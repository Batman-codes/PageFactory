package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class ViewLead extends BaseClass {
	
	@Test
	public void runViewLead() {
		
		new LoginPage()
		.enterCredentials(prop.getProperty("username"),prop.getProperty("password"))
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink();
	}

}