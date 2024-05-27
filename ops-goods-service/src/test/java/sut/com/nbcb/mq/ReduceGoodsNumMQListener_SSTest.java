/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.mq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.alibaba.fastjson.JSONException;
import com.nbcb.mq.ReduceGoodsNumMQListener;
import org.apache.rocketmq.common.message.MessageExt;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class ReduceGoodsNumMQListener_SSTest extends ReduceGoodsNumMQListener_SSTest_scaffolding {
// allCoveredLines:[27, 37, 38, 39, 42, 43, 47, 87, 88, 91]

  @Test(timeout = 9000)
  public void test_onMessage_0()  throws Throwable  {
      //caseID:152d7e561bb56e5be6eae699ad3a9986
      //CoveredLines: [27, 37, 38, 39, 42, 47, 87, 88, 91]
      //Input_0_MessageExt: {getBody=byteArray0}
      
      ReduceGoodsNumMQListener reduceGoodsNumMQListener0 = new ReduceGoodsNumMQListener();
      byte[] byteArray0 = new byte[0];
      //mock messageExt0
      MessageExt messageExt0 = mock(MessageExt.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(byteArray0).when(messageExt0).getBody();
      
      //Call method: onMessage
      reduceGoodsNumMQListener0.onMessage(messageExt0);
  }

  @Test(timeout = 9000)
  public void test_onMessage_1()  throws Throwable  {
      //caseID:984296a377c4d679557df76c7fdc4f07
      //CoveredLines: [27, 37, 38, 39, 42, 43, 47, 87, 88, 91]
      //Input_0_MessageExt: {getBody=byteArray0}
      
      ReduceGoodsNumMQListener reduceGoodsNumMQListener0 = new ReduceGoodsNumMQListener();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)125;
      //mock messageExt0
      MessageExt messageExt0 = mock(MessageExt.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(byteArray0).when(messageExt0).getBody();
      
      //Call method: onMessage
      // Undeclared exception!
      try { 
        reduceGoodsNumMQListener0.onMessage(messageExt0);
      } catch(Throwable e) {
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
         assertEquals("com.alibaba.fastjson.JSONException", e.getClass().getName());
         assertEquals("syntax error,expect start with { or [,but actually start with }", e.getMessage());
      }
  }
}
