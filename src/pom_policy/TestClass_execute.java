package pom_policy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import common_study.CommonClass_methods;

public class TestClass_execute {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.policybazaar.com/");
		Actions act=new Actions(driver);
		
		
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		CommonClass_methods.implicitWait(driver,1000);
		
//		create object of login page 
		LoginPage login= new LoginPage(driver);
		
		
		login.clickonHomepagesigninbutton();
		
		Thread.sleep(1000);
		
		login.Enterintomobilenumberfield();
		
		Thread.sleep(1000);
		CommonClass_methods.implicitWait(driver, 1000);
		
		login.ClickOnSigninwithPasswrdbutton();
		
		Thread.sleep(1000);
		CommonClass_methods.implicitWait(driver, 1000);
	
		login.ClickonEnterpasswordfield();
		
		Thread.sleep(1000);
		
		login.ClicksigninButtonpasswrdpage();
		
		CommonClass_methods.implicitWait(driver, 1000);
		
		login.ClickonmyAccountButton();
		
		Thread.sleep(1000);
		
		login.ClickonMyProfilebutton();
		
		CommonClass_methods.implicitWait(driver,1000);
		
//		switch the focus of selenium from id0 to id1 
		Set<String> allwinid = driver.getWindowHandles();
		
		List<String>al=new ArrayList<>(allwinid);
		
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(1000);
		
//		Creating object of POM class to call methods present in it.
		
		Myaccount_pom myacc=new Myaccount_pom(driver);
		
//		myacc.Clickonselectgenderbutton();
//		
//		Thread.sleep(1000);
//		
//		myacc.Clickenterusername();
//		
//		Thread.sleep(1000);
//		
//		myacc.clickenteremailid();
//		
//		Thread.sleep(1000);
//		
//		myacc.Clickonannualincome();
//		
//		Thread.sleep(1000);
//		
//		myacc.Clickondrpdwnforannualincome();
//		
//		Thread.sleep(1000);
//		
//		myacc.clickonmaritalstatus();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
//		
//		myacc.Clickondrpdwnformaritalstatus();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
//		myacc.Clickoncity();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
//		
//		myacc.clickondrpdwnforcity();
////		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		myacc.clickondob();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
  
		}
		
}


