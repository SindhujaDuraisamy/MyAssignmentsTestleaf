package coding.marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class MarathonBaseClass {

	public ChromeDriver driver;	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String Url,String userName,String userPassword) 
		{	
						
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        driver=new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get(Url);
	        driver.findElement(By.id("username")).sendKeys(userName);
	        driver.findElement(By.id("password")).sendKeys(userPassword);
	        driver.findElement(By.id("Login")).click();
	       
	        //driver.findElement(By.className("slds-icon- waffle")).click();
	        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	        
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
			
		}

	@AfterMethod
	public void postCondition() 
		{
			//Close the driver
			driver.close();		
		}
}
