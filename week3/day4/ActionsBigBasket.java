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
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
				
		//Precondition:
			
		//- Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//- Load the URL (https://www.bigbasket.com/)
		//1. Navigate to https://www.bigbasket.com/.
		driver.get("https://www.bigbasket.com/");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*Requirements	:
		Hints to Solve:
		- Use Selenium's Actions class methods such as `moveToElement()`, ‘perform()’ and Selenium methods such as`click()`,
		`sendKeys()`.
		- Utilize appropriate locators and techniques to interact with web elements.
		- Switch between windows using `getwindowHandles()` and switchTo().window().*/
		
		//2. Click on "Shop by Category".
		driver.findElement(By.id("headlessui-menu-button-:R5bab6:")).click();
		
		//3. Mouse over "Foodgrains, Oil & Masala".
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"))).perform();
		
		//4. Mouse over "Rice & Rice Products".
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).perform();
		
		//5. Click on "Boiled & Steam Rice".
		//a.moveToElement(driver.findElement(By.linkText("Boiled & Steam Rice"))).click().perform();
		//driver.findElement(By.linkText("Boiled & Steam Rice")).click();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).click().perform();
		Thread.sleep(2000);
		//Thread.sleep(3000);
		
		//6. Filter the results by selecting the brand "bb Royal".
		//driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]")).sendKeys("bb Royal");
		//driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx'])[2]	")).sendKeys("bb Royal");
		
		
		//7. Click on "Tamil Ponni Boiled Rice".
		a.moveToElement(driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"))).click().perform();
		//driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		
		// Switch to the product window
		
				Set<String> allWindowAddress = driver.getWindowHandles();
				List<String> allWindows = new ArrayList<String>(allWindowAddress);
				driver.switchTo().window(allWindows.get(1));
				Thread.sleep(2000);
		
		//8. Select the 5 Kg bag.
			a.moveToElement(driver.findElement(By.xpath("//span[text()='5 kg']"))).click().perform();
		//driver.findElement(By.xpath("//span[text()='5 kg']")).click();
		
		//9. Check and note the price of the rice.
		String ricePrice = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[2]")).getText();
		System.out.println("Price of the rice is:"+ricePrice);
		
		String verifyRicePrice = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println("Verify rice price:"+verifyRicePrice);
		if(verifyRicePrice.contains(ricePrice))
		{
			System.out.println("Price Matched");
		}
		
		//10. Click "Add" to add the bag to your cart.
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		Thread.sleep(3000);
		//11. Verify the success message that confirms the item was added to your cart.
		//div[@class='Toast___StyledDiv-sc-1uergwq-0 kLrmgR']
		System.out.println(driver.findElement(By.xpath("//div[@class='Toast___StyledDiv-sc-1uergwq-0 kLrmgR']")).getText());
		Thread.sleep(3000);
		//System.out.println("Success Message"+successMessage);
		
		//12. Take a snapshot of the current page
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/AddCart.png");
		FileUtils.copyFile(screenshot, destination);	
		
		//13. Close the current window.
		driver.close();		
		//14. Close the main window.
		driver.switchTo().window(allWindows.get(0));		
		driver.close();
		
	}

}
