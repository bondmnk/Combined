package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyAllOptionSInDropDown {

	public static void main(String[] args)
	{
		
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement yeardropdown = driver.findElement(By.id("year"));
			Select select = new Select(yeardropdown);
			
			boolean multiple = select.isMultiple();
			if(multiple==true)
			{
				System.out.println("The drop down is multi select");
			}
			else
			{
				System.out.println("The drop down is single select");
			}
			
			System.out.println("Verifying all options");
			
			List<WebElement> allOptions = select.getOptions();
			System.out.println("The total options available in year dropdown"+allOptions.size());
			int count=0;
			for(WebElement ele:allOptions)
			{
				count++;
				System.out.println( ele.getText());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			}

	}
