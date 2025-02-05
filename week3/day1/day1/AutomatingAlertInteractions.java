package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	// Precondition: - Initialize ChromeDriver -
		ChromeDriver driver=new ChromeDriver();
			
	// Load the URL (https://www.leafground.com/alert.xhtml)
		driver.get("https://www.leafground.com/alert.xhtml");
		
	// - Maximize the browser window - Add an implicit wait to ensure the webpage elements are fully loaded 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//	Assignment Requirements: - Click on the "Prompt Box" button to trigger the alert.
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
	//	- Switch to the alert and type a message in the alert box. 
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(4000);
		promptAlert.sendKeys("Sindhuja");
		
	//	- Dismiss the alert. - Retrieve the typed text from the alert and verify it.
		String typedAlertMessage = promptAlert.getText();
		System.out.println("Message typed in the prompt alert: "+typedAlertMessage);
		promptAlert.dismiss();
		Thread.sleep(3000);
		
		String retrieveAlertMessage = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		Thread.sleep(3000);
		System.out.println("Message after closing prompt: "+retrieveAlertMessage);
	
		driver.close();
	//Hints to Solve: - Use Selenium methods such as `findElement()`, `click()`, `switchTo().alert()`, and `sendKeys()` and ‘alert.getText()’ to perform the required actions.
	//- Use appropriate method of Alert interface to dismiss the alert. - Use conditional statements to verify the text entered in the alert.

	}

}
