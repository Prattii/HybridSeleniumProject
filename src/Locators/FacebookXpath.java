package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		
	}

}
