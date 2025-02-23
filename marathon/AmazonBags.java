package coding.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 01) Launch Chrome  
		 02) Load https://www.amazon.in/
     		 add  implicitlyWait
     		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 03) Type "Bags for boys" in the Search box
		 04) Choose the 	 item in the result (bags for boys)
		 05) Print the total number of results (like 50000)
   		 example like this-----> 1-48 of over 50,000 results for "bags for boys"
		 06) Select the first 2 brands in the left menu
    	 (like American Tourister, Generic)
		 07) Choose New Arrivals (Sort)
		 08) Print the first resulting bag info (name, discounted price)
		 09) Get the page title and close the browser(driver.close())
		 */
		//Team,use this code to avoid  the  captcha in amazon wesite 
		//driver.navigate().refresh();
		
		//(//span[text()='3']
		
		
		//1) Launch the Browser
				ChromeDriver driver=new ChromeDriver();				
		//2)Load https://www.amazon.in/
				driver.get("https://www.amazon.in/");
				
				//Maximize the browser window
				driver.manage().window().maximize();
				//add implicitWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.navigate().refresh();
				
		//3) Type "Bags for boys" in the Search box
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
				//click on the search button
				driver.findElement(By.id("nav-search-submit-button")).click();
				
		//4) Choose the 	 item in the result (bags for boys)
				String noOfBags = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
				
		//5) Print the total number of results (like 50000)		
				System.out.println(noOfBags);				
				
		//6) Select the first 2 brands in the left menu(like American Tourister, Generic)
				driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
				Thread.sleep(2000);
		//7) Choose New Arrivals (Sort)
				driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
				driver.findElement(By.linkText("Newest Arrivals")).click();			
		//8) Print the first resulting bag info (name, discounted price)
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']")).click();
				//Thread.sleep(2000);
				String bagName = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']")).getText();
				System.out.println("Bag Name is: " +bagName);
				String discountPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
				System.out.println("Discount Price is: "+discountPrice);
				
		//9) Get the page title and close the browser(driver.close())
				String pageTitle = driver.getTitle();
				System.out.println("Page Title is:"+pageTitle);
				driver.close();

	}

}
