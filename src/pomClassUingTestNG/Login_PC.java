package pomClassUingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PC {
	
//	variable 
	
	@FindBy(className = "sign-in") private WebElement SignInbuttononLoginpage;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement EnterMobilenum ;
	@FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]") private WebElement SignInwithPasswrdButton;
	@FindBy(xpath = "//input[@type='password']") private WebElement EnterPWD;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignInbuttonOnpwdpage;
	@FindBy(className = "userprofile") private WebElement MyAccount;
	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement MyProfile;
	@FindBy(xpath = "//span[text()='Sign out']")private WebElement Signout;
	
//	Constructor
	
	public Login_PC(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
//	Methods 
	
	public void ClickonSignInbuttonLoginpage()
	{
		SignInbuttononLoginpage.click();
	}
	public void EntermobNum()
	{
		EnterMobilenum.sendKeys("8407954749");
	}
	public void ClickOnSignInwithPWD ()
	{
		SignInwithPasswrdButton.click();
	}
	public void EnterPasswrd()
	{
		EnterPWD.sendKeys("Test$123");
	}
	public void ClickOnSigninPwdpage()
	{
		SignInbuttonOnpwdpage.click();
	}
	public void ClickonMyAccount()
	{
		MyAccount.click();
	}
	public void ClickonMyProfile()
	{
		MyProfile.click();
	}
	public void ClickonSignoutButton()
	{
		Signout.click();
	}
}
