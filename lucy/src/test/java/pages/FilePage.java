package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.windows.WindowsDriver;

public class FilePage {

	WindowsDriver driver;
	By edit = By.name("More Info");
	
	public FilePage(WindowsDriver driver)
	{
		this.driver = driver;
	}
	public void MoreInfo() {
	
		driver.findElement(edit).click();
		
	}
	
}
