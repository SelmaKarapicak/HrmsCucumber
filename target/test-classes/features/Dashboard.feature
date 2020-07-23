#Author: karapicakselma@gmail.com

Feature: Dashboard


@dash
  Scenario: Dashboard menu view for admin
  When user enters valid username and password
  Then user see dashboard menu is displayed
  | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |
  
  