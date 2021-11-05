package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead")
	WebElement createLeadLink;

	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	WebElement findLeadLink;
	
	public CreateLeadPage clickCreateLeadLink() {
		createLeadLink.click();
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLeadLink() {
		findLeadLink.click();
		return new FindLeadsPage();
	}

}
