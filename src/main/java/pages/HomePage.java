package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass{
	
//	private By logoutButton = By.className(prop.getProperty("HomePage.Logout.ClassName"));
//	private By crmSfaLink = By.linkText(prop.getProperty("HomePage.CrmsfaLink.LinkText"));
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement elementLogoutButton;
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	WebElement elementCrmsfaLink;
	
	public LoginPage clickLogoutButton() {
		elementLogoutButton.click();
		return new LoginPage();
	}
	
	public MyHomePage clickCrmSfaLink() {
		elementCrmsfaLink.click();
		return new MyHomePage();
	}

}
