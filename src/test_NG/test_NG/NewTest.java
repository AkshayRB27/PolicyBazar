package test_NG.test_NG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
	@Test (priority = 5)
	  public void Mymethod1()
	  {
		  Reporter.log("Mymethod1 is running ....",true);
	  }@Test (priority = 4)
  public void Mymethod2()
  {
	  Reporter.log("Mymethod2 is running ....",true);
  }
	  @Test(priority = 3, dependsOnMethods = "Mymethod5")
	  public void Mymethod3()
	  {
		  Reporter.log("Mymethod3 is running ....",true);
	  }
	  
	  @Test(priority = 2,dependsOnMethods = "Mymethod5" )
	  public void Mymethod4()
	  {
		  Reporter.log("Mymethod4 is running ....",true);
	  }
	  
	  @Test(priority = 1)
	  public void Mymethod5()
	  {
		  Reporter.log("Mymethod5 is running ....",true);
		  Assert.fail();
	  }
	  
	  
}
