package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://en-gb.facebook.com
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded
		Thread.sleep(2000);
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Sai");
		//Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		
		//Handle all three dropdowns in Date of birth 
		
		//Date
		WebElement dateElement = driver.findElement(By.name("birthday_day"));
		Select dateOption=new Select(dateElement);
		dateOption.selectByIndex(15);
		
		//Month
		WebElement monthElement = driver.findElement(By.id("month"));
		Select monthOption=new Select(monthElement);
		monthOption.selectByVisibleText("Dec");
		
		//Year
		WebElement yearElement = driver.findElement(By.id("year"));
		Select yearOption=new Select(yearElement);
		yearOption.selectByVisibleText("2019");
		
		// Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		//Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		//Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		//close the driver
		driver.close();
		
		
		
		
	}

}
