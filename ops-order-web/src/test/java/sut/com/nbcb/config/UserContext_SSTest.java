/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.config.UserContext;
import com.nbcb.pojo.ShopUser;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class UserContext_SSTest extends UserContext_SSTest_scaffolding {
// allCoveredLines:[5, 11, 12, 15]

  @Test(timeout = 9000)
  public void test_getUser_0()  throws Throwable  {
      //caseID:ffebde9056b39265e2d85421edaf1ab6
      //CoveredLines: [5, 15]
      //Assert: assertNull(method_result);
      
      UserContext userContext0 = new UserContext();
      
      //Call method: getUser
      ShopUser shopUser0 = UserContext.getUser();
      
      //Test Result Assert
      assertNull(shopUser0);
  }

  @Test(timeout = 9000)
  public void test_setUser_1()  throws Throwable  {
      //caseID:cc85e20494200a03216c4cb1ce17d4c8
      //CoveredLines: [11, 12]
      //Input_0_ShopUser: {}
      
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: setUser
      UserContext.setUser(shopUser0);
  }
}
