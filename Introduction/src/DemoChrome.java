import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. declare my webdriver
		WebDriver driver;	
				
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		//3. invoke the firefox browser	
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
		   
		//fetch a URL
		driver.get("http://www.google.com");
		
		//to print out the browser title 
		System.out.println(driver.getTitle());
		
		//retrieve the current URL to know if we landed on the right browser and print on console
		System.out.println(driver.getCurrentUrl());
		
		//	System.out.println(driver.getPageSource());//print page source
		
		
		//it should then go to yahoo
		driver.get("https://uk.yahoo.com");
		System.out.println(driver.getTitle());
		
		//retrieve the current URL to know if we landed on the right browser and print on console
		System.out.println(driver.getCurrentUrl());
		
		//now to go back to google in selenium i.e. clicking the back button in automation
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//retrieve the current URL to know if we landed on the right browser and print on console
		System.out.println(driver.getCurrentUrl());
		
		//this will land on yahoo again
		driver.navigate().forward();
	}

}
