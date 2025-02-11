package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*		 
		 *  Requirements: 
		
		 *  Hints to Solve: 
		 *  - Use Selenium's Actions class methods such as `moveToElement()`, ‘perform()’ and Selenium methods such as`click()`, `sendKeys()`. 
		 *  - Utilize appropriate locators and techniques to interact with web elements. 
		 *  - Switch between windows using `getwindowHandles()` and switchTo().window().
		 */
		/*	Precondition:*/
		
		// - Initialize ChromeDriver 
		ChromeDriver driver=new ChromeDriver();
		
		//- Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		
		//- Maximize the browser window -
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Search for "oneplus 9 pro". 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// 3. Get the price of the first product. 
		String firstProductPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("First Product Price is:" +firstProductPrice);
		
		// 4. Print the number of customer ratings for the first displayed product. 
		String rating = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative'][1]")).getAttribute("aria-label");
		System.out.println("Rating for first product: " + rating);
		
		// 5. Click the first text link of the first image. 
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")).click();
		//Switch the focus to the child window to perform next operations
		Set<String> allWindowHandles=driver.getWindowHandles();
		List<String> allWindows=new ArrayList<String>(allWindowHandles);
		System.out.println(allWindows);
		driver.switchTo().window(allWindows.get(1));
		
		// 6. Take a screenshot of the product displayed. 
		//Take the screenshot
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		//Locate the destination folder
		File destinationFile =new File("./screenshot/homepage.png");
		//Save the screenshot in the folder
		FileUtils.copyFile(sourceFile,destinationFile);
		
	
		// 7. Click the 'Add to Cart' button. 
		/*WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
		Actions a = new Actions(driver);
		System.out.println("Clicking on the Add to cart button");
		a.moveToElement(cartButton).click().perform();
		System.out.println("Clicked");
		Thread.sleep(3000);
		*/
		
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(cart).click().perform();
		Thread.sleep(3000);

		
		// 8. Get the cart subtotal and verify if it is correct.
		String cartSubtotal = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']")).getText();
		System.out.println("Cart SubTotal is:"+cartSubtotal);
		boolean isMatch = cartSubtotal.contains(firstProductPrice);
		//if(firstProductPrice==cartSubtotal)
		//{
		//	System.out.println("Cart Subtotal is correct as the first prodcut value");
		//}
		
		//  9. Close the browser. 
		driver.quit();
	}

}
