/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.PayStringResult;
import java.math.BigDecimal;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class PayStringResult_SSTest extends PayStringResult_SSTest_scaffolding {
// allCoveredLines:[8, 10, 12, 14, 16]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:dd90ebcc7bc771a6ccbad1f31309f78e
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: payStringResult0
      //Assert: assertTrue(method_result);
      
      PayStringResult payStringResult0 = new PayStringResult();
      
      //Call method: equals
      boolean boolean0 = payStringResult0.equals(payStringResult0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:167481e2a6f722f9797b3c147e788a97
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: BigDecimal.ZERO
      //Assert: assertFalse(method_result);
      
      PayStringResult payStringResult0 = new PayStringResult();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: equals
      boolean boolean0 = payStringResult0.equals(bigDecimal0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:aee74bdd0b40fac1cae731f50fc765c7
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      //Input_0_Object: payStringResult0
      //Assert: assertTrue(method_result);
      
      PayStringResult payStringResult0 = new PayStringResult();
      PayStringResult payStringResult1 = new PayStringResult();
      
      //Call method: equals
      boolean boolean0 = payStringResult1.equals(payStringResult0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:8aa6dc38983abcf7c68a7c2215f97e43
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      //Input_0_Object: payStringResult1
      //Assert: assertTrue(method_result);
      
      PayStringResult payStringResult0 = new PayStringResult();
      PayStringResult payStringResult1 = new PayStringResult();
      
      //Call method: equals
      boolean boolean0 = payStringResult0.equals(payStringResult1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:010138c8901f3ea71b683e26a3a97170
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      
      PayStringResult payStringResult0 = new PayStringResult();
      
      //Call method: hashCode
      payStringResult0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setIsPaid_5()  throws Throwable  {
      //caseID:f043fa47609950f0b482e1c720f8236a
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Integer: 43
      
      PayStringResult payStringResult0 = new PayStringResult();
      Integer integer0 = new Integer(43);
      
      //Call method: setIsPaid
      payStringResult0.setIsPaid(integer0);
      
      //Test Result Assert
      assertEquals(43, (int)payStringResult0.getIsPaid());
  }

  @Test(timeout = 9000)
  public void test_setOrderId_6()  throws Throwable  {
      //caseID:a9246a5c228460eca7013a8ed97addee
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: 1
      
      PayStringResult payStringResult0 = new PayStringResult();
      
      //Call method: setOrderId
      payStringResult0.setOrderId("1");
      
      //Test Result Assert
      assertNull(payStringResult0.getPayId());
  }

  @Test(timeout = 9000)
  public void test_setPayAmount_7()  throws Throwable  {
      //caseID:07190609338d07284718140fec7f9bb5
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      PayStringResult payStringResult0 = new PayStringResult();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setPayAmount
      payStringResult0.setPayAmount(bigDecimal0);
      
      //Test Result Assert
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 9000)
  public void test_setPayId_8()  throws Throwable  {
      //caseID:bb0cdc02848ec8a3bdff01b88c12db84
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: 1.0
      
      PayStringResult payStringResult0 = new PayStringResult();
      
      //Call method: setPayId
      payStringResult0.setPayId("1.0");
      
      //Test Result Assert
      assertNull(payStringResult0.getIsPaid());
  }

  @Test(timeout = 9000)
  public void test_toString_9()  throws Throwable  {
      //caseID:a611a580575a7778d548ac0a8cdec301
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      //Assert: assertEquals("PayStringResult(payId=null, orderId=null, payAmount=null, isPaid=null)", method_result);
      
      PayStringResult payStringResult0 = new PayStringResult();
      
      //Call method: toString
      String string0 = payStringResult0.toString();
      
      //Test Result Assert
      assertEquals("PayStringResult(payId=null, orderId=null, payAmount=null, isPaid=null)", string0);
  }
}
