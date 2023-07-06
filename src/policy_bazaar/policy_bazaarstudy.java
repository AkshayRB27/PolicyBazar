package policy_bazaar;


import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.interactions.Actions;

public class policy_bazaarstudy {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
//		Open URL
		driver.get("https://www.policybazaar.com/");
		
//		Apply some wait to load the page 
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(1000));	
		
//		inspect the Signing Button
		WebElement signin = driver.findElement(By.xpath("//a[@class='sign-in']"));
		
		Thread.sleep(1000);
		
		signin.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8407954749");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test$123");
		
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();			
		
		
		
		
	}

}
