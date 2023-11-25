package TestCases;

import java.net.URL;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators                    
{
	public static void main(String[] args) throws  Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");  
		
		WebElement element = driver.findElement(By.id("email"));       // id locator
		element.sendKeys("abc@123");
		
		WebElement element2 = driver.findElement(By.id("pass"));	   // id locator
		element2.sendKeys("12346");
		
		WebElement loginbutton= driver.findElement(By.name("login"));    // name locator
		loginbutton.click();
	
		List<WebElement> languages = driver.findElements(By.className("_sv4"));  // classname locator
		for(WebElement ele:languages)												// for each loop is mnadatory for classname locator
		{
			System.out.println(ele.getText());
			
		}
		
		
		
		
	}
}