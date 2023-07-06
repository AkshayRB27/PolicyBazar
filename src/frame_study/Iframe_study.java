package frame_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_study {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
//		
		
//		driver.findElement(By.tagName("path")).click();		
		
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[text()=' About Us'][1]")).click();

	}

}
