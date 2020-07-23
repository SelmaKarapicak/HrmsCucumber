package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class HardcodedExampless {
	
	/**
	 * Rest Assured
	 * 
	 * given - prepare your request
	 * when -  you are making the call to the endpoint
	 * then -  validating
	 * 
	 * @param args
	 */
	
	static String baseURI=RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token= "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUyMTgyNjQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTI2MTQ2NCwidXNlcklkIjoiNzIzIn0.jcX1Z-Y0ZkTP44QR1eYYODGPAcFz6fK0ENt71sowgUs";
	
	
	public void sampleTestNotes() {
		
		/**
		 * BaseURI for all calls
		 */
		
		RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
		
		/**
		 * JWT required for all calls - expires every 12 hours
		 */
		
		String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUyMTgyNjQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTI2MTQ2NCwidXNlcklkIjoiNzIzIn0.jcX1Z-Y0ZkTP44QR1eYYODGPAcFz6fK0ENt71sowgUs";
	    
		/**
		 * Preparing /  getOneEmployee.php request
		 */
	   RequestSpecification getOneEmployeeRequest=given().header("Content-Type","application/json").header("Authorization", token).queryParam("employee_id", "19052A").log().all(); // log All sonradan ekledik her bilgiyi ayrintili veriyor
	   
	   /**
	    * Storing response
	    */
	  Response getOneEmployeeResponse= getOneEmployeeRequest.when().get("/getOneEmployee.php");
	  
	  /**
	   * Two ways to print response
	   * prettyPrint() method converts JSON object into String and prints - no need to SOP
	   */
	  getOneEmployeeResponse.prettyPrint(); //get json object and convert to string
	 // String response = getOneEmployeeResponse.body().asString();
	 // System.out.println(response);
	  
	  getOneEmployeeResponse.then().assertThat().statusCode(200);
		
	}
	
    @Test
    public void aPOSTcreateEmployee() {
    	
    	/**
    	 * Preparing request for /createEmployee.php
    	 */
	
    RequestSpecification createEmployeeRequest = given().header("Content-Type","application/json").header("Authorization",token).body("{\r\n" + 
    		"  \"emp_firstname\": \"Selma\",\r\n" + 
    		"  \"emp_lastname\": \"Acar\",\r\n" + 
    		"  \"emp_middle_name\": \"Karapicak\",\r\n" + 
    		"  \"emp_gender\": \"F\",\r\n" + 
    		"  \"emp_birthday\": \"1991-07-06\",\r\n" + 
    		"  \"emp_status\": \"Employee\",\r\n" + 
    		"  \"emp_job_title\": \"CEO\"\r\n" + 
    		"}");
    
    /**
     * Storing response into createEmployeeResponse
     */
    Response createEmployeeResponse=createEmployeeRequest.when().post("\r\n" + "/createEmployee.php");
    
    /**
     * Printing response using prettyPrint() method
     */
    createEmployeeResponse.prettyPrint();
	
    
}

}

