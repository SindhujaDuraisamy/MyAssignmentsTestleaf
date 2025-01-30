package week2.day3;

public class Edge extends Browser {

	
	public void takeSnap()
	{
		System.out.println("take snap");
	}
	
	public void clearCookies()
	{
		System.out.println("clear cookies");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge eObj=new Edge();
		eObj.takeSnap();
		eObj.clearCookies();
		eObj.closeBrowser();
		eObj.openURL();
		eObj.navigateBack();

	}

}
