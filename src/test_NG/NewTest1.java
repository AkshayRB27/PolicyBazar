package test_NG;



//import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NewTest1 {
  @Test(priority = 2,invocationCount = 3)
  public void test() {
	  System.out.println("This is the test method...");
	  Reporter.log("This is the test method...");
	  Assert.fail();
  }
  @Test(priority = 1,invocationCount = 4,timeOut = 5)
  void test1()
  {
	  System.out.println("This is the Test2 Execution ");
	  Reporter.log("This is the test1 method...");

  }
  @Test (enabled = false)
  void test2()
  {
	  System.out.println("To check this method ....");
  }
  @BeforeMethod
  void beforemethod()
  {
	  System.out.println("This is the Beforemethod Execution ");
  }
  
  @AfterMethod
  void aftermethod()
  {
	  System.out.println("This is the Aftermethod Execution ");

  }
  @BeforeClass
  void beforeclass()
  {
	  System.out.println("This is the Beforeclass Execution ");
  
  }
  
  @AfterClass
  void afterclass()
  {
	  System.out.println("This is the Afterclass Execution ");

  }
}
