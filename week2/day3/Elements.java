package week2.day3;

//SubClass Elements inherits the Button Parent Class
public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object of the SubClass Elements
		Elements eleObj=new Elements();
		
		//Accessing methods of the Grand Parent Class using Child class object
		eleObj.click();
		System.out.println(eleObj.setText("Hello from SubClass Elements"));
		
		//Accessing methods of the Parent Class using Child class object
		eleObj.submit();

	}

}
