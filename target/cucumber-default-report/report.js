$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddAnEmployee.feature");
formatter.feature({
  "name": "Create an Employee and Login Credentials for an Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Add Employee without employee id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Add Employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_navigates_to_Add_Employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters employees first name and last name",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user deletes employee id",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_deletes_employee_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_clicks_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SearchEmployee.feature");
formatter.feature({
  "name": "Employee Search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint13"
    }
  ]
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint13"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_is_navigated_to_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to employee list page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_navigate_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid employee id",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_enters_valid_employee_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see employee information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_see_employee_information_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/loginCredentials.feature");
formatter.feature({
  "name": "Login valid Admin and ESS Credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\" is successfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "Hum@nhrm123"
      ]
    },
    {
      "cells": [
        "abd77",
        "Syntax123!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid \"Admin\" and \"Hum@nhrm123\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\" is successfully logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid \"abd77\" and \"Syntax123!\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\" is successfully logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/loginWithInvalidCredentials.feature");
formatter.feature({
  "name": "User should see error message when login with invalid credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginWithInvalidCredentials.user_navigated_to_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginWithInvalidCredentials.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see Invalid credentials error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginWithInvalidCredentials.user_see_Invalid_credentials_error_message()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cInvalid [C]redentials\u003e but was:\u003cInvalid [c]redentials\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.hrms.steps.LoginWithInvalidCredentials.user_see_Invalid_credentials_error_message(LoginWithInvalidCredentials.java:31)\r\n\tat ✽.user see Invalid credentials error message(file:///C:/Users/karap/eclipse-workspace/HrmsCucumber/src/test/resources/features/loginWithInvalidCredentials.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid username and without password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginWithInvalidCredentials.user_navigated_to_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and empty password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginWithInvalidCredentials.user_enters_valid_username_and_empty_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see Password can not be empty error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginWithInvalidCredentials.user_see_Password_can_not_be_empty_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});