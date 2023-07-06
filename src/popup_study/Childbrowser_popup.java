package popup_study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("NewWindow")).click();
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> windowsid = driver.getWindowHandles();
		
		System.out.println(windowsid);
		
		ArrayList<String> al=new ArrayList<>(windowsid);
		String mainid = al.get(0);
		String childid = al.get(1);
		
		driver.switchTo().window(childid);
		
		Thread.sleep(1000);
		
		driver.close();
		
		Thread.sleep(1000);
		
		driver.switchTo().window(mainid);
		
		driver.close();
		
		
	}

}
