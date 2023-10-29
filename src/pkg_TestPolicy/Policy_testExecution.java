package pkg_TestPolicy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pkg_Base.Base;
import pkg_PomPolicy.Pom_Policy;
import pkg_PomPolicy.myAccount_Policy;
import pkg_Utility.UtilityPolicy;

public class Policy_testExecution extends Base
{
	Pom_Policy login;
	myAccount_Policy myAcc;
//	@Parameters("browserName")
	@BeforeClass
	public void LauchingURL () throws InterruptedException
	{
		UtilityPolicy.wait(1000);
		lauchingURL();
		login = new Pom_Policy(driver);
		myAcc = new myAccount_Policy(driver);
		
	}
		
	@BeforeMethod
	public void LoginPB() throws InterruptedException
	{
		UtilityPolicy.wait(2000);
		login.ClickonSignInbuttonLoginpage();
		UtilityPolicy.wait(1000);
		login.EntermobNum();
		UtilityPolicy.wait(3000);
		login.ClickOnSignInwithPWD();
		UtilityPolicy.wait(3000);
		login.EnterPasswrd();
		UtilityPolicy.wait(2000);
		login.ClickOnSigninPwdpage();
		UtilityPolicy.wait(2000);
		login.ClickonMyAccount();
		UtilityPolicy.wait(2000);
		login.ClickonMyProfile();
		UtilityPolicy.wait(2000);
		Set<String> allwindowid = driver.getWindowHandles();
		List<String> id= new ArrayList<>(allwindowid);
		driver.switchTo().window(id.get(1));
		Reporter.log("Switching window to child page ", true);
		UtilityPolicy.wait(1000);
		
		
	}
	
	@Test 
	public void validateUserId() throws IOException, InterruptedException
	{
		String actualUN = myAcc.getActualUsername();
		String expUN    = "Akshay Bhosale";
		UtilityPolicy.wait(1000);
		
		Assert.assertEquals(actualUN, expUN, "TC failed,UN not matching ");
		UtilityPolicy.wait(1000);
		
		UtilityPolicy.takingscreenshot(driver, actualUN);
		
	}
	
	@AfterMethod
	public void loggingOut () throws InterruptedException
	{
		UtilityPolicy.wait(1000);
		myAcc.CilckonLogOut();
		
	}
	
	@AfterClass
	public void Closingwindw() throws InterruptedException
	{
		UtilityPolicy.wait(1000);
		driver.quit();
	}
	
	
	
}
