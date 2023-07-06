package test_NG1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeMethods {
  @Test(priority=9)
  public void Method1() {
	  System.out.println("Method-1 is running ...."); 
	  Reporter.log("Method-1 is running ....");
	  Assert.fail();
  }
  @Test(priority=8)
  public void Method2() {
	  System.out.println("Method-2 is running ...."); 
	  Reporter.log("Method-2 is running ....");
  }
  @Test(priority=7)
  public void Method3() {
	  System.out.println("Method-3 is running ...."); 
	  Reporter.log("Method-3 is running ....");
  }
  @Test(priority=6)
  public void Method4() {
	  System.out.println("Method-4 is running ...."); 
	  Reporter.log("Method-4 is running ....");
  }
  @Test(priority=5)
  public void Method5() {
	  System.out.println("Method-5 is running ...."); 
	  Reporter.log("Method-5 is running ....");
  }
  @Test(priority=4)
  public void Method6() {
	  System.out.println("Method-6 is running ...."); 
	  Reporter.log("Method-6 is running ....");
  }
  @Test(priority=3)
  public void Method7() {
	  System.out.println("Method-7 is running ...."); 
	  Reporter.log("Method-7 is running ....");
  }
  @Test(priority=2)
  public void Method8() {
	  System.out.println("Method-8 is running ...."); 
	  Reporter.log("Method-8 is running ....");
  }
  
  @Test(priority=1)
  public void Method9() {
	  System.out.println("Method-9 is running ...."); 
	  Reporter.log("Method-9 is running ....");
  }
}
