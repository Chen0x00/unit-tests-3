/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopGoods;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopGoods_SSTest extends ShopGoods_SSTest_scaffolding {
// allCoveredLines:[8, 11, 13, 15, 17, 19, 21]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:f471c9217c0282868c0402936d0056b4
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: 1
      //Assert: assertFalse(method_result);
      
      ShopGoods shopGoods0 = new ShopGoods();
      
      //Call method: equals
      boolean boolean0 = shopGoods0.equals("1");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:470b796af33a8ce368f833cae6a938e8
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Object: shopGoods0
      //Assert: assertTrue(method_result);
      
      ShopGoods shopGoods0 = new ShopGoods();
      
      //Call method: equals
      boolean boolean0 = shopGoods0.equals(shopGoods0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:0e29161a5d890c5b75c9510bf000c09d
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 11, 13, 15, 17, 19, 21]
      //Input_0_Object: shopGoods1
      //Assert: assertTrue(method_result);
      
      ShopGoods shopGoods0 = new ShopGoods();
      ShopGoods shopGoods1 = new ShopGoods();
      
      //Call method: equals
      boolean boolean0 = shopGoods0.equals(shopGoods1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:7468256fc910386cac50b6321a1c0ca7
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 11, 13, 15, 17, 19, 21]
      //Input_0_Object: shopGoods0
      //Assert: assertTrue(method_result);
      
      ShopGoods shopGoods0 = new ShopGoods();
      ShopGoods shopGoods1 = new ShopGoods();
      
      //Call method: equals
      boolean boolean0 = shopGoods1.equals(shopGoods0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:907469421cb668047f67d5bd80390f46
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 11, 13, 15, 17, 19, 21]
      
      ShopGoods shopGoods0 = new ShopGoods();
      
      //Call method: hashCode
      shopGoods0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAddTime_05()  throws Throwable  {
      //caseID:7a8679ddeed2e1fbf07c49fbebe57903
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Date: {}
      
      ShopGoods shopGoods0 = new ShopGoods();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setAddTime
      shopGoods0.setAddTime(date0);
      
      //Test Result Assert
      assertNull(shopGoods0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setGoodsDesc_06()  throws Throwable  {
      //caseID:805a371f02df36c0d3313152a5797eaa
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: 
      
      ShopGoods shopGoods0 = new ShopGoods();
      
      //Call method: setGoodsDesc
      shopGoods0.setGoodsDesc("");
      
      //Test Result Assert
      assertNull(shopGoods0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setGoodsId_07()  throws Throwable  {
      //caseID:8473203665c15af34e329158a92d78dc
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Long: 1792L
      
      ShopGoods shopGoods0 = new ShopGoods();
      Long long0 = new Long(1792L);
      
      //Call method: setGoodsId
      shopGoods0.setGoodsId(long0);
      
      //Test Result Assert
      assertNull(shopGoods0.getGoodsNumber());
  }

  @Test(timeout = 9000)
  public void test_setGoodsName_08()  throws Throwable  {
      //caseID:121fef1ad9c2fc7a6ab3b490f621c5ca
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_String: , goodsPrice=
      
      ShopGoods shopGoods0 = new ShopGoods();
      
      //Call method: setGoodsName
      shopGoods0.setGoodsName(", goodsPrice=");
      
      //Test Result Assert
      assertNull(shopGoods0.getGoodsId());
  }

  @Test(timeout = 9000)
  public void test_setGoodsNumber_09()  throws Throwable  {
      //caseID:bdd4008f0e1fb39c6d535c7419dfa036
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_Integer: (-1)
      
      ShopGoods shopGoods0 = new ShopGoods();
      Integer integer0 = new Integer((-1));
      
      //Call method: setGoodsNumber
      shopGoods0.setGoodsNumber(integer0);
      
      //Test Result Assert
      assertNull(shopGoods0.getGoodsName());
  }

  @Test(timeout = 9000)
  public void test_setGoodsPrice_10()  throws Throwable  {
      //caseID:62654995d492f3cf6e3c401b2f34465a
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
      //Input_0_BigDecimal: (-1.0)
      
      ShopGoods shopGoods0 = new ShopGoods();
      BigDecimal bigDecimal0 = new BigDecimal((-1.0));
      
      //Call method: setGoodsPrice
      shopGoods0.setGoodsPrice(bigDecimal0);
      
      //Test Result Assert
      assertEquals((byte) (-1), bigDecimal0.byteValue());
  }

  @Test(timeout = 9000)
  public void test_toString_11()  throws Throwable  {
      //caseID:1d9b2a6ab02644a7e04a33d44ccfa9cb
      //CoveredLines: [8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 11, 13, 15, 17, 19, 21]
      //Assert: assertEquals("ShopGoods(goodsId=null, goodsName=null, goodsNumber=null, goodsPrice=null, goodsDesc=null, addTime=null)", method_result);
      
      ShopGoods shopGoods0 = new ShopGoods();
      
      //Call method: toString
      String string0 = shopGoods0.toString();
      
      //Test Result Assert
      assertEquals("ShopGoods(goodsId=null, goodsName=null, goodsNumber=null, goodsPrice=null, goodsDesc=null, addTime=null)", string0);
  }
}
