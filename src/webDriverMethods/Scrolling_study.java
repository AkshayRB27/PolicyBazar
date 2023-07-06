package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_study {

	public static void main(String[] args) throws InterruptedException {
//	 1.Pixel method
//	 2.Visible element method
//	 3. Bottom method
     
//		Pixel Method
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
//		object creation
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,-2000)");
//		
//		driver.close();
		
//		Visible element method
		WebElement best_seller = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
//		
		Thread.sleep(1000);
//		
		js.executeScript("argument[0].scrollIntoView(true);",best_seller);
//		
//		js.executeScript("window.scrollTo(0,documentbody.scrollHeight)");
		
	}

	
	}


