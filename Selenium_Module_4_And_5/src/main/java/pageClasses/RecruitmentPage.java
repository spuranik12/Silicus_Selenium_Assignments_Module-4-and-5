package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class RecruitmentPage extends BasePage { 
	
	@FindBy(xpath = "//b[.='Recruitment']")
	private WebElement recruitmentLink;
	
	@FindBy(xpath = "//a[.='Vacancies']")
	private WebElement vacancyLink;
	
	@FindBy(xpath = "//h1[.='Vacancies']")
	private WebElement vacancyHeader;
	
	public RecruitmentPage(WebDriver driver){
		super(driver);
	}
	
	public void clickOnRecruitmentLink() throws InterruptedException {
		Thread.sleep(3000);
		recruitmentLink.click();
	}
	
	public void clickOnVacancyLink(){
		actions.applyDefaultImplicitWait();
		vacancyLink.click();
	}
	
	public boolean verifyVacancyTab() {
		actions.applyImplicitWait(10);
		return vacancyHeader.isDisplayed(); 
	}
	
	public String printVacancyHeader() { 
		return vacancyHeader.getText();  
	}
}
