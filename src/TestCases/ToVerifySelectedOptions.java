package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySelectedOptions {

	public static void main(String[] args) throws Throwable {
		
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select select = new Select(yeardropdown);
		
		select.selectByVisibleText("1998");
		Thread.sleep(2000l);
		
		WebElement selected1 = select.getFirstSelectedOption();
		System.out.println(selected1.getText());

		
		select.selectByVisibleText("2009");
		Thread.sleep(2000l);
			
		select.selectByVisibleText("1990");
		
		
		WebElement selected = select.getFirstSelectedOption();
		System.out.println(selected.getText());
		
		
		

	}

}
