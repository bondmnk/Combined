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
import org.openqa.selenium.io.FileHandler;

public class Screenshot3                     /////web element screenshot pgm
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.name("login"));		
		File tempFile = loginbutton.getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
	
		
		File permanentfile = new File("./Screenshot/"+timestamp+"facebook.png");
		
		FileHandler.copy(tempFile, permanentfile);
		
	}

}
