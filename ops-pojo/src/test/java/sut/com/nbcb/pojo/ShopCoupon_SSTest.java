/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopCoupon;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopCoupon_SSTest extends ShopCoupon_SSTest_scaffolding {
// allCoveredLines:[9, 11, 13, 15, 17, 19, 21]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:2b78a91f5ca37b69675e00b325a9627f
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: shopCoupon0
      //Assert: assertTrue(method_result);
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      
      //Call method: equals
      boolean boolean0 = shopCoupon0.equals(shopCoupon0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:045a5f395d3bbd9b612ff9bc0825219b
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: BigDecimal.ZERO
      //Assert: assertFalse(method_result);
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: equals
      boolean boolean0 = shopCoupon0.equals(bigDecimal0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:3fb26c66f4fa7ff337e79f73add8aee9
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21]
      //Input_0_Object: shopCoupon0
      //Assert: assertTrue(method_result);
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      ShopCoupon shopCoupon1 = new ShopCoupon();
      
      //Call method: equals
      boolean boolean0 = shopCoupon1.equals(shopCoupon0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:3c19b1b334dfabfd22662c4d2f7a753a
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21]
      //Input_0_Object: shopCoupon1
      //Assert: assertTrue(method_result);
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      ShopCoupon shopCoupon1 = new ShopCoupon();
      
      //Call method: equals
      boolean boolean0 = shopCoupon0.equals(shopCoupon1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:9d2e0547fb6ca191fea8e01db3943f1a
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21]
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      
      //Call method: hashCode
      shopCoupon0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setCouponId_05()  throws Throwable  {
      //caseID:be14659191653126ab9fb1dd69012fca
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 1L
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      Long long0 = new Long(1L);
      
      //Call method: setCouponId
      shopCoupon0.setCouponId(long0);
      
      //Test Result Assert
      assertNull(shopCoupon0.getUserId());
  }

  @Test(timeout = 9000)
  public void test_setCouponPrice_06()  throws Throwable  {
      //caseID:0a7445bc05983cb1e18f38d601a170a8
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: 0L
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      
      //Call method: setCouponPrice
      shopCoupon0.setCouponPrice(bigDecimal0);
      
      //Test Result Assert
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 9000)
  public void test_setIsUsed_07()  throws Throwable  {
      //caseID:6dff956a0035646436fa1e06de553e92
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Integer: 1088
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      Integer integer0 = new Integer(1088);
      
      //Call method: setIsUsed
      shopCoupon0.setIsUsed(integer0);
      
      //Test Result Assert
      assertNull(shopCoupon0.getCouponId());
  }

  @Test(timeout = 9000)
  public void test_setOrderId_08()  throws Throwable  {
      //caseID:cf3443dcd1dfbb9ca77c236882a68fc7
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 0L
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      Long long0 = new Long(0L);
      
      //Call method: setOrderId
      shopCoupon0.setOrderId(long0);
      
      //Test Result Assert
      assertNull(shopCoupon0.getIsUsed());
  }

  @Test(timeout = 9000)
  public void test_setUsedTime_09()  throws Throwable  {
      //caseID:28eb8142335d6684ffd56e9611e067ba
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Date: {}
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setUsedTime
      shopCoupon0.setUsedTime(date0);
      
      //Test Result Assert
      assertNull(shopCoupon0.getCouponId());
  }

  @Test(timeout = 9000)
  public void test_setUserId_10()  throws Throwable  {
      //caseID:e73faae2e66e9b7f935e285718a530d5
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Long: 1085L
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      Long long0 = new Long(1085L);
      
      //Call method: setUserId
      shopCoupon0.setUserId(long0);
      
      //Test Result Assert
      assertEquals(1085L, (long)shopCoupon0.getUserId());
  }

  @Test(timeout = 9000)
  public void test_toString_11()  throws Throwable  {
      //caseID:f88ec36580b6a0bfa360e34b50a25f8f
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 13, 15, 17, 19, 21]
      //Assert: assertEquals("ShopCoupon(couponId=null, couponPrice=null, userId=null, orderId=null, isUsed=null, usedTime=null)", method_result);
      
      ShopCoupon shopCoupon0 = new ShopCoupon();
      
      //Call method: toString
      String string0 = shopCoupon0.toString();
      
      //Test Result Assert
      assertEquals("ShopCoupon(couponId=null, couponPrice=null, userId=null, orderId=null, isUsed=null, usedTime=null)", string0);
  }
}