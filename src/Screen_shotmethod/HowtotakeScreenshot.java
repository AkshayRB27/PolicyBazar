package Screen_shotmethod;

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

public class HowtotakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		System.out.println(abc);
	
		String str=RandomString.make(3);
		
		
		File src = new File("F:\\Akshay study\\Screenshot\\a"+str+".png");
		
		FileHandler.copy(abc, src);
		
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String stir=RandomString.make(2);
		
		File desk = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			File actual = new File("F:\\Akshay study\\Screenshot\\a"+stir+".png");
			
			FileHandler.copy(desk, actual);
			
			driver.close();
		
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement srcn = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
		
		File source = srcn.getScreenshotAs(OutputType.FILE);
		
		File desti=new File("F:\\Akshay study\\Screenshot\\c.png");
		
		FileHandler.copy(source, desti);
		
		driver.quit();
		
		
		
		
		
		
		;
		
		
		
		
		
		

	}

}
