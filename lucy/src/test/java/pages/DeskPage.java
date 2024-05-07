package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class DeskPage {

	WindowsDriver driver;
	
	By deskMenu = By.name("Desk");
	By addNewDisease = By.name("Add new disease");
	By enterSearch = By.name("Testing History");
	By currentMed = By.name("Current Med.");
	By currentSearchBar = By.name("Search Medication");
	
	public DeskPage(WindowsDriver driver)
	{
		this.driver = driver;
	}

	public void goToDesk(){
		driver.findElement(deskMenu).click();
	}
	
	public void addNewDisease(){
		driver.findElement(addNewDisease).click();
		driver.findElement(addNewDisease).sendKeys("Testing History");
		driver.findElement(addNewDisease).sendKeys(Keys.RETURN);
		
	}
	
	public void addMedication(){
		driver.findElement(currentMed).click();
		driver.findElement(currentSearchBar).sendKeys("ab");
		
		WebElement option = driver.findElementByName("ALTRIABAK 0,25 MG/ML COLLY 5 ML");
		option.click();
	}
}
