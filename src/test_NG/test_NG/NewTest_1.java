package test_NG.test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest_1 {
  @Test
  public void Mymethod6() 
  {
	  Reporter.log("Mymethod6 is running ...",true);
  }
  @Test (invocationCount = 2,timeOut = 10)
  public void Mymethod7() 
  {
	  Reporter.log("Mymethod7 is running ...",true);
  }
  @Test 
  public void Mymethod8() 
  {
	  Reporter.log("Mymethod8 is running ...",true);
  }
  @Test
  public void Mymethod9() 
  {
	  Reporter.log("Mymethod9 is running ...",true);
  }
  @Test 
  public void Mymethod10() 
  {
	  Reporter.log("Mymethod10 is running ...",true);
  }
  @Test (enabled = false)
  public void Mymethod11() 
  {
	  Reporter.log("Mymethod11 is running ...",false);
  }
}
