package Package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.DataClass;

public class DataProvideer {
	
	@Test(dataProviderClass = DataClass.class, dataProvider = "get")
	public void Test1(String name, String DOB, int age) 
	{
		//System.out.println(name+"---------"+DOB+"---------"+age);
	}
	@Test(dataProviderClass = DataClass.class, dataProvider = "get")
	public void Test2(String name, String DOB, int age) 
	{
		//System.out.println(name+"---------"+DOB+"---------"+age);
	}
}
