package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement elementUsername;
	
	@FindBy(how=How.ID, using="password")
	WebElement elementPassword;
	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement elementLoginButton;
	
//	@FindBys({
//			@FindBy(how=How.ID, using="username"),
//			@FindBy(how=How.NAME, using="USERNAME")
//			}
//	)
	
	public LoginPage enterCredentials(String username, String password) {
		
		elementUsername.sendKeys(username);
		elementPassword.sendKeys(password);
		return this;
	}
	
	public HomePage clickLoginButton() {
		elementLoginButton.click();
		return new HomePage();
	}
	
	public LoginPage clickLoginButtonNegative() {
		elementLoginButton.click();
		return this;
	}
	
	public LoginPage negativeLoginMessage() {
		System.out.println("Negative");
		return this;
	}

}
