package Package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
	@Test
	public void Test1()
	{
		String str1="Hello World";
		String str2="Hello World";
		Assert.assertEquals(str1, str2);
	}

}
