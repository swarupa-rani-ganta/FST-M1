@FirstExample
Feature: Basic Syntax

  @FirstScenario
  Scenario: TS Homepage Test
    Given User is on the Homepage
    When the User clicks on about us link
    Then the User is directed to about page
    Then close the browser
