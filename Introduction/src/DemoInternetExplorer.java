import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoInternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. declare my webdriver
		WebDriver driver;	
				
		//set the driver property
		System.setProperty("webdriver.ie.driver", "C:\\MicrosoftWebDriver.exe");
				
		//3. invoke the IE browser	
		driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
		   
		//fetch a URL
		driver.get("http://www.google.com");
		
		//to print out the browser title 
		System.out.println(driver.getTitle());
	}
	}

