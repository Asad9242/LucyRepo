package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {

	WebDriver driver;
	By codeField = By.name("Code");
	By enterButton = By.name("Enter");
	By codeSavebutton = By.name("Save");
	
	By selectDropdown = By.name("Please Select");
	By selectPayment = By.name("Master Card");
	
	
	public BillingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchCode(String keyword) throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(codeField).click();
		driver.findElement(codeField).sendKeys(keyword);
		WebElement option = driver.findElement(By.name(keyword));
		option.click();
		driver.findElement(enterButton).click();
		
		Thread.sleep(1000);
		
	}
	
	public void saveInvice() {
		driver.findElement(codeSavebutton).click();
	}
	
	public void paymentSelect() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(selectDropdown).click();
		driver.findElement(selectPayment).click();
		Thread.sleep(1000);
		WebElement saveButton = driver.findElement(By.name("Save"));
		saveButton.click();
	}
	
}
