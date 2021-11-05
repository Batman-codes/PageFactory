package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class FindLeadsPage extends BaseClass{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="firstName")
	WebElement leadIdText;
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	WebElement findLeadButton;
	
	public FindLeadsPage enterLeadId() {
		leadIdText.sendKeys("Rahul");
		return this;
	}
	public FindLeadsPage clickFindLeadButton() {
		findLeadButton.click();
		return this;
	}

}
