package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrent_url {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.unishivaji.ac.in/student/Student-Council");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String MyUrl=driver.getCurrentUrl();
		System.out.println("My Current URL "+MyUrl);
		
		driver.quit();
		

	}

}
