package week2.day3;
//SubClass TextField inherits the WebElement Parent Class
public class TextField extends WebElement {

	
	//SubClass Methods
	public void getText()
	{
		System.out.println("Get Text");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object of the SubClass TextField
		TextField textObj=new TextField();
		//Accessing methods of the Grand Parent Class using Child class object
		textObj.getText();
		System.out.println(textObj.setText("Hello from Subclass TextField"));
		
		//child class object calling its own method
		textObj.click();
		

	}

}
