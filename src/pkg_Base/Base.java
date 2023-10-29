package pkg_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Base 
{
 //	create lauching url with browser 
	public WebDriver driver;
	
	
	public void lauchingURL()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		Reporter.log("Launching URL", true);
	}
	
	public void ClosingURL()
	{
		
		Reporter.log("Closing URL", true);
		driver.quit();
	}

}
