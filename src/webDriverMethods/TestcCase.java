package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestcCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		Thread.sleep(1000);
		
		WebElement DAY = driver.findElement(By.id("day"));	
		
		Select sdate= new Select(DAY);
		
		sdate.selectByValue("15");
		
		
		
		

	}

}
