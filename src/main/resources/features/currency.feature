@smoke
Feature: Currency selection
  Scenario: select euro currency
    Given user go to homepage
    When user select euro
    Then all currencies turn into euro
    Then browser quit