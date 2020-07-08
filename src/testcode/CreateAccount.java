package testcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//shivani//Downloads//chromedriver//");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.audible.com/");
		
		//Click on the 'Sign In' button
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
		//Since, it's new user, he/she has to register first
		driver.findElement(By.id("createAccountSubmit")).click();
		
		//Find the element on page with field customer name and fill user's full name
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Shivani Taneja");
		
		//Find the element on page with field customer email and fill user's email address
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("shtaneja+test1@audible.com");
		
		//Find the element on page with field Password and fill password
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Newyork14@");
		
		//Find the element on page with field Re-enter password and fill the same password again
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Newyork14@");
		
		//To ensure and check whether the details are correct. This is just for testing purpose
		Thread.sleep(5000);
		
		//Click 'Create Account' 
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		/* Current Scenario
		 * After clicking, 'Create Account', the user is redirected to 'Verify identity'
		 * page. On this page, user has to enter the OTP he received on the email registered.
		 * 
		 * There are two cases: 
		 * 1. To automate the process of extracting OTP from email
		 * 2. To manually check the email and enter the OTP
		 */
		
		
	}
}
