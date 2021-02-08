package com.api;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.util1.ExtentReporting;

import io.restassured.response.Response;

public class testCases extends ExtentReporting{
	
	@Test(priority=1)
	public void testGetUsers()
	{
		logger=report.createTest("API testing");
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
		
		logger.pass("testGetUsers Success");
		/*Response res= given()
			.auth().none()
			.param("page", "2")
			.header("Content-Type", "application/json")
		.when()
			.get("https://reqres.in/api/users");
		
		res.prettyPrint(); */		
		
	}
	
	
	@Test(priority=2)
	public void addnewUser()
	{
		HashMap<String, Object> data=new HashMap<String, Object>();		
		
		//JSONObject request=new JSONObject();

		data.put("name", "Lakshman");
		data.put("job", "Engineer");
		
		
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
		logger.fail("addnewUser Failed");
			
		}
	
	@Test(priority=3)
	public void getUser()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().body()
			.body("data.id", equalTo(2))
			.body("data.email", equalTo("janet.weaver@reqres.in"));		
		
	}
	
	@Test(priority=4)
	public void testDelete()
	{				
		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
			.statusCode(204)
			//.log().body();
			.log().all();
	}
		
		
		
		


}
