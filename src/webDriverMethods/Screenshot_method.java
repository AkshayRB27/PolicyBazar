package webDriverMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_method {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();// Create Interface
		
		driver.get("https://www.justdial.com/"); //Get the Url 
		
		driver.manage().window().maximize();
		Thread.sleep(1000); //apply thread for Url opening 
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //command driver to take screenshot
	
//	System.out.println(src); // show the path for the image stored i.e temp files
	String str=RandomString.make(3);
	File path=new File("F:\\Akshay study\\Screenshot\\f"+str+".png");
	
	FileHandler.copy(src,path);
	
	Thread.sleep(1000);
	
	
	Thread.sleep(2000);
	
	
	driver.get("https://www.makemytrip.com/");
	
	WebElement Section = driver.findElement(By.xpath("//div[contains(@class,'widgetSection appendBottom40 primaryTraveler ')]"));
	
	File source=Section.getScreenshotAs(OutputType.FILE);
	
	
	
	File location=new File("F:\\Akshay study\\Screenshot\\f"+str+".png");
	
	FileHandler.copy(source, location);
	
	Thread.sleep(1000);
	driver.close();
	
	
	
	
	
	
		
		

		
		

	}

}
