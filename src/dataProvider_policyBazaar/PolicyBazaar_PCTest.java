package dataProvider_policyBazaar;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v111.browser.model.WindowID;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common_study.CommonClass_methods;
import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver;

public class PolicyBazaar_PCTest {
	WebDriver driver;
	Login_PC login;
	Myaccount_PC myacc;
	SoftAssert s;
	
	
	@BeforeMethod
    public void LaunchUrl() throws InterruptedException
    {
		
		driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/"); 
		Thread.sleep(1000);
		driver.manage().window().maximize();
		login= new Login_PC(driver);
		myacc = new Myaccount_PC(driver);
		s= new SoftAssert();
    }
	
		@Test(dataProvider = "Policybazaar", dataProviderClass =pb_DATA.class)
		public void logintoPC(String mobNum,String pwd)
		{
	
		CommonClass_methods.implicitWait(driver, 1000);
		login.ClickonSignInbuttonLoginpage();
		CommonClass_methods.implicitWait(driver, 1500);
		login.EntermobNum(mobNum);
		CommonClass_methods.implicitWait(driver, 1500);
		login.ClickOnSignInwithPWD();
		CommonClass_methods.implicitWait(driver, 1500);
		login.EnterPasswrd(pwd);
		CommonClass_methods.implicitWait(driver, 1000);
		login.ClickOnSigninPwdpage();
		CommonClass_methods.implicitWait(driver, 1000);
		login.ClickonMyAccount();
		CommonClass_methods.implicitWait(driver, 500);
		login.ClickonMyProfile();
		CommonClass_methods.implicitWait(driver, 1000);
		Set<String> allwindowid = driver.getWindowHandles();
		List<String> id = new ArrayList<>(allwindowid);
		driver.switchTo().window(id.get(1));
		CommonClass_methods.implicitWait(driver, 1000);
		
		driver.navigate().refresh();
		CommonClass_methods.implicitWait(driver, 2000);
		
		
//		MyAccount page 
		
//		
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.EnterUsername();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.ClickonGender();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.EnterEmailid();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.ClickonAnnualIncomebutton();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.SelectAnnualIncome();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.EnterDOB();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.EnterMaritalstatus();
//		CommonClass_methods.implicitWait(driver, 500);
//		myacc.ClickOnselectMstatus();
//		CommonClass_methods.implicitWait(driver, 500);
//		myacc.Doubleclickcity();
//		CommonClass_methods.implicitWait(driver, 500);
//		myacc.SelectCityname();
//		CommonClass_methods.implicitWait(driver, 1000);
//		myacc.EnterCityName();
//		CommonClass_methods.implicitWait(driver, 500);
//		myacc.Clickonsavebutton();
		
		s.assertAll();
	}
	

	
@AfterMethod
  public void logginoutFromPB()
  {
	myacc.ClickOnLogout();
	CommonClass_methods.implicitWait(driver, 1000);
	Set<String> allwindowid = driver.getWindowHandles();
	List<String>Mid= new ArrayList<>(allwindowid);
	driver.switchTo().window(Mid.get(0));
	CommonClass_methods.implicitWait(driver, 1000);
	login.ClickonMyAccount();
	CommonClass_methods.implicitWait(driver, 500);
	login.ClickonSignoutButton();
	
  }
//@AfterClass
// public void ClosingWindow()
// {
//	CommonClass_methods.implicitWait(driver, 1000);
//	driver.quit();
//	
// }


}
