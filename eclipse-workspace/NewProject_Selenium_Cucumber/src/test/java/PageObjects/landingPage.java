package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
	
	public WebDriver driver;
	
	public landingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName = By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	By Lnk = By.linkText("Top Deals");
	By IncrNum = By.xpath("//a[normalize-space() = '+']");
	By addCart = By.xpath("//button[normalize-space()='ADD TO CART']");

	
	public void searchItem(String name)
	{		
		driver.findElement(search).sendKeys(name);
	}
		
	
	public String productNameTxt()
	{
		return driver.findElement(productName).getText();
	}
		
	
	public void getLnk()
	{
		driver.findElement(Lnk).click();
	}
	
	public void IncrementProduct()
	{
		driver.findElement(IncrNum).click();
	}
	
	public void AddToCart()
	{
		driver.findElement(addCart).click();
	}

	
}
