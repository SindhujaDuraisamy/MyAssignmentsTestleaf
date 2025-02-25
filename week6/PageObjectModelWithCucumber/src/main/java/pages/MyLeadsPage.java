package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class MyLeadsPage extends BaseClass {
	
	
	
	@When("Click on CreateLead link")
	public CreateLeadsPage clickOnCreateLeadLink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
        return new CreateLeadsPage();
	}

}