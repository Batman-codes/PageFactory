package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement elementLeadsLink;
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	public MyLeadsPage clickLeadsLink() {
		elementLeadsLink.click();
		return new MyLeadsPage();
	}

}
