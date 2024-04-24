package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver = null;
	By billingMenu = By.name("Billing");
	
	public void Dashbaord(WebDriver driver)
	{
		this.driver = driver;
	}

	public void gotoBilling()
	{
		 driver.findElement(billingMenu).click();
	}
}
