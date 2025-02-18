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

public class PutAndPatchExamples {
	
	@Test
	public void testput(){
		JSONObject request = new JSONObject();
		
		request.put( "first_name","saikumar");
		request.put("last_name", "Ganjikunta");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/user/2").
		then().
		statusCode(200)
		.log().all();
	}
	
	@Test
	public void testpatch(){
		JSONObject request = new JSONObject();
		
		request.put( "name","sai");
		request.put("job", "Software");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("/user/2").
		then().
		statusCode(200);
		
	}
	
	
	
	@Test
	public void testdelete(){
		
		
		//baseURI = "https://reqres.in/api";
		
		given()
	
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
	}
	
	
	
	
	
	
	

}
