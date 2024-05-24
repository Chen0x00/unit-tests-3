/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopOrderGoodsLog;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopOrderGoodsLog_SSTest extends ShopOrderGoodsLog_SSTest_scaffolding {
// allCoveredLines:[8, 10, 12]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:89ed90eab23185f3b1b7ca9515772d51
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: shopOrderGoodsLog0
      //Assert: assertTrue(method_result);
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLog0.equals(shopOrderGoodsLog0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:f93ea7da18a46be44d2dab8f6e60c531
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: 0
      //Assert: assertFalse(method_result);
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      Long long0 = new Long(0);
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLog0.equals(long0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:b81d0e092d83c625ae1e5025ba70c6fe
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 10, 12]
      //Input_0_Object: shopOrderGoodsLog0
      //Assert: assertTrue(method_result);
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      ShopOrderGoodsLog shopOrderGoodsLog1 = new ShopOrderGoodsLog();
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLog1.equals(shopOrderGoodsLog0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:40383f0d4ff57d5e19b190d8e44f1a33
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 10, 12]
      //Input_0_Object: shopOrderGoodsLog1
      //Assert: assertTrue(method_result);
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      ShopOrderGoodsLog shopOrderGoodsLog1 = new ShopOrderGoodsLog();
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLog0.equals(shopOrderGoodsLog1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:7c33c38063e066d3cc3265456e236f5b
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 10, 12]
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      
      //Call method: hashCode
      shopOrderGoodsLog0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setGoodsNumber_5()  throws Throwable  {
      //caseID:9655e3151eb2df30a398e7d9869e049b
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8]
      //Input_0_Integer: 0
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      Integer integer0 = new Integer(0);
      
      //Call method: setGoodsNumber
      shopOrderGoodsLog0.setGoodsNumber(integer0);
      
      //Test Result Assert
      assertEquals(0, (int)shopOrderGoodsLog0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setLogTime_6()  throws Throwable  {
      //caseID:d307ff385fbb57dfef76860cda56a8bc
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8]
      //Input_0_Date: {}
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setLogTime
      shopOrderGoodsLog0.setLogTime(date0);
      
      //Test Result Assert
      assertNull(shopOrderGoodsLog0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_toString_7()  throws Throwable  {
      //caseID:cb3f0f1e3a81fd29e2b5e7d690940ebf
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 10, 12]
      //Assert: assertEquals("ShopOrderGoodsLog(goodsNumber=null, logTime=null)", method_result);
      
      ShopOrderGoodsLog shopOrderGoodsLog0 = new ShopOrderGoodsLog();
      
      //Call method: toString
      String string0 = shopOrderGoodsLog0.toString();
      
      //Test Result Assert
      assertEquals("ShopOrderGoodsLog(goodsNumber=null, logTime=null)", string0);
  }
}
