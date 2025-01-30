package week2.day3;

public class Chrome extends Browser{
	
	public void openIncognito()
	{
		System.out.println("open cognito");
	}

	
	public void clearCache()
	{
		System.out.println("clear cache");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome cObj=new Chrome();
		cObj.openIncognito();
		cObj.clearCache();
		cObj.closeBrowser();
		cObj.openURL();
		cObj.navigateBack();
	}

}
