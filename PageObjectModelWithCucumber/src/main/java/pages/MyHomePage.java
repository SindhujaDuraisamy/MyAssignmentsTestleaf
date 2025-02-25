package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class MyHomePage extends BaseClass {
	
	
	
	@When("Click on Leads link")
	public MyLeadsPage clickOnLeadsButton() {
		getDriver().findElement(By.linkText("Leads")).click();
          return new MyLeadsPage();
	}

}