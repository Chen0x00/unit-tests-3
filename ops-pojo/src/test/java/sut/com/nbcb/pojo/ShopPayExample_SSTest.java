/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopPayExample;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopPayExample_SSTest extends ShopPayExample_SSTest_scaffolding {
// allCoveredLines:[15, 16, 17, 20, 21, 24, 28, 29, 32, 36, 40, 41, 44, 45, 46, 50, 51, 52, 54, 58, 59, 63, 64, 65, 66, 72, 73, 74, 353, 354]

  @Test(timeout = 9000)
  public void test_clear_0()  throws Throwable  {
      //caseID:6d8b00dc7ef1166c0b11c497be5d0492
      //CoveredLines: [15, 16, 17, 63, 64, 65, 66]
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: clear
      shopPayExample0.clear();
      
      //Test Result Assert
      assertFalse(shopPayExample0.isDistinct());
  }

  @Test(timeout = 9000)
  public void test_createCriteria_1()  throws Throwable  {
      //caseID:94c988dc6359e34ccd9518122901d85c
      //CoveredLines: [15, 16, 17, 50, 51, 54, 58, 59, 72, 73, 74, 353, 354]
      //Assert: assertFalse(method_result.equals((Object)shopPayExample_Criteria0));
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      LinkedList<ShopPayExample.Criteria> linkedList0 = new LinkedList<ShopPayExample.Criteria>();
      //mock shopPayExample_Criteria0
      ShopPayExample.Criteria shopPayExample_Criteria0 = mock(ShopPayExample.Criteria.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      linkedList0.add(shopPayExample_Criteria0);
      
      PrivateAccess.setVariable((Class<?>) ShopPayExample.class, shopPayExample0, "oredCriteria", (Object) linkedList0);
      
      //Call method: createCriteria
      ShopPayExample.Criteria shopPayExample_Criteria1 = shopPayExample0.createCriteria();
      
      //Test Result Assert
      assertFalse(shopPayExample_Criteria1.equals((Object)shopPayExample_Criteria0));
  }

  @Test(timeout = 9000)
  public void test_createCriteria_2()  throws Throwable  {
      //caseID:0e9f297e4cae3b46edcbd41daa4b0630
      //CoveredLines: [15, 16, 17, 50, 51, 52, 54, 58, 59, 72, 73, 74, 353, 354]
      //Assert: assertNotNull(method_result);
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: createCriteria
      ShopPayExample.Criteria shopPayExample_Criteria0 = shopPayExample0.createCriteria();
      
      //Test Result Assert
      assertNotNull(shopPayExample_Criteria0);
  }

  @Test(timeout = 9000)
  public void test_getOrderByClause_3()  throws Throwable  {
      //caseID:973a0b887d0e6212888aea363e8218fb
      //CoveredLines: [15, 16, 17, 24]
      //Assert: assertNull(method_result);
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: getOrderByClause
      String string0 = shopPayExample0.getOrderByClause();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getOredCriteria_4()  throws Throwable  {
      //caseID:9123dd968ec221c530d0cc64738b6c8c
      //CoveredLines: [15, 16, 17, 36]
      //Assert: assertTrue(method_result.isEmpty());
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: getOredCriteria
      List<ShopPayExample.Criteria> list0 = shopPayExample0.getOredCriteria();
      
      //Test Result Assert
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 9000)
  public void test_isDistinct_5()  throws Throwable  {
      //caseID:539f056d85bac14986023edbd884314f
      //CoveredLines: [15, 16, 17, 32]
      //Assert: assertFalse(method_result);
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: isDistinct
      boolean boolean0 = shopPayExample0.isDistinct();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_or_6()  throws Throwable  {
      //caseID:150465f8d5a9c3779b1d6f2e767d6baa
      //CoveredLines: [15, 16, 17, 40, 41]
      //Input_0_ShopPayExample.Criteria: {}
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      //mock shopPayExample_Criteria0
      ShopPayExample.Criteria shopPayExample_Criteria0 = mock(ShopPayExample.Criteria.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: or
      shopPayExample0.or(shopPayExample_Criteria0);
      
      //Test Result Assert
      assertFalse(shopPayExample0.isDistinct());
  }

  @Test(timeout = 9000)
  public void test_or_7()  throws Throwable  {
      //caseID:8f0a5e4134f6b9cef6915c0686eb8413
      //CoveredLines: [15, 16, 17, 44, 45, 46, 58, 59, 72, 73, 74, 353, 354]
      //Assert: assertNotNull(method_result);
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: or
      ShopPayExample.Criteria shopPayExample_Criteria0 = shopPayExample0.or();
      
      //Test Result Assert
      assertNotNull(shopPayExample_Criteria0);
  }

  @Test(timeout = 9000)
  public void test_setDistinct_8()  throws Throwable  {
      //caseID:42e7fe69d428eee918f677ba73f49589
      //CoveredLines: [15, 16, 17, 28, 29]
      //Input_0_boolean: true
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: setDistinct
      shopPayExample0.setDistinct(true);
      
      //Test Result Assert
      assertNull(shopPayExample0.getOrderByClause());
  }

  @Test(timeout = 9000)
  public void test_setOrderByClause_9()  throws Throwable  {
      //caseID:c3938d9ca26113ec76d5beb021959769
      //CoveredLines: [15, 16, 17, 20, 21]
      //Input_0_String: L(
      
      ShopPayExample shopPayExample0 = new ShopPayExample();
      
      //Call method: setOrderByClause
      shopPayExample0.setOrderByClause("L(");
      
      //Test Result Assert
      assertFalse(shopPayExample0.isDistinct());
  }
}
