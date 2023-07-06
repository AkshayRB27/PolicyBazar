package locators_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selectors {

	public static void main(String[] args) throws InterruptedException {
//		css= tag#id
//		css=tag.class
//		css=tag[attribute=value]
//		css=tag.class[attribute=value]
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("sahil");
		
		
		

	}

}
