package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	
    public WebDriver driver;
	public checkoutPage(WebDriver driver) {
		
		this.driver = driver;
	}

	By CheckoutLnk = By.xpath("//img[@alt='Cart']");
	By proceedCheckout = By.xpath("(//div[@class='action-block'])[1]");
	By checkoutPageProductName = By.xpath("//p[@class='product-name']");
	By promocode = By.xpath("//input[@placeholder='Enter promo code']");
	By placeOrder = By.xpath("//div[@id='root']");
	By logo = By.xpath("//div[@class='brand greenLogo']");
	By applyCode = By.xpath("//button[normalize-space()='Apply']");
	
	
	public void clickCheckoutLink()
	{
		driver.findElement(CheckoutLnk).click();
	}
	
	public void proceedToCheckout()
	{
		driver.findElement(proceedCheckout).click();
	}
	
	public String getcheckoutproductname()
	{
		return driver.findElement(checkoutPageProductName).getText();
	}
	
	public void promoCodeText(String promo)
	{
		driver.findElement(promocode).sendKeys(promo);
	}
	
	public void submitOrder()
	{
		driver.findElement(placeOrder).click();
	}
	
	public boolean pageLogo()
	{
		return driver.findElement(logo).isDisplayed();
	}
	
	public void applyPromoCode()
	{
		driver.findElement(applyCode).click();
	}
	
	
	
}
