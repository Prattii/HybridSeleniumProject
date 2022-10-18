package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("abcd");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("pqrstu");
		
		//Thread.sleep(3000);
		
		//Xpath with combination of contains and group index - only first word selected
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		
		
		
	}

}
