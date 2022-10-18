package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		//*login
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		
		
		//driver.    DOUBT :  What to do when you have only div. like on login button, we are getting only div option.
		
		
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		
		
		
		
		driver.findElement(By.linkText("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("maanger");

		//QUESTION - link text has been used above ..but there is no link text in inspect element. How mam has taken linktext as username?
				
	}

}
