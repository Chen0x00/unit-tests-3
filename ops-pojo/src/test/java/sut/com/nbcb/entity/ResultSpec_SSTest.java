/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.ResultSpec;
import com.nbcb.entity.Value;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ResultSpec_SSTest extends ResultSpec_SSTest_scaffolding {
// allCoveredLines:[7, 12, 16, 20]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:7138eb026eba4b576e7541459f6340bc
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: 1.0
      //Assert: assertFalse(method_result);
      
      ResultSpec resultSpec0 = new ResultSpec();
      
      //Call method: equals
      boolean boolean0 = resultSpec0.equals("1.0");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:beba5cc9173d4b5969be2996307bccb0
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: resultSpec0
      //Assert: assertTrue(method_result);
      
      ResultSpec resultSpec0 = new ResultSpec();
      
      //Call method: equals
      boolean boolean0 = resultSpec0.equals(resultSpec0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:8b2b6da5caf4050bd2eafec4cbcc66e1
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      //Input_0_Object: resultSpec0
      //Assert: assertTrue(method_result);
      
      ResultSpec resultSpec0 = new ResultSpec();
      ResultSpec resultSpec1 = new ResultSpec();
      
      //Call method: equals
      boolean boolean0 = resultSpec1.equals(resultSpec0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:e8dd251725b5d93da7f919ea8195d635
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      //Input_0_Object: resultSpec1
      //Assert: assertTrue(method_result);
      
      ResultSpec resultSpec0 = new ResultSpec();
      ResultSpec resultSpec1 = new ResultSpec();
      
      //Call method: equals
      boolean boolean0 = resultSpec0.equals(resultSpec1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:41fad272fa1b9333223d547de4b71df8
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      
      ResultSpec resultSpec0 = new ResultSpec();
      
      //Call method: hashCode
      resultSpec0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setId_5()  throws Throwable  {
      //caseID:2e297220ba9b9c7f1aba39790fac319c
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: )
      
      ResultSpec resultSpec0 = new ResultSpec();
      
      //Call method: setId
      resultSpec0.setId(")");
      
      //Test Result Assert
      assertNull(resultSpec0.getName());
  }

  @Test(timeout = 9000)
  public void test_setName_6()  throws Throwable  {
      //caseID:4cce0c73aae2d1b00f4c7ddf1b0d1e42
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: , name=
      
      ResultSpec resultSpec0 = new ResultSpec();
      
      //Call method: setName
      resultSpec0.setName(", name=");
      
      //Test Result Assert
      assertNull(resultSpec0.getId());
  }

  @Test(timeout = 9000)
  public void test_setValues_7()  throws Throwable  {
      //caseID:65aa2721aa3be8dca20a0d59809cde00
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_List<Value>: linkedList0
      
      ResultSpec resultSpec0 = new ResultSpec();
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      
      //Call method: setValues
      resultSpec0.setValues(linkedList0);
      
      //Test Result Assert
      assertNull(resultSpec0.getName());
  }

  @Test(timeout = 9000)
  public void test_toString_8()  throws Throwable  {
      //caseID:7071fd85b140af3a028e82035f1665ef
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      //Assert: assertEquals("ResultSpec(id=null, name=null, values=null)", method_result);
      
      ResultSpec resultSpec0 = new ResultSpec();
      
      //Call method: toString
      String string0 = resultSpec0.toString();
      
      //Test Result Assert
      assertEquals("ResultSpec(id=null, name=null, values=null)", string0);
  }
}
