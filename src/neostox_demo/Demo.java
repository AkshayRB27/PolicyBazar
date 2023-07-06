package neostox_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
//		Implicit wait will help us to wait for the browser to load and save time if search has completed before time 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		Click on Sign in
		driver.findElement(By.xpath("//a[text()='Sign In'][1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		Input Mobile No
		driver.findElement(By.xpath("//input[@type='number'][1]")).sendKeys("8407954749");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//		Click on signup button
		driver.findElement(By.id("lnk_signup1")).click();
//		Enter password
		driver.findElement(By.id("txt_accesspin")).sendKeys("1234");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//		Click on Submit button
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		
		
		 WebElement popup1 = driver.findElement(By.xpath("(//span[text()='×'])[19]"));
		 
		 WebDriverWait W= new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 W.until(ExpectedConditions.visibilityOf(popup1));
		 
		 popup1.click();
		
		 
		
		WebElement popup2 = driver.findElement(By.xpath("(//span[text()='×'])[36]"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(40));
		
		W.until(ExpectedConditions.visibilityOf(popup2));
		
		popup2.click();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
//		ChromeOptions opt=new ChromeOptions();
//		
//		opt.addArguments("–disable-popup-blocking");
//		opt.addArguments("-disable-notifications");
		
		
		WebElement popup3 = driver.findElement(By.xpath("(//span[text()='×'])[36]"));
		
		w.until(ExpectedConditions.visibilityOf(popup3));
		
		popup3.click();
		
		Thread.sleep(1000);
		
		WebElement Balance = driver.findElement(By.id("navbarDropdown"));
		
		System.out.println(Balance.getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		
//		
//		
//		
//		w.until(ExpectedConditions.visibilityOf(logout));
//		
//		logout.click();
//		
//		
	}

}
