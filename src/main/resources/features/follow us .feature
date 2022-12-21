@smoke
Feature: Follow Us feature
  Scenario: follow us on facebook
    Given user go to main page1
    When user click on facebook icon "a[href="http://www.facebook.com/nopCommerce"]"
    Then user directed to facebook "https://www.facebook.com/nopCommerce"
    Then close bowser
  Scenario: follow us on twitter
    Given user go to main page1
    When user click on twitter icon "a[href="https://twitter.com/nopCommerce"]"
    Then user directed to twitter "https://twitter.com/nopCommerce"
    Then close bowser
  Scenario: follow us on rss
    Given user go to main page1
    When user click on rss icon "a[href="/news/rss/1"]"
    Then user directed to rss "https://demo.nopcommerce.com/new-online-store-is-open"
    Then close bowser
  Scenario: follow us on youtube
    Given user go to main page1
    When user click on youtube icon "a[href="http://www.youtube.com/user/nopCommerce"]"
    Then user directed to youtube "https://www.youtube.com/user/nopCommerce"
    Then close bowser