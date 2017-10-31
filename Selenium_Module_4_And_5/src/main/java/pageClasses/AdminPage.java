package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import common.BasePage;
import common.BaseTest;

public class AdminPage extends BasePage {
	
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement adminLink;
	
	@FindBy(xpath = "//a[.='Organization']")
	private WebElement organizationLink;
	
	@FindBy(xpath = "//a[.='General Information']")
	private WebElement generalInfoLink;
	
	@FindBy(xpath = "//h1[@id='genInfoHeading']")
	private WebElement generalInfoPageHeader;
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnAdminLink() throws InterruptedException {
		Thread.sleep(3000);
		adminLink.click();
	}
	
	public void openGeneralInfo()throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(BaseTest.driver);
		action.moveToElement(organizationLink).build().perform();
		action.moveToElement(generalInfoLink);
		Thread.sleep(1000);
		generalInfoLink.click();
	}
	
	public boolean verifyGeneralInfoPage(){
		actions.applyImplicitWait(10);
		return generalInfoPageHeader.isDisplayed(); 
	}
	
	public String dispGeneralInfoPageHeader(){
		return generalInfoPageHeader.getText(); 
	}
	
}
