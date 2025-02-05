package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAndInteractionAutomationHomeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Precondition:  
		 - 
		    Hints to Solve: - Use Selenium methods such as `get()`, `findElement()`, `sendKeys()`, `click()`, and `switchTo().alert()`
		     to perform the required actions.
		      - Use appropriate locators and techniques to interact with web elements.
		       - To switch between windows, use `getWindowHandles()` and `switchTo().window()`..
		 */
		//- Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//- Load the URL (http://leaftaps.com/opentaps/control/login) 
		driver.get("http://leaftaps.com/opentaps/control/login");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Add an implicit wait to ensure the webpage elements are fully loaded Requirements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// - Enter the username and password. 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//- Click on the Login button. 
		driver.findElement(By.className("decorativeSubmit")).click();
		// - Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		// - Click on the Contacts button. 
		driver.findElement(By.linkText("Contacts")).click();
		//- Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		//- Click on the widget of the "From Contact". 
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[1]")).click();
		
		//- Switching the driver focus to the child window
		//String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allWindowsList=new ArrayList<String>(allWindowHandles);
		driver.switchTo().window(allWindowsList.get(1));
		driver.manage().window().maximize();
		
		// - Click on the first resulting contact. 
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();		
		//- Switching the driver focus back to the Parent window
		driver.switchTo().window(allWindowsList.get(0));
		//- Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[2]")).click();
		Set<String> allWindowHandles1 = driver.getWindowHandles();
		List<String> allWindowsList1=new ArrayList<String>(allWindowHandles1);
		driver.switchTo().window(allWindowsList1.get(1));
		driver.manage().window().maximize();
		// - Click on the second resulting contact.
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/following::a)[1]")).click();
		driver.switchTo().window(allWindowsList1.get(0));
		// - Click on the Merge button. 
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//- Accept the alert. 
		driver.switchTo().alert().accept();
		// - Verify the title of the page.
		String titleOfFinalPage = driver.getTitle();
		System.out.println("Title of the Page"+titleOfFinalPage);
		driver.close();		
	}

}
