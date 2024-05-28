/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.UserAddress;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class UserAddress_SSTest extends UserAddress_SSTest_scaffolding {
// allCoveredLines:[3, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:2fe267a48dd98a743d6ee878c4187a46
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_Object: userAddress0
      //Assert: assertTrue(method_result);
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: equals
      boolean boolean0 = userAddress0.equals(userAddress0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:51aa9677c10fe005ddfc62f83d0e831d
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_Object: 
      //Assert: assertFalse(method_result);
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: equals
      boolean boolean0 = userAddress0.equals("");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:636c94d238b15f6e621477f564196d9a
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]
      //Input_0_Object: userAddress0
      //Assert: assertTrue(method_result);
      
      UserAddress userAddress0 = new UserAddress();
      UserAddress userAddress1 = new UserAddress();
      
      //Call method: equals
      boolean boolean0 = userAddress1.equals(userAddress0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:383f623cbf7f6bd32246af9dd0cd1787
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]
      //Input_0_Object: userAddress1
      //Assert: assertTrue(method_result);
      
      UserAddress userAddress0 = new UserAddress();
      UserAddress userAddress1 = new UserAddress();
      
      //Call method: equals
      boolean boolean0 = userAddress0.equals(userAddress1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:24188ce1ce0cc73032fa4b30821460bf
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: hashCode
      userAddress0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAddress_05()  throws Throwable  {
      //caseID:dfa77006adba0f33818776289d19a670
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: , id=
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setAddress
      userAddress0.setAddress(", id=");
      
      //Test Result Assert
      assertNull(userAddress0.getPostalCode());
  }

  @Test(timeout = 9000)
  public void test_setAddressTags_06()  throws Throwable  {
      //caseID:b174b88c5e36e1a9adfc4c19576f44e5
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: fS8Ll/+?]
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setAddressTags
      userAddress0.setAddressTags("fS8Ll/+?]");
      
      //Test Result Assert
      assertEquals("fS8Ll/+?]", userAddress0.getAddressTags());
  }

  @Test(timeout = 9000)
  public void test_setCityCode_07()  throws Throwable  {
      //caseID:9f6d43a2a1e980c5661232c7a478ee16
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: , receiver=
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setCityCode
      userAddress0.setCityCode(", receiver=");
      
      //Test Result Assert
      assertNull(userAddress0.getProvinceCode());
  }

  @Test(timeout = 9000)
  public void test_setContact_08()  throws Throwable  {
      //caseID:685745b1b4f4af424cb8165d4c41b110
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: 1.0
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setContact
      userAddress0.setContact("1.0");
      
      //Test Result Assert
      assertNull(userAddress0.getReceiver());
  }

  @Test(timeout = 9000)
  public void test_setCountyCode_09()  throws Throwable  {
      //caseID:0433a1488b9328da2ad78819e2f30198
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: 1.0
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setCountyCode
      userAddress0.setCountyCode("1.0");
      
      //Test Result Assert
      assertNull(userAddress0.getAddress());
  }

  @Test(timeout = 9000)
  public void test_setFullLocation_10()  throws Throwable  {
      //caseID:14108c423a07ec376a68115ec5cd3348
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: 
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setFullLocation
      userAddress0.setFullLocation("");
      
      //Test Result Assert
      assertNull(userAddress0.getCityCode());
  }

  @Test(timeout = 9000)
  public void test_setId_11()  throws Throwable  {
      //caseID:5675fec673e9d32ef59b4cc344a7fac8
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: 
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setId
      userAddress0.setId("");
      
      //Test Result Assert
      assertNull(userAddress0.getProvinceCode());
  }

  @Test(timeout = 9000)
  public void test_setIsDefault_12()  throws Throwable  {
      //caseID:ea45712c47f1109d623103d66151c966
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_long: 1011
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setIsDefault
      userAddress0.setIsDefault(1011L);
      
      //Test Result Assert
      assertNull(userAddress0.getCityCode());
  }

  @Test(timeout = 9000)
  public void test_setPostalCode_13()  throws Throwable  {
      //caseID:15f9f7c90b7b518e186ade18b28cfd50
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: 
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setPostalCode
      userAddress0.setPostalCode("");
      
      //Test Result Assert
      assertNull(userAddress0.getProvinceCode());
  }

  @Test(timeout = 9000)
  public void test_setProvinceCode_14()  throws Throwable  {
      //caseID:0d1fba71eb421c2fbd1a99d9e8da8d29
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: Aq*}^
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setProvinceCode
      userAddress0.setProvinceCode("Aq*}^");
      
      //Test Result Assert
      assertEquals(0L, userAddress0.getIsDefault());
  }

  @Test(timeout = 9000)
  public void test_setReceiver_15()  throws Throwable  {
      //caseID:ace78f6c58bdfdaaab1d7f580880053d
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
      //Input_0_String: 32
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: setReceiver
      userAddress0.setReceiver("32");
      
      //Test Result Assert
      assertNull(userAddress0.getPostalCode());
  }

  @Test(timeout = 9000)
  public void test_toString_16()  throws Throwable  {
      //caseID:51d94a23b24b65029c5838285f00775b
      //CoveredLines: [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]
      //Assert: assertEquals("UserAddress(address=null, addressTags=null, cityCode=null, contact=null, countyCode=null, fullLocation=null, id=null, isDefault=0, postalCode=null, provinceCode=null, receiver=null)", method_result);
      
      UserAddress userAddress0 = new UserAddress();
      
      //Call method: toString
      String string0 = userAddress0.toString();
      
      //Test Result Assert
      assertEquals("UserAddress(address=null, addressTags=null, cityCode=null, contact=null, countyCode=null, fullLocation=null, id=null, isDefault=0, postalCode=null, provinceCode=null, receiver=null)", string0);
  }
}
