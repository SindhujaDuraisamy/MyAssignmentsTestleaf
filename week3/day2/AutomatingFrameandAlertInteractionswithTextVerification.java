package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameandAlertInteractionswithTextVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1) Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				
		//2) Load the Url "https://www.pvrcinemas.com/"
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				
		//Maximize the browser window
				driver.manage().window().maximize();
		//add implicitWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Thread.sleep(2000);
				
		//switch to the frame
				driver.switchTo().frame("iframeResult");
				
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				Thread.sleep(2000);
				
				Alert alert=driver.switchTo().alert();
				Thread.sleep(2000);
				alert.accept();
				String message = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
				System.out.println(message);
				
				driver.switchTo().defaultContent();
					
				
	}

}
