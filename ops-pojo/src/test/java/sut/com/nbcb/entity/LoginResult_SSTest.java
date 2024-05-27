/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.entity.LoginResult;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class LoginResult_SSTest extends LoginResult_SSTest_scaffolding {
// allCoveredLines:[9, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50, 54]

  @Test(timeout = 9000)
  public void test_equals_00()  throws Throwable  {
      //caseID:a6edf81b54e166bfdd6b99854a003b6e
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: 
      //Assert: assertFalse(method_result);
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: equals
      boolean boolean0 = loginResult0.equals("");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_01()  throws Throwable  {
      //caseID:7412c98922848ceaeebc76827c237c72
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_Object: loginResult0
      //Assert: assertTrue(method_result);
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: equals
      boolean boolean0 = loginResult0.equals(loginResult0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_02()  throws Throwable  {
      //caseID:f379cdbbc6c3f5c3ea71e0e6c3014452
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50, 54]
      //Input_0_Object: loginResult0
      //Assert: assertTrue(method_result);
      
      LoginResult loginResult0 = new LoginResult();
      LoginResult loginResult1 = new LoginResult();
      
      //Call method: equals
      boolean boolean0 = loginResult1.equals(loginResult0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_equals_03()  throws Throwable  {
      //caseID:4e3fe6b5d9c9b6a312d5de1334ba73ac
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50, 54]
      //Input_0_Object: loginResult1
      //Assert: assertTrue(method_result);
      
      LoginResult loginResult0 = new LoginResult();
      LoginResult loginResult1 = new LoginResult();
      
      //Call method: equals
      boolean boolean0 = loginResult0.equals(loginResult1);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_hashCode_04()  throws Throwable  {
      //caseID:a520917e8a07d024f9e9b234e173411f
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50, 54]
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: hashCode
      loginResult0.hashCode();
  }

  @Test(timeout = 9000)
  public void test_setAccount_05()  throws Throwable  {
      //caseID:04402bf1e2c7604f78b27e929a8972a2
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setAccount
      loginResult0.setAccount("");
      
      //Test Result Assert
      assertNull(loginResult0.getGender());
  }

  @Test(timeout = 9000)
  public void test_setAvatar_06()  throws Throwable  {
      //caseID:dee05b9fc31f3a51bcab7c20b793a6d3
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: , avatar=
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setAvatar
      loginResult0.setAvatar(", avatar=");
      
      //Test Result Assert
      assertNull(loginResult0.getProfession());
  }

  @Test(timeout = 9000)
  public void test_setBirthday_07()  throws Throwable  {
      //caseID:3898811600b174200d52576eca60f4c9
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setBirthday
      loginResult0.setBirthday("");
      
      //Test Result Assert
      assertNull(loginResult0.getGender());
  }

  @Test(timeout = 9000)
  public void test_setCityCode_08()  throws Throwable  {
      //caseID:83e4711a9b9261929281e69698e7fe57
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 1
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setCityCode
      loginResult0.setCityCode("1");
      
      //Test Result Assert
      assertEquals("1", loginResult0.getCityCode());
  }

  @Test(timeout = 9000)
  public void test_setGender_09()  throws Throwable  {
      //caseID:088aaa8f2aa6f2038daf66037e7e4c54
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: , profession=
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setGender
      loginResult0.setGender(", profession=");
      
      //Test Result Assert
      assertEquals(", profession=", loginResult0.getGender());
  }

  @Test(timeout = 9000)
  public void test_setId_10()  throws Throwable  {
      //caseID:d31dcd451c465acb2c8a9f197665a3f5
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 1.0
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setId
      loginResult0.setId("1.0");
      
      //Test Result Assert
      assertNull(loginResult0.getBirthday());
  }

  @Test(timeout = 9000)
  public void test_setMobile_11()  throws Throwable  {
      //caseID:488b05ae52b3d955d1f02e9c38298296
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 43
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setMobile
      loginResult0.setMobile("43");
      
      //Test Result Assert
      assertEquals("43", loginResult0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_setNickname_12()  throws Throwable  {
      //caseID:7e0d98cfc33d08c6796e359e3fb46510
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: , id=
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setNickname
      loginResult0.setNickname(", id=");
      
      //Test Result Assert
      assertNull(loginResult0.getCityCode());
  }

  @Test(timeout = 9000)
  public void test_setProfession_13()  throws Throwable  {
      //caseID:59646efcb22418dbb0cbd1e8568a08fb
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: com.nbcb.entity.LoginResult
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setProfession
      loginResult0.setProfession("com.nbcb.entity.LoginResult");
      
      //Test Result Assert
      assertNull(loginResult0.getGender());
  }

  @Test(timeout = 9000)
  public void test_setProvinceCode_14()  throws Throwable  {
      //caseID:fe034bc25fa780d2ac763e73533f3b65
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: 1
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setProvinceCode
      loginResult0.setProvinceCode("1");
      
      //Test Result Assert
      assertEquals("1", loginResult0.getProvinceCode());
  }

  @Test(timeout = 9000)
  public void test_setToken_15()  throws Throwable  {
      //caseID:4cefa59ea5fb7e70669fa795d4a46ab3
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
      //Input_0_String: )
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: setToken
      loginResult0.setToken(")");
      
      //Test Result Assert
      assertNull(loginResult0.getMobile());
  }

  @Test(timeout = 9000)
  public void test_toString_16()  throws Throwable  {
      //caseID:7ad5fadf1fe43bac3ba535f97685e294
      //CoveredLines: [9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50, 54]
      //Assert: assertEquals("LoginResult(account=null, avatar=null, birthday=null, cityCode=null, gender=null, id=null, mobile=null, nickname=null, profession=null, provinceCode=null, token=null)", method_result);
      
      LoginResult loginResult0 = new LoginResult();
      
      //Call method: toString
      String string0 = loginResult0.toString();
      
      //Test Result Assert
      assertEquals("LoginResult(account=null, avatar=null, birthday=null, cityCode=null, gender=null, id=null, mobile=null, nickname=null, profession=null, provinceCode=null, token=null)", string0);
  }
}
