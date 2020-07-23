package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import org.junit.Assert;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginWithInvalidCredentials extends CommonMethods{

	@Given("user navigated to HRMS")
	public void user_navigated_to_HRMS() {
		setUp();
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
		sendText(login.username, ConfigsReader.getProperty("username")); 
		sendText(login.password, "123456678hhh");
		click(login.loginBtn);
	}

	@Then("user see Invalid credentials error message")
	public void user_see_Invalid_credentials_error_message() {
		
		String expected="Invalid Credentials";
		String actual=login.errorMessage.getText();
		Assert.assertEquals( expected, actual);
	}

	@When("user enters valid username and empty password")
	public void user_enters_valid_username_and_empty_password() {
		sendText(login.username, ConfigsReader.getProperty("username")); 
		sendText(login.password, " ");
		click(login.loginBtn);
	}

	@Then("user see Password can not be empty error message")
	public void user_see_Password_can_not_be_empty_error_message() {
		String expected="Password cannot be empty";
		String actual=login.errorMessage.getText();
		if(expected.equals(actual)) {
			System.out.println("Passed");
		}
	}

	@Then("user see Username can not be empty error message")
	public void user_see_Username_can_not_be_empty_error_message() {
		String expected="Username cannot be empty";
		String actual=login.errorMessage.getText();
		if(expected.equals(actual)) {
			System.out.println("Passed");
			
		}
		takeScreenshot("errorMessage");
		
	}
	
	

}
