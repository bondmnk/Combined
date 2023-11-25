package TestCases;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdgeBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/login/");
		


		}

}
