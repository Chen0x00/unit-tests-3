package com.nbcb.mq;

import com.alibaba.fastjson.JSON;
import com.nbcb.constant.ShopCode;
import com.nbcb.entity.OrderResult;
import com.nbcb.entity.Result;
import com.nbcb.mapper.ShopCouponMapper;
import com.nbcb.pojo.ShopCoupon;
import com.nbcb.pojo.ShopOrder;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@SuppressWarnings("ALL")
@Slf4j
@Component
@RocketMQMessageListener(topic = "${mq.order.confirm.topic}",
        consumerGroup = "${mq.order.confirm.consumer.groupname}",
        messageModel = MessageModel.BROADCASTING)
public class OrderTransactionMQListener implements RocketMQListener<MessageExt> {
    @Autowired
    private ShopCouponMapper couponMapper;

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Value("${mq.order.confirm.consumer.callback.topic}")
    private String callbackTopic;

    @Value("${mq.order.confirm.consumer.callback.tag}")
    private String callbackTag;

    @Value("${mq.order.confirm.consumer.callback.sourcecode}")
    private String sourceCode;

    @Override
    public void onMessage(MessageExt messageExt) {
        String body = new String(messageExt.getBody());
        ShopOrder order = JSON.parseObject(body, ShopOrder.class);
        log.info("优惠券扣减服务,接收到信息");
        Result result = reduceCoupon(order);
        try {
            sendMessage(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Result reduceCoupon(ShopOrder order) {
        if (order.getCouponId() != null) {
            try {
                ShopCoupon coupon = couponMapper.selectByPrimaryKey(order.getCouponId());
                if (coupon.getIsUsed().intValue() == ShopCode.SHOP_COUPON_ISUSED.getCode().intValue()) {
                    log.info(ShopCode.SHOP_COUPON_ISUSED.getMessage());
                    OrderResult orderResult = new OrderResult();
                    orderResult.setOrderId(order.getOrderId());
                    orderResult.setStatus(ShopCode.SHOP_FAIL.getSuccess());
                    orderResult.setMessage(ShopCode.SHOP_COUPON_ISUSED.getMessage());
                    orderResult.setSourceCode(sourceCode);
                    return new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_COUPON_ISUSED.getCode(), JSON.toJSONString(orderResult));
                }
                coupon.setOrderId(order.getOrderId());
                coupon.setIsUsed(ShopCode.SHOP_COUPON_ISUSED.getCode());
                coupon.setUsedTime(new Date());
                //更新优惠券状态
                couponMapper.updateByPrimaryKey(coupon);
                log.info("订单:" + order.getOrderId() + ",使用优惠券");
                OrderResult orderResult = new OrderResult();
                orderResult.setOrderId(order.getOrderId());
                orderResult.setStatus(ShopCode.SHOP_SUCCESS.getSuccess());
                orderResult.setMessage(ShopCode.SHOP_COUPON_USE_SUCCESS.getMessage());
                orderResult.setSourceCode(sourceCode);
                return new Result(ShopCode.SHOP_SUCCESS.getSuccess(), ShopCode.SHOP_COUPON_USE_SUCCESS.getCode(), JSON.toJSONString(orderResult));
            } catch (Exception e) {
                e.printStackTrace();
                OrderResult orderResult = new OrderResult();
                orderResult.setOrderId(order.getOrderId());
                orderResult.setStatus(ShopCode.SHOP_FAIL.getSuccess());
                orderResult.setMessage(ShopCode.SHOP_COUPON_USE_FAIL.getMessage());
                orderResult.setSourceCode(sourceCode);
                return new Result(ShopCode.SHOP_FAIL.getSuccess(), ShopCode.SHOP_COUPON_USE_FAIL.getCode(), ShopCode.SHOP_COUPON_USE_FAIL.getMessage());
            }
        } else {
            log.info("订单:" + order.getOrderId() + ",未使用优惠券");
            OrderResult orderResult = new OrderResult();
            orderResult.setOrderId(order.getOrderId());
            orderResult.setStatus(ShopCode.SHOP_SUCCESS.getSuccess());
            orderResult.setMessage(ShopCode.SHOP_SUCCESS.getMessage()); // JSON.toJSONString(orderResult)
            orderResult.setSourceCode(sourceCode);
            return new Result(ShopCode.SHOP_SUCCESS.getSuccess(), ShopCode.SHOP_COUPON_USE_SUCCESS.getCode(), JSON.toJSONString(orderResult));
        }
    }

    private void sendMessage(Result result) throws Exception {
        Message message = new Message(callbackTopic, callbackTag, result.getCode().toString(), JSON.toJSONString(result).getBytes());
        rocketMQTemplate.getProducer().send(message);
        log.info("优惠券扣减成功,发送消息");

    }
}
