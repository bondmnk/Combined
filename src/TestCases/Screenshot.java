package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{
	public static void main(String[] args) throws Throwable    /// Web page screensshot
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String Localdate = LocalDateTime.now().toString().replace(':', '-');
		File tempfile = driver.getScreenshotAs(OutputType.FILE);
		
		File permanentfile = new File("./Screenshot/"+Localdate+"facebook.png");
		
		FileHandler.copy(tempfile, permanentfile);
		
	}

}
