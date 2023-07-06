package actionClass_Study;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick_RightClick_study {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement contxtclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(contxtclick).perform();
		
		Thread.sleep(1000);
		
//		Now use Unordered list from miscellaneous .
		
		List<WebElement> unorderli = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li"));
		
		for(WebElement unl:unorderli)
		{
		System.out.println(unl.getText());
		}
		for(WebElement unl:unorderli)
		{
		String exp= "Quit";
		
		if(exp.equals(unl.getText()))
		{
			unl.click();
		
			break;
		}	}	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
//		Now to handle alert popup to click accept
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
//		
		
		
		
		
		
		
		}

	}


