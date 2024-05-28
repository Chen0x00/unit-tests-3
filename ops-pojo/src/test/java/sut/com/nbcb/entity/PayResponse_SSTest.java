/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.entity.PayResponse;
import com.nbcb.entity.PayStringResult;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class PayResponse_SSTest extends PayResponse_SSTest_scaffolding {
// allCoveredLines:[6, 11, 15, 19]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:8c1f94eea8b7619613d7b816d96281fa
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_Object: , msg=
      //Assert: assertFalse(method_result);
      
      PayResponse payResponse0 = new PayResponse();
      
      //Call method: equals
      boolean boolean0 = payResponse0.equals(", msg=");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:cae9f511a888c2f3e91231763d454251
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_Object: payResponse0
      //Assert: assertTrue(method_result);
      
      PayResponse payResponse0 = new PayResponse();
      
      //Call method: equals
      boolean boolean0 = payResponse0.equals(payResponse0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:2e796529f9f2af2c0122a4dfcd108279
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19]
      //Input_0_Object: payResponse0
      //Assert: assertTrue(method_result);
      
      PayResponse payResponse0 = new PayResponse();
      PayResponse payResponse1 = new PayResponse();
      
      //Call method: equals
      boolean boolean0 = payResponse1.equals(payResponse0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:75cc065b8bb1b4528d5da8f698b04d7b
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19]
      //Input_0_Object: payResponse1
      //Assert: assertTrue(method_result);
      
      PayResponse payResponse0 = new PayResponse();
      PayResponse payResponse1 = new PayResponse();
      
      //Call method: equals
      boolean boolean0 = payResponse0.equals(payResponse1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:c509ce9c6ede3920c0c74bb8f14a14d1
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19]
      
      PayResponse payResponse0 = new PayResponse();
      
      //Call method: hashCode
      payResponse0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setCode_5()  throws Throwable  {
      //caseID:9471a3039ddd540b33f5c2aa50ca594b
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_String: 
      
      PayResponse payResponse0 = new PayResponse();
      
      //Call method: setCode
      payResponse0.setCode("");
      
      //Test Result Assert
      assertEquals("", payResponse0.getCode());
  }

  @Test(timeout = 9000)
  public void test_setMsg_6()  throws Throwable  {
      //caseID:32d792dabe350e27930969dfb3ec8471
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_String: , result=
      
      PayResponse payResponse0 = new PayResponse();
      
      //Call method: setMsg
      payResponse0.setMsg(", result=");
      
      //Test Result Assert
      assertEquals(", result=", payResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_setResult_7()  throws Throwable  {
      //caseID:5cc95a75160145d2f8a512636c38dee4
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_PayStringResult: {}
      
      PayResponse payResponse0 = new PayResponse();
      //mock payStringResult0
      PayStringResult payStringResult0 = mock(PayStringResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setResult
      payResponse0.setResult(payStringResult0);
      
      //Test Result Assert
      assertNull(payResponse0.getCode());
  }

  @Test(timeout = 9000)
  public void test_toString_8()  throws Throwable  {
      //caseID:c197a598d33dfd94c9a921d018b1df67
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19]
      //Assert: assertEquals("PayResponse(code=null, msg=null, result=null)", method_result);
      
      PayResponse payResponse0 = new PayResponse();
      
      //Call method: toString
      String string0 = payResponse0.toString();
      
      //Test Result Assert
      assertEquals("PayResponse(code=null, msg=null, result=null)", string0);
  }
}
