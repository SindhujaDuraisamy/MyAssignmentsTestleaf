package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	
	
	
	@Then("It should navigate to the next page")
	public WelcomePage it_should_navigate_to_the_next_page() {
	    String text = getDriver().findElement(By.xpath("//h2[text()='Welcome ']")).getText();
	if(text.contains("Welcome")) {
		System.out.println("It was navigated");
	}
	else {
		System.out.println("It was not navigated");
	}
	return this;
	}
	
	@When("Click on CRMSFA link")
	public MyHomePage clickCRMSFALink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
         return new MyHomePage();
	}
	
	
	public LoginPage clickLogout() {
		getDriver().findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        return new LoginPage();
	}

}