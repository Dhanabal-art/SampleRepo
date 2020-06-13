package Package1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lister implements ITestListener {
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failure");
	}
	

}
