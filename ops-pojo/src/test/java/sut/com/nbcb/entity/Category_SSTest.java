/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.entity.Category;
import com.nbcb.entity.Parent;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class Category_SSTest extends Category_SSTest_scaffolding {
// allCoveredLines:[5, 10, 14, 18, 22]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:5529221ee07664fa2bca11b613efb330
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: category0
      //Assert: assertTrue(method_result);
      
      Category category0 = new Category();
      
      //Call method: equals
      boolean boolean0 = category0.equals(category0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:6e7e4732afba511e610ecf286002724f
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Object: 1
      //Assert: assertFalse(method_result);
      
      Category category0 = new Category();
      
      //Call method: equals
      boolean boolean0 = category0.equals("1");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:c8579d62d7125fbefc59111152520dfc
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22]
      //Input_0_Object: category0
      //Assert: assertTrue(method_result);
      
      Category category0 = new Category();
      Category category1 = new Category();
      
      //Call method: equals
      boolean boolean0 = category1.equals(category0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:ce06a95ec5661d3236761063a88bf90e
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22]
      //Input_0_Object: category1
      //Assert: assertTrue(method_result);
      
      Category category0 = new Category();
      Category category1 = new Category();
      
      //Call method: equals
      boolean boolean0 = category0.equals(category1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:ffe77aa1c6625ffc70645524a4b11f51
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22]
      
      Category category0 = new Category();
      
      //Call method: hashCode
      category0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setId_5()  throws Throwable  {
      //caseID:1fe6d0e5a8dbd499d49385cd0ef34cc1
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: 43
      
      Category category0 = new Category();
      
      //Call method: setId
      category0.setId("43");
      
      //Test Result Assert
      assertEquals("43", category0.getId());
  }

  @Test(timeout = 9000)
  public void test_setLayer_6()  throws Throwable  {
      //caseID:c2551fb39ba077a7c8cd75298e143336
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_long: 0
      
      Category category0 = new Category();
      
      //Call method: setLayer
      category0.setLayer(0L);
      
      //Test Result Assert
      assertNull(category0.getId());
  }

  @Test(timeout = 9000)
  public void test_setName_7()  throws Throwable  {
      //caseID:f19d0cd77a62dd84bd132d154e6a8728
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_String: com.nbcb.entity.Category
      
      Category category0 = new Category();
      
      //Call method: setName
      category0.setName("com.nbcb.entity.Category");
      
      //Test Result Assert
      assertNull(category0.getId());
  }

  @Test(timeout = 9000)
  public void test_setParent_8()  throws Throwable  {
      //caseID:8c877bd8a09a1aa0616de5f96f260a93
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5]
      //Input_0_Parent: {}
      
      Category category0 = new Category();
      //mock parent0
      Parent parent0 = mock(Parent.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setParent
      category0.setParent(parent0);
      
      //Test Result Assert
      assertEquals(0L, category0.getLayer());
  }

  @Test(timeout = 9000)
  public void test_toString_9()  throws Throwable  {
      //caseID:84800766615d877b41a4388d95f0356b
      //CoveredLines: [5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 14, 18, 22]
      //Assert: assertEquals("Category(id=null, layer=0, name=null, parent=null)", method_result);
      
      Category category0 = new Category();
      
      //Call method: toString
      String string0 = category0.toString();
      
      //Test Result Assert
      assertEquals("Category(id=null, layer=0, name=null, parent=null)", string0);
  }
}