package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testt {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.linkText("Create a Page")).click();
		
		driver.findElement(By.id("email")).sendKeys("selenium");
		driver.findElement(By.name("pass")).sendKeys("managerytrtus");
		driver.findElement(By.name("login")).click();
	}

}
