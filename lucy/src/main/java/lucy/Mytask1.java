package lucy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.springframework.util.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
import okhttp3.Address;


public class Mytask1 { 

	static WindowsDriver driver=null;
	static Process process=null;
	
	@BeforeClass
	public void stepup() throws Exception {
		
		String winserver = "C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe";
		ProcessBuilder build = new ProcessBuilder(winserver).inheritIO();
		Process process = build.start();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "windows");
		cap.setCapability("automationName", "windows");
		cap.setCapability("app","C:\\Users\\Dell\\AppData\\Local\\Programs\\lucy\\lucy.exe");
		
	  driver= new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap );
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
	
	}
	
	@AfterClass
	public void cleanup() {
		
	}
	
	@Test(priority = 1)
	public void Login() throws Exception{
		
		WebElement email = driver.findElementByName("Username");
		email.click();
		email.sendKeys("asad@email.medlucy.com");
		WebElement pass = driver.findElementByName("Password");
		pass.click();
		pass.sendKeys("Test@123");
		WebElement login = driver.findElementByName("Login");
		login.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test(priority = 0)
	public void desk() throws Exception {
		
		WebElement deskscreen = driver.findElementByName("Desk");
		deskscreen.click();
		
		WebElement history = driver.findElementByName("Add new disease");
		history.click();
		history.sendKeys("Testing History");
		history.submit();
		
		WebElement currentMD = driver.findElementByName("Current Med.");
		currentMD.click();
		
		WebElement searchMD = driver.findElementByName("Search Medication");
		searchMD.click();
		searchMD.sendKeys("ABC");
		
		WebElement MD = driver.findElementByName("ALTRIABAK 0,25 MG/ML COLLY 5 ML");
		MD.click();
		
		
		WebElement tool1 = driver.findElementByXPath("/html/body/div[1]/div/div/div/div/main/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/div[3]/span/svg");
		tool1.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority = 3)
	public void billing() throws Exception {
	
		
		WebElement billscreen = driver.findElementByName("Billing");
		billscreen.click();
		WebElement price = driver.findElementByName("Code");
		price.click();
		price.sendKeys("a");
		WebElement dropdown1 = driver.findElementByName("N212");
		dropdown1.click();
		WebElement selectoption = driver.findElementByName("Enter");
		selectoption.click();
		price.clear();
		price.click();
		price.sendKeys("n");
		WebElement dropdown2 = driver.findElementByName("N210");
		dropdown2.click();
		selectoption.click();
		price.clear();
		price.click();
		price.sendKeys("n");
		WebElement dropdown3 = driver.findElementByName("N302");
		dropdown3.click();
		selectoption.click();
		price.clear();
		price.click();
		price.sendKeys("j");
		WebElement dropdown4 = driver.findElementByName("J1");
		dropdown4.click();
		selectoption.click();
		
		
		//String value = driver.findElementByName("10.90").getAttribute("Value");																							
		//System.out.println(value);
		//String Expected = "10.90";
		//org.testng.Assert.assertEquals(value, Expected);
																													
																											
		//String total = driver.findElementByName("Total: €10.9").getAttribute("Value");
		//System.out.println(value);
		//String Expect = "Total: €10.9";
		//org.testng.Assert.assertEquals(value, Expect);
			
		WebElement savebutton = driver.findElementByName("Save");
		savebutton.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	@Test(priority = 2)
	public void createpatient() throws Exception {
		
		Thread.sleep(3000);
		WebElement search = driver.findElementByName("Search");
		search.sendKeys("John");
		Thread.sleep(2000);
		WebElement patient = driver.findElementByName("DoeJohn");
		patient.click();
		Thread.sleep(1000);
		
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
     
        
        driver.findElementByName("Billing").click();
		driver.findElementByClassName("ant-menu-item").click();
		driver.findElement(By.xpath("//ul[@id='add-patient']")).click();
		driver.findElementById("add-patient").click();
		process.destroy();
	
	}
	
}
