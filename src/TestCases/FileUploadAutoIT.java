package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {

	public static void main(String[] args) throws Throwable {
		
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0,600);
		
		
		WebElement uploadButton = driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
		uploadButton.click();
		
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Documents\\Autoit Script\\resume.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
