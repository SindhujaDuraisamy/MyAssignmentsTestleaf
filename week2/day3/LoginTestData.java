package week2.day3;

//Create subclasses and create 2 methods in each LoginTestData - enterUsername() - enterPassword()

////Childclass for SingleInheritance

public class LoginTestData extends TestData {

	public String enterUsername(String username)
	{
		System.out.println("The Username is: ");
		return username;
	}
	
	public String enterPassword(String password)
	{
		System.out.println("The password is: ");
		return password;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object of the Child Class
		LoginTestData loginObj=new LoginTestData();
		
		loginObj.enterCredentials();
		
		//Calling the method of Parent Class using the Obj of the Child Class
		System.out.println(loginObj.enterUsername("Sindhuja"));
		System.out.println(loginObj.enterPassword("pass123"));
		loginObj.navigateToHomePage();
	}

}
