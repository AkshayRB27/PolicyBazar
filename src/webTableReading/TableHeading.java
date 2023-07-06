package webTableReading;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHeading {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> header = driver.findElements(By.tagName("th"));
		
		Iterator<WebElement> it = header.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" | ");
		}
		System.out.println();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		To read the data data from single row 
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/td"));
		Iterator<WebElement> itr = row1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next().getText()+" | ");
		}
		System.out.println();
	}

}
