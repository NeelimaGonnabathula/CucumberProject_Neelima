package StepDefinitions;

import org.testng.Assert;

import PageObjects.checkoutPage;
import PageObjects.landingPage;
import Utilities.UtilityVariables;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkOutPageStepDefinition3 {

	
	 UtilityVariables utilityvar;
	 public checkoutPage cp1;
	 public landingPage lp1;

	public checkOutPageStepDefinition3(UtilityVariables utilityvar)
	{
		this.utilityvar = utilityvar;
		this.cp1 = utilityvar.pm1.getCheckoutPage();
		this.lp1 = utilityvar.pm1.getLandingPage();
		
	}
	
    @When("click on checkout page link and proceed with checkout")
    public void click_on_checkout_page_link_and_proceed_with_checkout() throws InterruptedException {

    	//landingPage lp1 = utilityvar.pm1.getLandingPage();
    	
    	cp1.clickCheckoutLink();
    	cp1.proceedToCheckout();
    	Thread.sleep(5000);
         
    }
	 
	 @Then("in checkoutpage check if landing page and Checkout page has same product")
	 public void in_checkoutpage_check_if_landing_page_and_checkout_page_has_same_product() 
	 {
		 
		 utilityvar.checkPageProductName = cp1.getcheckoutproductname().split("-")[0].trim();
		 System.out.println(utilityvar.checkPageProductName + " extracted data for checkoutpage");
		 System.out.println(utilityvar.LandingPageProductName + " extracted data forlandingpagedata");
		 Assert.assertEquals(utilityvar.checkPageProductName,  utilityvar.LandingPageProductName);
	 }
	 

	 
	 @Then("^Enter promo code as (.+) and click on place order$")
	 public void enter_promo_code_as_neelu_and_click_on_place_order(String promo) throws InterruptedException 
	 {
		cp1.promoCodeText(promo);
		cp1.applyPromoCode();
		cp1.submitOrder();
	 }

	
	
}
