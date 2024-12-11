
Feature:Ebay Advanced Search Page Scenarios

  @P21
  Scenario: Advanced Search Link

    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I navigated to Home Page

  @P22
  Scenario: Advanced Search an Item

    Given I am on Ebay Advanced Search Page
    When I advanced search an Item
      |keyword|exclude|minprice|maxprice|
      |jazz|audio|0|100|


