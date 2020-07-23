package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddEmployee extends CommonMethods {

	@Given("user logged in into HRMS")
	public void user_logged_in_into_HRMS() {
		login.login();
	}

	@Given("user navigates to Add Employee page")
	public void user_navigates_to_Add_Employee_page() {
		jsClick(dashboard.addEmp);
	}

	@When("user enters employees {string},{string} and {string}")
	public void user_enters_employees(String fName, String mName, String lName) {
		sendText(addEmp.firstName, fName);
		sendText(addEmp.lastName, lName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmp.save);
	}

	@Then("employee is added")
	public void employee_is_added() {
		System.out.println("-----Employee is added using datatable");
	}
	
	@When("user enters employee data from {string} excel sheet then employee is added")
	public void user_enters_employee_data_from_excel_sheet_then_employee_is_added(String sheetName) {
	  List<Map<String,String>> excelList=ExcelUtility.excelIntoListOfMaps(Constants.TESTDATA_FILEPATH, sheetName);
	  //HMW
	}
	
	
	@When("user enters employee details and click on save")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
		List<Map<String, String>> addEmployeeList=dataTable.asMaps();
		  
		for(Map<String, String> map:addEmployeeList) {

			String fname=map.get("FirstName");
			String mname=map.get("MiddleName");
			String lname=map.get("LastName");

			sendText(addEmp.firstName, fname);
			sendText(addEmp.middleName, mname);
			sendText(addEmp.lastName, lname);
			click(addEmp.save);
			//adding assertion

			String actual=pdetails.verifyEmp.getText();
			String expected=fname+" "+mname+" "+lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			wait(5);
		}
	  
	}
	
	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.empId.sendKeys(Keys.DELETE);

	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		click(addEmp.chkLoginDetails);
		sendText(addEmp.userName,"erkanacarrrr");
		sendText(addEmp.userPassword, "Erhanacar123456789.");
		sendText(addEmp.confirmPassword, "Erhanacar123456789.");
        Select select= new Select (addEmp.status);
		select.selectByVisibleText("Enabled");
	}
	
	

}
