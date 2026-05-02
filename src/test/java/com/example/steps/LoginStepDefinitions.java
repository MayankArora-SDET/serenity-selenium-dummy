package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("STEP: Open login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("STEP: Enter valid username and password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("STEP: Verify dashboard is visible");
    }

    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        System.out.println("STEP: Enter incorrect password");
    }

    @Then("user should see an error message")
    public void user_should_see_an_error_message() {
        System.out.println("STEP: Verify error message displayed");
    }

    @When("username is missing")
    public void username_is_missing() {
        System.out.println("STEP: Submit login without username");
    }

    @Then("user should see a username required message")
    public void user_should_see_a_username_required_message() {
        System.out.println("STEP: Verify username required message");
    }

    @Given("user is logged in")
    public void user_is_logged_in() {
        System.out.println("STEP: Simulate user already logged in");
    }

    @When("user clicks logout")
    public void user_clicks_logout() {
        System.out.println("STEP: Click logout button");
    }

    @Then("user should return to login page")
    public void user_should_return_to_login_page() {
        System.out.println("STEP: Verify login page is shown again");
    }
}
