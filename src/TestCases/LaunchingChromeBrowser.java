package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser
{

	public static void main(String[] args) 
	{
		
		//Setting  driver executable path//---> by using System.setProperty
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Instantiation of of the driver executable class
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");  // To navigate to the url
		
		String CurrentUrl=driver.getCurrentUrl(); // to get present url
		System.out.println(CurrentUrl);
		
		String Titleforlogin=driver.getTitle(); // to get title of present url
		System.out.println(Titleforlogin);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		String CurrentUrl2=driver.getCurrentUrl();  // to get present url
		System.out.println(CurrentUrl2);
		
		
		String Titleforsignuppage=driver.getTitle();  // to get Title of present url
		System.out.println(Titleforsignuppage);
		
	String	Sourcecode=driver.getPageSource();  // to get the source of the current url
		System.out.println(Sourcecode);
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
