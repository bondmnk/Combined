package TestCases;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("www.chrome.driver","./Drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");
		String s = driver.getCurrentUrl();
		System.out.println("The current url of the page is"+s);
		
		String s2 = driver.getTitle();
		System.out.println("The title of the current url page is "+s2);
		
		
		// window handling//
		Options option = driver.manage();
		Window window = option.window();
		
		
		window.fullscreen();
		Thread.sleep(5000L);
		
		window.maximize();
		Thread.sleep(6000L);
		
		window.minimize();
		Thread.sleep(4000L);
	}

}
