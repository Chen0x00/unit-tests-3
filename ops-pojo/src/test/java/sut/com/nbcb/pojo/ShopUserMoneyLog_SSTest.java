/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.pojo.ShopUserMoneyLog;
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
public class ShopUserMoneyLog_SSTest extends ShopUserMoneyLog_SSTest_scaffolding {
// allCoveredLines:[7, 15, 19, 20, 23, 27, 28, 31, 35, 36]

  @Test(timeout = 9000)
  public void test_getCreateTime_0()  throws Throwable  {
      //caseID:6b1044f860958d45f8addf89febde954
      //CoveredLines: [7, 31]
      //Assert: assertNull(method_result);
      
      ShopUserMoneyLog shopUserMoneyLog0 = new ShopUserMoneyLog();
      
      //Call method: getCreateTime
      Date date0 = shopUserMoneyLog0.getCreateTime();
      
      //Test Result Assert
      assertNull(date0);
  }

  @Test(timeout = 9000)
  public void test_getMoneyLogType_1()  throws Throwable  {
      //caseID:8adfa932080e2c2190ea75a47da55e13
      //CoveredLines: [7, 15]
      //Assert: assertNull(method_result);
      
      ShopUserMoneyLog shopUserMoneyLog0 = new ShopUserMoneyLog();
      
      //Call method: getMoneyLogType
      Integer integer0 = shopUserMoneyLog0.getMoneyLogType();
      
      //Test Result Assert
      assertNull(integer0);
  }

  @Test(timeout = 9000)
  public void test_getUseMoney_2()  throws Throwable  {
      //caseID:98718fe291fda15e9ad6f9cba8eca3cc
      //CoveredLines: [7, 23]
      //Assert: assertEquals((short)10, method_result.shortValue());
      
      ShopUserMoneyLog shopUserMoneyLog0 = new ShopUserMoneyLog();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      
      PrivateAccess.setVariable((Class<?>) ShopUserMoneyLog.class, shopUserMoneyLog0, "useMoney", (Object) bigDecimal0);
      
      //Call method: getUseMoney
      BigDecimal bigDecimal1 = shopUserMoneyLog0.getUseMoney();
      
      //Test Result Assert
      assertEquals((short)10, bigDecimal1.shortValue());
  }

  @Test(timeout = 9000)
  public void test_setCreateTime_3()  throws Throwable  {
      //caseID:5c9209420e12ec75bb7db04296b1f519
      //CoveredLines: [7, 35, 36]
      //Input_0_Date: {}
      
      ShopUserMoneyLog shopUserMoneyLog0 = new ShopUserMoneyLog();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setCreateTime
      shopUserMoneyLog0.setCreateTime(date0);
      
      //Test Result Assert
      assertNull(shopUserMoneyLog0.getMoneyLogType());
  }

  @Test(timeout = 9000)
  public void test_setMoneyLogType_4()  throws Throwable  {
      //caseID:40fd9e2ab6174b853241ed28cc41ceba
      //CoveredLines: [7, 19, 20]
      //Input_0_Integer: 204
      
      ShopUserMoneyLog shopUserMoneyLog0 = new ShopUserMoneyLog();
      Integer integer0 = new Integer(204);
      
      //Call method: setMoneyLogType
      shopUserMoneyLog0.setMoneyLogType(integer0);
      
      //Test Result Assert
      assertNull(shopUserMoneyLog0.getUserId());
  }

  @Test(timeout = 9000)
  public void test_setUseMoney_5()  throws Throwable  {
      //caseID:debd4175e4efbabf2eb35f0eb83b2452
      //CoveredLines: [7, 27, 28]
      //Input_0_BigDecimal: BigDecimal.ONE
      
      ShopUserMoneyLog shopUserMoneyLog0 = new ShopUserMoneyLog();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      
      //Call method: setUseMoney
      shopUserMoneyLog0.setUseMoney(bigDecimal0);
      
      //Test Result Assert
      assertEquals((byte)1, bigDecimal0.byteValue());
  }
}