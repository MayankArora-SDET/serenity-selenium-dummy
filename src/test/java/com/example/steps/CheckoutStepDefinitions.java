package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefinitions {

    @Given("user has items in the cart")
    public void user_has_items_in_the_cart() {
        System.out.println("STEP: Verify items exist in the cart");
    }

    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        System.out.println("STEP: Click on checkout button");
    }

    @Then("user should see the order summary")
    public void user_should_see_the_order_summary() {
        System.out.println("STEP: Confirm order summary is displayed");
    }

    @When("user enters shipping details")
    public void user_enters_shipping_details() {
        System.out.println("STEP: Fill shipping address form");
    }

    @Then("shipping details should be accepted")
    public void shipping_details_should_be_accepted() {
        System.out.println("STEP: Verify shipping details are saved");
    }

    @When("user enters payment information")
    public void user_enters_payment_information() {
        System.out.println("STEP: Enter card or payment details");
    }

    @Then("payment should be processed")
    public void payment_should_be_processed() {
        System.out.println("STEP: Confirm payment processing");
    }

    @Then("order confirmation should be shown")
    public void order_confirmation_should_be_shown() {
        System.out.println("STEP: Verify order confirmation message");
    }
}
