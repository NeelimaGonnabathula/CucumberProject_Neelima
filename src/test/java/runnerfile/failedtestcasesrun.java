package runnerfile;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="@target/failedtestcases.txt",
		glue = "stepdefinitionations",
		monochrome= true,
		//dryRun=true,
		//tags = "@Sanity and @Regression",
		plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		         "rerun:target/failedtestcases.txt"}

       )
public class failedtestcasesrun extends AbstractTestNGCucumberTests {

	//to run test scenarios parallely
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}