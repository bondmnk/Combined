package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640");
		WebElement FirstName = driver.findElement(By.name("firstname"));
		Point point = FirstName.getLocation();
		
		System.out.println(point.getX() + "is the x  co ordinate of FirstnametextField");
		System.out.println(point.getY() + "is the y  co ordinate of FirstnametextField");
		
		
		Dimension dimension = FirstName.getSize();
		System.out.println(dimension.getWidth() + "Is the width of the fisrt name text field");
		System.out.println(dimension.getHeight() + "Is the height of the fisrt name text field");
		
		Rectangle rect = FirstName.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		
		WebElement Maleradiobutton = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		System.out.println("before clicking"+ Maleradiobutton);
		
		Maleradiobutton.click();
		
		
		System.out.println("after clicking"+ Maleradiobutton);
		
		
		
		WebElement facebookimage = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		System.out.println("Facebook page is displayed"+  facebookimage.isDisplayed());
		
		
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(5000);
		
		WebElement instaloginbutton = driver.findElement(By.xpath("//div[text()='Log in']/parent::button"));
		
		System.out.println("the element is disabled"+  instaloginbutton.isEnabled());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}