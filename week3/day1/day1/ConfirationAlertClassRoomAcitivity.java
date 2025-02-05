package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirationAlertClassRoomAcitivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				//Load the URL https://en-gb.facebook.com
				driver.get("https://www.Leafground.com/alert.xhtml");
				//Maximize the browser window
				driver.manage().window().maximize();
				//Add an implicit wait to ensure the web page elements are fully loaded
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
				Alert confirmAlert=driver.switchTo().alert();
				String text = confirmAlert.getText();
				System.out.println(text);
				Thread.sleep(3000);
				confirmAlert.accept();
	}

}
