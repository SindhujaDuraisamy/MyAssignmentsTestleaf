package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleClassRoomActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch the Browser
					ChromeDriver driver=new ChromeDriver();
				
				// Load the URL https://leafground.com/checkbox.xhtml 
					driver.get("https://www.ajio.com/");
				
				// Maximize the browser window
					driver.manage().window().maximize();
				// Add implicitWait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					driver.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']")).click();
					String parentWindowHandle = driver.getWindowHandle();
					Set<String> allWindowHandles = driver.getWindowHandles();
					List<String> allWindows=new ArrayList<String>(allWindowHandles);
					driver.switchTo().window(allWindows.get(1));
					String childWindowTitle = driver.getTitle();
					System.out.println("Child Window: "+childWindowTitle);
					driver.close();
					driver.switchTo().window(allWindows.get(0));
					String parentWindowTitle = driver.getTitle();
					System.out.println("Parent Window: "+parentWindowTitle);
					driver.quit();
					
					
					
	}

}
