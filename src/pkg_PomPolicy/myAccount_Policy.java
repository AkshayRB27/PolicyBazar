package pkg_PomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class myAccount_Policy 
{
	
//	variables
	
	
	@FindBy (xpath = "//div[text()='Akshay Bhosale']") private WebElement username;
	@FindBy(className = "h_l")private WebElement Logout;
	
	
	
	
	
	
//	constructor
	public myAccount_Policy(WebDriver driver)
	{
		PageFactory.initElements(driver	, this);
		
	}
		
	
	
//	methods
	public String getActualUsername()
	{
		 String actualUN= username.getText();
		return actualUN;
		 
	}
	public void CilckonLogOut()
	{
		Reporter.log("Login Out of My Account page ", true);
		Logout.click();
	}
	
	
}
