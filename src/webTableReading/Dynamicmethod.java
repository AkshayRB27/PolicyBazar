package webTableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicmethod {
;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		int Rownub = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		int columnnub = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		
		

	}

}
