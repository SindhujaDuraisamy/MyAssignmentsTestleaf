package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginFunctionality extends BaseClass
{
	
	@BeforeTest
	public void setValue() {
		filename="Login";

	}
@Test(dataProvider = "fetchData")
public void runLogin(String userName,String userPassword)
{
	LoginPage lp=new LoginPage();
	lp.enterUsername(userName).enterPassword(userPassword).clickLoginButton();
}
}
