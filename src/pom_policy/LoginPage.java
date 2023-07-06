package pom_policy;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//	variables
	
	@FindBy(xpath="//a[@class='sign-in']")private WebElement HomepagesigninButton;
	
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement Mobilenumberfield;
	
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SigninwithPasswrdbutton;
	
	@FindBy(xpath="//input[@name='password']")private WebElement Enterpasswordfield;
	
	
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SigninButtononPasswrdpage;
	
	@FindBy(xpath="//div[text()='My Account']")private WebElement MyaccountButton;
	
	@FindBy(xpath="(//a[@class='ico-1'])[1]")private WebElement MyProfileButton;
	
//  Constructors
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Methods 	
	public void clickonHomepagesigninbutton()
	{
		HomepagesigninButton.click();
	}
	
	public void Enterintomobilenumberfield()
	{
		Mobilenumberfield.sendKeys("8407954749");
	}
	
	public void ClickOnSigninwithPasswrdbutton()
	{
		SigninwithPasswrdbutton.click();
	}
	
	public void ClickonEnterpasswordfield()
	{
		Enterpasswordfield.sendKeys("Test$123");
	}
	
	public void ClicksigninButtonpasswrdpage()
	{
		SigninButtononPasswrdpage.click();
	}
	
	
	public void ClickonmyAccountButton()
	{
		MyaccountButton.click();
	}
	
	public void ClickonMyProfilebutton()
	{
		MyProfileButton.click();
	}
	
}
