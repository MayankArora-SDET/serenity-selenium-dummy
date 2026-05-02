Feature: User login

  @AS360-101
  Scenario: Successful login
    Given user is on the login page
    When user enters valid credentials
    Then user should see the dashboard

  @AS360-102
  Scenario: Invalid password
    Given user is on the login page
    When user enters invalid password
    Then user should see an error message

  @AS360-103
  Scenario: Missing username
    Given user is on the login page
    When username is missing
    Then user should see a username required message

  @AS360-104
  Scenario: Logout from dashboard
    Given user is logged in
    When user clicks logout
    Then user should return to login page
