package ParallelTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallel1 {
	
	public WebDriver driver;
	
	@Parameters("BrowserName")
	
	@Test
	
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
				{
					driver = new ChromeDriver();
				}
		
		else
		{
		driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.id("last")).click();
		
		
			
	}

}
