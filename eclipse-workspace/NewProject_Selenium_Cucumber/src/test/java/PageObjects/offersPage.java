package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPage {
	
	public WebDriver driver;
	
	public offersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By searchtxt = By.xpath("//input[@id='search-field']");
	By getproductNameOffersPage = By.xpath("//table[@class='table table-bordered']//td[1]");
	
	
	
	public void searchoffersPage(String name)
	{
		driver.findElement(searchtxt).sendKeys(name);
	}
	
	public String getNameOffersPage()
	{
		return driver.findElement(getproductNameOffersPage).getText();
	}

}
