package coding.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNowMarathon2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		//Testcase:2 Ordering mobile
		//==========================
		//Note: If you have your own Servicenow Credentials you can use it .
		
		//1. Launch ServiceNow application
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/* * 2. Login with valid credentials username as admin and password 
		 * URL:https://dev186929.service-now.com/
			User name: admin
			Password: 2AqjN!lC2!Vy */
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		//shadow.findElementByXPath("//span[@class='label']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//4. Click on mobiles
		//iframe[@title='Main Content']
		//iframe[@id='gsft_main']
		WebElement mobileFrameElement = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(mobileFrameElement);
		//driver.findElement(By.xpath("//a[contains(text(),'Mobiles']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//5. Select Apple iphone13pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//6. Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		//7. Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		
		//8. Select Unlimited from the dropdown in Monthly data allowance
		WebElement monthlyDataAllowanceElement = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select dd1=new Select(monthlyDataAllowanceElement);
		dd1.selectByVisibleText("Unlimited [add $4.00]");
		
		//9. Update color field to Blue and storage field to 512GB
		Actions actMouseOver=new Actions(driver);
		WebElement colorElement = driver.findElement(By.xpath("//label[text()='Sierra Blue']"));
		actMouseOver.moveToElement(colorElement).click().perform();
		WebElement storageFieldElement = driver.findElement(By.xpath("//label[contains(text(),'512 GB')]"));
		actMouseOver.moveToElement(storageFieldElement).click().perform();
		
		//10. Click on Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
		//11. Verify order is placed and copy the request number
		String orderSuccessMessage = driver.findElement(By.xpath("//div[@class='notification notification-success']/span[2]")).getText();
		System.out.println("Order Message:"+orderSuccessMessage);
		
		String requestNumber = driver.findElement(By.id("requesturl")).getText();
		System.out.println("Request No is:"+requestNumber);
				
		//12.Take a Snapshot of order placed page 
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/ServiceNowScreenShot.png");
		FileUtils.copyFile(screenshot, destination);
	}

}
