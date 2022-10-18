package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//

public class Test6 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	/*CSS SELECTOR
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abcde");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass1");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	*/
	
		
	//   PartialLink Text       	driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();		
		
		
		
	}

}
