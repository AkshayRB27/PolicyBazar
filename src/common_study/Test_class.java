package common_study;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.neostox.com/sign-in");
		
		driver.manage().window().maximize();
		
		CommonClass_methods.implicitWait(driver, 1000);
		
//		CommonClass_methods.screenshot(driver, "neostox");
		
		CommonClass_methods.implicitWait(driver, 1000);
		
//		WebElement mobilenum = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		
//		CommonClass_methods.implicitWait(driver, 1000);
		
//		CommonClass_methods.scrollIntoview(driver, mobilenum);
		
		CommonClass_methods.implicitWait(driver, 1000);
		
		WebElement Loginscreen = driver.findElement(By.id("div_mainsignin"));
		
		CommonClass_methods.screenshot(driver, "login");
		
		CommonClass_methods.readdatafromExcel(0, 2);
		
		
	}

}
