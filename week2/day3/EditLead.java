package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
				
				//Initialize the WebDriver (ChromeDriver)
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL http://leaftaps.com/opentaps/
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximize the browser window
				driver.manage().window().maximize();
				
				//Enter a username and password
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// Click the "Login" button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the "CRM/SFA" link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				// - Click on the Leads Button
				driver.findElement(By.linkText("Leads")).click();
				
				//- Click on Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				
				//- Enter the CompanyName Field Using Xpath.
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
				
				//- Enter the FirstName Field Using Xpath.
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saiesh");
				
				//- Enter the LastName Field Using Xpath. 
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajesh");
				
				//- Enter the FirstName (Local) Field Using Xpath
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sai");
				
				//- Enter the Department Field Using any Locator of Your Choice.
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Head");
				
				//- Enter the Description Field Using any Locator of your choice.
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Companys CEO");
				
				//- Enter your email in the E-mail address Field using the locator of your choice. 				
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Sai@gmail.com");
				
				//- Select State/Province as NewYork Using Visible Text.
				WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
				Select stateOption=new Select(stateDropdown);
				stateOption.selectByVisibleText("New York");
					
				//- Click on the Create Button.
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				//- Click on the edit button.
				//driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
				
				//- Clear the Description Field. 
				driver.findElement(By.xpath("//textarea[@class='inputBox'][1]")).clear();
				
				//- Fill the Important Note Field with Any text. 
				driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("The head of the department");
				
				//- Click on the update button.
				driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
								
				//- Get the Title of the Resulting Page. 
				String title=driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
				System.out.println("The title of the page is:"+title);
				
				//- Close the browser window.
				driver.close();
		
	}

}
