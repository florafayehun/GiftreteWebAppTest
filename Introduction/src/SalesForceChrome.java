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
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("Flora");
	driver.findElement(By.name("pw")).sendKeys("123456");
	
	//an error is expected here because there are spaces in between the class name
//	driver.findElement(By.className("button r4 wide primary")).click();
	
	//error message: no such element: Unable to locate element: {"method":"css selector","selector":".button\ r4\ wide\ primary"}
	
	//if there are more than 1 element with the same identifier like id, name etc, selenium uses the first element and ignores the rest element with same ID
	//Selenium scans element from the TOP LEFT
	
	}

}
