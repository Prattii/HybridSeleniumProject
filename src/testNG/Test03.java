package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test03
{
	
	@Test(priority=-2,invocationCount =2)
		public void demo()
	{
		Reporter.log("s",true);
		Reporter.log("s1",true);
	}
	
	@Test(priority=-1,invocationCount =2)
	public void demo1()
	{
		Reporter.log("Awadhesh",true);
		Reporter.log("Pratibha",true);
	}
	
	
	@Test(invocationCount =2)
	public void demo2()
	{
		Reporter.log("String1",true);
		Reporter.log("String2",true);
	}

}
