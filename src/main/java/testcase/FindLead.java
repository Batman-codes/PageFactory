package testcase;


import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class FindLead extends BaseClass {
	
	@Test
	public void runFindLead() {
		new LoginPage()
		.enterCredentials(prop.getProperty("username"),prop.getProperty("password"))
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.clickFindLeadLink()
		.enterLeadId()
		.clickFindLeadButton();
	}

}
