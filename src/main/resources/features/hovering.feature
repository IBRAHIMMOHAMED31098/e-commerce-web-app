@smoke
Feature: hovering
  Scenario: hover
    Given user go to main  page
    When hover on main category and select sub_category
    Then directed to its page
    Then Close the browser
