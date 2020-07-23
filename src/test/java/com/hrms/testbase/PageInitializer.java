package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ReportsPageElements;

//initializes all page classes and stores references in static variables
//that will be called/used in test classes
public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ReportsPageElements reports;
	public static  ViewEmployeePageElements viewEmp;
	
	public static void initialize() {
		
		 login=new LoginPageElements();
		 dashboard=new DashBoardPageElements();
		 addEmp=new AddEmployeePageElements();
		 pdetails=new PersonalDetailsPageElements();
		 reports=new ReportsPageElements();
		 viewEmp=new ViewEmployeePageElements();
	}

}
