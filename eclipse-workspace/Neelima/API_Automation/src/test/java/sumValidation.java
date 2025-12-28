import org.testng.Assert;
import org.testng.annotations.Test;

import Files.payloads;
import io.restassured.path.json.JsonPath;

public class sumValidation {

	@Test
	public void sumofCourses()
	{
		JsonPath js = new JsonPath(payloads.CoursePrice());
		//verify if sum of all prices matches purchase amount
		int count = js.get("courses.size()");
		int amount = 0;
		for(int i=0; i<count; i++)
		{
			int prices = js.get("courses["+i+"].price");
			int copies = js.get("courses["+i+"].copies");
			amount = amount + prices*copies;	
			
		}
		System.out.println(amount);
		
		int purchaseamount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(purchaseamount, amount);
	}
	
	
	
	
}
