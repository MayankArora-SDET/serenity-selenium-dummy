Feature: Search functionality

  @AS360-201
  Scenario: Search for a product
    Given user is on the search page
    When user searches for a product
    Then user should see search results

  @AS360-202
  Scenario: Search with empty query
    Given user is on the search page
    When user searches with an empty query
    Then user should see a validation warning

  @AS360-203
  Scenario: Filter search results
    Given user is on the search page
    When user filters results by category
    Then search results should match the filter

  @AS360-204
  Scenario: Sort search results
    Given user is on the search page
    When user sorts results by price
    Then search results should be sorted
