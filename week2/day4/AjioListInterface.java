package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Add an implicit wait to ensure the web page elements are fully loaded
		Thread.sleep(2000);
		//In the search box, type as "bags" and press enter 
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// To the left of the screen under "Gender" click on "Men" 
		//Click on the Gender
		//driver.findElement(By.xpath("//span[@class='facet-left-pane-label'][1]")).click();
		// To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		//          //input[@id='Men - Fashion Bags']
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String noOfItemsFound = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(noOfItemsFound);
		noOfItemsFound=noOfItemsFound.substring(0,5);
		noOfItemsFound=noOfItemsFound.replace(",", "");
		int count=Integer.parseInt(noOfItemsFound);
		System.out.println("The count of items found : " +count);
		
		// -Print the count of the items found. 
		//div[@class='brand']
		//div[@class='brand']
		
		//Get the list of brand of the products displayed in the page and print the list. 
				List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
				List<String> brandList = new ArrayList<String>();
				System.out.println("Brand names : ");
				for(int i=0;i<brand.size();i++) 
				{
					
					brandList.add(i, brand.get(i).getText());
				
				}
				
			//	System.out.println("Names of the Brands : " + brandList);
				for(int j=0;j<brandList.size();j++)
				{
					System.out.println(brandList.get(j));//get(index) to get the values
				}
			// to get all the bag names use findelements
				List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
				//cant get text from webelement so making it into arraylist
				List<String> bagsList = new ArrayList<String>();
			//	System.out.println(bagsList);
				for(int k=0;k<bags.size();k++) {
					bagsList.add(k, bags.get(k).getText());//adding each webelement by (index,gettetx) into arrayList
				
				}
			//	System.out.println("Names of the Bags : " + bagsList);
				System.out.println("Bags names : ");
				for(int l=0;l<bagsList.size();l++) {
					//- - Get the list of names of the bags and print it
					System.out.println(bagsList.get(l));//get(index) to get the values
				}
				Thread.sleep(5000);
				driver.close();
	}

}
