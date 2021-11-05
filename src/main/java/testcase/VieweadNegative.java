package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VieweadNegative extends BaseClass {

	@Test
	public void runViewLead() {
		
		new LoginPage()
		.enterCredentials(prop.getProperty("username"),prop.getProperty("password"))
		.clickLoginButtonNegative()
		.negativeLoginMessage();
	}
}
