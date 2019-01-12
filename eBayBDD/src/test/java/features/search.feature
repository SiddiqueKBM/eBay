@FunctionalTest
Feature: Search Feature
  In order to search item in search product
  as a user I need to be in Home Page

  Scenario Outline: Search Laptop
    Given I am in Home Page
    When Enter product name "<Product>" in search box
    And Click Search Button
    Then  Laptop items appear

    Examples:
      | Product |
      | Dell   |
      | Asus   |




