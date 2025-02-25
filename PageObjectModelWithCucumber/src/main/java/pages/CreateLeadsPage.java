package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class CreateLeadsPage extends BaseClass{
	
	
	
	@When("Enter the companyname as (.*)$")
	public CreateLeadsPage enterCompanyname(String companyName) {
		
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	      return this;
	}
	
	@When("Enter the firstname as (.*)$")
	public CreateLeadsPage enterFirstname(String firstName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
         return this;
	}
	
	@When("Enter the lastname as (.*)$")
	public CreateLeadsPage enterLastName(String lastName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
          return this;
	}
	
	@When("Click on Create Lead button")
	public ViewLeadPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
        return new ViewLeadPage();
	}

}