package locators_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Use {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1.ID
		 * 2.Class
		 * 3.Linked text
		 * 4.Partial linked text
		 * 5.Tagname 
		 * 6.css selector
		 * 7.Xpath
		 * {xpath by attribute , by text ,by contains(text/attribute),Index,select}
		 * 
		 * 8.Name*/
		
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://catalogger.ashokleyland.com/(S(et3fli3swyvos1rdqyopwacf))/frmALNewLogin.aspx");
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(1500);
////		We have used locator ID to locate the web element Userid
//		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtusername")).sendKeys("AS91384");
//		
////		we have used locator NAME to locate the web element password
//		
//		driver.findElement(By.name("firstname")).sendKeys("Xpress");
//		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("inputtext")).sendKeys("Hello");
		
		driver.findElement(By.name("pass")).sendKeys("good night");
		
		
		driver.findElement(By.linkText("Forgotten password?"));	
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		
		
		
	}

}
