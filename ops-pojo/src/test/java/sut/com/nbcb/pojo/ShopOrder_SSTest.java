/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopOrder;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopOrder_SSTest extends ShopOrder_SSTest_scaffolding {
// allCoveredLines:[9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:cc4e2856e7c499060876b37b645a7a39
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: 0
      //Assert: assertFalse(method_result);
      
      ShopOrder shopOrder0 = new ShopOrder();
      Integer integer0 = new Integer(0);
      
      //Call method: equals
      boolean boolean0 = shopOrder0.equals(integer0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:535ceaa07967cd058572c736c86c914b
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: shopOrder0
      //Assert: assertTrue(method_result);
      
      ShopOrder shopOrder0 = new ShopOrder();
      
      //Call method: equals
      boolean boolean0 = shopOrder0.equals(shopOrder0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:3e48ac8667b4c40b69c9273ee3532277
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]
      //Input_0_Object: shopOrder1
      //Assert: assertTrue(method_result);
      
      ShopOrder shopOrder0 = new ShopOrder();
      ShopOrder shopOrder1 = new ShopOrder();
      
      //Call method: equals
      boolean boolean0 = shopOrder0.equals(shopOrder1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:2f8ab3fa62f1cdffab26a2d2229bbd74
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]
      //Input_0_Object: shopOrder0
      //Assert: assertTrue(method_result);
      
      ShopOrder shopOrder0 = new ShopOrder();
      ShopOrder shopOrder1 = new ShopOrder();
      
      //Call method: equals
      boolean boolean0 = shopOrder1.equals(shopOrder0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:79edd90872c00e1b3fb515db0b8b6108
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]
      
      ShopOrder shopOrder0 = new ShopOrder();
      
      //Call method: hashCode
      shopOrder0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAddTime_05()  throws Throwable  {
      //caseID:bef9368b4975171cbc1c5a8f62c130de
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Date: {}
      
      ShopOrder shopOrder0 = new ShopOrder();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setAddTime
      shopOrder0.setAddTime(date0);
      
      //Test Result Assert
      assertNull(shopOrder0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setAddress_06()  throws Throwable  {
      //caseID:c91908e5116d4599a8fba485dbf2f1b6
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: , addTime=
      
      ShopOrder shopOrder0 = new ShopOrder();
      
      //Call method: setAddress
      shopOrder0.setAddress(", addTime=");
      
      //Test Result Assert
      assertNull(shopOrder0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setConfirmTime_07()  throws Throwable  {
      //caseID:52ff4020eca781d129edbda3bd7ff3c2
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Date: {}
      
      ShopOrder shopOrder0 = new ShopOrder();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setConfirmTime
      shopOrder0.setConfirmTime(date0);
      
      //Test Result Assert
      assertNull(shopOrder0.getUserId());
  }

  @Test(timeout = 9000)
  public void test_setConsignee_08()  throws Throwable  {
      //caseID:18a75284b5a216a77ec14765f8245fe3
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 1
      
      ShopOrder shopOrder0 = new ShopOrder();
      
      //Call method: setConsignee
      shopOrder0.setConsignee("1");
      
      //Test Result Assert
      assertNull(shopOrder0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setCouponId_09()  throws Throwable  {
      //caseID:082af3691435bcb336b0efe592c29efc
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 0L
      
      ShopOrder shopOrder0 = new ShopOrder();
      Long long0 = new Long(0L);
      
      //Call method: setCouponId
      shopOrder0.setCouponId(long0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderId());
  }

  @Test(timeout = 9000)
  public void test_setCouponPaid_10()  throws Throwable  {
      //caseID:40e292cc15cae4f267c20d7233807815
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: BigDecimal.ONE
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      
      //Call method: setCouponPaid
      shopOrder0.setCouponPaid(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setGoodsAmount_11()  throws Throwable  {
      //caseID:d48fb178642204ca04377be34af34cf7
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: 2061L
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = new BigDecimal(2061L);
      
      //Call method: setGoodsAmount
      shopOrder0.setGoodsAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getUserId());
  }

  @Test(timeout = 9000)
  public void test_setGoodsId_12()  throws Throwable  {
      //caseID:5bb448a1f9b305d5b0b9824e81e8fe26
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 747L
      
      ShopOrder shopOrder0 = new ShopOrder();
      Long long0 = new Long(747L);
      
      //Call method: setGoodsId
      shopOrder0.setGoodsId(long0);
      
      //Test Result Assert
      assertNull(shopOrder0.getUserId());
  }

  @Test(timeout = 9000)
  public void test_setGoodsNumber_13()  throws Throwable  {
      //caseID:8b64096c0df43ba67e71e93577c2d964
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Integer: 59
      
      ShopOrder shopOrder0 = new ShopOrder();
      Integer integer0 = new Integer(59);
      
      //Call method: setGoodsNumber
      shopOrder0.setGoodsNumber(integer0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderStatus());
  }

  @Test(timeout = 9000)
  public void test_setGoodsPrice_14()  throws Throwable  {
      //caseID:969af2b4dc53af47b8c1b650c9701880
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: BigDecimal.ONE
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      
      //Call method: setGoodsPrice
      shopOrder0.setGoodsPrice(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderStatus());
  }

  @Test(timeout = 9000)
  public void test_setMoneyPaid_15()  throws Throwable  {
      //caseID:1572068d337b442e03f144762ff7d8ba
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: BigDecimal.TEN
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      
      //Call method: setMoneyPaid
      shopOrder0.setMoneyPaid(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderStatus());
  }

  @Test(timeout = 9000)
  public void test_setOrderAmount_16()  throws Throwable  {
      //caseID:aa9905fe9abb31227ac266d0e92346b1
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setOrderAmount
      shopOrder0.setOrderAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getShippingStatus());
  }

  @Test(timeout = 9000)
  public void test_setOrderId_17()  throws Throwable  {
      //caseID:3d975057d4d6a67dbd0f18bc7e2138e7
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 513L
      
      ShopOrder shopOrder0 = new ShopOrder();
      Long long0 = new Long(513L);
      
      //Call method: setOrderId
      shopOrder0.setOrderId(long0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderStatus());
  }

  @Test(timeout = 9000)
  public void test_setOrderStatus_18()  throws Throwable  {
      //caseID:8fb06081a3df580d8c1c0c2b4d9abbd1
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Integer: 102
      
      ShopOrder shopOrder0 = new ShopOrder();
      Integer integer0 = new Integer(102);
      
      //Call method: setOrderStatus
      shopOrder0.setOrderStatus(integer0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderId());
  }

  @Test(timeout = 9000)
  public void test_setPayAmount_19()  throws Throwable  {
      //caseID:632b76b10e7c65aa547972d21c3fdeca
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setPayAmount
      shopOrder0.setPayAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getPayStatus());
  }

  @Test(timeout = 9000)
  public void test_setPayStatus_20()  throws Throwable  {
      //caseID:4351ef92f1ce259d7ee5569e46aee914
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Integer: 224
      
      ShopOrder shopOrder0 = new ShopOrder();
      Integer integer0 = new Integer(224);
      
      //Call method: setPayStatus
      shopOrder0.setPayStatus(integer0);
      
      //Test Result Assert
      assertNull(shopOrder0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setPayTime_21()  throws Throwable  {
      //caseID:375b5bb9fbb89f91b5e4542c0f4bad4c
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Date: {}
      
      ShopOrder shopOrder0 = new ShopOrder();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setPayTime
      shopOrder0.setPayTime(date0);
      
      //Test Result Assert
      assertNull(shopOrder0.getConsignee());
  }

  @Test(timeout = 9000)
  public void test_setShippingFee_22()  throws Throwable  {
      //caseID:1fc703cd282ba9ecddc29e52e2b1d128
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: 1.0
      
      ShopOrder shopOrder0 = new ShopOrder();
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      
      //Call method: setShippingFee
      shopOrder0.setShippingFee(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopOrder0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setShippingStatus_23()  throws Throwable  {
      //caseID:2d454da3fc0c45c522a4541a71dd3b86
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Integer: (-1)
      
      ShopOrder shopOrder0 = new ShopOrder();
      Integer integer0 = new Integer((-1));
      
      //Call method: setShippingStatus
      shopOrder0.setShippingStatus(integer0);
      
      //Test Result Assert
      assertNull(shopOrder0.getOrderStatus());
  }

  @Test(timeout = 9000)
  public void test_setUserId_24()  throws Throwable  {
      //caseID:c13fd2083244464d0c67528eb32cc20a
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 840L
      
      ShopOrder shopOrder0 = new ShopOrder();
      Long long0 = new Long(840L);
      
      //Call method: setUserId
      shopOrder0.setUserId(long0);
      
      //Test Result Assert
      assertNull(shopOrder0.getConsignee());
  }

  @Test(timeout = 9000)
  public void test_toString_25()  throws Throwable  {
      //caseID:2e59e489aba33a5d87b9fb24061fe268
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]
      //Assert: assertEquals("ShopOrder(orderId=null, userId=null, orderStatus=null, payStatus=null, shippingStatus=null, address=null, consignee=null, goodsId=null, goodsNumber=null, goodsPrice=null, goodsAmount=null, shippingFee=null, orderAmount=null, couponId=null, couponPaid=null, moneyPaid=null, payAmount=null, addTime=null, confirmTime=null, payTime=null)", method_result);
      
      ShopOrder shopOrder0 = new ShopOrder();
      
      //Call method: toString
      String string0 = shopOrder0.toString();
      
      //Test Result Assert
      assertEquals("ShopOrder(orderId=null, userId=null, orderStatus=null, payStatus=null, shippingStatus=null, address=null, consignee=null, goodsId=null, goodsNumber=null, goodsPrice=null, goodsAmount=null, shippingFee=null, orderAmount=null, couponId=null, couponPaid=null, moneyPaid=null, payAmount=null, addTime=null, confirmTime=null, payTime=null)", string0);
  }
}