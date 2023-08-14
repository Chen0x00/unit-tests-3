package com.nbcb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.nbcb.api.ICouponService;
import com.nbcb.api.IGoodsService;
import com.nbcb.api.IOrderService;
import com.nbcb.api.IUserService;
import com.nbcb.constant.ShopCode;
import com.nbcb.entity.MQEntity;
import com.nbcb.entity.OrderResult;
import com.nbcb.entity.Result;
import com.nbcb.exception.CastException;
import com.nbcb.mapper.ShopMsgProviderMapper;
import com.nbcb.mapper.ShopOrderMapper;
import com.nbcb.pojo.*;
import com.nbcb.utils.IDWorker;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SuppressWarnings("ALL")
@Slf4j
@Component
@Service(interfaceClass = IOrderService.class)
public class OrderServiceImpl implements IOrderService {

    @Reference
    private IGoodsService goodsService;

    @Reference
    private IUserService userService;

    @Reference
    private ICouponService couponService;

    @Autowired
    private ShopOrderMapper orderMapper;

    @Autowired
    private ShopMsgProviderMapper msgProviderMapper;

    @Autowired
    private IDWorker idWorker;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Autowired
    private DefaultMQProducer producer;

    private Map<Long, Boolean> EmptyStockMap = new HashMap<>();

    @Value("${mq.rocketmq.producer.group}")
    private String groupName;

    @Value("${mq.order.topic}")
    private String topic;

    @Value("${mq.order.tag.cancel}")
    private String tag;

    @Value("${mq.goods.topic}")
    private String goodsTopic;

    @Value("${mq.goods.tag.reduce}")
    private String reduceGoodsNumTag;

