/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.Skus;
import com.nbcb.entity.SkusSpec;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class Skus_SSTest extends Skus_SSTest_scaffolding {
// allCoveredLines:[7, 12, 16, 20, 24, 28, 32]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:58aac0a7ed00a2fdc4f1d87b38c2383d
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: io.lettuce.core.dynamic.ReactiveTypeAdapters$PublisherToMonoAdapter
      //Assert: assertFalse(method_result);
      
      Skus skus0 = new Skus();
      
      //Call method: equals
      boolean boolean0 = skus0.equals("io.lettuce.core.dynamic.ReactiveTypeAdapters$PublisherToMonoAdapter");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:e908b2c868a504e26227775943025dd6
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: skus0
      //Assert: assertTrue(method_result);
      
      Skus skus0 = new Skus();
      
      //Call method: equals
      boolean boolean0 = skus0.equals(skus0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:f9bfe0932d4636bfa5914ae92aeb7d51
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20, 24, 28, 32]
      //Input_0_Object: skus0
      //Assert: assertTrue(method_result);
      
      Skus skus0 = new Skus();
      Skus skus1 = new Skus();
      
      //Call method: equals
      boolean boolean0 = skus1.equals(skus0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:99b675d27123f38a814cc08383a1b3c9
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20, 24, 28, 32]
      //Input_0_Object: skus1
      //Assert: assertTrue(method_result);
      
      Skus skus0 = new Skus();
      Skus skus1 = new Skus();
      
      //Call method: equals
      boolean boolean0 = skus0.equals(skus1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:34109790d120bc89272f1d3c68f22eaf
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20, 24, 28, 32]
      
      Skus skus0 = new Skus();
      
      //Call method: hashCode
      skus0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setId_05()  throws Throwable  {
      //caseID:f532df19fb39d9f9c8dd46b69e98b8e4
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: V8lbo.0M&gty_X
      
      Skus skus0 = new Skus();
      
      //Call method: setId
      skus0.setId("V8lbo.0M&gty_X");
      
      //Test Result Assert
      assertNull(skus0.getPrice());
  }

  @Test(timeout = 9000)
  public void test_setInventory_06()  throws Throwable  {
      //caseID:01fee7840a1bf4c2ea2e66c7d8bd6ad6
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_long: 0
      
      Skus skus0 = new Skus();
      
      //Call method: setInventory
      skus0.setInventory(0L);
      
      //Test Result Assert
      assertNull(skus0.getOldPrice());
  }

  @Test(timeout = 9000)
  public void test_setOldPrice_07()  throws Throwable  {
      //caseID:995ebf21ddbc7c2d2bcdef6845c39e2d
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: 0
      
      Skus skus0 = new Skus();
      
      //Call method: setOldPrice
      skus0.setOldPrice("0");
      
      //Test Result Assert
      assertNull(skus0.getSkuCode());
  }

  @Test(timeout = 9000)
  public void test_setPrice_08()  throws Throwable  {
      //caseID:cfc3e10b7c83851ce253cf12e18511d8
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: com.nbcb.entity.Skus
      
      Skus skus0 = new Skus();
      
      //Call method: setPrice
      skus0.setPrice("com.nbcb.entity.Skus");
      
      //Test Result Assert
      assertEquals(0L, skus0.getInventory());
  }

  @Test(timeout = 9000)
  public void test_setSkuCode_09()  throws Throwable  {
      //caseID:bacf3c83e553c5040ba7c3d26578daaa
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: , skuCode=
      
      Skus skus0 = new Skus();
      
      //Call method: setSkuCode
      skus0.setSkuCode(", skuCode=");
      
      //Test Result Assert
      assertNull(skus0.getPrice());
  }

  @Test(timeout = 9000)
  public void test_setSpecs_10()  throws Throwable  {
      //caseID:65dfb459291ef3e6039d4eddfa8c63d4
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_List<SkusSpec>: linkedList0
      
      Skus skus0 = new Skus();
      LinkedList<SkusSpec> linkedList0 = new LinkedList<SkusSpec>();
      
      //Call method: setSpecs
      skus0.setSpecs(linkedList0);
      
      //Test Result Assert
      assertNull(skus0.getId());
  }

  @Test(timeout = 9000)
  public void test_toString_11()  throws Throwable  {
      //caseID:2dbb799d3c9a2449603441f346c8e45e
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20, 24, 28, 32]
      //Assert: assertEquals("Skus(id=null, inventory=0, oldPrice=null, price=null, skuCode=null, specs=null)", method_result);
      
      Skus skus0 = new Skus();
      
      //Call method: toString
      String string0 = skus0.toString();
      
      //Test Result Assert
      assertEquals("Skus(id=null, inventory=0, oldPrice=null, price=null, skuCode=null, specs=null)", string0);
  }
}