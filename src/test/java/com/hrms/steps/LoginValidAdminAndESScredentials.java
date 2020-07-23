package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginValidAdminAndESScredentials extends CommonMethods{
	
	@Given("Admin user navigated to HRMS")
	public void admin_user_navigated_to_HRMS() {
	   setUp();
	}

	@When("Admin user enters valid username and password")
	public void admin_user_enters_valid_username_and_password() {
	  login.login();
	}

	@Then("Admin verify you logged in succesfully")
	public void admin_verify_you_logged_in_succesfully() {
		boolean welcome=dashboard.welcome.isDisplayed();
		tearDown();
	}
	
	@Given("ESS user navigated to HRMS")
	public void ess_user_navigated_to_HRMS() {
	   setUp();
	}

	@When("ESS user enters valid username and password")
	public void ess_user_enters_valid_username_and_password() {
	    sendText(login.username,"turkerdogruer");
	    sendText(login.password,"Turkerdogruer123.");
	    click(login.loginBtn);
	}

	@Then("ESS verify you logged in succesfully")
	public void ess_verify_you_logged_in_succesfully() {
		boolean welcome=dashboard.welcome.isDisplayed();
		Assert.assertTrue(welcome);
		takeScreenshot("ESSCredentials");
	}



}
