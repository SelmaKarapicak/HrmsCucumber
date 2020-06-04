Feature: Employee Search

Scenario: Search employee by id
Given user is navigated to HRMS
And user is logged with valid admin credentials
And user navigat to employee list page
When user enters valid employee id
And click on search button
Then user see employee information is displayed

Scenario: Search employee by name
Given user is navigated to HRMS
And user is logged with valid admin credentials
And user navigate to employee list page
When user enters valid employee name and lastname
And click on search button
Then user see employee information is displayed


