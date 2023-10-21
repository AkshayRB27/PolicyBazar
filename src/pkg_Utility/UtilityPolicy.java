package pkg_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityPolicy 
{
//		screenshot
//		scrolling 
//		read from excel 
//		wait 
	
	public static void takingscreenshot(WebDriver driver, String filename) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Akshay study\\Screenshot"+filename+".png");
		FileHandler.copy(src, dest);
		
		Reporter.log("Taking SScreenshot", true);
		Reporter.log("Screenshot location is ..."+ dest, true);
	}
	
	public static void ScrollingInto(WebDriver driver,WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true)", element);
		
		Reporter.log("Scrolling Intoview", true);
	}
	
	public static String readExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		Reporter.log("Reading data from Excel Sheet", true);
		FileInputStream myfile = new FileInputStream("F:\\Akshay study\\Velocity\\excel\\read.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet").getRow(row).getCell(cell).getStringCellValue();
		return value ;
		
	}
	
	public static void wait (int waittime) throws InterruptedException
	{
		Reporter.log("waiting for "+ waittime +"millisec", true);
		Thread.sleep(waittime);
	}
}
