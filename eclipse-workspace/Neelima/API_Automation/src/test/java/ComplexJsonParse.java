import org.testng.Assert;

import Files.payloads;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js = new JsonPath(payloads.CoursePrice());
		
		//no of courses count
		int count = js.getInt("courses.size()");    //size() method is used in arrays
		System.out.println(count);
		
		//print purchase amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//print title of first course
		String firsttitle = js.get("courses[0].title");
		System.out.println(firsttitle);
		
		//print title of second course
		String secondtitle = js.get("courses[1].title");
		System.out.println(secondtitle);
		
		//print all course titles
		System.out.println("list of courses : ");
		for(int i=0; i<count; i++)
		{
			String coursetitle = js.get("courses["+i+"].title");
			int allprices = js.getInt("courses["+i+"].price");
			System.out.println(coursetitle);
			System.out.println(allprices);
		}
		
		//print no.of copies sold by RPA
		System.out.println("print no.of copies sold by RPA : ");
		for(int i=0; i<count; i++)
		{
			String coursetitle = js.get("courses["+i+"].title");
			if(coursetitle.equalsIgnoreCase("RPA"))
			{
				int copiescount = js.get("courses["+i+"].copies");
				System.out.println(copiescount);
				break;
			}
		}
		

	}

}
