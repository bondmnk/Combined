package TestCases;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2                        /////web page screenshot pgm
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/");
		
		String Localdate = LocalDateTime.now().toString().replace(':', '-');
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		File permanentfile = new File("./Screenshot/"+Localdate+"facebook.png");
		
		FileHandler.copy(tempfile, permanentfile);
		
	}

}
