Feature: Account management

  @AS360TC-3
  Scenario: Just login into the application
    Given user is on the login page
    When user enters valid credentials
    Then user should see the dashboard

  @AS360TC-4
  Scenario: Login fails with valid password
    Given user is on the login page
    When user enters invalid password
    Then user should see the dashboard

  @AS360-403
  Scenario: View order history
    Given user is on the account page
    When user views order history
    Then recent orders should be visible
