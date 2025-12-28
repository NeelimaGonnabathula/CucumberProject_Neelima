package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public landingPage lp1 ;
	public offersPage of1;
	public checkoutPage cp1;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver =  driver;
	}
	


	public landingPage getLandingPage()
	{	
		lp1 = new landingPage(driver);
		return lp1;
	}
	
	public offersPage getOffersPage()
	{
		of1 = new offersPage(driver);
		return of1;
	}
	
    public checkoutPage getCheckoutPage()
    {
    	cp1 = new checkoutPage(driver);
    	return cp1;
    }
	

}
