import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.ReusableMethods;
import Files.payloads;

public class Basics {

	public static void main(String[] args) {
		
		//validate addplace api is working as expected
		
		//given when then
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
	    String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(payloads.AddPlace())
	    .when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Content-Type", "application/json;charset=UTF-8").extract().response().asString();
		
		System.out.println(response);
		//add place-> update that place with new address -> get place to validate if new address is present in the reponse 
	    
	    JsonPath js = new JsonPath(response);     //for parsing json
		String placeId = js.getString("place_id");
        System.out.println("placeId = "+ placeId);
        
        
        //updateplace
        
        String newAddress = "70 Summer walk, USA";
        
        given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n"
        		+ "\"place_id\":\""+placeId+"\",\r\n"
        		+ "\"address\":\""+newAddress+"\",\r\n"
        		+ "\"key\":\"qaclick123\"\r\n"
        		+ "}\r\n"
        		+ "")
        .when().put("/maps/api/place/update/json")
        .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	
	// validate if address is updated //GetPlace
	
	String getplaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	 .when().get("/maps/api/place/get/json")
	 .then().log().all().assertThat().statusCode(200).extract().response().asString();
	
    System.out.println(getplaceResponse);
    
  //  JsonPath js1 = new JsonPath(getplaceResponse);
    JsonPath js1 =  ReusableMethods.rawToJson(getplaceResponse);
    String actualAddress = js1.getString("address");
    System.out.println(actualAddress);
    
   Assert.assertEquals(actualAddress, "70 Summer walk, USA");
}
}
