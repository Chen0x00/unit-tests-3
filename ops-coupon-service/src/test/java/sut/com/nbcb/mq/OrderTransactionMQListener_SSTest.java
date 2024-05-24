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
// allCoveredLines:[33, 54, 55, 56, 57, 58, 66, 67, 68, 69, 70, 71, 75, 76, 77, 78, 79, 82, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 98, 99, 100, 101, 102, 104, 107, 108, 109, 110, 111, 112, 113, 114, 117, 118, 122, 123, 124, 125, 126, 127, 128, 129, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 147, 148, 152, 155, 156, 157, 158, 159, 160, 161, 171, 172, 176, 177, 178, 179]

  @Test(timeout = 9000)
  public void test_onMessage_0()  throws Throwable  {
      //caseID:3b5986356bb54687be25461753ff6929
      //CoveredLines: [33, 54, 55, 56, 57, 58, 66, 67, 68, 69, 70, 71, 75, 76, 77, 79, 176, 177]
      //Input_0_MessageExt: {getBody=byteArray0}
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)125;
      //mock messageExt0
      MessageExt messageExt0 = mock(MessageExt.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(byteArray0).when(messageExt0).getBody();
      
      //Call method: onMessage
      // Undeclared exception!
      try { 
        orderTransactionMQListener0.onMessage(messageExt0);
      } catch(Throwable e) {
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
         assertEquals("com.alibaba.fastjson.JSONException", e.getClass().getName());
         assertEquals("syntax error,expect start with { or [,but actually start with }", e.getMessage());
      }
  }

  @Test(timeout = 9000)
  public void test_onMessage_1()  throws Throwable  {
      //caseID:0f1c211c9ecdc34f6c94191333630a96
      //CoveredLines: [33, 54, 55, 56, 57, 58, 66, 67, 68, 69, 70, 71, 75, 78, 79, 176, 177, 178, 179]
      //Input_0_MessageExt: {getBody=byteArray0}
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      RocketMQTemplate rocketMQTemplate0 = new RocketMQTemplate();
      //mock defaultMQProducer0
      DefaultMQProducer defaultMQProducer0 = mock(DefaultMQProducer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      rocketMQTemplate0.setProducer(defaultMQProducer0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "rocketMQTemplate", (Object) rocketMQTemplate0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)125;
      //mock messageExt0
      MessageExt messageExt0 = mock(MessageExt.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(byteArray0).when(messageExt0).getBody();
      
      //Call method: onMessage
      // Undeclared exception!
      try { 
        orderTransactionMQListener0.onMessage(messageExt0);
      } catch(Throwable e) {
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
         assertEquals("com.alibaba.fastjson.JSONException", e.getClass().getName());
         assertEquals("syntax error,expect start with { or [,but actually start with }", e.getMessage());
      }
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_2()  throws Throwable  {
      //caseID:743c39511d8c8e35e27d1ed7c087304f
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
      //caseID:a9867de49466877bc08006b9354584c3
      //CoveredLines: [33, 82, 84, 85, 86, 87, 89, 90, 91, 92, 93, 94]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getOrderId=403L, getUserId=403L}
      //Assert: assertEquals((-1), (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      Long long0 = new Long(403L);
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
      //caseID:68de6729817e799a47f04585e46a7704
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.ZERO BigDecimal.ZERO, getOrderId=403L 403L, getUserId=403L}
      //Assert: assertEquals((-1), (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      Long long0 = new Long(403L);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals((-1), (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_5()  throws Throwable  {
      //caseID:fb8f9f388e7a6f1e31dbc8e44ad6e2b4
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 108, 109, 110, 111, 112, 113, 114]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=1 1, getOrderId=1 1 1, getUserId=1 1 1}
      //Assert: assertEquals("{\"orderId\":1,\"message\":\"\u8BA2\u5355\u5DF2\u4ED8\u6B3E\",\"status\":false}", method_result.getMessage());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(shopUser0).getUserMoney();
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      doReturn(1).when(shopUserMapper0).updateByPrimaryKey(any(com.nbcb.pojo.ShopUser.class));
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((long)1).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      doReturn(1).when(shopUserMoneyLogMapper0).insert(any(com.nbcb.pojo.ShopUserMoneyLog.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(1);
      Integer integer0 = new Integer(1);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal0, bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      //  // Unstable assertion: assertEquals("{\"orderId\":1,\"message\":\"\u8BA2\u5355\u5DF2\u4ED8\u6B3E\",\"status\":false}", result0.getMessage());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_6()  throws Throwable  {
      //caseID:90d96266c6fa8f953db126310bd6486b
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 122, 123, 124, 125, 126, 127, 128, 129]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=2 2, getOrderId=(-2797L) (-2797L) (-2797L), getUserId=(-2797L) (-2797L) (-2797L)}
      //Assert: assertEquals(0, (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-2797L)).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long((-2797L));
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Integer integer0 = new Integer(2);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals(0, (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_7()  throws Throwable  {
      //caseID:c3ced97a44e4983ee3e022f906440a37
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 108, 117, 118, 122, 152, 155, 156, 157, 158, 159, 160, 161, 171, 172]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=1 1, getOrderId=1 1 1, getUserId=1 1 1}
      //Assert: assertEquals("{\"orderId\":1,\"message\":\"\u4F59\u989D\u6263\u51CF\u6210\u529F\",\"status\":true}", method_result.getMessage());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(shopUser0).getUserMoney();
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      doReturn(1).when(shopUserMapper0).updateByPrimaryKey(any(com.nbcb.pojo.ShopUser.class));
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-2781L)).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      doReturn(1).when(shopUserMoneyLogMapper0).insert(any(com.nbcb.pojo.ShopUserMoneyLog.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(1);
      Integer integer0 = new Integer(1);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal0, bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      //  // Unstable assertion: assertEquals("{\"orderId\":1,\"message\":\"\u4F59\u989D\u6263\u51CF\u6210\u529F\",\"status\":true}", result0.getMessage());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_8()  throws Throwable  {
      //caseID:89720aaa875f48c45ad39c956dc1f17d
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 122, 123, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.TEN BigDecimal.TEN, getMoneyLogType=2 2, getOrderId=2 2 2 2, getUserId=2 2 2 2}
      //Assert: assertEquals(30004, (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((long)6, (long)2).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(2);
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
      assertEquals(30004, (int)result0.getCode());
  }

  @Test(timeout = 9000)
  public void test_updateMoneyPaid_9()  throws Throwable  {
      //caseID:1709900df98983e47e04ede2ff14192c
      //CoveredLines: [33, 82, 84, 85, 86, 87, 88, 98, 99, 100, 101, 102, 104, 107, 122, 123, 132, 133, 134, 135, 136, 137, 138, 147, 148, 152, 155, 156, 157, 158, 159, 160, 161, 171, 172]
      //Input_0_com.nbcb.pojo.ShopUserMoneyLog: {getUseMoney=BigDecimal.ONE BigDecimal.ONE BigDecimal.ONE, getMoneyLogType=2 2, getOrderId=2 2 2 2, getUserId=2 2 2 2}
      //Assert: assertEquals(30005, (int)method_result.getCode());
      
      OrderTransactionMQListener orderTransactionMQListener0 = new OrderTransactionMQListener();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      //mock shopUser0
      ShopUser shopUser0 = mock(ShopUser.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(bigDecimal0).when(shopUser0).getUserMoney();
      //mock shopUserMapper0
      ShopUserMapper shopUserMapper0 = mock(ShopUserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(shopUser0).when(shopUserMapper0).selectByPrimaryKey(anyLong());
      doReturn(1).when(shopUserMapper0).updateByPrimaryKey(any(com.nbcb.pojo.ShopUser.class));
      //mock shopUserMoneyLogMapper0
      ShopUserMoneyLogMapper shopUserMoneyLogMapper0 = mock(ShopUserMoneyLogMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((long)1, (-2790L)).when(shopUserMoneyLogMapper0).countByExample(any(com.nbcb.pojo.ShopUserMoneyLogExample.class));
      doReturn(2).when(shopUserMoneyLogMapper0).insert(any(com.nbcb.pojo.ShopUserMoneyLog.class));
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMoneyLogMapper", (Object) shopUserMoneyLogMapper0);
      
      PrivateAccess.setVariable((Class<?>) OrderTransactionMQListener.class, orderTransactionMQListener0, "userMapper", (Object) shopUserMapper0);
      Long long0 = new Long(2);
      Integer integer0 = new Integer(2);
      //mock shopUserMoneyLog0
      ShopUserMoneyLog shopUserMoneyLog0 = mock(ShopUserMoneyLog.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0, integer0).when(shopUserMoneyLog0).getMoneyLogType();
      doReturn(bigDecimal0, bigDecimal0, bigDecimal0).when(shopUserMoneyLog0).getUseMoney();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getOrderId();
      doReturn(long0, long0, long0, long0).when(shopUserMoneyLog0).getUserId();
      
      //Call method: updateMoneyPaid
      Result result0 = (Result)PrivateAccess.callMethod((Class<OrderTransactionMQListener>) OrderTransactionMQListener.class, orderTransactionMQListener0, "updateMoneyPaid", (Object) shopUserMoneyLog0, (Class<?>) ShopUserMoneyLog.class);
      
      //Test Result Assert
      assertEquals(30005, (int)result0.getCode());
  }
}
