package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test01 {
	
	
	@Test
	
	public void demo()
	{
		Reporter.log("hi",true);
		Reporter.log("hello",false);
	}
	

}
