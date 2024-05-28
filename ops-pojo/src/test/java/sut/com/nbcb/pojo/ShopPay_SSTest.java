/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.pojo.ShopPay;
import java.math.BigDecimal;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopPay_SSTest extends ShopPay_SSTest_scaffolding {
// allCoveredLines:[8, 10, 12, 14, 16]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:56aa876b1856d73995e46718c1cff2a7
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: shopPay0
      //Assert: assertTrue(method_result);
      
      ShopPay shopPay0 = new ShopPay();
      
      //Call method: equals
      boolean boolean0 = shopPay0.equals(shopPay0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:11f857d030c3dad0190eae4dbb56a59f
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: 2328
      //Assert: assertFalse(method_result);
      
      ShopPay shopPay0 = new ShopPay();
      Long long0 = new Long(2328);
      
      //Call method: equals
      boolean boolean0 = shopPay0.equals(long0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:6afc86a3e3421bee7d945c99483cbdec
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      //Input_0_Object: shopPay1
      //Assert: assertTrue(method_result);
      
      ShopPay shopPay0 = new ShopPay();
      ShopPay shopPay1 = new ShopPay();
      
      //Call method: equals
      boolean boolean0 = shopPay0.equals(shopPay1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:d913bb192eb37c72cf5c6f866a7b7903
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      //Input_0_Object: shopPay0
      //Assert: assertTrue(method_result);
      
      ShopPay shopPay0 = new ShopPay();
      ShopPay shopPay1 = new ShopPay();
      
      //Call method: equals
      boolean boolean0 = shopPay1.equals(shopPay0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:46b2946930b1e28b1ee6e7684cb8c8c7
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      
      ShopPay shopPay0 = new ShopPay();
      
      //Call method: hashCode
      shopPay0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setIsPaid_5()  throws Throwable  {
      //caseID:7576e7930d728cb0e7809dcaa4e1dacd
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Integer: 43
      
      ShopPay shopPay0 = new ShopPay();
      Integer integer0 = new Integer(43);
      
      //Call method: setIsPaid
      shopPay0.setIsPaid(integer0);
      
      //Test Result Assert
      assertNull(shopPay0.getOrderId());
  }

  @Test(timeout = 9000)
  public void test_setOrderId_6()  throws Throwable  {
      //caseID:06d520d64735be7f4cc67a428c9af8c5
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Long: 0L
      
      ShopPay shopPay0 = new ShopPay();
      Long long0 = new Long(0L);
      
      //Call method: setOrderId
      shopPay0.setOrderId(long0);
      
      //Test Result Assert
      assertNull(shopPay0.getIsPaid());
  }

  @Test(timeout = 9000)
  public void test_setPayAmount_7()  throws Throwable  {
      //caseID:99cd85bdae272e8b5554a700c80940a2
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_BigDecimal: 1L
      
      ShopPay shopPay0 = new ShopPay();
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      
      //Call method: setPayAmount
      shopPay0.setPayAmount(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopPay0.getPayId());
  }

  @Test(timeout = 9000)
  public void test_setPayId_8()  throws Throwable  {
      //caseID:dd1bafdc8bc15a6e6bd1b5c763696ce8
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Long: 2870L
      
      ShopPay shopPay0 = new ShopPay();
      Long long0 = new Long(2870L);
      
      //Call method: setPayId
      shopPay0.setPayId(long0);
      
      //Test Result Assert
      assertEquals(2870L, (long)shopPay0.getPayId());
  }

  @Test(timeout = 9000)
  public void test_toString_9()  throws Throwable  {
      //caseID:de9bc284146628d14002e8e0d2f40ecf
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 10, 12, 14, 16]
      //Assert: assertEquals("ShopPay(payId=null, orderId=null, payAmount=null, isPaid=null)", method_result);
      
      ShopPay shopPay0 = new ShopPay();
      
      //Call method: toString
      String string0 = shopPay0.toString();
      
      //Test Result Assert
      assertEquals("ShopPay(payId=null, orderId=null, payAmount=null, isPaid=null)", string0);
  }
}
