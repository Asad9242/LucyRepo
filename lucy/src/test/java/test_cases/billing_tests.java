package test_cases;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.windows.WindowsDriver;
import pages.BillingPage;
import pages.Dashboard;

public class billing_tests {
	
	static WindowsDriver driver=null;
	static Process process=null;
	
	
	@BeforeTest
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
	
	@Test
	public void searchCode(){
		Dashboard dashboard = new Dashboard();
		dashboard.gotoBilling();
		BillingPage billingPage = new BillingPage(driver);
		billingPage.searchCode("n");
		
	}
	
}
