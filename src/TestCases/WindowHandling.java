package TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling
{
	public static void main(String[] args) throws  Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");     //to get to maine page of a website
		
		 Options option = driver.manage();    //To manage the window
		Window window = option.window();	 //To have options for the window to perform various actions
	
		//Wndow Handling//
		
		window.maximize();					//To maximize the window
		Thread.sleep(2000L);				// To stable the screen for 2 seconds 
		window.minimize();					// To maximize the window
		Thread.sleep(3000L);				// To stable the screen for 2 seconds 
		window.fullscreen();				//To make the window fullscreen
		
		
		//To get the X-Y co ordinates of window//
		
		 Point point = window.getPosition();				//To get co ordinates of X-Y of window
		int x =point.getX(); 								//To get x coordinates
		System.out.println("The co ordinate of X is"+ x);
		 
		int y=point.getY();									//To get y coordinates
		System.out.println("The co ordinate of Y is"+y);
		
		
		//To set the X-Y co ordinates of window//
		
		
		 Point point1 = new Point(100,100); //creating object to enter the coordinates of x-y
		 window.setPosition(point1);		//setting position for window
	
		 
		Dimension size=window.getSize();
		System.out.println("The height of the Y coordinate"+size.getHeight());   
	 
		 System.out.println("The width of the X coordinate"+size.getWidth());
		 
		 							    	//x  ,/y
		Dimension dimension = new Dimension(1000,300);    //to set the size of the window 
		window.setSize(dimension)		 ;
		
		
	  String s  =	driver.getWindowHandle();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	  System.out.println("The id of current window "+s);
		 
	  
	  
	  Set<String> s2=driver.getWindowHandles();
	  System.out.println("The id of current multiple windows"+s2);
	  
	  
	  driver.manage().window().minimize();   //to minimize
	  Thread.sleep(5000);
	  driver.manage().window().maximize();   //to minimize
	  
	  ///Navigating methods///
	  
	  Navigation nav = driver.navigate(); // Navigation method 
	  nav.back();							//Method for back page 
	  Thread.sleep(3000L);
	  nav.forward();						//Method for forward page
	  Thread.sleep(2000L);
	  nav.refresh();						//To refresh the current page
	  Thread.sleep(4200L);
	  
	  URL url = new URL("https://www.facebook.com/");     //To navigate to the sub page of the website
	  nav.to(url);
	  Thread.sleep(2000L);
	  nav.to("https://kn-in.facebook.com/");
	}

}
