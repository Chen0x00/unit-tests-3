/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.mq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.nbcb.mq.CancelConsumerMQListener;
import org.junit.runner.RunWith;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class CancelConsumerMQListener_SSTest extends CancelConsumerMQListener_SSTest_scaffolding {
// allCoveredLines:[26, 48, 49, 50, 51, 52, 53, 54, 55, 60]

  @Test(timeout = 9000)
  public void test_getCancelRocketMQConsumer_0()  throws Throwable  {
      //caseID:f3136d211619338327e47b7bbb75fb3a
      //CoveredLines: [26, 48, 49, 50, 51, 52, 53, 54, 55, 60]
      
      CancelConsumerMQListener cancelConsumerMQListener0 = new CancelConsumerMQListener();
      
      PrivateAccess.setVariable((Class<?>) CancelConsumerMQListener.class, cancelConsumerMQListener0, "topic", (Object) "");
      
      //Call method: getCancelRocketMQConsumer
      try { 
        cancelConsumerMQListener0.getCancelRocketMQConsumer();
      } catch(Throwable e) {
         verifyException("org.apache.rocketmq.client.Validators", e);
         assertEquals("org.apache.rocketmq.client.exception.MQClientException", e.getClass().getName());
         assertEquals("the specified group is blank\nFor more information, please visit the url, http://rocketmq.apache.org/docs/faq/", e.getMessage());
      }
  }
}