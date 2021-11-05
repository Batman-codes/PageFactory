package testcase;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import pages.ViewLeadPage;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setFileName() {
		myExcel = "CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	private void runCreateLead(String companyName, String firstName, String lastName) {

		HomePage home = new LoginPage()
				.enterCredentials(prop.getProperty("username"),prop.getProperty("password"))
				.clickLoginButton();
		String ViewLeadFirstName =	home.clickCrmSfaLink()
				.clickLeadsLink()
				.clickCreateLeadLink()
				.enterCompanyName(companyName)
				.enterfirstName(firstName)
				.enterLastName(lastName)
				.clickCreateLeadButton()
				.checkFirstName();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ViewLeadFirstName, firstName);
		
		new ViewLeadPage().clickTestleafLogo()
		.clickLogoutButton();
		
		softAssert.assertAll();

	}
	
	

}
