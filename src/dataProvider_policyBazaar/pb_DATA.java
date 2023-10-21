package dataProvider_policyBazaar;

import org.testng.annotations.DataProvider;

public class pb_DATA
{
	@DataProvider(name="Policybazaar")
	public static String[][] pbdata()
	{
		String[][]data= {{"8407954749","Test$123"}};
		return data;
	}
	
}
