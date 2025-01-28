package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		String titleName = "Tester";
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sindhuja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Duraisamy");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println(title);
		if(title.equals(titleName)) {
			System.out.println("Verified successfully");
		}else {
			System.out.println("not verified successfully");
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
