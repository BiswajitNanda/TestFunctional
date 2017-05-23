@AcceptanceTests
Feature: Ebay Search

  As a new customer (Not logged in) on eBay,
  I want to be able to shop for an item I want, to look
  for the cheapest item available and use the filtering options available.

  Background:
    Given user is on ebay

  @FunctionalAutomatedScenario
  Scenario Outline: Sorting by types
    Given User searches <searchType>
    When user sort by <sortingOptions>
    And user selects an item from the search result
    Then the <deliveryResult> should get display
    Examples:
      | searchType | sortingOptions        | deliveryResult              |
      | "Coffee"   | "Lowest price"        | "Free collection in person" |
      | "Iphone"   | "Highest price"       | "Free collection in person" |
      | "Samsung"  | "Highest price + P&P" | "Economy Delivery"          |
      | "Garden"   | "Lowest price + P&P"  | "Free Delivery"             |
      | "Patio"    | "Newly listed"        | "Free collection in person" |

  @FunctionalAutomatedScenario
  Scenario Outline: Filter by listings
    Given User searches <searchType>
    When user sort by <sortingOptions>
    And user filter by <listings>
    Then the <deliveryResult> should get display
    Examples:
      | searchType | sortingOptions | listings  | deliveryResult              |
      | "Coffee"   | "Lowest price" | "Auction" | "Free collection in person" |

  @ManualNotYetAutomated
  Scenario: Search results in Grid View
    Given I search for "London"
    When I click on the GridView icon on Search results
    Then the results should appear in the grid
    And the Grid should be three adverts wide
    And the ListView icon should be displayed

  @ManualNotYetAutomated
  Scenario: Changing the search results view from list to the grid
    Given I search for "London"
    When I click on the GridView icon on Search results
    Then the results should appear in the grid
    And the ListView icon should be displayed

  @ManualNotYetAutomated
  Scenario: Changing the search results view from grid to list
    Given the searched result is displayed in Grid view
    And the ListView icon is displayed
    When I click on the ListView icon on Search results
    Then the results should appear in the ListView
    And the GrudView icon should be displayed

  @ManualNotYetAutomated
  Scenario Outline: Sorting in Grid View by Date & Price
    Given I have searched for "London"
    And I have clicked on GridView icon
    When I sort by <Date> added & <Price>
    Then the search results be sorted based on <Date> & <Price>
    Examples:
      | Date         | Price  |
      | "29/12/2016" | "1000" |
      | "09/12/2016" | "500"  |