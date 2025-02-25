package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LogoutFunctionality extends BaseClass {
	@Test
	public void runLogout(String userName,String userPassword)
	{
		LoginPage lp=new LoginPage();
		lp.enterUsername(userName).enterPassword(userPassword).clickLoginButton();
	}
}
