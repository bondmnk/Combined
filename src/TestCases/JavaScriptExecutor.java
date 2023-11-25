package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Dell\\Desktop\\index3.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000l);
		WebElement alertbutton = driver.findElement(By.id("AL"))	;
		alertbutton.click();
		
		
		Thread.sleep(2000l);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		Thread.sleep(2000l);
		WebElement confirmationbutton = driver.findElement(By.id("CN"))	;
		confirmationbutton.click();
		System.out.println(alert.getText());
		Thread.sleep(2000l);
		alert.accept();
		
		
	
	}

}
