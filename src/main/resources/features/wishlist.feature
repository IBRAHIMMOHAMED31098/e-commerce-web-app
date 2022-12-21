@smoke
Feature: wishlist
  Scenario: add item to wishlist
    Given user  go to main page
    When user add item to wishlist
    Then wishlist counter should be incremented by 1
    Then QUIT browser