package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPageElements{
	
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy(xpath="//input[@id='empsearch_id']")
	public WebElement empId;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	public WebElement searchButton;
	
	
	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
