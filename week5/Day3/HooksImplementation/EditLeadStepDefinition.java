package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass {
	
	@When("Click on EditLead link")
	public void click_on_edit_lead_link() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Enter the Phone Number as {string}")
	public void enter_the_phone_number_as(String phoneNumber) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);		
	}

	@When("Click on Find Leads")
	public void click_on_find_leads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);		
	}

	@When("Click on Edit Link")
	public void click_on_edit_link() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();		
	}

	@When("Enter the Updated Company Name as {string}")
	public void enter_the_updated_company_name_as(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		
	}

	@Then("Lead should be edited")
	public void lead_should_be_edited() {
		driver.findElement(By.name("submitButton")).click();
	}

}
