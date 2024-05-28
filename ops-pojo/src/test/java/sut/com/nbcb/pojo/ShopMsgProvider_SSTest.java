/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopMsgProvider;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopMsgProvider_SSTest extends ShopMsgProvider_SSTest_scaffolding {
// allCoveredLines:[8, 10, 12, 14, 16, 18]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:f0421d825a4e867a633ff290199c5ced
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: )
      //Assert: assertFalse(method_result);
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: equals
      boolean boolean0 = shopMsgProvider0.equals(")");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:6aec9599b60cd2ceb5913faf9b04fa84
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: shopMsgProvider0
      //Assert: assertTrue(method_result);
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: equals
      boolean boolean0 = shopMsgProvider0.equals(shopMsgProvider0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:7947ce72df2ce50adbbe81831d794628
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16, 18]
      //Input_0_Object: shopMsgProvider0
      //Assert: assertTrue(method_result);
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      ShopMsgProvider shopMsgProvider1 = new ShopMsgProvider();
      
      //Call method: equals
      boolean boolean0 = shopMsgProvider1.equals(shopMsgProvider0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:5c9a26681c43a370086e407bde4059d7
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16, 18]
      //Input_0_Object: shopMsgProvider1
      //Assert: assertTrue(method_result);
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      ShopMsgProvider shopMsgProvider1 = new ShopMsgProvider();
      
      //Call method: equals
      boolean boolean0 = shopMsgProvider0.equals(shopMsgProvider1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:eddfd3f062d2ce26d0630c69fedbda15
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16, 18]
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: hashCode
      shopMsgProvider0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setCreateTime_05()  throws Throwable  {
      //caseID:1d1d6260762b86a0895ba114f9e51802
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Date: {}
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setCreateTime
      shopMsgProvider0.setCreateTime(date0);
      
      //Test Result Assert
      assertNull(shopMsgProvider0.getMsgBody());
  }

  @Test(timeout = 9000)
  public void test_setId_06()  throws Throwable  {
      //caseID:03b30ab420bc6ca34951ac6fec04989f
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: com.nbcb.pojo.ShopMsgProvider
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: setId
      shopMsgProvider0.setId("com.nbcb.pojo.ShopMsgProvider");
      
      //Test Result Assert
      assertNull(shopMsgProvider0.getGroupName());
  }

  @Test(timeout = 9000)
  public void test_setMsgBody_07()  throws Throwable  {
      //caseID:bfd8cb3c93b62594fac3f67eaa46f159
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: 59
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: setMsgBody
      shopMsgProvider0.setMsgBody("59");
      
      //Test Result Assert
      assertNull(shopMsgProvider0.getMsgKey());
  }

  @Test(timeout = 9000)
  public void test_setMsgStatus_08()  throws Throwable  {
      //caseID:c453a92698ed20c8f386b7f47159e1b0
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Integer: 43
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      Integer integer0 = new Integer(43);
      
      //Call method: setMsgStatus
      shopMsgProvider0.setMsgStatus(integer0);
      
      //Test Result Assert
      assertEquals(43, (int)shopMsgProvider0.getMsgStatus());
  }

  @Test(timeout = 9000)
  public void test_setMsgTopic_09()  throws Throwable  {
      //caseID:a2df3dc61884b9c3644301f67c1fdc8f
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: Y
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: setMsgTopic
      shopMsgProvider0.setMsgTopic("Y");
      
      //Test Result Assert
      assertNull(shopMsgProvider0.getId());
  }

  @Test(timeout = 9000)
  public void test_toString_10()  throws Throwable  {
      //caseID:a6108c72baf3f573ca11a51eb38b2d24
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16, 18]
      //Assert: assertEquals("ShopMsgProvider(id=null, msgTopic=null, msgBody=null, msgStatus=null, createTime=null)", method_result);
      
      ShopMsgProvider shopMsgProvider0 = new ShopMsgProvider();
      
      //Call method: toString
      String string0 = shopMsgProvider0.toString();
      
      //Test Result Assert
      assertEquals("ShopMsgProvider(id=null, msgTopic=null, msgBody=null, msgStatus=null, createTime=null)", string0);
  }
}
