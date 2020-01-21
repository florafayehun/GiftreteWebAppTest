import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
		//now to go back to google in selenium i.e. clicking the back button in automation
		driver.navigate().back();
		
		//this will land on yahoo again
		//	driver.navigate().forward();
		
		//to close the current browser
		//driver.close();
		
		//to close all browsers opened by selenium(all child windows)
		//driver.quit();
		
		
		
		  //now go to facebook page
		driver.get("https://www.facebook.com/");
		  
		  //find element by id and fill the text box
		//  driver.findElement(By.id("email")).sendKeys("flora.toluhi@yahoo.com");
	//	  driver.findElement(By.className("")).sendKeys("");
		  //find element by name and fill the text box
		//  driver.findElement(By.name("pass")).sendKeys("jason123");
		  
		  //use of link text for forgot password. this can be used for any link on the
		 // page with a tag
	//	  driver.findElement(By.linkText("Forgotten account?")).click();
		
		//use the css selector for email
		driver.findElement(By.cssSelector("#email")).sendKeys("mymail@yahoo.com");
		 		
		//use xpath for password
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("mypass");
		
		
	}

}
