/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.PayResult;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class PayResult_SSTest extends PayResult_SSTest_scaffolding {
// allCoveredLines:[5, 7, 8, 9, 10]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:cf88d31759ff74d74e0aa627e5d108ce
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: payResult0
      //Assert: assertTrue(method_result);
      
      PayResult payResult0 = new PayResult();
      
      //Call method: equals
      boolean boolean0 = payResult0.equals(payResult0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:e63bf39d091a87e7a10c0cef4233bcc2
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: 1L
      //Assert: assertFalse(method_result);
      
      PayResult payResult0 = new PayResult();
      Long long0 = new Long(1L);
      
      //Call method: equals
      boolean boolean0 = payResult0.equals(long0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:7f59fb8c83deb02141994b0bae43701d
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 8, 9, 10]
      //Input_0_Object: payResult1
      //Assert: assertTrue(method_result);
      
      PayResult payResult0 = new PayResult();
      PayResult payResult1 = new PayResult();
      
      //Call method: equals
      boolean boolean0 = payResult0.equals(payResult1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:6b34fe66ab98d701157bff86a5918872
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 8, 9, 10]
      //Input_0_Object: payResult0
      //Assert: assertTrue(method_result);
      
      PayResult payResult0 = new PayResult();
      PayResult payResult1 = new PayResult();
      
      //Call method: equals
      boolean boolean0 = payResult1.equals(payResult0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:007a66060efe25fc1f0e4167ade0d1c4
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 8, 9, 10]
      
      PayResult payResult0 = new PayResult();
      
      //Call method: hashCode
      payResult0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setMessage_5()  throws Throwable  {
      //caseID:3158344873b781cb54727095411cd28e
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 1
      
      PayResult payResult0 = new PayResult();
      
      //Call method: setMessage
      payResult0.setMessage("1");
      
      //Test Result Assert
      assertNull(payResult0.getPayId());
  }

  @Test(timeout = 9000)
  public void test_setOrderId_6()  throws Throwable  {
      //caseID:2ef358dc664a7b45f0a4d65f8ae1cfa9
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Long: 0L
      
      PayResult payResult0 = new PayResult();
      Long long0 = new Long(0L);
      
      //Call method: setOrderId
      payResult0.setOrderId(long0);
      
      //Test Result Assert
      assertEquals(0L, (long)payResult0.getOrderId());
  }

  @Test(timeout = 9000)
  public void test_setPayId_7()  throws Throwable  {
      //caseID:9b9ccd19a301ef28b46b0e1cc4731a15
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Long: 242L
      
      PayResult payResult0 = new PayResult();
      Long long0 = new Long(242L);
      
      //Call method: setPayId
      payResult0.setPayId(long0);
      
      //Test Result Assert
      assertNull(payResult0.getMessage());
  }

  @Test(timeout = 9000)
  public void test_setStatus_8()  throws Throwable  {
      //caseID:4ee224e85252a92052e8db4a2f58784a
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Boolean: Boolean.FALSE
      
      PayResult payResult0 = new PayResult();
      Boolean boolean0 = Boolean.FALSE;
      
      //Call method: setStatus
      payResult0.setStatus(boolean0);
      
      //Test Result Assert
      assertFalse(payResult0.getStatus());
  }

  @Test(timeout = 9000)
  public void test_toString_9()  throws Throwable  {
      //caseID:fc40196978dba80ecb44917eb21aa24a
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 8, 9, 10]
      //Assert: assertEquals("PayResult(message=null, payId=null, status=null, orderId=null)", method_result);
      
      PayResult payResult0 = new PayResult();
      
      //Call method: toString
      String string0 = payResult0.toString();
      
      //Test Result Assert
      assertEquals("PayResult(message=null, payId=null, status=null, orderId=null)", string0);
  }
}
