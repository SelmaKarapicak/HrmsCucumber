package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

public class ReportsPageElements extends CommonMethods {
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement add;
	
	@FindBy(xpath="//input[@id='report_report_name']")
	public WebElement reportName;
	
	@FindBy(xpath="//select[@id='report_criteria_list']")
	public WebElement selectionCriteria;
	
	@FindBy(xpath="//select[@id='report_include_comparision']")
	public WebElement include;
	
	@FindBy(xpath="//select[@id='report_display_groups']")
	public WebElement displayFieldGroups;
	
	@FindBy(xpath="//select[@id='report_display_field_list']")
	public WebElement displayFields;
	
	@FindBy(xpath="//a[@id='btnAddDisplayField']")
	public WebElement displayAdd;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement save ;
	
	public ReportsPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void defineReport(String reportname,String sCriteria, String selectedCriteria, String displayGroups, String dFields) {
		sendText(reportName,reportname);
		selectDdValue(selectionCriteria,sCriteria);
		selectDdValue(include,selectedCriteria);
		selectDdValue(displayFieldGroups,displayGroups);
		selectDdValue(displayFields,dFields);
		click(displayAdd);
		click(reports.save);
	}
	
	
	
	
	
	
	

}
