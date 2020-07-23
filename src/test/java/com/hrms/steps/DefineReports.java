package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefineReports extends CommonMethods{
	
	@Given("User navigate to HRMS")
	public void user_navigate_to_HRMS() {
	    setUp();
	}

	@Given("user navigates to Reports page")
	public void user_navigates_to_Reports_page() {
	    jsClick(dashboard.reports);
	}

	@Given("user enters Add")
	public void user_enters_Add() {
	    click(reports.add);
	}

	@When("user click Add enters Report Name")
	public void user_click_Add_enters_Report_Name() {
	    sendText(reports.reportName,ConfigsReader.getProperty("reportName"));
	}

	@When("click Add button near Display Fields")
	public void click_Add_button_near_Display_Fields() {
	   jsClick(reports.displayAdd); 
	}
	@When("click checkbox under Display Fields")
	public void click_checkbox_under_Display_Fields() {
	    click(reports.checkbox);
	}

	@Then("click Save button")
	public void click_Save_button() {
		click(reports.save);
		takeScreenshot("report");
	}



}
