package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement companyNameInput;
	
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement firstNameInput;
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement lastNameInput;
	
	@FindBy(how=How.NAME, using="submitButton")
	WebElement submitButton;
	

	public CreateLeadPage enterCompanyName(String companyName) {
		companyNameInput.sendKeys(companyName);
		return this;
	}
	
	public CreateLeadPage enterfirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
		return this;
	}
	public ViewLeadPage clickCreateLeadButton() {
		submitButton.click();
		return new ViewLeadPage();
	}
	

}
