package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class PatientProfile {

	WindowsDriver driver;
	By edit = By.name("More Info");
	
	public PatientProfile(WindowsDriver driver)
	{
		this.driver = driver;
	}
	public void fillPatientInfo() throws Exception {
	
		WebElement edit = driver.findElementByName("More Info");
		edit.click();
		WebElement update = driver.findElementByName("197212120374");
		update.sendKeys("9");
		
		// Find the dropdown element by its ID, name, XPath, or CSS selector
        WebElement dropdown = driver.findElementByName("Please select diagnosis");
        dropdown.clear();
        dropdown.click();
        WebElement select = driver.findElementByName("Hepatite");
        select.click();
        
        WebElement zip = (WebElement) driver.findElementsByAccessibilityId("zip_code");
        zip.click();
        zip.clear();
        zip.sendKeys("54000");
        
        WebElement adress = driver.findElementByName("address");
        adress.click();
        adress.clear();
        adress.sendKeys("1st Street");
        
        WebElement cities = driver.findElementByName("city");
        cities.click();
        cities.clear();
        cities.sendKeys("Paris");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.findElementByName("Female").click();
        WebElement doctor = driver.findElementByTagName("/html/body/div[1]/div/div/div/div/main/div/form/div/div[2]/div[1]/div[2]/div[4]/div/div/div/div/div/div/div/span[2]");
        doctor.click();
        
        WebElement fn = (WebElement) driver.findElementsByAccessibilityId("first_name");
        fn.click();
        fn.sendKeys("A");
        
        WebElement ln = driver.findElementByXPath("/html/body/div/div/div/div/div/main/div/form/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div/input");
        ln.click();
        ln.sendKeys("B");
        
        driver.findElementByXPath("RadioButton[@Name=\\\"Female  \\\"]").click();
        
        
        driver.findElementByClassName("ant-select-arrow").click();
        driver.findElementByName("Dr. Ali Asad").click();
        
        Thread.sleep(1000);
     
		
	}
	
}
