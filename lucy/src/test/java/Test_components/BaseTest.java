package Test_components;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class BaseTest {

	
		public WindowsDriver driver;
		public Process process;
		
		public WindowsDriver initializeDriver() throws Exception{
			
			
			String winserver = "C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe";
			ProcessBuilder build = new ProcessBuilder(winserver).inheritIO();
			Process process = build.start();
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "windows");
			cap.setCapability("automationName", "windows");
			cap.setCapability("app","C:\\Users\\Dell\\AppData\\Local\\Programs\\lucy\\lucy.exe");
			
		  driver= new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap );
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return driver;
		}

}
