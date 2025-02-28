package coding.marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount extends MarathonBaseClass {

	@Test
	public  void runCreateAccount() {
		 
	        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	        
	        //driver.findElement(By.xpath("//a[@title='Accounts']")).click();
	        WebElement accountClick =  driver.findElement(By.xpath("//a[@title='Accounts']"));
	        driver.executeScript("arguments[0].click()",accountClick);
	        
	        driver.findElement(By.xpath("//a[@title='New']")).click();
	        String accountName = "Gokul";
	        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
	        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	        driver.executeScript("arguments[0].click()",ownershipDD);
	        
	        //driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='public']")).click();	      
	        driver.findElement(By.xpath("//span[text()='Public']")).click();
	        
	        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	        System.out.println(toastMessage);
	        Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
	}

}
