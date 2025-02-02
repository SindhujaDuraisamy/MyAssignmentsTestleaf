package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceClassRoomActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://en-gb.facebook.com
		driver.get("https://www.amazon.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//int noOfPrices = allPrices.size();
		//System.out.println("The no of prices of phones are: "+noOfPrices);
		
		/*Assignment Requirements:
		 *  - Navigate to amazon.in
		 *  - Search phones in the search field 
		 *  - Find the lowest price from the list of phones
		 *  
		 *  Hints to Solve: 
		 *  - Write common locator / xpath matching all the phone price in the page and get into List<Element> 
		 *  - Get the values in a list and sort the values in ascending order
		 *   - Get the first item from the sorted list which is the least price
		 * */
		ArrayList<Integer> price=new ArrayList<Integer>();
	     for(int i=0;i<priceList.size();i++)
	     {
	    String pl=	priceList.get(i).getText();
	    	String s= pl.replace(",", "");
	    	 int cost=Integer.parseInt(s);
	    	 price.add(cost);
	     }
	     Collections.sort(price);
	     System.out.println("Lowest Price:"+price.get(0));
		
		/*List<String> newPriceArray =new ArrayList<String>();
		//allPrices.addAll(newPriceArray);
		//System.out.println(List<String> newPriceArray =new ArrayList<String>());
		for(int i=1;i<noOfPrices;i++)
		{
			String price1=allPrices.get(i).getText();
			String price2=price1.replace(","," ");
			String price3=price2.replace(" ", "");
			newPriceArray.add(price3);
		}
		System.out.println("The Price List is: "+newPriceArray);
		
		Collections.sort(newPriceArray);
		System.out.println("Sorted List: "+newPriceArray);*/
		driver.close();
	}

}
