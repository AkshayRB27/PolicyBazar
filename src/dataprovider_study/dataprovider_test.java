package dataprovider_study;

import org.testng.annotations.DataProvider;

public class dataprovider_test 
{
//	All methods in data provider are static so to make it easier to call 
	@DataProvider(name="fbdata")
	public static String[][] testData()
	{
		String data[][]= {{"Akshay","Bhosale","8407954749"},{"POONAM","SIDDHANURLE","1234"}};
		return data;
	}
	@DataProvider (name="aig")
	public static String[][] Testinfo()
	{
		String data[][]= {{"Akshay","Bhosale"},{"Poonam","Siddhanurle"}};
		return data;
		
	}
	
	
}
