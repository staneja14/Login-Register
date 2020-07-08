package testcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

	

		System.setProperty("webdriver.chrome.driver", "//Users//shivani//Downloads//chromedriver//");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.audible.com/");

		// Click on the 'Sign In' button
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

		// Find the field on the Login page with name 'Email' and fill the user email
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("shtaneja+test1@audible.com");

		// Find the field on the Login page with name Password and fill the user
		// password
		driver.findElement(By.id("ap_password")).sendKeys("Newyork14@");

		// Find the button 'Sign In' on the Login page and click on it
		driver.findElement(By.cssSelector("#signInSubmit")).click();

	}

}
