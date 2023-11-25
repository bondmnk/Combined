package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement forgotpasswordlink = driver.findElement(By.linkText("Forgotten password?"));
		forgotpasswordlink.click();
	
	driver.findElement(By.partialLinkText("Centre")).click();
	
	WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
	LoginButton.click();
	
	}
	

}
