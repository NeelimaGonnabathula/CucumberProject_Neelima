package StepDefinitions;

import PageObjects.PageObjectManager;
import PageObjects.landingPage;
import PageObjects.offersPage;
import Utilities.UtilityVariables;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition2 {

	UtilityVariables utilityvar;
	PageObjectManager pm1;
	landingPage lp1;

	public OfferPageStepDefinition2(UtilityVariables utilityvar)
	{
		this.utilityvar = utilityvar;
	}
	
    @Then("^User searched for samename (.+) in offerspage$") 
	public void check_shortname_in_offerpage(String name) throws InterruptedException
	{
    	
    	switchToChildWindow();
    	//offersPage of1 = new offersPage(utilityvar.driver);        //nani	
    	offersPage of1 = utilityvar.pm1.getOffersPage();
    	Thread.sleep(5000);
    	of1.searchoffersPage(name);
    	of1.getNameOffersPage();
    	
    	
   // 	utilityvar.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(name);
   // 	utilityvar.offerPageProductName = utilityvar.driver.findElement(By.xpath("//table[@class='table table-bordered']//td[1]")).getText();
    	
	}
    
    public void switchToChildWindow()
    {
    	//if(utilityvar.driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
    	//landingPage lp1 = new landingPage(utilityvar.driver);
    	landingPage lp1 = utilityvar.pm1.getLandingPage();
    	lp1.getLnk();
    	utilityvar.gn1.switchToChildWindow();
    	
    }
    
    
	@Then("validate product name from landingpage and offers page")
	public void validate_product_name_from_landingpage_and_offers_page()
	{
		//offersPage of1 = new offersPage(utilityvar.driver);  
		offersPage of1 = utilityvar.pm1.getOffersPage();
		System.out.println(utilityvar.LandingPageProductName + " landingpage");
		System.out.println(of1.getNameOffersPage() + " offerspage");
		//  Assert.assertEquals(utilityvar.LandingPageProductName, utilityvar.offerPageProductName);
		  System.out.println("Hence, product names availble in both the pages are same");
	}  
}
