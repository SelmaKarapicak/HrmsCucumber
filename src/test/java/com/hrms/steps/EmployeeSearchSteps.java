package com.hrms.steps;


import org.junit.Assert;

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
	  login.login();
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
	    jsClick(dashboard.PIM);
	    jsClick(dashboard.empList);
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	    sendText(viewEmp.empId, "14688");
	}
	
	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String string) {
		 sendText(viewEmp.empId, "14688");
	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(viewEmp.searchButton);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	  String expected="14688";
	  String actual=viewEmp.empId.getText();
	  if(expected.equals(actual)) {
		  System.out.println("Passed");
	  }
	 // Assert.assertEquals(expected, actual);
	   tearDown();
	}
	
	@When("user enters valid employee name and lastname")
	public void user_enters_valid_employee_name_and_lastname() {
	   sendText(viewEmp.empName,"Bishnu1");
	}
	
	@Then("verify table is displayed")
	public void verify_table_is_displayed() {
	   Assert.assertEquals(true, viewEmp.isTableDisplayed());
	}

	@Then("get firstname from table")
	public void get_firstname_from_table() {
	    System.out.println(viewEmp.getFirstNameFromTable());
	}

	@Then("verify first name from ui against db")
	public void verify_first_name_from_ui_against_db() {
	    Assert.assertEquals(DBSteps.dbData, viewEmp.getFirstNameFromTable());
	}

}
