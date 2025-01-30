package week2.day3;

public class Safari extends Browser {
	
	public void readerMode()
	{
		System.out.println("reader mode");
	}
	
	public void fullScreenMode()
	{
		System.out.println("full screen");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari sObj=new Safari();
		sObj.readerMode();
		sObj.fullScreenMode();
		sObj.closeBrowser();
		sObj.openURL();
		sObj.navigateBack();

	}

}
