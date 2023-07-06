package webTableReading;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webintermidate_tableReading {

	public static void main(String[] args) {
//		to read the read the intermediate rows 
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
//			 WebElement singleheader = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[3]"));
//
//			System.out.print(singleheader.getText()+);

			WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[1]"));
			
			System.out.println(data.getText());
			
			for (int i=1;i<=5;i++)
			{
				WebElement d1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td["+i+"]"));
				
				System.out.print(d1.getText()+"|");
			}
			System.out.println();
	}

	
	
}
