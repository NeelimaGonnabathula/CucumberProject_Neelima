package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException
	{
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resouces//global.properties");
		 Properties prop =new Properties();
		 prop.load(fis);
		 String url = prop.getProperty("qaurl");
		 System.out.println("step1");
		if(driver == null)
		{			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				 System.out.println("step2");
				driver = new ChromeDriver();	
			}
			
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();	
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		 System.out.println("step3");
		 driver.get(url);
		 driver.manage().window().maximize();
		 System.out.println("launched chrome browser");
		}		
		return driver;	
	}
}
