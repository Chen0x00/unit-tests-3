/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.HotByDay;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class HotByDay_SSTest extends HotByDay_SSTest_scaffolding {
// allCoveredLines:[5, 10, 14, 18, 22, 26, 30, 34]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:442f6b220d277d0d9a7b11d7ca679b67
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: hotByDay0
      //Assert: assertTrue(method_result);
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: equals
      boolean boolean0 = hotByDay0.equals(hotByDay0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:d97719b86dd27f0e863048f63e98e987
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: , price=
      //Assert: assertFalse(method_result);
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: equals
      boolean boolean0 = hotByDay0.equals(", price=");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:df0f8c0ac4e7dc5daf0cd8de8c9cf153
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      //Input_0_Object: hotByDay1
      //Assert: assertTrue(method_result);
      
      HotByDay hotByDay0 = new HotByDay();
      HotByDay hotByDay1 = new HotByDay();
      
      //Call method: equals
      boolean boolean0 = hotByDay0.equals(hotByDay1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_03()  throws Throwable  {
      //caseID:4bf0b4305137454a3c90bacff189e258
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: hashCode
      hotByDay0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setDesc_04()  throws Throwable  {
      //caseID:b4d8ebb396cd867ba428d6a0fc4fbe0b
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 0
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setDesc
      hotByDay0.setDesc("0");
      
      //Test Result Assert
      assertEquals("0", hotByDay0.getDesc());
  }

  @Test(timeout = 9000)
  public void test_setDiscount_05()  throws Throwable  {
      //caseID:99966f6d6c7507456cc6c81e44e53d94
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: cVf&ry}87nE
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setDiscount
      hotByDay0.setDiscount("cVf&ry}87nE");
      
      //Test Result Assert
      assertNull(hotByDay0.getPicture());
  }

  @Test(timeout = 9000)
  public void test_setId_06()  throws Throwable  {
      //caseID:049c1c78b431f1eef6de1d23b18e4ecf
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: Pw.B24kgZ;<J=v
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setId
      hotByDay0.setId("Pw.B24kgZ;<J=v");
      
      //Test Result Assert
      assertNull(hotByDay0.getName());
  }

  @Test(timeout = 9000)
  public void test_setName_07()  throws Throwable  {
      //caseID:9c0b8a454f52481b4e99c409f85e633b
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 1
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setName
      hotByDay0.setName("1");
      
      //Test Result Assert
      assertNull(hotByDay0.getPicture());
  }

  @Test(timeout = 9000)
  public void test_setOrderNum_08()  throws Throwable  {
      //caseID:8498ea3f5f8a433ec7550fe9dafc67c2
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_long: 2242
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setOrderNum
      hotByDay0.setOrderNum(2242L);
      
      //Test Result Assert
      assertNull(hotByDay0.getPicture());
  }

  @Test(timeout = 9000)
  public void test_setPicture_09()  throws Throwable  {
      //caseID:5916cadd161d834f2250e87ff6899105
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 1.0
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setPicture
      hotByDay0.setPicture("1.0");
      
      //Test Result Assert
      assertNull(hotByDay0.getName());
  }

  @Test(timeout = 9000)
  public void test_setPrice_10()  throws Throwable  {
      //caseID:21f99f34671211ac11510c280baf9d47
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: setPrice
      hotByDay0.setPrice("");
      
      //Test Result Assert
      assertNull(hotByDay0.getName());
  }

  @Test(timeout = 9000)
  public void test_toString_11()  throws Throwable  {
      //caseID:929a3e9b0ff172bbf64c3359688d202d
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      //Assert: assertEquals("HotByDay(desc=null, discount=null, id=null, name=null, orderNum=0, picture=null, price=null)", method_result);
      
      HotByDay hotByDay0 = new HotByDay();
      
      //Call method: toString
      String string0 = hotByDay0.toString();
      
      //Test Result Assert
      assertEquals("HotByDay(desc=null, discount=null, id=null, name=null, orderNum=0, picture=null, price=null)", string0);
  }
}
