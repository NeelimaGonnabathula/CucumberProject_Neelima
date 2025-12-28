package StepDefinitions;

import PageObjects.PageObjectManager;
import PageObjects.landingPage;
import Utilities.UtilityVariables;
import io.cucumber.java.en.*;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions()
public class LandingPageStepDefinition1 {


	UtilityVariables utilityvar;
	PageObjectManager pm1;
	landingPage lp1;
	
	
	//creating a constructor
	public LandingPageStepDefinition1(UtilityVariables utilityvar)                   //nani
	{
		this.utilityvar=utilityvar; 
		this.lp1 = utilityvar.pm1.getLandingPage();
	}
	
	
	@Given("User is on GreenCart LoginPage")
	public void search_login()
	{
//		utilityvar.driver = new ChromeDriver();
//		utilityvar.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		utilityvar.driver.manage().window().maximize();
				
	}
	 
    
    @When("^User Search With shortname (.+) and extracted actual name from product$")
	public void extract_actual_name(String name) throws InterruptedException
	{
    	//utilityvar.driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(name);
    	//utilityvar.LandingPageProductName = utilityvar.driver.findElement(By.xpath("//h4[normalize-space()='Tomato - 1 Kg']")).getText().split("-")[0].trim();
    	//pm1 = new PageObjectManager(utilityvar.driver);
    	//landingPage lp1 = utilityvar.pm1.getLandingPage();
    	
    	lp1.searchItem(name);
		Thread.sleep(5000);		
		utilityvar.LandingPageProductName = lp1.productNameTxt().split("-")[0].trim();
		System.out.println(utilityvar.LandingPageProductName + " extracted from homepage");
		
	}
    
    @When("^added (.+) items and added then to cart$")
    public void added_items_and_added_then_to_cart(Integer int1) 
    {
    	//landingPage lp1 = utilityvar.pm1.getLandingPage();
    	
    	int i = int1-1;
    	while(i>0)
    	{
    		lp1.IncrementProduct();
    		i--;
    	}
    	
    lp1.AddToCart();
    	
    }
	


   

}
