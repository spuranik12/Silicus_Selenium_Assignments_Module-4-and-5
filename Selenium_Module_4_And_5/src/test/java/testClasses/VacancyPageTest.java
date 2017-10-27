package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.RecruitmentPage;
import utilities.DataProviderClass;
import common.BaseTest;

public class VacancyPageTest extends BaseTest {
	
	@Test(priority = 1, dataProvider = "Valid Login Detials", dataProviderClass = DataProviderClass.class)
	public void loginWithValidInfo(String uname, String pwd){
		LoginPage lp = new LoginPage(driver);
		lp.loginWithValidCredentials(uname, pwd);
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isUserLoggedIn());
		System.out.println(hp.getLoggedInUserName());
	}
	
	@Test(priority = 2)
	public void openVacancyTab() throws InterruptedException{
		RecruitmentPage rp = new RecruitmentPage(driver);
		rp.clickOnRecruitmentLink();
		rp.clickOnVacancyLink();
		Assert.assertTrue(rp.verifyVacancyTab());
		System.out.println(rp.printVacancyHeader()); 
	}
}
