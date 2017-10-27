package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(css = "#txtUsername")
	private WebElement usernameField;
	
	@FindBy(css = "#txtPassword")
	private WebElement passwordField; 
	
	@FindBy(css = "#btnLogin")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[.='LOGIN Panel']")
	private WebElement loginPanel;
	
	@FindBy(css = "#spanMessage")
	private WebElement invalidLoginMsg;
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public void loginWithValidCredentials(String username, String password){
		actions.applyImplicitWait(10);
		usernameField.sendKeys(username);
		actions.applyDefaultImplicitWait();
		passwordField.sendKeys(password); 
		actions.waitElementToBeClickable(loginBtn, 5);
		loginBtn.click();
	}
	
	public void loginWithInvalidCredentials(String username, String password){
		actions.applyDefaultImplicitWait();
		usernameField.sendKeys(username);
		actions.applyDefaultImplicitWait();
		passwordField.sendKeys(password);  
		actions.waitElementToBeClickable(loginBtn, 5);
		loginBtn.click();
	}
	
	public boolean isLoginPageDisplayed(){
		actions.applyDefaultImplicitWait();
		return loginPanel.isDisplayed();   
	}
	
	public String displayInavlidMessage(){
		actions.applyDefaultImplicitWait();
		return invalidLoginMsg.getText();  
	}
	public boolean isInvalidLoginMessageDisplayed(){
		actions.applyDefaultImplicitWait();
		return invalidLoginMsg.isDisplayed(); 
	}
	
}
