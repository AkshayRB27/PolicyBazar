 package actionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop_study {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement src = driver.findElement(By.xpath(" //a[text()=' 5000 ']"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(1000);
		
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.clickAndHold(src).moveToElement(dest1).release().build().perform();
		

	}

}
