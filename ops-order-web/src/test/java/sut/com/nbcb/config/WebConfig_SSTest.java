/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.nbcb.config.WebConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class WebConfig_SSTest extends WebConfig_SSTest_scaffolding {
// allCoveredLines:[15, 22, 23]

  @Test(timeout = 9000)
  public void test_addInterceptors_0()  throws Throwable  {
      //caseID:920a9ae2124e4f3f82cf851ac9b90387
      //CoveredLines: [15, 22, 23]
      //Input_0_InterceptorRegistry: {}
      
      WebConfig webConfig0 = new WebConfig();
      //mock interceptorRegistry0
      InterceptorRegistry interceptorRegistry0 = mock(InterceptorRegistry.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: addInterceptors
      webConfig0.addInterceptors(interceptorRegistry0);
  }
}
