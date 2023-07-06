package popup_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele_popupbrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement mobno = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		mobno.sendKeys("8669121224");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
