package locators_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_use {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.id("day"));
		
		Select sdate=new Select(Day);
		
		sdate.selectByVisibleText("15");
		
		WebElement Month=driver.findElement(By.id("month"));
		
		Select smonth=new Select(Month);
		
		smonth.selectByIndex(3);
		
		WebElement Year = driver.findElement(By.id("year"));
		
		Select syear=new Select(Year);
		
		syear.selectByValue("2015");
		
	}

}
