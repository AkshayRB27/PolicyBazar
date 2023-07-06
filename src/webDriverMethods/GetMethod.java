package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod {

	public static void main(String[] args) {
		
//		to call url by creating objection
		
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.dtdc.in/");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().window().minimize();
//		
		driver.navigate().to("https://www.dtdc.in/");
		
		driver.navigate().to("https://www.samsung.com/in/offer/online/samsung-fest/");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.apple.com/in/iphone/");
		
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
