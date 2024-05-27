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
import ch.qos.logback.classic.Level;
import com.nbcb.entity.Result;
import com.nbcb.mapper.ShopUserMapper;
import com.nbcb.mapper.ShopUserMoneyLogMapper;
import com.nbcb.mq.OrderTransactionMQListener;
import com.nbcb.pojo.ShopUser;
import com.nbcb.pojo.ShopUserMoneyLog;
import java.math.BigDecimal;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class OrderTransactionMQListener_SSTest extends OrderTransactionMQListener_SSTest_scaffolding {
// allCoveredLines:[33, 54, 55, 56, 57, 58, 82, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 98, 99, 100, 101, 102, 104, 107, 108, 109, 110, 111, 112, 113, 114, 117, 118, 122, 123, 124, 125, 126, 127, 128, 129, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 147, 148, 152, 155, 156, 157, 158, 159, 160, 161, 171, 172, 176, 177, 178, 179]

  @Test(timeout = 9000)
  public void test_onMessage_0()  throws Throwable  {
      //caseID:5c9ac34d3907274c0aaba02f96fc19cd
      //CoveredLines: [33, 54, 55, 56, 57, 58]
      //Input_0_MessageExt: {getBody=byteArray0}
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      byte[] byteArray0 = new byte[0];
      //mock messageExt0
      MessageExt messageExt0 = mock(MessageExt.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(byteArray0).when(messageExt0).getBody();
      
      //Call method: onMessage
      // Undeclared exception!
      try { 
        orderTransactionMQListener0.onMessage(messageExt0);
      } catch(Throwable e) {
         verifyException("com.nbcb.mq.OrderTransactionMQListener", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 9000)
  public void test_sendMessage_1()  throws Throwable  {
      //caseID:8b8ec8443ab0d5bfc180636d2b26f3d6
      //CoveredLines: [33, 176, 177, 178, 179]
      //Input_0_com.nbcb.entity.Result: {getCode=Level.TRACE_INTEGER}
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      RocketMQTemplate rocketMQTemplate0 = new RocketMQTemplate();
      //mock defaultMQProducer0
      DefaultMQProducer defaultMQProducer0 = mock(DefaultMQProducer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      rocketMQTemplate0.setProducer(defaultMQProducer0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "rocketMQTemplate", (Object) rocketMQTemplate0);
      Integer integer0 = Level.TRACE_INTEGER;
      //mock result0
      Result result0 = mock(Result.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(result0).getCode();
      
      //Call method: sendMessage
      PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "sendMessage", (Object) result0, (Class<?>) Result.class);
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_2()  throws Throwable  {
      //caseID:475d958f49576960caa5f74967cb99ba
      //CoveredLines: [33, 82, 84, 85, 89, 90, 91, 92, 93, 94]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {}
      //Assert: assertEquals((-1), (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals((-1), (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_3()  throws Throwable  {
      //caseID:53640b02a4dc72ac8ecbb59cadc6fa9d
      //CoveredLines: [33, 82, 84, 85, 86, 87, 89, 90, 91, 92, 93, 94]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getOrderId=0L, getUserId=0L}
      //Assert: assertEquals((-1), (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      Long long0 = new Long(0L);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals((-1), (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_4()  throws Throwable  {
      //caseID:52ab3a26726c0efbb271d558e55b2ee3
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.ZERO BigDecimal.ZERO, getOrderId=1596L 1596L, getUserId=1596L}
      //Assert: assertFalse(method_result.getSuccess());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      Long long0 = new Long(1596L);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertFalse(result0.getSuccess());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_5()  throws Throwable  {
      //caseID:701f0db06a498594dc1ef0b31c44d7f5
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 108, 109, 110, 111, 112, 113, 114]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=1, getOrderId=1045L 1045L 1045L, getUserId=1045L 1045L 1045L}
      //Assert: assertEquals("{\"orderId\":1045,\"message\":\"\u8BA2\u5355\u5DF2\u4ED8\u6B3E\",\"status\":false}", method_result.getMessage());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1045L).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(1045L);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Integer integer0 = new Integer(1);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      //  // Unstable assertion: assertEquals("{\"orderId\":1045,\"message\":\"\u8BA2\u5355\u5DF2\u4ED8\u6B3E\",\"status\":false}", result0.getMessage());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_6()  throws Throwable  {
      //caseID:cb4c044c2303adb10216d343309d423d
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 122, 123, 124, 125, 126, 127, 128, 129]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN BigDecimal.ZERO, getMoneyLogType=2 2, getOrderId=(-1L) (-1L) (-1L) (-1L), getUserId=(-1L) (-1L) (-1L) (-1L)}
      //Assert: assertEquals(0, (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(shopUser0).getUserMoney();
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      doReturn(0).when(shopUserMapper0).updateByPrimaryKey(any(com.nbcb.pojo.ShopUser.class));
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1L), (long)0).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      doReturn(0).when(shopUserMoneyLogMapper0).insert(any(com.nbcb.pojo.ShopUserMoneyLog.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long((-1L));
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      Integer integer0 = new Integer(2);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal1, bigDecimal1, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals(0, (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_7()  throws Throwable  {
      //caseID:509ce425f9e0eead25071a242a280cea
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 108, 117, 118, 122, 152, 155, 156, 157, 158, 159, 160, 161, 171, 172]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=1, getOrderId=0L 0L, getUserId=0L 0L 0L}
      //Assert: assertEquals(30005, (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(shopUser0).getUserMoney();
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0L).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(0L);
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      Integer integer0 = new Integer(1);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal1, bigDecimal1, bigDecimal1).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals(30005, (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_8()  throws Throwable  {
      //caseID:5efc6aedb1642c529a5535db9045cb00
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 122, 123, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=2 2, getOrderId=11L 11L 11L 11L, getUserId=11L 11L 11L 11L}
      //Assert: assertEquals("{\"orderId\":11,\"message\":\"\u8BA2\u5355\u5DF2\u9000\u8FC7\u6B3E\",\"status\":false}", method_result.getMessage());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(11L, (long)1462).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(11L);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Integer integer0 = new Integer(2);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      //  // Unstable assertion: assertEquals("{\"orderId\":11,\"message\":\"\u8BA2\u5355\u5DF2\u9000\u8FC7\u6B3E\",\"status\":false}", result0.getMessage());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_9()  throws Throwable  {
      //caseID:340a0e892680e7a4766f1a238c963b99
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 122, 123, 132, 133, 134, 135, 136, 137, 138, 147, 148, 152, 155, 156, 157, 158, 159, 160, 161, 171, 172]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN BigDecimal.ZERO, getMoneyLogType=2 2, getOrderId=11L 11L 11L 11L, getUserId=11L 11L 11L 11L}
      //Assert: assertEquals("{\"orderId\":11,\"message\":\"\u4F59\u989D\u6263\u51CF\u6210\u529F\",\"status\":true}", method_result.getMessage());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(shopUser0).getUserMoney();
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      doReturn(0).when(shopUserMapper0).updateByPrimaryKey(any(com.nbcb.pojo.ShopUser.class));
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(11L, (long)0).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      doReturn(0).when(shopUserMoneyLogMapper0).insert(any(com.nbcb.pojo.ShopUserMoneyLog.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(11L);
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      Integer integer0 = new Integer(2);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal1, bigDecimal1, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      //  // Unstable assertion: assertEquals("{\"orderId\":11,\"message\":\"\u4F59\u989D\u6263\u51CF\u6210\u529F\",\"status\":true}", result0.getMessage());
  }
}
