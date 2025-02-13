package week4.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class ProjectSpecificMethodChild extends ProjectSpecificMethod
{
	
	@Test
	public void runEditEntity() throws InterruptedException 
	{
				//Click on the toggle menu button from the left corner
				driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
				//Click on the View All 
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				//Pass the input "Legal Entities" in the search box 
				driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
				//Click on "Legal Entities" from App Launcher
				driver.findElement(By.xpath("//span[@class='slds-truncate label-display']//mark[text()='Legal Entities']")).click();
				//Click on the Dropdown icon in the legal Entities tab
				driver.findElement(By.xpath("//button[@title='Select a List View: Legal Entities']")).click();
				//Click on New Legal Entity
				driver.findElement(By.xpath("//div[@title='New']")).click();
				//Enter the Company name as 'TestLeaf'.
				//div[@class='isModal inlinePanel oneRecordActionWrapper']
				Actions a=new Actions(driver);
				WebElement editEntitiesPage = driver.findElement(By.xpath("//div[@class='isModal inlinePanel oneRecordActionWrapper']"));
				a.moveToElement(editEntitiesPage).perform();
				
				driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
				//Enter Description as 'Salesforces'.				
				driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
				
				Thread.sleep(3000);
				Actions actScroll=new Actions(driver);
				WebElement comboButtonElement = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
				actScroll.scrollToElement(comboButtonElement).click().perform();
				Thread.sleep(3000);
				
				//Select Status as 'Active'				
				//WebElement optionActive = driver.findElement(By.xpath("//div[@id='dropdown-element-216']//lightning-base-combobox-item[@data-value='Active']"));
				//actScroll.scrollToElement(optionActive).click().perform();
				
				//Click on Save
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				
				//Verify the Alert message (Complete this field) displayed for Name
				String textAlertMessage = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
				System.out.println("Alert Message is:"+textAlertMessage);
				
				//Close the alert box
				driver.findElement(By.xpath("//button[@title='Close error dialog']")).click();
				//Close the Edit Entity Window
				driver.findElement(By.xpath("//button[@title='Close this window']")).click();
	}
}
