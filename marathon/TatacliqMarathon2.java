package coding.marathon;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TatacliqMarathon2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//TestCase 1:

		//Tatacliq Testcase:
		//==================
		
		//1. Load the url as https://www.tatacliq.com/
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Handling Sweet Alert
		driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();
		//2. MouseHover on 'Brands'
		Actions actMouseOver=new Actions(driver);
		WebElement brandElement = driver.findElement(By.xpath("//div[text()='Brands']"));
		actMouseOver.moveToElement(brandElement).perform();
		
		//3. MouseHover on 'Watches & Accessories'		)
		//div[@class='DesktopHeader__categoryDetailsValueWithArrow']
		WebElement watchesAndAccessoriesElement = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		actMouseOver.moveToElement(watchesAndAccessoriesElement).perform();
		
		//4. Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
		
		//5. Select sortby: New Arrivals
		WebElement elementNewArrivals = driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']/select"));
		Select dd1=new Select(elementNewArrivals);
		dd1.selectByVisibleText("New Arrivals");
		
		//6. choose men from catagories filter.
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(5000);
		
		//7. print all price of watches
		List<WebElement> priceWatches = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		System.out.println(priceWatches.size());
		String firstWatchPrice = priceWatches.get(0).getText();
		System.out.println("First Watch Price"+firstWatchPrice);
		for(int i=0;i<priceWatches.size();i++)
		{
			System.out.println(priceWatches.get(i).getText());
		}
		
		//8. click on the first resulting watch.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		
		//10. click Add to cart and get count from the cart icon.
		Set<String> allWindowsAddress=driver.getWindowHandles();
		List<String> allWindows=new ArrayList<String>(allWindowsAddress);
		driver.switchTo().window(allWindows.get(1));
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String cartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart count is:"+cartCount);
		
		//driver.findElement(By.xpath("//div[@class='ProductDescription__base']")).click();
		
				//9. compare two price are similar
				Thread.sleep(3000);
				String watchPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
				System.out.println("Watch Price:"+watchPrice);
				String cost=watchPrice.substring(5);
				System.out.println(cost);
				if(firstWatchPrice.equals(cost))
				{
					System.out.println("Both Prices are Matching");
				}
				else
				{
					System.out.println("Prices do not match");
				}
		//11. Click on the cart
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		//12. Take a snap of the resulting page. 
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/PhoneScreenShot.png");
		FileUtils.copyFile(screenshot, destination);	
		
		//13. Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(allWindows.get(0));
		driver.close();
	}

}
