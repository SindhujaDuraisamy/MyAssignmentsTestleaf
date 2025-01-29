package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
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
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name. - Enter a description as "Selenium Automation Tester."
		driver.findElement(By.id("accountName")).sendKeys("Sathyam1");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//find the select element
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industryOption=new Select(industryDropdown);
		//Select "ComputerSoftware" as the industry
		industryOption.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipOption=new Select(ownershipDropdown);
		ownershipOption.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select sourceOption=new Select(sourceDropdown);
		sourceOption.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement MarketingDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select marketingOption=new Select(MarketingDropdown);
		marketingOption.selectByIndex(5);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOption=new Select(stateDropdown);
		stateOption.selectByValue("TX");
		
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		
		// Verify that the account name is displayed correctly.		
		WebElement accountNameOutput = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		System.out.println("Account name is: "+accountNameOutput.getText());
		
		//- Close the browser window.
		driver.close();

				
				
		
				

	}

}
