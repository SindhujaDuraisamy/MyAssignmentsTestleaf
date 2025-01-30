package week2.day3;

//Base Class for Inheritance Concept
public class WebElement {

	//methods of Base Class
	public void click()
	{
		System.out.println("Click on the webElement");
	}
	
	public String setText(String text)
	{
		return text;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object of the Base Class
		WebElement webObj=new WebElement();
		//Calling its own methods
		webObj.click();
		System.out.println(webObj.setText("Hello from Base Class"));
	}

}
