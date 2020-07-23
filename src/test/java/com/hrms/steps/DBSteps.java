package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.DataBaseUtils;

import io.cucumber.java.en.When;

public class DBSteps {
	
	public static List<Map<String,String>> dbData;

	@When("get data from db")
	public void get_data_from_db() {
		
		String sqlQuery="select emp_firstname from hs_hr_employees\n" +
		"where employee_id=14688";
		
		dbData=DataBaseUtils.storeDataFromDB(sqlQuery);
	   
	}
}
