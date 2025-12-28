package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features",
		glue = "StepDefinitions",
		monochrome= true,
		//dryRun=true,
		tags = "@Checkout or @SearchProduct",
		plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

       )
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	//to run test scenarios parallely
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
