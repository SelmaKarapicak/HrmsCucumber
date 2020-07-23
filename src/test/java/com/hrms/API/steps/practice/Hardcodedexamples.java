package com.hrms.API.steps.practice;
//package com.hrms.API.steps.practice;
//import static io.restassured.RestAssured.given;
//
//import org.junit.Test;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//public class HardCodedExamples {
//	/**
//	 * Rest Assured
//	 *
//	 * given - prepare your request
//	 * when - you are making the call to the endpoint
//	 * then - validating
//	 *
//	 * @param args
//	 */
//	
//	static String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
//	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUxNjg1ODksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTIxMTc4OSwidXNlcklkIjoiOTE2In0.z7vk_Hc49ZZm0IOnfuPHt-o8xqTM1gh7c3hnJpG4MUM";
//	
//	
//	public void sampleTestNotes () {
//		
//		/**
//		 * JWT required for all calls - expires every 12 hours
//		 */
//		
//		//RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
//		
//		//String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUwOTYyMTIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTEzOTQxMiwidXNlcklkIjoiOTE2In0.QcViE5sOdggqzWrzg59ERPOorLV3eckvxIMB8NmF4PQ";
//		
//		/**
//		 * Preparing / getOneEmployee.php request
//		 */
//		
//		RequestSpecification getOneEmployeeRequest = given().header("Content-Type", "application/json").header("Authorization", token).queryParam("employee_id", "15851A");
//		
//		/**
//		 * Storing response
//		 */
//		
//		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
//		/**
//		 * Two ways to print response
//		 * prettyPrint() method converts JSON object into String and prints - no need to Syso
//		 */
//		getOneEmployeeResponse.prettyPrint();
//		
//		//String response = getOneEmployeeResponse.body().asString();
//		
//		//System.out.println(getOneEmployeeResponse);
//		
//		getOneEmployeeResponse.then().assertThat().statusCode(200);
//		
//	}
//	
//	  @Test
//	  public void aPostCreateEmployee () {
//		 
//		RequestSpecification createEmployeeRequest = given().header("Content-Type", "application/json").header("Authorization", token).body("{\r\n" +
//				"  \"emp_firstname\": \"ReyhaneeNalan\",\r\n" +
//				"  \"emp_lastname\": \"Barindik\",\r\n" +
//				"  \"emp_middle_name\": \"Munisse\",\r\n" +
//				"  \"emp_gender\": \"F\",\r\n" +
//				"  \"emp_birthday\": \"1992-03-07\",\r\n" +
//				"  \"emp_status\": \"Employee\",\r\n" +
//				"  \"emp_job_title\": \"Automation Engineer\"\r\n" +
//				"}");
//		
//		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
//		
//		createEmployeeResponse.prettyPrint();
//		
//	  }
//	
//	
//	
//	
//	
//	
//}