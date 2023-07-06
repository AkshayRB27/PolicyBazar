package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Till_GetText {

	public static void main(String[] args) throws InterruptedException {
		
//		Web element 				webelement
//		1.sendkeys					sendkeys,click,clear,gettext,is-enable,is-selected,is-displayed
//		2.gettext
//		3.quit 
//		4.close
//		5.clear
//		6.click
//		7.threadsleep??
//		8.getcurrenturl
//		9.get title 
//		10.isenable
//		11.findelement
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://helpline.ashokleyland.com/elitesupport/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		String Exptcttext="Elite login";
		
		WebElement title = driver.findElement(By.xpath("//b[text()='Elite Login']"));
		
		String Header=title.getText();
		
		System.out.println("My title "+Header);
		
		driver.quit();
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("91601DSH");
//		
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("all@123");
//		
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
//		
		

		
		
		
		
	}

	
	}


