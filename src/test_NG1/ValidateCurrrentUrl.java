package test_NG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateCurrrentUrl {
  @Test
  public void validateurl() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://gallagher-service-center.ajg.com/overview/");
	  
	  Thread.sleep(1000);
	  
	  String ActualUrl = driver.getCurrentUrl();
	  String ExpUrl = "https://gallagher-service-center.ajg.com/overview/";
	  
	  if (ActualUrl.equals(ExpUrl))
	  {
		  Reporter.log("Actual and Expected Url Matches. TC Passed");
	  }
	  else
	  {
		 Reporter.log("Actual and Expected Url Not Matches. TC Failed"); 
	  }
	   
	  Thread.sleep(1000);
	  
	  driver.close();
	  
	  
  }
}
