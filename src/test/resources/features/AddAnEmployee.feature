@tag
Feature: Create an Employee and Login Credentials for an Employee

 Background: Given user logged in into HRMS
            And user navigates to Add Employee page
  @tag1
  Scenario: Add new Employee
    Given user logged in into HRMS
    And user navigates to Add Employee page
    When user enters employees first name and last name
    And user clicks save button
    Then employee is added successfully

  @smoke
  Scenario: Add Employee without employee id
    Given user logged in into HRMS
    And user navigates to Add Employee page
    When user enters employees first name and last name
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

  Scenario: AddEmployee and create Login Credentials
    Given user logged in into HRMS
    And user navigates to Add Employee page
    When user enters employees first name and last name
    And user enters login credentials
    And user clicks save button
    Then employee is added successfully

  #to perform DDT in Cucumber we use Scenario Outline with examples
  @inProgress
  Scenario Outline: Adding multiple employees
    When user enter employee "<FirstName>", "<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>", "<MiddleName>" and "<LastName>" is added succesfully

    Examples:  //entire senaryo
      | FirstName | MiddleName | LastName   |
      | James     | J          | Smith      |
      | Faisal    | F          | Sakhil     |
      | Sohil     | S          | Instructor |
      | Yunus     | Emre       | Yakut      |


  #adding multiple employees using Cucumber DataTable  //spesific case oldugunda method kapanmadan hepsini ayni anda yapiyor
  Scenario: Adding multiple employees
    When user enters employee details and click on save
      | FirstName | MiddleName | LastName |
      | John      | J          | Smith    |
      | Jane      | J          | Smith    |
    Then employee is added successfully
    
    @excel
    Scenario: Adding multiple employees from excel
    When user enters employee data from "EmployeeLoginCredentials" excel sheet then employee is added
    
    Scenario: Add Employee and validate database
    When I add "James", "John" and "Smith"
    And I click Save
    And I see Employee has been succesfully added
    Then I collect employee data from database
    And I verify employee data is matched
    
    
