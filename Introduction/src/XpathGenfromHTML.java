import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathGenfromHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. declare my webdriver
		WebDriver driver;	
				
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		//3. invoke the firefox browser	
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//1.
		//to get Xpath for email text box
		//this is the email HTML  : <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		//Using the syntax: //tagName[@attribute='value']
		//input[@id='email']
		//test on browser console with $x("//input[@id='email']"), it should point to the email text box
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("flora.toluhi@yahoo.com");
		
		
		//2.
		//to get Xpath for password text box
		//this is the password HTML  : <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
		
		//Using the syntax: //tagName[@attribute='value'] or [attribute='value'] 
		//input[@id='pass']
		//test on browser console with $x("//input[@id='pass']"), it should point to the email text box
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akewi");
		System.out.println("password entered");
		
		
		//3.
		//to get Xpath for Login button
		//this is the Login button HTML  : <input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">
		//Using the syntax: //tagName[@attribute='value']
		//input[@value='Log In']
		//test on browser console with $x("//input[@value='Log In']"), it should point to the email text box
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		//GENERATING XPATH BY REGULAR EXPRESSION METHOD
		//SYNTAX: //tagname[contains(@attribute,'value')]
		//can be used for eng <input name="username12342">
		//we can use just username for the value n ignore d numbers
		// its //input[contains(@name,''username)]
		
		
		
		
		
		
		
		
		
		
		
		
		
		   

		
	}

}
