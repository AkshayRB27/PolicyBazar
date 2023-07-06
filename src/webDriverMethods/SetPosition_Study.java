package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Study {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		System.out.println(driver.manage().window().getPosition());
		
		Dimension d2=new Dimension(100,100);
		
		driver.manage().window().setSize(d2);
		
		Thread.sleep(1000);
		
		Point p=new Point(10,10);
		
		driver.manage().window().setPosition(p);
		
		
		

		
	}

}
