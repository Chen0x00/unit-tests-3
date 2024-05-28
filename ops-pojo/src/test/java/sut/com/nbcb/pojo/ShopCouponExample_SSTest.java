/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopCouponExample;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopCouponExample_SSTest extends ShopCouponExample_SSTest_scaffolding {
// allCoveredLines:[16, 17, 18, 21, 22, 25, 29, 30, 33, 37, 41, 42, 45, 46, 47, 51, 52, 53, 55, 59, 60, 64, 65, 66, 67, 73, 74, 75, 474, 475]

  @Test(timeout = 9000)
  public void test_clear_0()  throws Throwable  {
      //caseID:26e6d641491cc7cf37967d737640af2d
      //CoveredLines: [16, 17, 18, 64, 65, 66, 67]
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: clear
      shopCouponExample0.clear();
      
      //Test Result Assert
      assertFalse(shopCouponExample0.isDistinct());
  }

  @Test(timeout = 9000)
  public void test_createCriteria_1()  throws Throwable  {
      //caseID:a9f0cc9512a7367bf7ac20369142ac22
      //CoveredLines: [16, 17, 18, 51, 52, 55, 59, 60, 73, 74, 75, 474, 475]
      //Assert: assertFalse(method_result.equals((Object)shopCouponExample_Criteria0));
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      ArrayList<ShopCouponExample.Criteria> arrayList0 = new ArrayList<ShopCouponExample.Criteria>();
      //mock shopCouponExample_Criteria0
      ShopCouponExample.Criteria shopCouponExample_Criteria0 = mock(ShopCouponExample.Criteria.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      arrayList0.add(shopCouponExample_Criteria0);
      
      PrivateAccess.setVariable((Class<?>) ShopCouponExample.class, shopCouponExample0, "oredCriteria", (Object) arrayList0);
      
      //Call method: createCriteria
      ShopCouponExample.Criteria shopCouponExample_Criteria1 = shopCouponExample0.createCriteria();
      
      //Test Result Assert
      assertFalse(shopCouponExample_Criteria1.equals((Object)shopCouponExample_Criteria0));
  }

  @Test(timeout = 9000)
  public void test_createCriteria_2()  throws Throwable  {
      //caseID:ffc51e8251c3a105ca160748755eb843
      //CoveredLines: [16, 17, 18, 51, 52, 53, 55, 59, 60, 73, 74, 75, 474, 475]
      //Assert: assertNotNull(method_result);
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: createCriteria
      ShopCouponExample.Criteria shopCouponExample_Criteria0 = shopCouponExample0.createCriteria();
      
      //Test Result Assert
      assertNotNull(shopCouponExample_Criteria0);
  }

  @Test(timeout = 9000)
  public void test_getOrderByClause_3()  throws Throwable  {
      //caseID:918a2ba1885e5bdf07a3cb54defead0b
      //CoveredLines: [16, 17, 18, 25]
      //Assert: assertNull(method_result);
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: getOrderByClause
      String string0 = shopCouponExample0.getOrderByClause();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getOredCriteria_4()  throws Throwable  {
      //caseID:9e70f0dbf0d056e452ecfec2fbcffcaf
      //CoveredLines: [16, 17, 18, 37]
      //Assert: assertEquals(0, method_result.size());
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: getOredCriteria
      List<ShopCouponExample.Criteria> list0 = shopCouponExample0.getOredCriteria();
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 9000)
  public void test_isDistinct_5()  throws Throwable  {
      //caseID:ffa1e6234d96051ce16029ec2d807226
      //CoveredLines: [16, 17, 18, 33]
      //Assert: assertFalse(method_result);
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: isDistinct
      boolean boolean0 = shopCouponExample0.isDistinct();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_or_6()  throws Throwable  {
      //caseID:13b11d2758d74fcdb49f01c2aaf5f67d
      //CoveredLines: [16, 17, 18, 41, 42]
      //Input_0_ShopCouponExample.Criteria: {}
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      //mock shopCouponExample_Criteria0
      ShopCouponExample.Criteria shopCouponExample_Criteria0 = mock(ShopCouponExample.Criteria.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: or
      shopCouponExample0.or(shopCouponExample_Criteria0);
      
      //Test Result Assert
      assertNull(shopCouponExample0.getOrderByClause());
  }

  @Test(timeout = 9000)
  public void test_or_7()  throws Throwable  {
      //caseID:0683427b7e4fac89e7c03bcb27a201c6
      //CoveredLines: [16, 17, 18, 45, 46, 47, 59, 60, 73, 74, 75, 474, 475]
      //Assert: assertNotNull(method_result);
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: or
      ShopCouponExample.Criteria shopCouponExample_Criteria0 = shopCouponExample0.or();
      
      //Test Result Assert
      assertNotNull(shopCouponExample_Criteria0);
  }

  @Test(timeout = 9000)
  public void test_setDistinct_8()  throws Throwable  {
      //caseID:41877455afa2279bd206129df81687fb
      //CoveredLines: [16, 17, 18, 29, 30]
      //Input_0_boolean: true
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: setDistinct
      shopCouponExample0.setDistinct(true);
      
      //Test Result Assert
      assertNull(shopCouponExample0.getOrderByClause());
  }

  @Test(timeout = 9000)
  public void test_setOrderByClause_9()  throws Throwable  {
      //caseID:450c03e6b388dbc7fcaa2126bcd55862
      //CoveredLines: [16, 17, 18, 21, 22]
      //Input_0_String: 18B5#
      
      ShopCouponExample shopCouponExample0 = new ShopCouponExample();
      
      //Call method: setOrderByClause
      shopCouponExample0.setOrderByClause("18B5#");
      
      //Test Result Assert
      assertEquals("18B5#", shopCouponExample0.getOrderByClause());
  }
}