    @Override
    public ShopOrder findOne(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Result confirmOrder(ShopOrder order) {
        // 1 校验订单
        checkOrder(order);
        // 2 生成预订单
        Long orderId = savePreOrder(order);
        Result result;
        String message = ShopCode.SHOP_ORDER_CONFIRM_FAIL.getMessage();
        MQEntity mqEntity = null;
        try {
            mqEntity = new MQEntity();
            mqEntity.setOrderId(orderId);
            mqEntity.setUserId(order.getUserId());
            mqEntity.setGoodsId(order.getGoodsId());
            mqEntity.setCouponId(order.getCouponId());
            mqEntity.setUserMoney(order.getMoneyPaid());
            mqEntity.setGoodsNumber(order.getGoodsNumber());

            // 3 扣减优惠券
            Result reduceCouponStatus = reduceCouponStatus(order);
            if (reduceCouponStatus.getSuccess().equals(ShopCode.SHOP_FAIL.getSuccess())) {
                log.info(reduceCouponStatus.toString());
                mqEntity.setCouponId(order.getCouponId());
                mqEntity.setGoodsNumber(0);
                mqEntity.setUserMoney(BigDecimal.ZERO);
                CastException.cast(ShopCode.SHOP_COUPON_USE_FAIL);
            }
            // 4 使用余额
            Result reduceMoneyPaid = reduceMoneyPaid(order);
            if (reduceMoneyPaid.getSuccess().equals(ShopCode.SHOP_FAIL.getSuccess())) {
                log.info(reduceMoneyPaid.toString());
                mqEntity.setUserMoney(BigDecimal.ZERO);
                mqEntity.setGoodsNumber(0);
                CastException.cast(ShopCode.SHOP_USER_MONEY_REDUCE_FAIL);
            }

            // 5 扣减库存
            Result reduceGoodsNum = reduceGoodsNum(order);
            // Result reduceGoodsNum = reduceGoodsNumByMQ(order);
            if (reduceGoodsNum.getSuccess().equals(ShopCode.SHOP_FAIL.getSuccess())) {
                log.info(reduceGoodsNum.toString());
                mqEntity.setGoodsNumber(0);
                CastException.cast(ShopCode.SHOP_REDUCE_GOODS_NUM_FAIL);
            }

            // 模拟异常抛出 逆向流程测试
            // CastException.cast(ShopCode.SHOP_FAIL);

            // 6 确认订单
            updateOrderStatus(order);
            OrderResult orderResult = new OrderResult();
            orderResult.setMessage(ShopCode.SHOP_ORDER_CONFIRM.getMessage());
            orderResult.setOrderId(orderId);
            orderResult.setStatus(ShopCode.SHOP_SUCCESS.getSuccess());
            orderResult.setPayAmount(order.getPayAmount());
            // 7 返回成功状态
            result = new Result(ShopCode.SHOP_SUCCESS.getSuccess(), JSON.toJSONString(orderResult));
            return result;
        } catch (Exception e) {
            log.info(e.toString());
            /** 失败补偿机制 **/
            // 1 确认订单失败,发送消息
            //订单ID 优惠券ID 用户ID 余额  商品ID 商品数量
            try {
                sendCancelOrder(topic, tag, order.getOrderId().toString(), JSON.toJSONString(mqEntity));
                log.info("已发送");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            // 2 返回失败状态
            result = new Result(ShopCode.SHOP_FAIL.getSuccess(), message);
            return result;
        }
    }

    @Override
    public Result cancelOrder(ShopOrder order) {
        Result result = null;
        // 参数校验
        if (order == null || order.getOrderId() == null ||
                order.getUserId() == null ||
                order.getGoodsId() == null ||
                order.getGoodsNumber().intValue() <= 0) {
            CastException.cast(ShopCode.SHOP_REQUEST_PARAMETER_VALID);
        }
        // 查询订单
        ShopOrder shopOrder = orderMapper.selectByPrimaryKey(order.getOrderId());
        // 判断订单是否能取消
        if (shopOrder != null && shopOrder.getOrderStatus() < 2 && shopOrder.getShippingStatus() < 1) {
            MQEntity mqEntity = new MQEntity();
            mqEntity.setOrderId(shopOrder.getOrderId());
            mqEntity.setUserId(shopOrder.getUserId());
            mqEntity.setGoodsId(shopOrder.getGoodsId());
            mqEntity.setGoodsNumber(shopOrder.getGoodsNumber());
            mqEntity.setUserMoney(shopOrder.getMoneyPaid());
            mqEntity.setCouponId(shopOrder.getCouponId());
            try {
                // 发送取消订单消息
                sendCancelOrder(topic, tag, shopOrder.getOrderId().toString(), JSON.toJSONString(mqEntity));
                OrderResult orderResult = new OrderResult();
                orderResult.setMessage(ShopCode.SHOP_ORDER_CANCEL_CHECK.getMessage());
                orderResult.setOrderId(shopOrder.getOrderId());
                orderResult.setStatus(ShopCode.SHOP_SUCCESS.getSuccess());
                orderResult.setPayAmount(shopOrder.getPayAmount());
                result = new Result(ShopCode.SHOP_SUCCESS.getSuccess(), ShopCode.SHOP_FAIL.getMessage());
            } catch (Exception e1) {
                e1.printStackTrace();
                result = new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_FAIL.getMessage());
            }
        } else {
            result = new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_ORDER_CANCEL_ERROR.getMessage());
        }
        return result;
    }

    /**
     * 发送订单确认失败消息
     *
     * @param topic
     * @param tag
     * @param keys
     * @param body
     */
    private void sendCancelOrder(String topic, String tag, String keys, String body) throws Exception {
        Message message = new Message(topic, tag, keys, body.getBytes());
        producer.send(message);
    }

    /**
     * 确认订单
     *
     * @param order
     */
    private void updateOrderStatus(ShopOrder order) {
        order.setOrderStatus(ShopCode.SHOP_ORDER_CONFIRM.getCode());
        order.setPayStatus(ShopCode.SHOP_ORDER_PAY_STATUS_NO_PAY.getCode());
        order.setConfirmTime(new Date());
        int r = orderMapper.updateByPrimaryKey(order);
        if (r <= 0) {// 订单确认失败
            CastException.cast(ShopCode.SHOP_ORDER_CONFIRM_FAIL);
        }
        log.info("订单:" + order.getOrderId() + ",确认订单成功");
    }

