package testcase;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/feature/CreateLead.feature",glue="pages")
public class RunnerClass extends BaseClass {
	
	

}
