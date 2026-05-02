Feature: Checkout process

  @AS360-301
  Scenario: View order summary
    Given user has items in the cart
    When user proceeds to checkout
    Then user should see the order summary

  @AS360-302
  Scenario: Enter shipping details
    Given user has items in the cart
    When user enters shipping details
    Then shipping details should be accepted

  @AS360-303
  Scenario: Enter payment information
    Given user has items in the cart
    When user enters payment information
    Then payment should be processed

  @AS360-304
  Scenario: See order confirmation
    Given user has items in the cart
    When user proceeds to checkout
    Then order confirmation should be shown
