package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{
	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
	  setUp();
	}

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	  click(login.loginBtn);
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
	    jsClick(dashboard.PIM);
	    jsClick(dashboard.empList);
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	    sendText(empList.empId, "10079");
	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(empList.searchButton);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	   System.out.println("Employee is displayed");
	   tearDown();
	}

	
}
