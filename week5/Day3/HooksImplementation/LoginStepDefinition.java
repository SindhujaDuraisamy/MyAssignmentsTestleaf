package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {

	@Given("Enter the username as Demosalesmanager")
	public void enter_the_username_as_demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@Given("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
	    String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
	if(text.contains("Welcome")) {
		System.out.println("It was navigated");
	}
	else {
		System.out.println("It was not navigated");
	}
	
	}
	

	@But("It throws error message")
	public void it_throws_error_message() {
	    System.out.println("It throws error message");
	}
}
