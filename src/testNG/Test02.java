package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test02 
{
	
	@Test(invocationCount =2)
		public void demo()
	{
		Reporter.log("s",true);
		Reporter.log("s1",true);
	}
	
	@Test(invocationCount =4)
	public void demo1()
	{
		Reporter.log("Awadhesh",true);
		Reporter.log("Pratibha",true);
	}
	
	
	@Test(invocationCount =6)
	public void demo2()
	{
		Reporter.log("String1",true);
		Reporter.log("String2",true);
	}

}
