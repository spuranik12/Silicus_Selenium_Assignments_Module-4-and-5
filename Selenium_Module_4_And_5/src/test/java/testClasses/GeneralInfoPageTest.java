package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageClasses.AdminPage;
import pageClasses.GeneralInformationPage;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import utilities.DataProviderClass;
import common.BaseTest;

public class GeneralInfoPageTest extends BaseTest {
	
	@Test(priority = 1, dataProvider = "Valid Login Detials", dataProviderClass = DataProviderClass.class)
	public void loginWithValidInfo(String uname, String pwd){
		LoginPage lp = new LoginPage(driver);
		lp.loginWithValidCredentials(uname, pwd);
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isUserLoggedIn());
		System.out.println(hp.getLoggedInUserName());
	}
	
	@Test(priority = 2)
	public void openAdminPage() throws InterruptedException{ 
		AdminPage ap = new AdminPage(driver);
		ap.clickOnAdminLink();
		ap.openGeneralInfo();
		Assert.assertTrue(ap.verifyGeneralInfoPage());
		System.out.println(ap.dispGeneralInfoPageHeader());
	}
	
	@Test(priority = 3)
	public void printGeneralInfoPageDetails() {
		GeneralInformationPage gp = new GeneralInformationPage(driver);
		gp.displayOrgName();
		gp.displayOrgTaxID();
		gp.displayNumOfEmployees();
		gp.displayRegistrationNum();
	}
}
