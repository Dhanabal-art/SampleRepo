package Package1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGClass {
	boolean flag=true;
	@Test(priority = 1, dependsOnMethods = {"Test2"})
	public void Test1()
	{
		System.out.println("Test 1 is starting");
		if(flag)
			throw new SkipException("Skipping the test");
	}
	@Test(priority = 2, dependsOnMethods = {"Test3"} )
	public void Test2()
	{
		System.out.println("Test 2 is starting");
	}
	@Test(priority = 3)
	public void Test3()
	{
		System.out.println("Test 3 is starting");
	}

}
