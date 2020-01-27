import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelectorGenRegularEpresn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. declare my webdriver
		WebDriver driver;	
				
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		//3. invoke the firefox browser	
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //the html attritube is title and the value contains 'sign in'
	//	driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys(""); //the copied xpath is //*[@id="login1"] by HTML GEN STYLE
		
		//OR Using the syntax: //tagName[@attribute='value'] or [attribute='value'] 
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("uname");
		
		  driver.findElement(By.cssSelector("input#password")).sendKeys("passwd");
		  
		  //		// its //input[contains(@attribute,'value')]
		  driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		  

		
	}

}
