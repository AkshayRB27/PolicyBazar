package webDriverMethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_study {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/login/");
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		

	}

}
