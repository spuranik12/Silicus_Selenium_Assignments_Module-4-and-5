package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class GeneralInformationPage extends BasePage {

	@FindBy(css = "#organization_name")
	private WebElement orgName;
	
	@FindBy(css = "#organization_taxId")
	private WebElement orgTaxId;
	
	@FindBy(css = "#numOfEmployees")
	private WebElement numOfEmp;
	
	@FindBy(css = "#organization_registraionNumber")
	private WebElement regNo;
	
	public GeneralInformationPage(WebDriver driver) {
		super(driver);
	}
	
	public void displayOrgName(){
		actions.applyDefaultImplicitWait();
		System.out.println("Organization Name:- " + orgName.getAttribute("value"));
	}
	
	public void displayOrgTaxID(){
		actions.applyDefaultImplicitWait();
		System.out.println("Tax ID:- " + orgTaxId.getAttribute("value"));
	}
	
	public void displayNumOfEmployees(){
		actions.applyDefaultImplicitWait();
		System.out.println("Number Of Employees:- " + numOfEmp.getText()); 
	}
	
	public void displayRegistrationNum(){
		actions.applyDefaultImplicitWait();
		System.out.println("Registration Number:- " + regNo.getAttribute("value"));  
	}
}
