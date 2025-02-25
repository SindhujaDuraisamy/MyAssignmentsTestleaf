package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLeadFunctionality extends BaseClass{
	
	@BeforeTest
	public void setValue() {
	 filename="CreateLead";

	}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String userName, String userPassword, String companyName,String firstName,String lastName)
	{
		LoginPage lp=new LoginPage();
		lp.enterUsername(userName).enterPassword(userPassword).clickLoginButton().clickCRMSFALink().clickOnLeadsButton().clickOnCreateLeadLink()
		.enterCompanyname(companyName).enterFirstname(firstName).enterLastName(lastName).clickCreateLeadButton().verifyLead();
	}
}
