package pkg_PomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Pom_Policy 

{
//	variables
	
	@FindBy(className = "sign-in") private WebElement SignInbuttononLoginpage;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement EnterMobilenum ;
	@FindBy(xpath= "(//span[text()='Sign in with Password'])[2]") private WebElement SignInwithPasswrdButton;
	@FindBy(xpath = "//input[@type='password']") private WebElement EnterPWD;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignInbuttonOnpwdpage;
	@FindBy(className = "userprofile") private WebElement MyAccount;
	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement MyProfile;
	@FindBy(xpath = "//span[text()='Sign out']")private WebElement Signout;
	
	
	
	
	
//	constructors 
	
	public Pom_Policy(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	
	
//	Methods
	public void ClickonSignInbuttonLoginpage()
	{
		Reporter.log("Click on HomePage SignIn Button"	, true);
		SignInbuttononLoginpage.click();
		
	}
	public void EntermobNum()
	{
		Reporter.log("Entering Mobile Number", true);
		EnterMobilenum.sendKeys("8407954749");
		
	}
	public void ClickOnSignInwithPWD ()
	{
		Reporter.log("Clicking On SIgnIn button With password",true);
		SignInwithPasswrdButton.click();
		
}
	public void EnterPasswrd()
	{
		Reporter.log("Entering Passwrod ", true);
		EnterPWD.sendKeys("Test$123");
		
	}
	public void ClickOnSigninPwdpage()
	{
		Reporter.log("Clicking On SignIn on Pwd page", true);
		SignInbuttonOnpwdpage.click();
		
	}
	public void ClickonMyAccount()
	{
		Reporter.log("Clicking On MyAccount", true);
		MyAccount.click();
			}
	public void ClickonMyProfile()
	{
		Reporter.log("Entering My profile", true);
		MyProfile.click();
		
	}
	public void ClickonSignoutButton()
	{
		Reporter.log("SignInOut", true);
		Signout.click();
	}
	
	
	
	
}
