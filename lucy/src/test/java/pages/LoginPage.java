package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	By email_field = By.name("Username");
	By pass_field = By.name("Password");
	By button_login = By.name("Login");
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String email, String password) {
		
		driver.findElement(email_field).sendKeys(email);
		driver.findElement(pass_field).sendKeys(password);
		driver.findElement(button_login).click();
	}

	
	
}
