/*
 * This file was automatically generated by SmartUnit
 */

package sut.com.nbcb.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.nbcb.utils.MD5Util;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true) 
public class MD5Util_SSTest extends MD5Util_SSTest_scaffolding {
// allCoveredLines:[12, 15, 27, 28, 38, 39, 43, 44, 45, 49, 50, 51]

  @Test(timeout = 9000)
  public void test_main_0()  throws Throwable  {
      //caseID:04fa82db5d24006dd92828bc06747849
      //CoveredLines: [12, 15, 27, 28, 38, 39, 43, 44, 45, 49, 50, 51]
      //Input_0_String[]: stringArray0
      
      MD5Util mD5Util0 = new MD5Util();
      String[] stringArray0 = new String[0];
      
      //Call method: main
      MD5Util.main(stringArray0);
      
      //Test Result Assert
      assertEquals(0, stringArray0.length);
  }
}
