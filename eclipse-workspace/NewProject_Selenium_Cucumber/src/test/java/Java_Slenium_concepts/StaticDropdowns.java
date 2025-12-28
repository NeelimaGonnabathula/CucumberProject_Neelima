package Java_Slenium_concepts;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	 //1.selectdropdown with select tag
		
	  /*WebElement staticDrpdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s1 = new Select(staticDrpdown);
		s1.selectByIndex(1);
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByValue("USD");
		System.out.println(s1.getFirstSelectedOption().getText());
		s1.selectByVisibleText("AED");
		System.out.println(s1.getFirstSelectedOption().getText());
		driver.quit();*/
		
		
		//2.select tag
		WebElement drp = driver.findElement(By.id("divpaxinfo"));
		drp.click();
		
//		for(int i=0;i<2;i++)
//		{
//		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//		} 
		
		int i=1;
		while(i<3)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(drp.getText());
		
	//Select s1 = new Select(drps);
	    

	}

}
