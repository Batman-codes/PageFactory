package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	WebElement firstNameText;
	
	@FindBy(how=How.XPATH, using = "//img[@alt='opentaps CRM']")
	WebElement testLeafLogo;

	public String checkFirstName() {
		return firstNameText.getText();	
	}
	public HomePage clickTestleafLogo() {
		testLeafLogo.click();
		return new HomePage();
	}
}