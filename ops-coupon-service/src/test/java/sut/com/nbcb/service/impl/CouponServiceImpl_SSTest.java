/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.nbcb.entity.Result;
import com.nbcb.mapper.ShopCouponMapper;
import com.nbcb.pojo.ShopCoupon;
import com.nbcb.service.impl.CouponServiceImpl;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class CouponServiceImpl_SSTest extends CouponServiceImpl_SSTest_scaffolding {
// allCoveredLines:[17, 24, 25, 27, 33, 34, 39, 40, 44, 46]

  @Test(timeout = 9000)
  public void test_findOne_0()  throws Throwable  {
      //caseID:ed87cc07c8d8c9d2838159306ef426be
      //CoveredLines: [17, 24, 25]
      //Input_0_Long: null
      
      CouponServiceImpl couponServiceImpl0 = new CouponServiceImpl();
      
      //Call method: findOne
      // Undeclared exception!
      try { 
        couponServiceImpl0.findOne((Long) null);
      } catch(Throwable e) {
         verifyException("com.nbcb.exception.CastException", e);
         assertEquals("com.nbcb.exception.CustomerException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_findOne_1()  throws Throwable  {
      //caseID:647490cc2318741ca8fa70c86eefa295
      //CoveredLines: [17, 24, 27]
      //Input_0_Long: 0L
      //Assert: assertNull(method_result);
      
      CouponServiceImpl couponServiceImpl0 = new CouponServiceImpl();
      //mock shopCouponMapper0
      ShopCouponMapper shopCouponMapper0 = mock(ShopCouponMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) CouponServiceImpl.class, couponServiceImpl0, "couponMapper", (Object) shopCouponMapper0);
      Long long0 = new Long(0L);
      
      //Call method: findOne
      ShopCoupon shopCoupon0 = couponServiceImpl0.findOne(long0);
      
      //Test Result Assert
      assertNull(shopCoupon0);
  }

  @Test(timeout = 9000)
  public void test_updateCouponStatus_2()  throws Throwable  {
      //caseID:ca842e468e6e418f2f9b595b291343e2
      //CoveredLines: [17, 33, 34]
      //Input_0_ShopCoupon: null
      //Assert: assertFalse(method_result.getSuccess());
      
      CouponServiceImpl couponServiceImpl0 = new CouponServiceImpl();
      
      //Call method: updateCouponStatus
      Result result0 = couponServiceImpl0.updateCouponStatus((ShopCoupon) null);
      
      //Test Result Assert
      assertFalse(result0.getSuccess());
  }

  @Test(timeout = 9000)
  public void test_updateCouponStatus_3()  throws Throwable  {
      //caseID:1c94e9d5bb9275b14ac8aea13270db4c
      //CoveredLines: [17, 33, 34]
      //Input_0_ShopCoupon: {}
      //Assert: assertEquals("\u8BF7\u6C42\u53C2\u6570\u6709\u8BEF", method_result.getMessage());
      
      CouponServiceImpl couponServiceImpl0 = new CouponServiceImpl();
      //mock shopCoupon0
      ShopCoupon shopCoupon0 = mock(ShopCoupon.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateCouponStatus
      Result result0 = couponServiceImpl0.updateCouponStatus(shopCoupon0);
      
      //Test Result Assert
      assertEquals("\u8BF7\u6C42\u53C2\u6570\u6709\u8BEF", result0.getMessage());
  }

  @Test(timeout = 9000)
  public void test_updateCouponStatus_4()  throws Throwable  {
      //caseID:a6afb8aa6ce44580ddf633cf49d60a77
      //CoveredLines: [17, 33, 39, 40, 44, 46]
      //Input_0_ShopCoupon: {getCouponId=0L}
      //Assert: assertEquals("\u6B63\u786E", method_result.getMessage());
      
      CouponServiceImpl couponServiceImpl0 = new CouponServiceImpl();
      //mock shopCouponMapper0
      ShopCouponMapper shopCouponMapper0 = mock(ShopCouponMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) CouponServiceImpl.class, couponServiceImpl0, "couponMapper", (Object) shopCouponMapper0);
      Long long0 = new Long(0L);
      //mock shopCoupon0
      ShopCoupon shopCoupon0 = mock(ShopCoupon.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(shopCoupon0).getCouponId();
      
      //Call method: updateCouponStatus
      Result result0 = couponServiceImpl0.updateCouponStatus(shopCoupon0);
      
      //Test Result Assert
      assertEquals("\u6B63\u786E", result0.getMessage());
  }
}
