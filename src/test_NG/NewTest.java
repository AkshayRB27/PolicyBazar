package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.policybazaar.com");
	  
	  Thread.sleep(1000);
	  driver.switchTo().newWindow(WindowType.TAB);
	  
	  driver.get("https://neostox.com/");
	  
	  driver.quit();
  }
	  
	  @Test
	  public void ab()
	  {
		  Reporter.log("ab is running ", true);
		 
	  }
	  @Test
	  public void cd()
	  {
		  Reporter.log("cd is running ",true);
	  }
	  
	  
	  
	  
	  
  
}
