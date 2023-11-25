package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAuthenticationPopup {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000l);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.partialLinkText("Swagger")));
		
		driver.findElement(By.partialLinkText("Swagger")).click();
		driver.switchTo().alert().accept();
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Documents\\Autoit Script\\HandlingAuthentication.exe");
		

	}

}
