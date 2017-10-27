package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(css = "#welcome")
	private WebElement loggedInUser; 
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	public boolean isUserLoggedIn(){ 
		actions.applyDefaultImplicitWait();
		return loggedInUser.isDisplayed(); 
	}
	
	public String getLoggedInUserName(){
		actions.applyDefaultImplicitWait();
		return loggedInUser.getText(); 
	}
}	
