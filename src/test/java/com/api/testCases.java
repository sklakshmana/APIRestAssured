package com.api;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testCases {
	
	@Test
	public void testGetUsers()
	{
		given()
			.auth().none()
			.param("page", "2")
			.header("Content-Type", "application/json")
		.when()
			.get("https://reqres.in/api/users")
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.body("per_page", equalTo(6)); 
		
		
		/*Response res= given()
			.auth().none()
			.param("page", "2")
			.header("Content-Type", "application/json")
		.when()
			.get("https://reqres.in/api/users");
		
		res.prettyPrint(); */		
		
	}
	
	
	@Test
	public void addnewUser()
	{
		HashMap<String, Object> data=new HashMap<String, Object>();		
		
		//JSONObject request=new JSONObject();

		data.put("name", "Lakshman");
		data.put("job", "Teacher");
		
		
		//Response res=
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			
		.then()
			.statusCode(201)
			.log().body();
		//	.extract().response();
		
		//res.prettyPrint();
			
		}
		
		
		
		


}
