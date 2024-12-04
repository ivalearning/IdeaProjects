
  Feature:Ebay Home Page Scenarios

  @P1
  Scenario: Advanced Search Link

      Given I am on Ebay Home Page
      When I click on Advanced Link
      Then I navigate to Advanced Search Page

  @P2
  Scenario: Search items count

    Given I am on Ebay Home Page
    When I search for iPhone11
    Then I validate at least 1000 search items present
