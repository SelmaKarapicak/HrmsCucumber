
Feature: Define Reports

  Scenario: As an admin I should be able to define reports
    Given User navigate to HRMS
    And Admin user enters valid username and password
    And user navigates to Reports page
    And user enters Add
    When user click Add enters Report Name
    And click Add button near Display Fields
    And click checkbox under Display Fields
    Then click Save button

 
