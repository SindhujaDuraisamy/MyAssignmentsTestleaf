package week2.day3;

//SubClass Button inherits the WebElement Parent Class
public class Button extends WebElement
{
	
	//SubClass Methods
	public void submit()
	{
		System.out.println("Submit Button Value");
	}
	public static void main(String[] args) {
		// TODO Aubto-generated method stub
		//Object of the SubClass Button
		Button buttonObj=new Button();
		
		//Accessing methods of the Parent Class using Child class object
		buttonObj.click();
		System.out.println(buttonObj.setText("Hello from Subclass Button"));
		//child class object calling its own method
		buttonObj.submit();

	}

}
