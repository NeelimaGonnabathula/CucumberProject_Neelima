package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import PageObjects.PageObjectManager;

public class UtilityVariables {
	
	public WebDriver driver;
	public String LandingPageProductName;
	public String offerPageProductName;
	public String checkPageProductName;
	public PageObjectManager pm1;
	public TestBase tb1;
	public GenericUtils gn1;
	
	
	public UtilityVariables() throws IOException
	{
		tb1 = new TestBase();
		pm1 = new PageObjectManager(tb1.WebDriverManager());
		gn1 = new GenericUtils(tb1.WebDriverManager());
	}
}
