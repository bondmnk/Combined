package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNotificationByAutoIT {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.puma.com/in/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000l);

			Runtime.getRuntime().exec("C:\\Users\\Dell\\Documents\\Autoit Script\\HandlingNotification.exe");

	}

}
