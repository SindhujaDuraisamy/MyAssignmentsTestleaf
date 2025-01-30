package week2.day3;

public class Browser {

	public void openURL()
	{
		System.out.println("URL");
	}
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	public void navigateBack()
	{
		System.out.println("navigate browser");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bObj=new Browser();
		bObj.openURL();
		bObj.closeBrowser();
		bObj.navigateBack();
	}

}
