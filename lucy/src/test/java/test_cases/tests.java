package test_cases;

import org.testng.annotations.Test;

import Test_components.BaseTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.windows.WindowsDriver;
import pages.BillingPage;
import pages.DashboardPage;
import pages.DeskPage;
import pages.LoginPage;
import pages.PatientProfile;

 class tests extends BaseTest {
	
	//static WindowsDriver driver=null;
	
	
	@BeforeTest
	public void Login() throws Exception{
		
		initializeDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("asad@email.medlucy.com","Test@123");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test (priority = 1)
	public void fillPatientInfo() throws Exception{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		DashboardPage dashboard = new DashboardPage(driver);
		//Search Patient Name
		dashboard.enterTextInSearchBar("John");
		dashboard.clickMoreInfo();
		//Patient Profile Page
		PatientProfile patientProfile = new PatientProfile(driver);
		patientProfile.fillPatientInfo();

	}
	
	@Test (priority = 2)
	public void CreateInvoice() throws Exception{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.gotoBilling();
		BillingPage billingPage = new BillingPage(driver);
		billingPage.searchCode("N212");
		billingPage.searchCode("N210");
		billingPage.searchCode("Q35");
		billingPage.saveInvice();
		//billingPage.paymentSelect();
		
	}
	
	@Test (priority = 3)
	public void addNewDisease()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DeskPage deskPage = new DeskPage(driver);
		deskPage.goToDesk();
		deskPage.addNewDisease();

	}
	
	@Test (priority = 4)
	public void addMedication()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DeskPage deskPage = new DeskPage(driver);
		//deskPage.goToDesk();
		deskPage.addMedication();
	
	}
	 
}
