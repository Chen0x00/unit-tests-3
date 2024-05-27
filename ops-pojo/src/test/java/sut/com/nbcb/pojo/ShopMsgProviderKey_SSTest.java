/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.pojo.ShopMsgProviderKey;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopMsgProviderKey_SSTest extends ShopMsgProviderKey_SSTest_scaffolding {
// allCoveredLines:[5, 13, 17, 18, 21, 25, 26, 29, 33, 34]

  @Test(timeout = 9000)
  public void test_getGroupName_0()  throws Throwable  {
      //caseID:d09ec33f27d5e1afb6c9b654709162df
      //CoveredLines: [5, 13]
      //Assert: assertNull(method_result);
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: getGroupName
      String string0 = shopMsgProviderKey0.getGroupName();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getMsgKey_1()  throws Throwable  {
      //caseID:4ddf2d5b2e96e781320fc3b42df8fdfe
      //CoveredLines: [5, 29]
      //Assert: assertNull(method_result);
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: getMsgKey
      String string0 = shopMsgProviderKey0.getMsgKey();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getMsgTag_2()  throws Throwable  {
      //caseID:7f9607ac92750705ce223a287de389e3
      //CoveredLines: [5, 21]
      //Assert: assertNull(method_result);
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: getMsgTag
      String string0 = shopMsgProviderKey0.getMsgTag();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_setGroupName_3()  throws Throwable  {
      //caseID:fc537e9fbad1b4f0e8cfab4f02587a15
      //CoveredLines: [5, 17, 18]
      //Input_0_String: null
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: setGroupName
      shopMsgProviderKey0.setGroupName((String) null);
      
      //Test Result Assert
      assertNull(shopMsgProviderKey0.getMsgTag());
  }

  @Test(timeout = 9000)
  public void test_setGroupName_4()  throws Throwable  {
      //caseID:c5d21385cc3ab9e7011af2d4a8340d7c
      //CoveredLines: [5, 17, 18]
      //Input_0_String: com.nbcb.pojo.ShopMsgProviderKey
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: setGroupName
      shopMsgProviderKey0.setGroupName("com.nbcb.pojo.ShopMsgProviderKey");
      
      //Test Result Assert
      assertEquals("com.nbcb.pojo.ShopMsgProviderKey", shopMsgProviderKey0.getGroupName());
  }

  @Test(timeout = 9000)
  public void test_setMsgKey_5()  throws Throwable  {
      //caseID:90a96ea59fc9aedfd14d8907b87df483
      //CoveredLines: [5, 33, 34]
      //Input_0_String: null
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: setMsgKey
      shopMsgProviderKey0.setMsgKey((String) null);
      
      //Test Result Assert
      assertNull(shopMsgProviderKey0.getMsgTag());
  }

  @Test(timeout = 9000)
  public void test_setMsgKey_6()  throws Throwable  {
      //caseID:caca4c7f57222e36688c0f4f70067366
      //CoveredLines: [5, 33, 34]
      //Input_0_String: bDe)
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: setMsgKey
      shopMsgProviderKey0.setMsgKey("bDe)");
      
      //Test Result Assert
      assertEquals("bDe)", shopMsgProviderKey0.getMsgKey());
  }

  @Test(timeout = 9000)
  public void test_setMsgTag_7()  throws Throwable  {
      //caseID:b5791c15b16a53a2aaab9f9f60f07cd3
      //CoveredLines: [5, 25, 26]
      //Input_0_String: null
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: setMsgTag
      shopMsgProviderKey0.setMsgTag((String) null);
      
      //Test Result Assert
      assertNull(shopMsgProviderKey0.getMsgKey());
  }

  @Test(timeout = 9000)
  public void test_setMsgTag_8()  throws Throwable  {
      //caseID:edc51d6f46af9a82e9670fba2ab9e01b
      //CoveredLines: [5, 25, 26]
      //Input_0_String: 1
      
      ShopMsgProviderKey shopMsgProviderKey0 = new ShopMsgProviderKey();
      
      //Call method: setMsgTag
      shopMsgProviderKey0.setMsgTag("1");
      
      //Test Result Assert
      assertEquals("1", shopMsgProviderKey0.getMsgTag());
  }
}
