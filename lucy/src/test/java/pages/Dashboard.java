package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.windows.WindowsDriver;

public class Dashboard {

	WindowsDriver driver = null;
	By billingMenu = By.name("Billing");
	By SearchBar = By.name("Search");
	By patient = By.name("DoeJohn");
	
	
	
	public void Dashbaord(WindowsDriver driver)
	{
		this.driver = driver;
	}

	public void gotoBilling()
	{
		 driver.findElement(billingMenu).click();
		
	}
	
	public void enterTextInSearchBar(String patientName){
		 driver.findElement(SearchBar).sendKeys("patientName");
	}
	
	public void clickOnPatient()
	{
		 driver.findElement(patient).click();
	}
	
}
