/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.pojo.ShopOrderGoodsLogKey;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopOrderGoodsLogKey_SSTest extends ShopOrderGoodsLogKey_SSTest_scaffolding {
// allCoveredLines:[7, 9, 11]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:9de99830d970955b143aa0616a700f0b
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: shopOrderGoodsLogKey0
      //Assert: assertTrue(method_result);
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLogKey0.equals(shopOrderGoodsLogKey0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:4bca2cb1ac14ac1ffb52682d5326b746
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: 416L
      //Assert: assertFalse(method_result);
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      Long long0 = new Long(416L);
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLogKey0.equals(long0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:7bd7e180c473d6199496afb14a96fa84
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 9, 11]
      //Input_0_Object: shopOrderGoodsLogKey0
      //Assert: assertTrue(method_result);
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      ShopOrderGoodsLogKey shopOrderGoodsLogKey1 = new ShopOrderGoodsLogKey();
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLogKey1.equals(shopOrderGoodsLogKey0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:4e130f95496ea5f42d15d4c0798ed34e
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 9, 11]
      //Input_0_Object: shopOrderGoodsLogKey1
      //Assert: assertTrue(method_result);
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      ShopOrderGoodsLogKey shopOrderGoodsLogKey1 = new ShopOrderGoodsLogKey();
      
      //Call method: equals
      boolean boolean0 = shopOrderGoodsLogKey0.equals(shopOrderGoodsLogKey1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:88b3d1016452b29da4fe262c6d4a0f3c
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 9, 11]
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      
      //Call method: hashCode
      shopOrderGoodsLogKey0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setGoodsId_5()  throws Throwable  {
      //caseID:45f826c017373f5a59b6d7f0446068b6
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7]
      //Input_0_Long: 1L
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      Long long0 = new Long(1L);
      
      //Call method: setGoodsId
      shopOrderGoodsLogKey0.setGoodsId(long0);
      
      //Test Result Assert
      assertNull(shopOrderGoodsLogKey0.getOrderId());
  }

  @Test(timeout = 9000)
  public void test_setOrderId_6()  throws Throwable  {
      //caseID:045f4e9f290834cb8a91ce292e2813f8
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7]
      //Input_0_Long: 1936L
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      Long long0 = new Long(1936L);
      
      //Call method: setOrderId
      shopOrderGoodsLogKey0.setOrderId(long0);
      
      //Test Result Assert
      assertNull(shopOrderGoodsLogKey0.getGoodsId());
  }

  @Test(timeout = 9000)
  public void test_toString_7()  throws Throwable  {
      //caseID:3a49098e1edda56ef5412e65c0d8d5a5
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 9, 11]
      //Assert: assertEquals("ShopOrderGoodsLogKey(goodsId=null, orderId=null)", method_result);
      
      ShopOrderGoodsLogKey shopOrderGoodsLogKey0 = new ShopOrderGoodsLogKey();
      
      //Call method: toString
      String string0 = shopOrderGoodsLogKey0.toString();
      
      //Test Result Assert
      assertEquals("ShopOrderGoodsLogKey(goodsId=null, orderId=null)", string0);
  }
}
