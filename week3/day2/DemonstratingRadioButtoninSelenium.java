package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingRadioButtoninSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch the Browser
			ChromeDriver driver=new ChromeDriver();
		
		// Load the URL https://leafground.com/checkbox.xhtml 
			driver.get("https://www.leafground.com/radio.xhtml");
		
		// Maximize the browser window
			driver.manage().window().maximize();
		// Add implicitWait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	Select 'Your most favourite browser' from the radio buttons
			driver.findElement(By.xpath("//input[@id='j_idt87:console1:1']")).click();
			
			//verify the radio button status
			boolean radioSelectedStatus = driver.findElement(By.xpath("//input[@id='j_idt87:console1:1']")).isSelected();
			System.out.println("Radio Button Selected Status: "+radioSelectedStatus);
			
		//  Click on a radio button, then click on the same radio button again
			driver.findElement(By.id("j_idt87:console1:1")).click();
		
		//  verify that it becomes ‘unselected’.
			boolean radioSelectedStatusAfter = driver.findElement(By.id("j_idt87:console1:1")).isSelected();
			System.out.println("Radio Button Selected Status After: "+radioSelectedStatusAfter);
			
			/*
			 * Requirements: -  
			 * - Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
			 *  - Identify the radio button that is initially selected by default. 
			 *  - Check and select the age group (21-40 Years) if not already selected.
			 * 
			 *  Hints to Solve: - Use Selenium WebDriver methods such as findElement(),isEnabled(), isSelected(),click()
			 *   to perform the required actions and verification.
			 */

	}

}
