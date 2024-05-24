/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopGoodsSeckill;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopGoodsSeckill_SSTest extends ShopGoodsSeckill_SSTest_scaffolding {
// allCoveredLines:[9, 14, 19, 24, 29]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:28d1d83eff1f07287ec0046bc9ea12da
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: shopGoodsSeckill0
      //Assert: assertTrue(method_result);
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      
      //Call method: equals
      boolean boolean0 = shopGoodsSeckill0.equals(shopGoodsSeckill0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:c1a6d185b43d2105018f66ad36848712
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: 1
      //Assert: assertFalse(method_result);
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      Long long0 = new Long(1);
      
      //Call method: equals
      boolean boolean0 = shopGoodsSeckill0.equals(long0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:dc7054cb81ade0ef78f0a70d061698a5
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 19, 24, 29]
      //Input_0_Object: shopGoodsSeckill1
      //Assert: assertTrue(method_result);
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      ShopGoodsSeckill shopGoodsSeckill1 = new ShopGoodsSeckill();
      
      //Call method: equals
      boolean boolean0 = shopGoodsSeckill0.equals(shopGoodsSeckill1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:d267f7bf44adb15d4cc76ef65abc0d95
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 19, 24, 29]
      //Input_0_Object: shopGoodsSeckill0
      //Assert: assertTrue(method_result);
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      ShopGoodsSeckill shopGoodsSeckill1 = new ShopGoodsSeckill();
      
      //Call method: equals
      boolean boolean0 = shopGoodsSeckill1.equals(shopGoodsSeckill0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:3f4cccea97aa57202678ac0a8a07bce4
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 19, 24, 29]
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      
      //Call method: hashCode
      shopGoodsSeckill0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setEndDate_5()  throws Throwable  {
      //caseID:e4f6cf0a386f6f13fb772b4287660702
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Date: {}
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setEndDate
      shopGoodsSeckill0.setEndDate(date0);
      
      //Test Result Assert
      assertNull(shopGoodsSeckill0.getGoodsName());
  }

  @Test(timeout = 9000)
  public void test_setSeckillPrice_6()  throws Throwable  {
      //caseID:d5e1f7bbcf57df21b1d19663662da8d0
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_BigDecimal: BigDecimal.ONE
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      
      //Call method: setSeckillPrice
      shopGoodsSeckill0.setSeckillPrice(bigDecimal0);
      
      //Test Result Assert
      assertNull(shopGoodsSeckill0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setStartDate_7()  throws Throwable  {
      //caseID:c86ef952de61e6fd00ff916da4d9c058
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Date: {}
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setStartDate
      shopGoodsSeckill0.setStartDate(date0);
      
      //Test Result Assert
      assertNull(shopGoodsSeckill0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setStockCount_8()  throws Throwable  {
      //caseID:9a0f1324d573a0e2597cd5feb474acd0
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Integer: 0
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      Integer integer0 = new Integer(0);
      
      //Call method: setStockCount
      shopGoodsSeckill0.setStockCount(integer0);
      
      //Test Result Assert
      assertNull(shopGoodsSeckill0.getGoodsId());
  }

  @Test(timeout = 9000)
  public void test_toString_9()  throws Throwable  {
      //caseID:ff8a0788098ecc9303c9d6f236b4f84d
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 19, 24, 29]
      //Assert: assertEquals("ShopGoodsSeckill(seckillPrice=null, stockCount=null, startDate=null, endDate=null)", method_result);
      
      ShopGoodsSeckill shopGoodsSeckill0 = new ShopGoodsSeckill();
      
      //Call method: toString
      String string0 = shopGoodsSeckill0.toString();
      
      //Test Result Assert
      assertEquals("ShopGoodsSeckill(seckillPrice=null, stockCount=null, startDate=null, endDate=null)", string0);
  }
}
