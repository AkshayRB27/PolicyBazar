package pom_policy;




import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount_pom {
	
	//variables
	
	@FindBy(xpath="//*[@id=\"profile\"]/div/div[1]/div/label[1]")private WebElement Selectgenderbutton;
	@FindBy(xpath="//input[@name='personName']")private WebElement enterusername;
	@FindBy(xpath="//input[@name='email']")private WebElement enteremailid;
	@FindBy (xpath ="//*[@id=\"profile\"]/div/div[4]/div[1]/div[1]/div/div")private WebElement annualincome;
	@FindBy(xpath="(//li[@role='option'])[4]")private WebElement drpdwnforannualincome;
	@FindBy(xpath ="(//div[@role='button'])[2]")private WebElement maritalstatus;
	@FindBy(xpath="(//li[@role='option'])[1]")private WebElement drpdwnformaritalstatus;
	@FindBy(xpath="//input[@autocomplete='off']")private WebElement city;
	@FindBy(xpath="(//div[@role='menuitem'])[1]")private WebElement drpdwnforcity;
	@FindBy(xpath="(//input[@type='text'])[4]")private WebElement dob;
	
	//Constructor
	public Myaccount_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void Clickonselectgenderbutton()
	{
		Selectgenderbutton.click();
	}
	public void Clickenterusername()
	{
		enterusername.sendKeys("Akshay");
	}
	public void clickenteremailid()
	{
		enteremailid.sendKeys("abc@gmail.com");
	}
	
	public void Clickonannualincome()
	{
		annualincome.click();
		
	}
	public void Clickondrpdwnforannualincome()
	{
		drpdwnforannualincome.click();
	}
	public void clickonmaritalstatus()
	{
		maritalstatus.click();
	}
	public void Clickondrpdwnformaritalstatus()
	{
		drpdwnformaritalstatus.click();
	}
	
	public void Clickoncity()
	{
		city.click();
		
		city.click();
		
		city.sendKeys("K");
	}
	
	public void clickondrpdwnforcity()
	{
		
		drpdwnforcity.click();
	}
	public void clickondob()
	{
		dob.click();
		dob.sendKeys("27111992");
	}
	
	
}
		
		
	
	

