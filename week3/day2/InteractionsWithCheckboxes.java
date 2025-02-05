package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
				
		// Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		// Load the URL https://leafground.com/checkbox.xhtml 
				driver.get("https://leafground.com/checkbox.xhtml");
				
		// Maximize the browser window
				driver.manage().window().maximize();
		// Add implicitWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Thread.sleep(2000);
		// Click on the "Basic Checkbox.”
				driver.findElement(By.id("j_idt87:j_idt89")).click();
		// Verify if the Basic Checkbox is selected or not
				boolean enabledBasicChecboxStatus = driver.findElement(By.id("j_idt87:j_idt89")).isEnabled();
				System.out.println("The Basic Checkbox status is: "+enabledBasicChecboxStatus);
		// Click on the "Notification Checkbox." 
				driver.findElement(By.id("j_idt87:j_idt91")).click();
		// Verify if the Notification Checkbox is selected or not
				boolean enabledNotificationChecboxStatus = driver.findElement(By.id("j_idt87:j_idt91")).isEnabled();
				System.out.println("The Notification Checkbox status is: "+enabledNotificationChecboxStatus);
				
		// Go to console tab in DOM page-> copy paste the below code for few seconds and press enter & then go and inspect th element
				//setTimeout(function(){debugger},5000)
				
		// Verify that the expected message is displayed
				String expectedMessage = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
				System.out.println("The expected message is: "+expectedMessage);
				
		// Click on your favorite language (assuming it's related to checkboxes). 
				driver.findElement(By.xpath("//label[text()='Python']")).click();
				
		// Click on the "Tri-State Checkbox." 
				driver.findElement(By.id("j_idt87:ajaxTriState")).click();
				
				
				 WebElement element = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
        		wait.until(ExpectedConditions.invisibilityOf(element));
   		//Then after the pop up gone Click on the tri state check box 
        		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
				 
				
		//Doubt - Not returning state value
		// Verify the expected message is dispalyed for tri state.
				String textOFTriSateOption = driver.findElement(By.xpath("(//span[@class='ui-growl-title'])/following::p")).getText();
				//wait.until(ExpectedConditions.invisibilityOf(element));
				System.out.println("The Tri State Option value is: "+textOFTriSateOption);
				
		// Click on the "Toggle Switch." 
				driver.findElement(By.id("j_idt87:j_idt100")).click();
		
		//  Verify the expected message is dispalyed for toggle switch.	
				String textOfToggleSwitch = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
				System.out.println("The Toggle Switch Option value is: "+textOfToggleSwitch);
				
		//  Verify if the Checkbox is disabled. 
				boolean checkboxDisabledStatus = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
				System.out.println("The checkbox Status is disabled :"+checkboxDisabledStatus);
				
		//  Select multiple options on the page (details may be needed).
				driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
				
		//Doubt Doesent Click
		//	Click on Miami & London
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
				Thread.sleep(3000);
		//	Perform any additional actions or verifications required.  
				boolean selected1 = driver.findElement(By.xpath("//li[@data-item-value='Miami']")).isEnabled();
				System.out.println(selected1);
				
				boolean selected2 = driver.findElement(By.xpath("//li[@data-item-value='London']")).isEnabled();
				System.out.println(selected2);
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
				
		//  Close the web browser when done
				//driver.close();
				
		/*		
		 * Requirements: 
		      
		 * Hints to Solve: - Use Selenium methods such as get(), findElement(), manage() and click() to perform the required actions. 
		 * - Use isSelected() to validate the checkboxes.
		 */
		
		// Click on the "Basic Checkbox.”
		
	}

}