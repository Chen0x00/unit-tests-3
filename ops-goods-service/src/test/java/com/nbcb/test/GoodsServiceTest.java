package com.nbcb.test;

import com.nbcb.GoodsServiceApplication;
import com.nbcb.api.IGoodsService;
import com.nbcb.pojo.ShopGoods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GoodsServiceApplication.class)
public class GoodsServiceTest {

    @Autowired
    private IGoodsService iGoodsService;

    @Test
    public void findOneGoods() {
//        Long couponId = 345988230098857984L;
        Long goodsId = 378715381063495688L;
//        Long userId = 378715381059301376L;
//        ShopOrder order = new ShopOrder();
//        order.setGoodsId(goodsId);
//        order.setUserId(userId);
//        order.setCouponId(couponId);
//        order.setAddress("北京");
//        order.setGoodsNumber(1);
//        order.setGoodsPrice(new BigDecimal(1000));
//        order.setShippingFee(BigDecimal.ZERO);
//        order.setOrderAmount(new BigDecimal(1000));
//        order.setMoneyPaid(new BigDecimal(100));
        ShopGoods goods = iGoodsService.findOne(goodsId);
        System.out.println(goods.getGoodsPrice());
        System.out.println(goods.getGoodsDesc());


    }
}