    /**
     * 扣减用户余额
     *
     * @param order
     */
    private Result reduceMoneyPaid(ShopOrder order) {
        Result result;
        if (order.getMoneyPaid() != null && order.getMoneyPaid().compareTo(BigDecimal.ZERO) == 1) {
            ShopUserMoneyLog userMoneyLog = new ShopUserMoneyLog();
            userMoneyLog.setOrderId(order.getOrderId());
            userMoneyLog.setUserId(order.getUserId());
            userMoneyLog.setUseMoney(order.getMoneyPaid());
            userMoneyLog.setMoneyLogType(ShopCode.SHOP_USER_MONEY_PAID.getCode());
            try {
                result = userService.updateMoneyPaid(userMoneyLog);
                if (result.getSuccess().equals(ShopCode.SHOP_FAIL.getSuccess())) {
                    log.info(ShopCode.SHOP_USER_MONEY_REDUCE_FAIL.getMessage());
                    return new Result(ShopCode.SHOP_USER_MONEY_REDUCE_FAIL.getSuccess(), result.getCode(), result.getMessage());
                }
                log.info("订单:" + order.getOrderId() + ",扣减余额成功");
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_FAIL.getCode(), ShopCode.SHOP_FAIL.getMessage());
            }

        }
        return new Result(ShopCode.SHOP_SUCCESS.getSuccess(), ShopCode.SHOP_SUCCESS.getCode(), ShopCode.SHOP_SUCCESS.getMessage());

    }

    /**
     * 扣减优惠券
     *
     * @param order
     */
    private Result reduceCouponStatus(ShopOrder order) {
        Result result;
        if (order.getCouponId() != null) {
            try {
                ShopCoupon coupon = couponService.findOne(order.getCouponId());
                if (coupon.getIsUsed().intValue() == ShopCode.SHOP_COUPON_ISUSED.getCode().intValue()) {
                    log.info(ShopCode.SHOP_COUPON_ISUSED.getMessage());
                    result = new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_COUPON_ISUSED.getCode(), ShopCode.SHOP_COUPON_ISUSED.getMessage());
                }
                coupon.setOrderId(order.getOrderId());
                coupon.setIsUsed(ShopCode.SHOP_COUPON_ISUSED.getCode());
                coupon.setUsedTime(new Date());

                //更新优惠券状态
                result = couponService.updateCouponStatus(coupon);
                if (result.getSuccess().equals(ShopCode.SHOP_COUPON_USE_FAIL.getSuccess())) {
                    log.info(ShopCode.SHOP_COUPON_USE_FAIL.getMessage());
                    result = new Result(ShopCode.SHOP_FAIL.getSuccess(), result.getCode(), result.getMessage());
                }
                log.info("订单:" + order.getOrderId() + ",使用优惠券");
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_FAIL.getCode(), ShopCode.SHOP_FAIL.getMessage());
            }
        }
        return new Result(ShopCode.SHOP_SUCCESS.getSuccess(), ShopCode.SHOP_SUCCESS.getCode(), ShopCode.SHOP_SUCCESS.getMessage());

    }

    /**
     * 扣减库存 (存在并发问题,使用数据库乐观锁解决,提升方案MQ)
     *
     * @param order
     */
    private Result reduceGoodsNum(ShopOrder order) {
        // 订单ID  商品ID 商品数量
        ShopOrderGoodsLog orderGoodsLog = new ShopOrderGoodsLog();
        orderGoodsLog.setOrderId(order.getOrderId());
        orderGoodsLog.setGoodsId(order.getGoodsId());
        orderGoodsLog.setGoodsNumber(order.getGoodsNumber());
        try {
            Result result = goodsService.reduceGoodsNum(orderGoodsLog);
            if (result.getSuccess().equals(ShopCode.SHOP_FAIL.getSuccess())) {
                log.info(result.getMessage());
                result = new Result(ShopCode.SHOP_FAIL.getSuccess(), result.getCode(), result.getMessage());
                return result;
            }
            log.info("订单:" + order.getOrderId() + ",扣减库存成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_FAIL.getCode(), ShopCode.SHOP_FAIL.getMessage());
        }
    }

    /**
     * 扣减库存 (方案MQ)
     *
     * @param order
     */
    private Result reduceGoodsNumByMQ(ShopOrder order) {
        // 订单ID  商品ID 商品数量
        ShopOrderGoodsLog orderGoodsLog = new ShopOrderGoodsLog();
        orderGoodsLog.setOrderId(order.getOrderId());
        orderGoodsLog.setGoodsId(order.getGoodsId());
        orderGoodsLog.setGoodsNumber(order.getGoodsNumber());
        try {
            /*  MQ start*/
            // 将消息持久化到数据库
            ShopMsgProvider msgProvider = new ShopMsgProvider();
            msgProvider.setId(String.valueOf(idWorker.nextId()));
            msgProvider.setGroupName(groupName);
            msgProvider.setMsgTopic(goodsTopic);
            msgProvider.setMsgTag(reduceGoodsNumTag);
            msgProvider.setMsgKey(String.valueOf(order.getOrderId()));
            msgProvider.setMsgBody(JSON.toJSONString(orderGoodsLog));
            msgProvider.setCreateTime(new Date());
            msgProviderMapper.insert(msgProvider);
            log.info("订单服务,持久化减库存消息到库");
            // 在线程池中进行处理
            threadPoolTaskExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    SendResult sendResult = null;
                    try {
                        // 发送消息到MQ,有延迟和堆积,使用线程异步优化
                        sendResult = sendReduceGoodsNum(goodsTopic, reduceGoodsNumTag, order.getOrderId().toString(), JSON.toJSONString(orderGoodsLog));
                    } catch (Exception e) {
                        log.info("订单:" + order.getOrderId() + ",扣减库存失败");
                    }
                    if (sendResult.getSendStatus().equals(SendStatus.SEND_OK)) {
                        //6 等待发送结果,如果MQ接受到消息,删除发送成功的消息
                        log.info("订单服务,消息发送成功");
                        ShopMsgProviderKey msgProviderKey = new ShopMsgProviderKey();
                        msgProviderKey.setGroupName(groupName);
                        msgProviderKey.setMsgKey(String.valueOf(order.getOrderId()));
                        msgProviderKey.setMsgTag(reduceGoodsNumTag);
                        msgProviderMapper.deleteByPrimaryKey(msgProviderKey);
                        log.info("订单服务,数据库中持久化减库存消息已删除");
                        log.info("订单:" + order.getOrderId() + ",扣减库存成功");
                    } else {
                        log.info("订单:" + order.getOrderId() + ",扣减库存失败");
                    }
                }
            });
            /*  MQ end */
            return new Result(ShopCode.SHOP_SUCCESS.getSuccess(), ShopCode.SHOP_SUCCESS.getCode(), ShopCode.SHOP_SUCCESS.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_FAIL.getCode(), ShopCode.SHOP_FAIL.getMessage());
        }
    }

    /**
     * 发送扣减库存消息
     *
     * @param topic
     * @param tag
     * @param keys
     * @param body
     * @throws Exception
     */
    private SendResult sendReduceGoodsNum(String topic, String tag, String keys, String body) throws Exception {
        Message message = new Message(topic, tag, keys, body.getBytes());
        return producer.send(message);
    }


    private void checkOrder(ShopOrder order) {
        // 校验订单是否存在
        if (order == null) {
            CastException.cast(ShopCode.SHOP_ORDER_INVALID);
        }
        // 校验订单商品是否存在
        ShopGoods goods = goodsService.findOne(order.getGoodsId());
        if (goods == null) {
            CastException.cast(ShopCode.SHOP_GOODS_NO_EXIST);
        }
        // 校验下单用户是否存在
        ShopUser user = userService.findOne(order.getUserId());
        if (user == null) {
            CastException.cast(ShopCode.SHOP_USER_NO_EXIST);
        }
        // 校验订单商品单价是否合法
        if (order.getGoodsPrice().compareTo(goods.getGoodsPrice()) != 0) {
            CastException.cast(ShopCode.SHOP_GOODS_PRICE_INVALID);
        }
        // 校验订单商品数量是否合法
        if (order.getGoodsNumber() >= goods.getGoodsNumber()) {
            CastException.cast(ShopCode.SHOP_GOODS_NUM_NOT_ENOUGH);
        }
        log.info("校验订单通过");
    }

    /**
     * 生成预订单
     *
     * @param order
     * @return
     */
    private Long savePreOrder(ShopOrder order) {
        //1 设置订单状态为不可见
        order.setOrderStatus(ShopCode.SHOP_ORDER_NO_CONFIRM.getCode());
        //2 设置订单ID
        long orderId = idWorker.nextId();
        order.setOrderId(orderId);
        //3 核算订单运费
        BigDecimal shippingFee = calculateShippingFee(order.getOrderAmount());
        if (order.getShippingFee().compareTo(shippingFee) != 0) {
            CastException.cast(ShopCode.SHOP_ORDER_SHIPPINGFEE_INVALID);
        }
        //4 核算订单总金额是否合法
        BigDecimal orderAmount = order.getGoodsPrice().multiply(new BigDecimal(order.getGoodsNumber()));
        orderAmount.add(shippingFee);
        if (order.getOrderAmount().compareTo(orderAmount) != 0) {
            CastException.cast(ShopCode.SHOP_ORDERMOUNT_INVALID);
        }
        //5 判断用户是否使用余额
        BigDecimal moneyPaid = order.getMoneyPaid();
        if (moneyPaid != null) {
            //5.1 订单中余额是否合法
            int r = moneyPaid.compareTo(BigDecimal.ZERO);
            // 余额小于0
            if (r == -1) {
                CastException.cast(ShopCode.SHOP_MONEY_PAID_LESS_ZERO);
            }
            // 余额大于0
            if (r == 1) {
                ShopUser user = userService.findOne(order.getUserId());
                // 判断余额是否超出
                if (moneyPaid.compareTo(user.getUserMoney()) == 1) {
                    // 余额超出
                    CastException.cast(ShopCode.SHOP_MONEY_PAID_INVALIS);
                }
            }
        } else {
            // 防空指针
            order.setMoneyPaid(BigDecimal.ZERO);
        }
        //6 判断用户是否使用优惠券
        Long couponId = order.getCouponId();
        if (couponId != null) {
            ShopCoupon coupon = couponService.findOne(couponId);
            //6.1 判断优惠券是否存在
            if (coupon == null) {
                CastException.cast(ShopCode.SHOP_COUPON_NO_EXIST);
            }
            //6.2 判断优惠券是否已使用
            if (coupon.getIsUsed().intValue() == ShopCode.SHOP_COUPON_ISUSED.getCode().intValue()) {
                CastException.cast(ShopCode.SHOP_COUPON_ISUSED);
            }
            //设置优惠券金额
            order.setCouponPaid(coupon.getCouponPrice());
        } else {
            // 防空指针
            order.setCouponPaid(BigDecimal.ZERO);
        }
        //7 核算订单支付金额 订单总金额 - 余额 - 优惠券金额
        BigDecimal payAmount = order.getOrderAmount().subtract(order.getMoneyPaid()).subtract(order.getCouponPaid());
        order.setPayAmount(payAmount);
        //8 设置下单时间
        order.setAddTime(new Date());
        //9 保存订单到数据库
        orderMapper.insert(order);
        log.info("生成预订单");
        //10 返回订单ID
        return orderId;
    }

    /**
     * 核算运费
     *
     * @param orderAmount
     * @return
     */
    private BigDecimal calculateShippingFee(BigDecimal orderAmount) {
        if (orderAmount.compareTo(new BigDecimal(99)) == 1) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(10);
        }
    }
    @Override
    public ShopOrder secKill(long userId, long goodsId) {

        ShopGoods goods = goodsService.findOne(goodsId);

        ShopOrder shopOrder = new ShopOrder();
        shopOrder.setGoodsId(goods.getGoodsId());
        shopOrder.setUserId(userId);

        shopOrder.setAddress("深圳");
        shopOrder.setGoodsNumber(1);
        shopOrder.setGoodsPrice(goods.getGoodsPrice());
        shopOrder.setGoodsAmount(goods.getGoodsPrice().multiply(new BigDecimal(1)));
        shopOrder.setShippingFee(BigDecimal.ZERO);
        shopOrder.setOrderAmount(goods.getGoodsPrice().multiply(new BigDecimal(1)).add(BigDecimal.ZERO));
        shopOrder.setMoneyPaid(new BigDecimal(0));

        Result result = confirmOrder(shopOrder);

        return shopOrder;
    }

}