@smoke
Feature: using slider
  Scenario: using 1st slider
    Given go to home page
    When select 1st slider
    Then 1st product diplayed
    Then quit_browser
    Scenario: using 2nd slider
      Given go to home page
      When select 2nd slider
      Then 2nd product diplayed
      Then quit_browser
