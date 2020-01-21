import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. declare my webdriver
		WebDriver driver;	
				
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		//3. invoke the firefox browser	
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		   
		
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		
		//right clicking on an element to copy Xpath isn't 100percent accurate, we need to be able to generate our own xpath
	
		//first, right click on the saleforce login button to inspect the element
		//right click on the blue highlighted element that is being inspected and copy Xpath , paste on a notepad
		//this is the element as copied //*[@id="Login"] but we cannot put this directly inside our code bec of the double quote, we have to change it to single quote befr java can take it
		//else we get a syntax error
		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

		
	}

}
