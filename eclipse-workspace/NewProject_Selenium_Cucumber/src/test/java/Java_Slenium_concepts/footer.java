package Java_Slenium_concepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
		
		driver.get("https://stackoverflow.com/questions/50638379/how-to-write-correct-feature-file-in-cucumber");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)");
		
		List<WebElement> items = driver.findElements(By.cssSelector("#footer"));
		
		for(WebElement x : items )
		{
			List<WebElement> LINKS = x.findElements(By.tagName("a"));
			
			for(WebElement link : LINKS)
			{
				link.click();
			}
			
		}
		
		driver.quit();
		
//		for(WebElement x : items )
//		{
//			x.findElement(By.tagName("a"));
//		}
	}

}
