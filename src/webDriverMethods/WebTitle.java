package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTitle {

	public static void main(String[] args) {
		
//		to call web url and check the actual and expected title of the web page .
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.unishivaji.ac.in/");
		
		String ExpectedTitle="Shivaji Universtiy,Kolhapur";
		System.out.println("Expected Title is "+ExpectedTitle);
		String ActualTitle= driver.getTitle();
		
		System.out.println("Actual Title is "+ActualTitle);
		
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Actual Title is same as Expected Title ");
		} 
		else {System.out.println("The Title has no match");

		}
		
		

	}

}
