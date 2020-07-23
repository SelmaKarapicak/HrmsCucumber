Feature: Login valid Admin and ESS Credentials

  Scenario: User should be be able to login as an Admin using valid admin credentials
    Given Admin user navigated to HRMS
    When Admin user enters valid username and password
    Then Admin verify you logged in succesfully
     

  Scenario: ESS user should be be able to login as an ESS using valid admin credentials
   Given user navigated to HRMS
    When ESS user enters valid username and password
    Then ESS verify you logged in succesfully
 
 #enhancing test with Scenario Outline
    @smoke   
    Scenario Outline: Valid Login Credentials
    When user enter valid "<Username>" and "<Password>"
    And user click on login button
    Then "<FirstName>" is successfully logged in
    
    Examples:
    |Username| Password  | FirstName|
    |Admin   |Hum@nhrm123| Admin|
    |abd77   |Syntax123! | Abdullah   | 
    