package pageClasses;

import org.apache.bcel.generic.BASTORE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;
import common.BaseTest;

public class AdminPage extends BasePage {
	
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement adminLink;
	
	@FindBy(xpath = ".//*[@id='menu_admin_Organization']")
	private WebElement organizationLink;
	
	@FindBy(xpath = ".//*[@id='menu_admin_viewOrganizationGeneralInformation']")
	private WebElement generalInfoLink;
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnAdminLink() throws InterruptedException {
		Thread.sleep(3000);
		adminLink.click();
	}
	
	public void clickOnOrganizationLink()throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(BaseTest.driver);
		action.moveToElement(organizationLink).build().perform();
		action.moveToElement(generalInfoLink);
		Thread.sleep(1000);
		generalInfoLink.click();
	}
}
