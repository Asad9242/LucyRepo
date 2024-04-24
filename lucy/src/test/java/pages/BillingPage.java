package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {

	WebDriver driver = null;
	By codeField = By.name("Code");
	By enterButton = By.name("Enter");
	
	public BillingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchCode(String keyword) {
		
		driver.findElement(codeField).click();
		driver.findElement(codeField).sendKeys(keyword);
		By option = By.name("N212");
		driver.findElement(option).click();
		driver.findElement(enterButton).click();
		driver.findElement(codeField).clear();
	}
}
