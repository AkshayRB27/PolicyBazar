package crossbrowser.test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	 
  @Parameters("browserName") 
  @Test
  public void cbTest (String bName) throws InterruptedException {
	  WebDriver driver = null;
	  
	  if (bName.equals("chrome"))
	  {
		  driver =new ChromeDriver();
	  }
	  else if (bName.equals("fireFox"))
		{
			driver =new FirefoxDriver();
		}
	  else if (bName.equals("Edge"))
	  {
		  
		 driver = new EdgeDriver();
	  }
	 
  
//  Open URL
	driver.get("https://www.policybazaar.com/");
	
	driver.manage().window().maximize();
	
	//	Apply some wait to load the page 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
	
//	inspect the Signing Button
	WebElement signin = driver.findElement(By.xpath("//a[@class='sign-in']"));
	
	Thread.sleep(1000);
	
	signin.click();
	
	Thread.sleep(1000);
	
	driver.close();
  
  }
  }

