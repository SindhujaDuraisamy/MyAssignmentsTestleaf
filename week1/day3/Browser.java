package week1.day3;
//Classroom Activity
public class Browser {

	public String launchBrowser()
	{
		return "Chrome";
	}
	
	public String loadUrl()
	{
		return "https://www.facebook.com";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserObj=new Browser();
		System.out.println(browserObj.launchBrowser());
		System.out.println(browserObj.loadUrl());
	}

}
