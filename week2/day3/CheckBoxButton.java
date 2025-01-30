package week2.day3;

//SubClass CheckBoxButton inherits the Button Parent Class
public class CheckBoxButton extends Button{

	//SubClass Methods
	public void clickCheckButton()
	{
		System.out.println("Click check box");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object of the SubClass CheckBoxButton
		CheckBoxButton checkBoxObj=new CheckBoxButton();
		
		//Accessing methods of the Grand Parent Class using Child class object
		checkBoxObj.submit();
		System.out.println(checkBoxObj.setText("Hello from CheckBoxButton SubClass"));
		
		//Accessing methods of the Parent Class using Child class object
		checkBoxObj.click();
		
		//Child class object calling its own method
		checkBoxObj.clickCheckButton();
	}

}
