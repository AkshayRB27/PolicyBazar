package common_study;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonClass_methods {
//all the methods are static in common class
	public static void implicitWait(WebDriver driver, long waitTime) //declaration 
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));

	}
	
//	screenshot
	
	public static void screenshot(WebDriver driver, String myfile) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("F:\\Akshay study\\Screenshot\\"+myfile+".png");
		
		FileHandler.copy(src, dest);
	}
	
//	scrolling .
	
	public static void scrollIntoview(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver ;
		js.executeScript("arguments[0].scrollIntoview(true)",element);
	}

//	Read data form excel
//	ExcelFile-->Sheet-->Row-->Column-->CellValue
	public static String readdatafromExcel(int rowNum ,int columnNum) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile = new FileInputStream("F:\\Akshay study\\excel\\read.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(rowNum).getCell(columnNum).getStringCellValue();
		return value;
	}

	
		
	}

