package TestCases;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		


	}

}
