package TestCases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutor1               /////web page full screenshot pgm
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement beautylink = driver.findElement(By.xpath("//a[@data-group='beauty']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(beautylink).perform();    //Mouse cursor moving action
		
	
		
		
		
		
		}
}