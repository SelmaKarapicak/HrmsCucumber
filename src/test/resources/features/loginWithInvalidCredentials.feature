
Feature: User should see error message when login with invalid credentials

@smoke
 Scenario: Login with valid username and invalid password
Given user navigated to HRMS
When user enters valid username and invalid password
Then user see Invalid credentials error message

@smoke
 Scenario:  Login with valid username and without password
Given user navigated to HRMS
When user enters valid username and empty password
Then user see Password can not be empty error message

@regression
Scenario:  Login without username and valid password
Given user navigated to HRMS
When user enters valid username and empty password
Then user see Username can not be empty error message
And user is happy
