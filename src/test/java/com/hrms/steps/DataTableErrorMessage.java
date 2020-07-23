package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DataTableErrorMessage extends CommonMethods{
	
	@When("I enter invalid username and password and see error message")
	public void i_enter_invalid_username_and_password_and_see_error_message(DataTable dataTable) {
		
		List<Map<String, String>> map=dataTable.asMaps();
		for(Map<String, String> maps:map) {
			
			sendText(login.username, maps.get("UserName"));
			sendText(login.password,maps.get("Password"));
			click(login.loginBtn);
			
			String actual=login.errorMsg.getText();
			String expected=maps.get("ErrorMessage");
			Assert.assertEquals(expected, actual);
			takeScreenshot("InvalidCredentials");	
		}
		
		
	  
	}

}
