@smoke
Feature: log in feature
Scenario: user login with valid data
  Given user navigate to homepage
  When user enter"ib.mo.ak.23@gmail.com" and "123456789"
  Then user should login successfully
  Then browser should be closed
Scenario: user login with invalid
  Given user navigate to homepage
  When user enter"ib.mo.az.98@gmail.com" and "123456789"
  Then user should fail to login
  Then browser should be closed

