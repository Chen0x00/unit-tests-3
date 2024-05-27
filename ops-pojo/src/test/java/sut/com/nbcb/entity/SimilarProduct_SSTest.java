/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.SimilarProduct;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class SimilarProduct_SSTest extends SimilarProduct_SSTest_scaffolding {
// allCoveredLines:[5, 10, 14, 18, 22, 26, 30, 34]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:7e7ce3ccf4cb26267cbdc7af2adbed72
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: 1
      //Assert: assertFalse(method_result);
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: equals
      boolean boolean0 = similarProduct0.equals("1");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:84277621d8bc29b6dfcb2e64f4c69632
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: similarProduct0
      //Assert: assertTrue(method_result);
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: equals
      boolean boolean0 = similarProduct0.equals(similarProduct0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:9251c3ce1bff7d7164326d3cef1df28a
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      //Input_0_Object: similarProduct0
      //Assert: assertTrue(method_result);
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      SimilarProduct similarProduct1 = new SimilarProduct();
      
      //Call method: equals
      boolean boolean0 = similarProduct1.equals(similarProduct0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:7aff9ada3e3775d26fb590532fb22f7a
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      //Input_0_Object: similarProduct1
      //Assert: assertTrue(method_result);
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      SimilarProduct similarProduct1 = new SimilarProduct();
      
      //Call method: equals
      boolean boolean0 = similarProduct0.equals(similarProduct1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:9af616ceeeb489e0244c59399b334dd0
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: hashCode
      similarProduct0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setDesc_05()  throws Throwable  {
      //caseID:aeedd7c464ae29a5021cf7974d721406
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: SimilarProduct(desc=
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setDesc
      similarProduct0.setDesc("SimilarProduct(desc=");
      
      //Test Result Assert
      assertEquals(0L, similarProduct0.getOrderNum());
  }

  @Test(timeout = 9000)
  public void test_setDiscount_06()  throws Throwable  {
      //caseID:eeedb861420a8c0d7c5e80c07323eec4
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: , name=
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setDiscount
      similarProduct0.setDiscount(", name=");
      
      //Test Result Assert
      assertNull(similarProduct0.getName());
  }

  @Test(timeout = 9000)
  public void test_setId_07()  throws Throwable  {
      //caseID:c3b6fa7f8de8710485f5553850096ea7
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 1.0
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setId
      similarProduct0.setId("1.0");
      
      //Test Result Assert
      assertEquals(0L, similarProduct0.getOrderNum());
  }

  @Test(timeout = 9000)
  public void test_setName_08()  throws Throwable  {
      //caseID:adf8855f2bb9a406f86089b1f6f402f7
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 1.0
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setName
      similarProduct0.setName("1.0");
      
      //Test Result Assert
      assertEquals(0L, similarProduct0.getOrderNum());
  }

  @Test(timeout = 9000)
  public void test_setOrderNum_09()  throws Throwable  {
      //caseID:875f2a4ed05997b7217cede9d599970d
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_long: 2282
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setOrderNum
      similarProduct0.setOrderNum(2282L);
      
      //Test Result Assert
      assertNull(similarProduct0.getId());
  }

  @Test(timeout = 9000)
  public void test_setPicture_10()  throws Throwable  {
      //caseID:58aa014c85743beb96730410ff197d7b
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setPicture
      similarProduct0.setPicture("");
      
      //Test Result Assert
      assertNull(similarProduct0.getDesc());
  }

  @Test(timeout = 9000)
  public void test_setPrice_11()  throws Throwable  {
      //caseID:14bffb271924c86ab3b742eaa7fa756b
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: setPrice
      similarProduct0.setPrice("");
      
      //Test Result Assert
      assertNull(similarProduct0.getId());
  }

  @Test(timeout = 9000)
  public void test_toString_12()  throws Throwable  {
      //caseID:664779730a24ff8b7a811d7e12116270
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22, 26, 30, 34]
      //Assert: assertEquals("SimilarProduct(desc=null, discount=null, id=null, name=null, orderNum=0, picture=null, price=null)", method_result);
      
      SimilarProduct similarProduct0 = new SimilarProduct();
      
      //Call method: toString
      String string0 = similarProduct0.toString();
      
      //Test Result Assert
      assertEquals("SimilarProduct(desc=null, discount=null, id=null, name=null, orderNum=0, picture=null, price=null)", string0);
  }
}
