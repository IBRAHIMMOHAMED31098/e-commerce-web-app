@smoke
Feature: registration
  Scenario: user register with valid data
    Given user navigate to registration page
    When user enter valid reg data and press enter
    Then user should register successfully
    Then the browser should be closed