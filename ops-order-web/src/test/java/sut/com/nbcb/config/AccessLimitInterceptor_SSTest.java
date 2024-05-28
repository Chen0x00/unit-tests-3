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
  public void test_getUser_0()  throws Throwable  {
      //caseID:9e5eb7c234cfd70497a31e7333b8cae0
      //CoveredLines: [29, 83, 85, 89]
      //Input_0_HttpServletRequest: {getCookies=cookieArray0}
      //Input_1_HttpServletResponse: {}
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      RedisTemplate<Object, AccessLimit> redisTemplate0 = new RedisTemplate<Object, AccessLimit>();
      
      PrivateAccess.setVariable((Class<?>) AccessLimitInterceptor.class, accessLimitInterceptor0, "redisTemplate", (Object) redisTemplate0);
      Cookie[] cookieArray0 = new Cookie[6];
      //mock cookie0
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("userTicket").when(cookie0).getName();
      doReturn("*j6d5cA51u").when(cookie0).getValue();
      cookieArray0[0] = cookie0;
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: getUser
      try { 
        PrivateAccess.callMethod((Class<AccessLimitInterceptor>) AccessLimitInterceptor.class, accessLimitInterceptor0, "getUser", (Object) httpServletRequest0, (Class<?>) HttpServletRequest.class, (Object) httpServletResponse0, (Class<?>) HttpServletResponse.class);
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 9000)
  public void test_preHandle_1()  throws Throwable  {
      //caseID:abd35f77c795c12e6e9688fbc35fb2dd
      //CoveredLines: [29, 38, 39, 40, 41, 42, 43, 46, 47, 48, 50, 51, 52, 53, 55, 74, 75, 76, 77, 78, 79, 80, 83, 85, 86]
      //Input_0_HttpServletRequest: {getRequestURI=\"Fv<KHGh9t-K!o)T\", getCookies=cookieArray0}
      //Input_1_HttpServletResponse: {getWriter=printWriter0}
      //Input_2_Object: {getMethodAnnotation=accessLimit0}
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      Cookie[] cookieArray0 = new Cookie[0];
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      doReturn("Fv<KHGh9t-K!o)T").when(httpServletRequest0).getRequestURI();
      //mock printWriter0
      PrintWriter printWriter0 = mock(PrintWriter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(printWriter0).when(httpServletResponse0).getWriter();
      //mock accessLimit0
      AccessLimit accessLimit0 = mock(AccessLimit.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(138).when(accessLimit0).maxCount();
      doReturn(true).when(accessLimit0).needLogin();
      doReturn(138).when(accessLimit0).second();
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
  public void test_preHandle_2()  throws Throwable  {
      //caseID:1fb1394c9c049d0d7dfb83459b4e9d04
      //CoveredLines: [29, 38, 70]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {}
      //Input_2_Object: {}
      //Assert: assertTrue(method_result);
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: preHandle
      boolean boolean0 = accessLimitInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, httpServletRequest0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 9000)
  public void test_preHandle_3()  throws Throwable  {
      //caseID:d9c8e80d24c7e70ffa196fba0b25c9af
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
      //caseID:9e6a4a985e57e87db8deda570ff78811
      //CoveredLines: [29, 38, 39, 40, 41, 42, 43, 46, 47, 48, 50, 51, 57, 58, 83, 85, 86]
      //Input_0_HttpServletRequest: {getRequestURI=\"\\u8BF7\\u6C42\\u6B21\\u6570\\u8FC7\\u591A\", getCookies=cookieArray0}
      //Input_1_HttpServletResponse: {}
      //Input_2_Object: {getMethodAnnotation=accessLimit0}
      
      AccessLimitInterceptor accessLimitInterceptor0 = new AccessLimitInterceptor();
      RedisTemplate<Object, String> redisTemplate0 = new RedisTemplate<Object, String>();
      
      PrivateAccess.setVariable((Class<?>) AccessLimitInterceptor.class, accessLimitInterceptor0, "redisTemplate", (Object) redisTemplate0);
      Cookie[] cookieArray0 = new Cookie[0];
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      doReturn("\u8BF7\u6C42\u6B21\u6570\u8FC7\u591A").when(httpServletRequest0).getRequestURI();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock accessLimit0
      AccessLimit accessLimit0 = mock(AccessLimit.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(3319).when(accessLimit0).maxCount();
      doReturn(false).when(accessLimit0).needLogin();
      doReturn(2290).when(accessLimit0).second();
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
