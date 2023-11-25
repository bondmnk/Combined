package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailelement1 = driver.findElement(By.id("email"));
		String tagname = emailelement1.getTagName();
		System.out.println(tagname);
		
	    emailelement1.sendKeys("Abdul");
	    
	    String e2 = emailelement1.getAttribute("placeholder");
	    System.out.println(e2);
	    
	    System.out.println("The email text field text is"+emailelement1.getText());
	    
	    
	    WebElement passelement2 = driver.findElement(By.name("pass"));
		passelement2.sendKeys("1245665");
	}
}
