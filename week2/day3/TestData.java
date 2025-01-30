package week2.day3;

//Create a superclass as TestData. Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData class.

//SingleLevelInheritance Example

//Superclass for SingleInheritance
public class TestData {
	
	public void enterCredentials()
	{
		System.out.println("Welcome to Login Page");
		System.out.println("Enter UserName and Password");
		
	}

	public void navigateToHomePage()
	{
		System.out.println("Navigate to Home Page");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData testDataObj=new TestData();
		testDataObj.enterCredentials();
		testDataObj.navigateToHomePage();

	}

}
