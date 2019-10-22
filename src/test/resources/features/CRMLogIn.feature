@All
Feature: Free CRM Application Test

Scenario: Validate free crm home page pass test

  Given User opens browser
  Then user on home page
  Then user log in with valid credentials
  Then user log out


  Scenario: Validate free crm fail test

    Given User opens browser
    Then user on home page
    Then user log in invalid credentials



