package pomClassUingTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount_PC {
	
//	variables
//	(//label[@class='sc-eHgmQL kDyQoE'])[1]
	@FindBy(xpath="(//label[@class='sc-eHgmQL kDyQoE'])[1]")private WebElement Gender;
	@FindBy(xpath="//input[@name='personName']")private WebElement username;
	@FindBy(xpath="//input[@name='email']")private WebElement emailid;
	@FindBy(xpath="(//div[@role='button'])[1]")private WebElement AnnualIncome;
	@FindBy(xpath="(//li[@role='option'])[4]")private WebElement annualIncomedropdwn;
	@FindBy(xpath="(//input[@type='text'])[4]") private WebElement DOB;
	@FindBy(xpath="(//div[@role='button'])[2]")private WebElement Maritalstatus ;
	@FindBy(xpath="(//li[@role='option'])[1]")private WebElement selectMstatus;
	@FindBy(xpath="(//input[@type='text'])[5]")private WebElement selectCity;
	@FindBy(xpath="//span[text()='e,Maharashtra']")private WebElement Cityname;
	@FindBy(xpath="//span[text()='Save']")private WebElement Savebutton;
	
	@FindBy(className = "h_l")private WebElement Logout;
	
	
	
	
//	Constructors 
	
	public Myaccount_PC(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Methods
	
	public void ClickonGender()
	{
		Gender.click();
	}
	public void EnterUsername()
	{
		username.sendKeys("Akshay Bhosale");
	}
	public void EnterEmailid()
	{
		emailid.sendKeys("ultimateakshay007@gmail.com");
	}
	public void ClickonAnnualIncomebutton()
	{
		AnnualIncome.click();
	}
	public void SelectAnnualIncome()
	{
		annualIncomedropdwn.click();
	}
	public void EnterDOB()
	{
		DOB.sendKeys("07/07/2000");
	}
	public void EnterMaritalstatus()
	{
		Maritalstatus.click();
	}
	public void ClickOnselectMstatus()
	{
		selectMstatus.click();
	}
	public void Doubleclickcity()
	{
		selectCity.click();
	}
	public void SelectCityname()
	{
		selectCity.sendKeys("pun");
	}
	public void EnterCityName()
	{
		Cityname.click();
	}
	public void Clickonsavebutton()
	{
		Savebutton.click();
	}
	
	public void ClickOnLogout ()
	{
		Logout.click();
	}
	
	
}
