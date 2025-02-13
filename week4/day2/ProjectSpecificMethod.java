package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String Url,String userName,String userPassword) 
		{	
			driver=new ChromeDriver();
			//Pass the URL
			driver.get(Url);
			//Maximize the window
			driver.manage().window().maximize();
			//Implicit Wait Timeout
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Send the username value
			driver.findElement(By.id("username")).sendKeys(userName);
			//Send the password value
			driver.findElement(By.id("password")).sendKeys(userPassword);
			//Click on the login button
			driver.findElement(By.id("Login")).click();
			
		}

	@AfterMethod
	public void postCondition() 
		{
			//Close the driver
			driver.close();		
		}

	
}
