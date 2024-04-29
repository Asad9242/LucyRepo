package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.windows.WindowsDriver;

public class File {

	WindowsDriver driver = null;
	By edit = By.name("More Info");
	
	
	public void MoreInfo() {
	
		driver.findElement(edit).click();
		
	}
	
}
