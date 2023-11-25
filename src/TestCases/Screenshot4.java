package TestCases;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4                  /////web page full screenshot pgm
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe/");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		HasFullPageScreenshot ts = (HasFullPageScreenshot)driver;	
		File tempFile = ts.getFullPageScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
	
		
		File permanentfile = new File("./Screenshot/"+timestamp+"facebook.png");
		
		FileHandler.copy(tempFile, permanentfile);
		
	}

}
