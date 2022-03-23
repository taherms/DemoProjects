package com.demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class RestAPIAutomate {
	setupParams params = new setupParams();
	
	JsonPath jp;

	@BeforeTest
	public void setup() {
		Response response = when().get(params.getBaseURL());
		if(response.getStatusCode()==200) {
			jp= new JsonPath(response.asString());
		}else {
			System.out.println("Error code response code not 200");
			System.exit(0);
		}
		
		
	}
	

	@Test(priority = 0)
	public void testName() {
		
		//System.out.println("test 1");
		Assert.assertEquals(jp.getString(params.getTest1Condition()), params.getTest1Criteria());
	}
	
	@Test(priority = 1)
	public void testRelist() { 
		//System.out.println("test 2");
		Assert.assertTrue(jp.get(params.getTest2Condition()).equals(params.getTest2Criteria()));
	}
	
	@Test(priority = 2)
	public void testPromotions() {
		//System.out.println("test 3");
		
		int c= jp.getList("Promotions.Id").size();
		for(int i=0;i<c;i++) {
			if(jp.get("Promotions.Name").equals(params.getTest3Condition())) {
				Assert.assertEquals(jp.get("Promotions.Description"), params.getTest3Criteria());
			}
		}
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Test completed");
	}
	
}
