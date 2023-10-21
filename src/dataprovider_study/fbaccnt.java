package dataprovider_study;



import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

public class fbaccnt 
{
	WebDriver driver;
	
	@Test(dataProvider = "fbdata", dataProviderClass = dataprovider_test.class)
	public void fbacc(String fname ,String Sname, String mobnum) throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfb%20account%7C&placement=&creative=589460569870&keyword=fb%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-15651597531%26loc_physical_ms%3D1007783%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIntWHiO6YgQMVpgB7Bx0IHATqEAAYASAAEgKRu_D_BwE");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys(fname);
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys(Sname);
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys(mobnum);
		
	}
	@Test (dataProvider= "aig", dataProviderClass = dataprovider_test.class)
	public void Aigaccnt (String username,String Passwrd) throws InterruptedException
	{
		driver=new EdgeDriver();
		driver.get("https://claims.agbenefitsolutions.com/lin/faces/LinLogin.jsp");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("loginForm:username")).sendKeys(username);
		Thread.sleep(1000);
		
		driver.findElement(By.name("loginForm:password")).sendKeys(Passwrd);
		
		Thread.sleep(1000);
		
		
	
	
	}
		
		
		
}
