
  Feature:Ebay Home Page Scenarios

  @P1
  Scenario: Advanced Search Link

      Given I am on Ebay Home Page
      When I click on Advanced Link
      Then I navigate to Advanced Search Page

  @P2
  Scenario: Search items count

    Given I am on Ebay Home Page
    When I search for 'iPhone 11'
    Then I validate at least 1000 search items present

  @P6
    Scenario: Search items count2

      Given I am on Ebay Home Page
      When I search for 'follet'
      Then I validate at least 100 search items present


    @P3
    Scenario: Select category via Map

      Given I am on Ebay Home Page
      When I click on Mapa Webu
      And I click on Audiobooks
      Then I navigate to Audiobooks catalog
      And I can search by Writer

    @P4
    Scenario: Get help

      Given I am on Ebay Home Page
      When I click on Napoveda
      Then I navigate to Napoveda Page

    @P5
    Scenario: Search help Topic

      Given I am on Search Help Page
      When I search for Guarantee
      Then I navigate to Query Result Page

    @P7
    Scenario: Search an item in Category

      Given I am on Ebay Home Page
      When I search for 'vecere' and 'Knihy a časopisy' in category



