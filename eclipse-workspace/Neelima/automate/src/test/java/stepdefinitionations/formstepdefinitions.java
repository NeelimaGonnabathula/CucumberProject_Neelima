package stepdefinitionations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class formstepdefinitions {

	WebDriver driver = new ChromeDriver();
	
	@Given("the user is on valid page")
	public void the_user_is_on_valid_page() {
		
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    
	}

	@When("provided <{string}> and <{string}>")
	public void provided_and(String string, String string2) {
		
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("user should sucessfully login")
	public void user_should_sucessfully_login() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}
  
	@Then("click on logout")
	public void click_on_logout() throws InterruptedException {
	   driver.findElement(By.xpath("//a[normalize-space() = 'Sign out']")).click();
	   Thread.sleep(5000);
	   driver.quit();
	   }


}
