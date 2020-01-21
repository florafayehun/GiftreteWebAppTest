import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SalesForceChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. declare my webdriver
		WebDriver driver;	
				
		//2. set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		//3. invoke the chrome browser	
		driver = new ChromeDriver();
		
		//4. browser wait
		driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
		   
				
		//find element by class name. Note: SELENIUM will not accept spaces in between class name
		//it throws error as COMPOUND CLASSES ARE NOT ACEPTED if there are spaces
	
	}

}
