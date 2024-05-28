/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopUser;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ShopUser_SSTest extends ShopUser_SSTest_scaffolding {
// allCoveredLines:[7, 23, 27, 28, 31, 35, 36, 39, 43, 44, 47, 51, 52, 55, 59, 60, 63, 67, 68, 71, 75, 76]

  @Test(timeout = 9000)
  public void test_getUserId_00()  throws Throwable  {
      //caseID:24cc5f6b80b9d894773e97a08c213380
      //CoveredLines: [7, 23]
      //Assert: assertNull(method_result);
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: getUserId
      Long long0 = shopUser0.getUserId();
      
      //Test Result Assert
      assertNull(long0);
  }

  @Test(timeout = 9000)
  public void test_getUserMobile_01()  throws Throwable  {
      //caseID:633dea5aac7df876b036fe0b14f7c0ed
      //CoveredLines: [7, 47]
      //Assert: assertNull(method_result);
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: getUserMobile
      String string0 = shopUser0.getUserMobile();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getUserMoney_02()  throws Throwable  {
      //caseID:3457cce9747971cb6f5085f6b57a1d0b
      //CoveredLines: [7, 71]
      //Assert: assertEquals((byte)10, method_result.byteValue());
      
      ShopUser shopUser0 = new ShopUser();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      
      PrivateAccess.setVariable((Class<?>) ShopUser.class, shopUser0, "userMoney", (Object) bigDecimal0);
      
      //Call method: getUserMoney
      BigDecimal bigDecimal1 = shopUser0.getUserMoney();
      
      //Test Result Assert
      assertEquals((byte)10, bigDecimal1.byteValue());
  }

  @Test(timeout = 9000)
  public void test_getUserName_03()  throws Throwable  {
      //caseID:7d3ba41da10ab1451034c42962be1aa5
      //CoveredLines: [7, 31]
      //Assert: assertNull(method_result);
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: getUserName
      String string0 = shopUser0.getUserName();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getUserPassword_04()  throws Throwable  {
      //caseID:a048e60ef62278c1ba99e95341340471
      //CoveredLines: [7, 39]
      //Assert: assertNull(method_result);
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: getUserPassword
      String string0 = shopUser0.getUserPassword();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 9000)
  public void test_getUserRegTime_05()  throws Throwable  {
      //caseID:f39f84e8df2e1577082059fb1a882542
      //CoveredLines: [7, 63]
      //Assert: assertNull(method_result);
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: getUserRegTime
      Date date0 = shopUser0.getUserRegTime();
      
      //Test Result Assert
      assertNull(date0);
  }

  @Test(timeout = 9000)
  public void test_getUserScore_06()  throws Throwable  {
      //caseID:65659640770f707ad3f9191a8157c401
      //CoveredLines: [7, 55]
      //Assert: assertNull(method_result);
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: getUserScore
      Integer integer0 = shopUser0.getUserScore();
      
      //Test Result Assert
      assertNull(integer0);
  }

  @Test(timeout = 9000)
  public void test_setUserId_07()  throws Throwable  {
      //caseID:433fb977b9941669fad7688f8f43149e
      //CoveredLines: [7, 27, 28]
      //Input_0_Long: (-15)
      
      ShopUser shopUser0 = new ShopUser();
      Long long0 = new Long((-15));
      
      //Call method: setUserId
      shopUser0.setUserId(long0);
      
      //Test Result Assert
      assertNull(shopUser0.getUserName());
  }

  @Test(timeout = 9000)
  public void test_setUserMobile_08()  throws Throwable  {
      //caseID:f13502d4e271b02921de1a2fad777061
      //CoveredLines: [7, 51, 52]
      //Input_0_String: null
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: setUserMobile
      shopUser0.setUserMobile((String) null);
      
      //Test Result Assert
      assertNull(shopUser0.getUserPassword());
  }

  @Test(timeout = 9000)
  public void test_setUserMobile_09()  throws Throwable  {
      //caseID:88819c41f7c6043cf2cd37b2a42dc662
      //CoveredLines: [7, 51, 52]
      //Input_0_String: resourceCleanup
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: setUserMobile
      shopUser0.setUserMobile("resourceCleanup");
      
      //Test Result Assert
      assertEquals("resourceCleanup", shopUser0.getUserMobile());
  }

  @Test(timeout = 9000)
  public void test_setUserMoney_10()  throws Throwable  {
      //caseID:b4071965cc14537a53674a4c935c8e83
      //CoveredLines: [7, 75, 76]
      //Input_0_BigDecimal: BigDecimal.ZERO
      
      ShopUser shopUser0 = new ShopUser();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      
      //Call method: setUserMoney
      shopUser0.setUserMoney(bigDecimal0);
      
      //Test Result Assert
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 9000)
  public void test_setUserName_11()  throws Throwable  {
      //caseID:c854de28cf18ef0ee299abeb2e462d00
      //CoveredLines: [7, 35, 36]
      //Input_0_String: null
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: setUserName
      shopUser0.setUserName((String) null);
      
      //Test Result Assert
      assertNull(shopUser0.getUserMobile());
  }

  @Test(timeout = 9000)
  public void test_setUserName_12()  throws Throwable  {
      //caseID:07849e5a5ffb56ced2573f7d5bb15616
      //CoveredLines: [7, 35, 36]
      //Input_0_String: B/
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: setUserName
      shopUser0.setUserName("B/");
      
      //Test Result Assert
      assertEquals("B/", shopUser0.getUserName());
  }

  @Test(timeout = 9000)
  public void test_setUserPassword_13()  throws Throwable  {
      //caseID:5444849c4c0ca2fb06ea92d2113a6bbd
      //CoveredLines: [7, 43, 44]
      //Input_0_String: null
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: setUserPassword
      shopUser0.setUserPassword((String) null);
      
      //Test Result Assert
      assertNull(shopUser0.getUserPassword());
  }

  @Test(timeout = 9000)
  public void test_setUserPassword_14()  throws Throwable  {
      //caseID:b431803c5854203ac5fc831e1e193c95
      //CoveredLines: [7, 43, 44]
      //Input_0_String: 1
      
      ShopUser shopUser0 = new ShopUser();
      
      //Call method: setUserPassword
      shopUser0.setUserPassword("1");
      
      //Test Result Assert
      assertEquals("1", shopUser0.getUserPassword());
  }

  @Test(timeout = 9000)
  public void test_setUserRegTime_15()  throws Throwable  {
      //caseID:4320e1a568a4f9179e7b5e1322108a88
      //CoveredLines: [7, 67, 68]
      //Input_0_Date: {}
      
      ShopUser shopUser0 = new ShopUser();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setUserRegTime
      shopUser0.setUserRegTime(date0);
      
      //Test Result Assert
      assertNull(shopUser0.getUserName());
  }

  @Test(timeout = 9000)
  public void test_setUserScore_16()  throws Throwable  {
      //caseID:845989a9d01c30434cadbbfbfcac12d1
      //CoveredLines: [7, 59, 60]
      //Input_0_Integer: (-1)
      
      ShopUser shopUser0 = new ShopUser();
      Integer integer0 = new Integer((-1));
      
      //Call method: setUserScore
      shopUser0.setUserScore(integer0);
      
      //Test Result Assert
      assertNull(shopUser0.getUserId());
  }
}
