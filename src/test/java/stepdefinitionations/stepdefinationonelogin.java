package stepdefinitionations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class stepdefinationonelogin {

	
	WebDriver driver = new ChromeDriver();
	
	@Given("user is on valid screen")
	public void user_is_on_valid_screen() {
	    
		
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("entered valid creds username and password")
	public void entered_valid_creds_username_and_password() throws InterruptedException {
	   
		driver.findElement(By.id("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
	    
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Secure Page page for Automation Testing Practice");
		driver.quit();		
	}

	@When("entered invalid creds username and password")
	public void entered_invalidvalid_creds_username_and_password() {
	    
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should not login successfully")
	public void user_should_not_login_successfully() {
        String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Login form page for Automation Testing Practice");
		driver.quit();
	}

	
	
	
}
