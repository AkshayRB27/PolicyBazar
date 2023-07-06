package frame_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
//		https://chercher.tech/practice/frames-example-selenium-webdriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
//		driver.quit();
		
		Thread.sleep(2000);
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
		
	}

}
