/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.Summary;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class Summary_SSTest extends Summary_SSTest_scaffolding {
// allCoveredLines:[6, 11, 15, 19, 23, 27]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:917611d83f0e033bb9e2977cfb3deb3a
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_Object: 1.0
      //Assert: assertFalse(method_result);
      
      Summary summary0 = new Summary();
      
      //Call method: equals
      boolean boolean0 = summary0.equals("1.0");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:2328b71560170f0c2e84d8ae2d34af94
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_Object: summary0
      //Assert: assertTrue(method_result);
      
      Summary summary0 = new Summary();
      
      //Call method: equals
      boolean boolean0 = summary0.equals(summary0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:d7501da9452c967545f3d96c56d7a301
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19, 23, 27]
      //Input_0_Object: summary1
      //Assert: assertTrue(method_result);
      
      Summary summary0 = new Summary();
      Summary summary1 = new Summary();
      
      //Call method: equals
      boolean boolean0 = summary0.equals(summary1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_3()  throws Throwable  {
      //caseID:21cff7da9b6daeb92b3d794c40a7ef2c
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19, 23, 27]
      
      Summary summary0 = new Summary();
      
      //Call method: hashCode
      summary0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setDiscountPrice_4()  throws Throwable  {
      //caseID:3822b0d69b8f1956ac3d029430110fa4
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_long: -2036
      
      Summary summary0 = new Summary();
      
      //Call method: setDiscountPrice
      summary0.setDiscountPrice((-2036L));
      
      //Test Result Assert
      assertEquals(0L, summary0.getTotalPrice());
  }

  @Test(timeout = 9000)
  public void test_setGoodsCount_5()  throws Throwable  {
      //caseID:c0e6f9a6670f7b3b84e0a48152437f83
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_long: 0
      
      Summary summary0 = new Summary();
      
      //Call method: setGoodsCount
      summary0.setGoodsCount(0L);
      
      //Test Result Assert
      assertEquals(0L, summary0.getTotalPayPrice());
  }

  @Test(timeout = 9000)
  public void test_setPostFee_6()  throws Throwable  {
      //caseID:f5c9665944fb4b21630e182f3682fb3a
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_long: 0
      
      Summary summary0 = new Summary();
      
      //Call method: setPostFee
      summary0.setPostFee(0L);
      
      //Test Result Assert
      assertEquals(0L, summary0.getPostFee());
  }

  @Test(timeout = 9000)
  public void test_setTotalPayPrice_7()  throws Throwable  {
      //caseID:ff0ef8e8017cb76ad2e4fd71addb31a1
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_long: 870
      
      Summary summary0 = new Summary();
      
      //Call method: setTotalPayPrice
      summary0.setTotalPayPrice(870L);
      
      //Test Result Assert
      assertEquals(870L, summary0.getTotalPayPrice());
  }

  @Test(timeout = 9000)
  public void test_setTotalPrice_8()  throws Throwable  {
      //caseID:41aa031190d99b717b4912e96ad91dc8
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
      //Input_0_long: 0
      
      Summary summary0 = new Summary();
      
      //Call method: setTotalPrice
      summary0.setTotalPrice(0L);
      
      //Test Result Assert
      assertEquals(0L, summary0.getDiscountPrice());
  }

  @Test(timeout = 9000)
  public void test_toString_9()  throws Throwable  {
      //caseID:c8315bbe3f7d3a998d175ec6af3dc052
      //CoveredLines: [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 11, 15, 19, 23, 27]
      //Assert: assertEquals("Summary(discountPrice=0, goodsCount=0, postFee=0, totalPayPrice=0, totalPrice=0)", method_result);
      
      Summary summary0 = new Summary();
      
      //Call method: toString
      String string0 = summary0.toString();
      
      //Test Result Assert
      assertEquals("Summary(discountPrice=0, goodsCount=0, postFee=0, totalPayPrice=0, totalPrice=0)", string0);
  }
}
