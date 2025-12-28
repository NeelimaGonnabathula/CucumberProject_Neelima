package stepdefinitionations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formstepdef {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("user navigates to <{string}>")
	public void user_navigates_to(String string) {
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("lo provided details to fill form")
	public void lo_provided_details_to_fill_form(DataTable dataTable) {

	
//		 String username1 = dataTable.cell(0, 0);
//		 String secondaryname = dataTable.cell(0, 1);
//		 String DoB = dataTable.cell(0, 2);
		 
		 List<List<String>> data = dataTable.cells();
		 
		 
		 for(int i=0;i<data.size();i++)
		 {
			 String username = data.get(i).get(0); 
			 String secondaryname = data.get(i).get(1);
			 String DoB =  data.get(i).get(2);
			 
			 
			 driver.findElement(By.name("firstname")).sendKeys(username);
			 driver.findElement(By.name("lastname")).sendKeys(secondaryname);
			 driver.findElement(By.id("sex-1")).click();
			 driver.findElement(By.id("exp-5")).click();
			 driver.findElement(By.id("datepicker")).sendKeys(DoB);
			 driver.findElement(By.id("profession-1")).click();
			 driver.findElement(By.id("tool-2")).click();
			 
			 WebElement drpdown =  driver.findElement(By.id("continents"));
					 
			 Select a = new Select(drpdown);
			 a.selectByIndex(2);		 
		 }
	
		
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	   
		driver.findElement(By.id("submit")).click();
	}

}
