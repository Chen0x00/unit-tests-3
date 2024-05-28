/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.GoodsResponse;
import com.nbcb.entity.GoodsResult;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class GoodsResponse_SSTest extends GoodsResponse_SSTest_scaffolding {
// allCoveredLines:[7, 12, 16, 20]

  @Test(timeout = 9000)
  public void test_equals_0()  throws Throwable  {
      //caseID:a72cced6cd83cc7702a4085e41e481c9
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: goodsResponse0
      //Assert: assertTrue(method_result);
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      
      //Call method: equals
      boolean boolean0 = goodsResponse0.equals(goodsResponse0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_1()  throws Throwable  {
      //caseID:bbb44e8ff82d943948322b6d63b269ac
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_Object: T'g%=n2-4x>j~Nmm}
      //Assert: assertFalse(method_result);
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      
      //Call method: equals
      boolean boolean0 = goodsResponse0.equals("T'g%=n2-4x>j~Nmm}");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_2()  throws Throwable  {
      //caseID:153eb9597d939bfc385b64ad05a82eba
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      //Input_0_Object: goodsResponse0
      //Assert: assertTrue(method_result);
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      GoodsResponse goodsResponse1 = new GoodsResponse();
      
      //Call method: equals
      boolean boolean0 = goodsResponse1.equals(goodsResponse0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_3()  throws Throwable  {
      //caseID:dfe3056e3222c117ef19ccc2a44bb878
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      //Input_0_Object: goodsResponse1
      //Assert: assertTrue(method_result);
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      GoodsResponse goodsResponse1 = new GoodsResponse();
      
      //Call method: equals
      boolean boolean0 = goodsResponse0.equals(goodsResponse1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_4()  throws Throwable  {
      //caseID:45cda283ab5d72ec62b9a43e0b1cfd1b
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      
      //Call method: hashCode
      goodsResponse0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setCode_5()  throws Throwable  {
      //caseID:29af357ba404a4149adb43ce3824a9d4
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: 1.0
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      
      //Call method: setCode
      goodsResponse0.setCode("1.0");
      
      //Test Result Assert
      assertNull(goodsResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_setMsg_6()  throws Throwable  {
      //caseID:9b039022113169fac0005c4ed03534af
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_String: 0
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      
      //Call method: setMsg
      goodsResponse0.setMsg("0");
      
      //Test Result Assert
      assertEquals("0", goodsResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_setResult_7()  throws Throwable  {
      //caseID:e5d0e34d72f31f4f5970f0281add1e5a
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7]
      //Input_0_List<GoodsResult>: linkedList0
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      LinkedList<GoodsResult> linkedList0 = new LinkedList<GoodsResult>();
      
      //Call method: setResult
      goodsResponse0.setResult(linkedList0);
      
      //Test Result Assert
      assertNull(goodsResponse0.getMsg());
  }

  @Test(timeout = 9000)
  public void test_toString_8()  throws Throwable  {
      //caseID:463b0c5f4bf4910c94bef5653b2141f2
      //CoveredLines: [7, 7, 7, 7, 7, 7, 7, 7, 12, 16, 20]
      //Assert: assertEquals("GoodsResponse(code=null, msg=null, result=null)", method_result);
      
      GoodsResponse goodsResponse0 = new GoodsResponse();
      
      //Call method: toString
      String string0 = goodsResponse0.toString();
      
      //Test Result Assert
      assertEquals("GoodsResponse(code=null, msg=null, result=null)", string0);
  }
}