Feature: Site navigation

  @AS360TC-134
  Scenario: Go to products page
    Given user is on the home page
    When user navigates to the products page
    Then product categories should be shown

  @AS360-502
  Scenario: Open help section
    Given user is on the home page
    When user opens the help section
    Then help topics should be visible

  @AS360-503
  Scenario: Go to settings page
    Given user is on the home page
    When user navigates to the settings page
    Then settings options should appear

  @AS360-504
  Scenario: Return to home page
    Given user is on the home page
    When user navigates to the products page
    Then product categories should be shown
