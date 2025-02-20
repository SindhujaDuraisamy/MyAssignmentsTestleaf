package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadStepDefinition extends BaseClass {
	
	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Find Leads link")
	public void click_on_find_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Click on Phone link")
	public void click_on_phone_link() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();		
	}
	
	@When("Enter the Phone Number of the lead as {string}")
	public void enter_the_phone_number_of_the_lead_as(String string) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	}

	@When("Click on Find Leads button")
	public void click_on_find_leads_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
			}

	@And("Find the leadId to be Deleted and click on Delete Link")
	public void find_the_lead_id_to_be_deleted() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Click the Find Leads button again")
	public void click_the_find_leads_button_again() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Verify the Lead is deleted")
	public void verify_the_lead_is_deleted() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}


}
