/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopUserExample;
import java.util.List;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopUserExample_SSTest extends ShopUserExample_SSTest_scaffolding {
// allCoveredLines:[16, 17, 18, 21, 22, 25, 29, 30, 33, 37, 41, 42, 45, 46, 47, 51, 52, 53, 55, 59, 60, 64, 65, 66, 67, 73, 74, 75, 564, 565]

  @Test(timeout = 9000)
  public void test_clear_0()  throws Throwable  {
      //caseID:27914397d2a18ddd1def7689292e3f07
      //CoveredLines: [16, 17, 18, 64, 65, 66, 67]
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: clear
      shopUserExample0.clear();
      
      //Test Result Assert
      assertFalse(shopUserExample0.isDistinct());
  }

  @Test(timeout = 9000)
  public void test_createCriteria_1()  throws Throwable  {
      //caseID:0fdbfc9433bfba11ffc409681f32480e
      //CoveredLines: [16, 17, 18, 51, 52, 55, 59, 60, 73, 74, 75, 564, 565]
      //Assert: assertFalse(method_result.equals((Object)shopUserExample_Criteria0));
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      Vector<ShopUserExample.Criteria> vector0 = new Vector<ShopUserExample.Criteria>();
      //mock shopUserExample_Criteria0
      ShopUserExample.Criteria shopUserExample_Criteria0 = mock(ShopUserExample.Criteria.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      vector0.add(shopUserExample_Criteria0);
      
      PrivateAccess.setVariable((Class<?>) ShopUserExample.class, shopUserExample0, "oredCriteria", (Object) vector0);
      
      //Call method: createCriteria
      ShopUserExample.Criteria shopUserExample_Criteria1 = shopUserExample0.createCriteria();
      
      //Test Result Assert
      assertFalse(shopUserExample_Criteria1.equals((Object)shopUserExample_Criteria0));
  }

  @Test(timeout = 9000)
  public void test_createCriteria_2()  throws Throwable  {
      //caseID:9175303403ad6e9a098c98ef25560973
      //CoveredLines: [16, 17, 18, 51, 52, 53, 55, 59, 60, 73, 74, 75, 564, 565]
      //Assert: assertNotNull(method_result);
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: createCriteria
      ShopUserExample.Criteria shopUserExample_Criteria0 = shopUserExample0.createCriteria();
      
      //Test Result Assert
      assertNotNull(shopUserExample_Criteria0);
  }

  @Test(timeout = 9000)
  public void test_getOrderByClause_3()  throws Throwable  {
      //caseID:d5546e6d0b011027444650a9c3b441df
      //CoveredLines: [16, 17, 18, 25]
      //Assert: assertNull(method_result);
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: getOrderByClause
      String string0 = shopUserExample0.getOrderByClause();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getOredCriteria_4()  throws Throwable  {
      //caseID:27fb3442b80338b9470b404db1ac7c40
      //CoveredLines: [16, 17, 18, 37]
      //Assert: assertEquals(0, method_result.size());
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: getOredCriteria
      List<ShopUserExample.Criteria> list0 = shopUserExample0.getOredCriteria();
      
      //Test Result Assert
      assertEquals(0, list0.size());
  }

  @Test(timeout = 9000)
  public void test_isDistinct_5()  throws Throwable  {
      //caseID:2fbe5a3e4e850324d369000986fc8d12
      //CoveredLines: [16, 17, 18, 33]
      //Assert: assertFalse(method_result);
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: isDistinct
      boolean boolean0 = shopUserExample0.isDistinct();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_or_6()  throws Throwable  {
      //caseID:36c18e0b52293826cd4565c355b27a2a
      //CoveredLines: [16, 17, 18, 41, 42]
      //Input_0_ShopUserExample.Criteria: {}
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      //mock shopUserExample_Criteria0
      ShopUserExample.Criteria shopUserExample_Criteria0 = mock(ShopUserExample.Criteria.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: or
      shopUserExample0.or(shopUserExample_Criteria0);
      
      //Test Result Assert
      assertNull(shopUserExample0.getOrderByClause());
  }

  @Test(timeout = 9000)
  public void test_or_7()  throws Throwable  {
      //caseID:b6858daf877d7c5e8b37cc9bcc37283b
      //CoveredLines: [16, 17, 18, 45, 46, 47, 59, 60, 73, 74, 75, 564, 565]
      //Assert: assertNotNull(method_result);
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: or
      ShopUserExample.Criteria shopUserExample_Criteria0 = shopUserExample0.or();
      
      //Test Result Assert
      assertNotNull(shopUserExample_Criteria0);
  }

  @Test(timeout = 9000)
  public void test_setDistinct_8()  throws Throwable  {
      //caseID:20c810cabb81956cfe681a90d008b7e0
      //CoveredLines: [16, 17, 18, 29, 30]
      //Input_0_boolean: true
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: setDistinct
      shopUserExample0.setDistinct(true);
      
      //Test Result Assert
      assertTrue(shopUserExample0.isDistinct());
  }

  @Test(timeout = 9000)
  public void test_setOrderByClause_9()  throws Throwable  {
      //caseID:a8990462f6ed61910b9bfd1144bea0e9
      //CoveredLines: [16, 17, 18, 21, 22]
      //Input_0_String: user_reg_time <=
      
      ShopUserExample shopUserExample0 = new ShopUserExample();
      
      //Call method: setOrderByClause
      shopUserExample0.setOrderByClause("user_reg_time <=");
      
      //Test Result Assert
      assertFalse(shopUserExample0.isDistinct());
  }
}
