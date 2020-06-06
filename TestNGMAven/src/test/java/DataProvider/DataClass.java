package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataClass {
	@DataProvider(name="get")
	public static Object[][] getData(Method m)
	{
		System.out.println(m.getName());
		Object[][] data=new Object[2][3];
		data[0][0]="Dhanabal";
		data[0][1]="17111985";
		data[0][2]=34;
		
		data[1][0]="Susai";
		data[1][1]="17111984";
		data[1][2]=36;
		
		return data;
		
	}

}
