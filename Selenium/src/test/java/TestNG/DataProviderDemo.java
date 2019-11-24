package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  
	@DataProvider
	public String[][] testdata()
	{
		String data[][] = {{"Apple", "Banana"}, {"Pork", "Beef"} };
		
		return data;	
	}
	
	@Test(dataProvider="testdata")
	public void test1(String s1, String s2)
	{
		System.out.println("S1 = " + s1 + "S2 = " + s2);
	}
}
