package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadDataExcel;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	private static final ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();
	public String filename;

	public void setDriver() 
	{
		cDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver()
	{
		ChromeDriver chromeDriver=cDriver.get();
		return chromeDriver;
	}
	
	@BeforeMethod
	public void preConditions()
	{
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	
	@AfterMethod
	public void postConditions()
	{
		getDriver().close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		return ReadDataExcel.readData(filename);
	}
}
