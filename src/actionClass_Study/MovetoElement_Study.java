package actionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement_Study {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
//		handle pop-up window by using xpath. 
		
		driver.findElement(By.xpath("//button[@data-testid='close-button']")).click();
		
//		to take mouse actions we need to create Object of the Actions class		
		Actions act =new Actions(driver);
		
		Thread.sleep(1000);
		
		WebElement aboutUs = driver.findElement(By.xpath("(//a[text()=' About Us'])[1]"));

		act.moveToElement(aboutUs).perform();
		
		aboutUs.click();

	}

}
