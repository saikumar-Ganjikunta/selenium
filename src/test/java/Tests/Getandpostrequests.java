package Tests;

import org.testng.Assert;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Getandpostrequests {
	
     @Test
	public void testget() {
    	 
    given()
    
    
    .when()
    .get("https://reqres.in/api/users?page=2")
    
    
    .then()
    .statusCode(200)
    .body("data[3].first_name", equalTo("Byron"));
    
		
	}
     
     
     
     @Test
     public  void testPost() {
     	Map<String, Object>map = new HashMap<String,Object>();
     	
//     	map.put("name","sai");  
//     	map.put("job","Test Engineer");
//     	
//    	System.out.println(map);
     	
     	JSONObject request = new JSONObject();
     	request.put("name", "saikumar");
     	request.put("job", "TestEngineer");
     	
     	System.out.print(request.toJSONString());
     	
     	baseURI="https://reqres.in/api";
     	
     	
     	given()
     	
     	.header("Content-Type","application/json")
     	.contentType(ContentType.JSON)
     	.accept(ContentType.JSON)
     	.body(request.toJSONString())
     	
     	.when()
     	
     	.post("/user")
     	
     	
     	.then()
     	.statusCode(201).log().all();
     
     
     
}
}


