package Java_Slenium_concepts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class amazonpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("eske");

		List<WebElement> bagslist = driver.findElements(By.cssSelector("div.s-suggestion-container"));

		for (WebElement item : bagslist) {
			if (item.getText().equalsIgnoreCase("eske laptop bags for men")) {
				item.click();
				break;
			}
		}

		List<WebElement> items = driver.findElements(By.cssSelector(".a-size-medium"));
		for (WebElement x : items) {
			if (x.getText().contains("eske Truder 15\" Leather Bag For Men")) 
			{
				x.click();
				break;
			}
		}
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.id("add-to-cart-button")).click();
	}

}
