Feature: Account management

  @SIMPLETC-3
  Scenario: Update profile information
    Given user is on the account page
    When user updates profile information
    Then profile updates should be applied

  @AS360-402
  Scenario: Change password
    Given user is on the account page
    When user changes the password
    Then password change should be successful

  @AS360-403
  Scenario: View order history
    Given user is on the account page
    When user views order history
    Then recent orders should be visible
