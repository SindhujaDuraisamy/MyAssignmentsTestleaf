package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {

	
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String userName) {
		getDriver().findElement(By.id("username")).sendKeys(userName);
		return this;
	}
	//@Given("Enter the username as {string}")
	//public LoginPage enterUsername(String userName) {
		//driver.findElement(By.id("username")).sendKeys(userName);
		//return this;
	//}
	
	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String userPassword) {
		getDriver().findElement(By.id("password")).sendKeys(userPassword);
		return this;

	}
	
	@When("Click on the Login button")
	public WelcomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		String text = getDriver().findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(text.contains("Welcome")) {
			System.out.println("It was navigated");
		}
		else {
			System.out.println("It was not navigated");
		}
		
		return new WelcomePage();
	
	}

	
}
