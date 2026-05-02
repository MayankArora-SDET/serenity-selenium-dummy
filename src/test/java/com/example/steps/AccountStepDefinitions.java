package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountStepDefinitions {

    @Given("user is on the account page")
    public void user_is_on_the_account_page() {
        System.out.println("STEP: Navigate to account page+++++++++");
    }

    @When("user updates profile information")
    public void user_updates_profile_information() {
        System.out.println("STEP: Change profile details and save++++++++++");
    }

    @Then("profile updates should be applied")
    public void profile_updates_should_be_applied() {
        System.out.println("STEP: Confirm updated profile information+++++++++");
    }

    @When("user changes the password")
    public void user_changes_the_password() {
        System.out.println("STEP: Enter new password and save+++++++++");
    }

    @Then("password change should be successful")
    public void password_change_should_be_successful() {
        System.out.println("STEP: Verify password update message+++++++++");
    }

    @When("user views order history")
    public void user_views_order_history() {
        System.out.println("STEP: Open order history section+++++++++");
    }

    @Then("recent orders should be visible")
    public void recent_orders_should_be_visible() {
        System.out.println("STEP: Check recent order entries+++++++++   ");
    }
}
