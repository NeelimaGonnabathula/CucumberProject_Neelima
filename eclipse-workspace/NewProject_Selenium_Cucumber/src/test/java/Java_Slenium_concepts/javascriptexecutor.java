package Java_Slenium_concepts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
		
//		List<WebElement> price = driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"));
//				
//				int sum =0;
//				for(int i=0;i<price.size();i++)
//				{
//					sum = sum + Integer.parseInt(price.get(i).getText());
//				}
//				
//				System.out.println(sum);
//				
//				driver.quit();
		
		List<WebElement> courseprice = driver.findElements(By.cssSelector("table[name='courses'] td:nth-child(3)"));
		int sum =0;
		for(WebElement x : courseprice)
		{
			sum = sum + Integer.parseInt(x.getText());
		}
		System.out.println(sum);
		
	    Assert.assertEquals(sum, 235);
	}

}
