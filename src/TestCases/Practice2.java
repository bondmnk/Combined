package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2
{
	public static void main(String[] args) throws  Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");  
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("shakoorabdul3994@gmail.com");
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement password= driver.findElement(By.id("ap_password"));
		password.sendKeys("Abdul shakoor");
		
		WebElement sigin = driver.findElement(By.id("signInSubmit"));
		sigin.click();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.click();
		
		WebElement typecontent = driver.findElement(By.id("twotabsearchtextbox"));
		typecontent.sendKeys("Shirts for men");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();		
		
		
	}
}