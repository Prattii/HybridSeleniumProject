package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));f
		
	//	driver.findElement(By.linkText("LOGIN")).click();
		
	//	driver.findElement(By.id("email")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
	}

}
