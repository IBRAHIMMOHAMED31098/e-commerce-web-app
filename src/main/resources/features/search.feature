@smoke
Feature: searching for product
  Scenario Outline: search using names
    Given User navigate to main page
    When he enters the products names "<product_name>" and click search
    Then user should find the "<product_name>"
    Then quit browser
    Examples:
      | product_name|
      | book        |
      |laptop       |
      | nike        |
    Scenario Outline: search using sKu
      Given User navigate to main page
      When user enter the product sku "<sKu>" and press search
      Then user should find the product "<sKu>"
      Then quit browser
      Examples:
           |sKu|
           | COMP_CUST |
