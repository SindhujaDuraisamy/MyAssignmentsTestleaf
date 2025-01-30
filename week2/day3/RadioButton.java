package week2.day3;

//SubClass RadioButton inherits the Button Parent Class
public class RadioButton extends Button{

	//SubClass Methods
	public void selectRadioButton()
	{
		System.out.println("select radio button");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object of the SubClass RadioButton
		RadioButton radioObj=new RadioButton();
		
		//Accessing methods of the Grand Parent Class using Child class object
		radioObj.click();
		System.out.println(radioObj.setText("Hello from SubClass Radio Button"));
		
		//Accessing methods of the Parent Class using Child class object
		radioObj.submit();
		
		//Child class object calling its own method
		radioObj.selectRadioButton();
		
	}

}
