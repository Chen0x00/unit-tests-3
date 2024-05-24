/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.nbcb.config.AccessLimit;
import com.nbcb.config.AccessLimitInterceptor;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.method.HandlerMethod;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class AccessLimitInterceptor_SSTest extends AccessLimitInterceptor_SSTest_scaffolding {
// allCoveredLines:[29, 38, 39, 40, 41, 42, 43, 44, 46, 47, 48, 50, 51, 52, 53, 55, 57, 58, 70, 74, 75, 76, 77, 78, 79, 80, 83, 85, 86, 89]

  @Test(timeout = 9000)
  public void test_preHandle_0()  throws Throwable  {
      //caseID:0fbda7e26d1dfa991072582aa293f8ca
      //CoveredLines: [29, 38, 39, 40, 41, 42, 43, 46, 47, 48, 50, 51, 52, 53, 55, 74, 75, 76, 77, 78, 79, 80, 83, 85, 86]
      //Input_0_HttpServletRequest: {getRequestURI=\"1.0\", getCookies=cookieArray0}
      //Input_1_HttpServletResponse: {getWriter=printWriter0}
      //Input_2_Object: {getMethodAnnotation=accessLimit0}
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      Cookie[] cookieArray0 = new Cookie[0];
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      doReturn("1.0").when(httpServletRequest0).getRequestURI();
      //mock printWriter0
      PrintWriter printWriter0 = mock(PrintWriter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(printWriter0).when(httpServletResponse0).getWriter();
      //mock accessLimit0
      AccessLimit accessLimit0 = mock(AccessLimit.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(30001).when(accessLimit0).maxCount();
      doReturn(true).when(accessLimit0).needLogin();
      doReturn(30001).when(accessLimit0).second();
      //mock handlerMethod0
      HandlerMethod handlerMethod0 = mock(HandlerMethod.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(accessLimit0).when(handlerMethod0).getMethodAnnotation(any(java.lang.Class.class));
      
      //Call method: preHandle
      try { 
        accessLimitInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, handlerMethod0);
      } catch(Throwable e) {
         verifyException("com.nbcb.config.AccessLimitInterceptor", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_preHandle_1()  throws Throwable  {
      //caseID:21aa6cfe27c84c654aabc9eeed19a45f
      //CoveredLines: [29, 38, 70]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {}
      //Input_2_Object: redisTemplate0
      //Assert: assertTrue(method_result);
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      RedisTemplate<String, Integer> redisTemplate0 = new RedisTemplate<String, Integer>();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: preHandle
      boolean boolean0 = accessLimitInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, redisTemplate0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_preHandle_2()  throws Throwable  {
      //caseID:9aeeb1ef426c7dc5f3fc950b96ce53d7
      //CoveredLines: [29, 38, 39, 83, 85, 89]
      //Input_0_HttpServletRequest: {getCookies=cookieArray0}
      //Input_1_HttpServletResponse: {}
      //Input_2_Object: {}
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      RedisTemplate<String, AccessLimit> redisTemplate0 = new RedisTemplate<String, AccessLimit>();
      
      PrivateAccess.setVariable((Class<?>) AccessLimitInterceptor.class, accessLimitInterceptor0, "redisTemplate", (Object) redisTemplate0);
      Cookie[] cookieArray0 = new Cookie[1];
      //mock cookie0
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("userTicket").when(cookie0).getName();
      doReturn("6R1C*LJ").when(cookie0).getValue();
      cookieArray0[0] = cookie0;
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock handlerMethod0
      HandlerMethod handlerMethod0 = mock(HandlerMethod.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: preHandle
      try { 
        accessLimitInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, handlerMethod0);
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_preHandle_3()  throws Throwable  {
      //caseID:79c25cb11a4c6d1c7b5e4f4e942a25ea
      //CoveredLines: [29, 38, 39, 40, 41, 42, 43, 44, 83, 85, 86]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {}
      //Input_2_Object: {}
      //Assert: assertTrue(method_result);
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock handlerMethod0
      HandlerMethod handlerMethod0 = mock(HandlerMethod.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: preHandle
      boolean boolean0 = accessLimitInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, handlerMethod0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_preHandle_4()  throws Throwable  {
      //caseID:246218441687bc59ace795827553a5cb
      //CoveredLines: [29, 38, 39, 40, 41, 42, 43, 46, 47, 48, 50, 51, 57, 58, 83, 85, 86]
      //Input_0_HttpServletRequest: {getCookies=cookieArray0}
      //Input_1_HttpServletResponse: {}
      //Input_2_Object: {getMethodAnnotation=accessLimit0}
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      RedisTemplate<Object, Integer> redisTemplate0 = new RedisTemplate<Object, Integer>();
      
      PrivateAccess.setVariable((Class<?>) AccessLimitInterceptor.class, accessLimitInterceptor0, "redisTemplate", (Object) redisTemplate0);
      Cookie[] cookieArray0 = new Cookie[0];
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock accessLimit0
      AccessLimit accessLimit0 = mock(AccessLimit.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock handlerMethod0
      HandlerMethod handlerMethod0 = mock(HandlerMethod.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(accessLimit0).when(handlerMethod0).getMethodAnnotation(any(java.lang.Class.class));
      
      //Call method: preHandle
      try { 
        accessLimitInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, handlerMethod0);
      } catch(Throwable e) {
      }
  }
}
