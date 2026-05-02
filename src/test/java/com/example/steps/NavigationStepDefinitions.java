package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefinitions {

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        System.out.println("STEP: Open home page");
    }

    @When("user navigates to the products page")
    public void user_navigates_to_the_products_page() {
        System.out.println("STEP: Click on products menu");
    }

    @Then("product categories should be shown")
    public void product_categories_should_be_shown() {
        System.out.println("STEP: Verify product categories display");
    }

    @When("user opens the help section")
    public void user_opens_the_help_section() {
        System.out.println("STEP: Click on help link");
    }

    @Then("help topics should be visible")
    public void help_topics_should_be_visible() {
        System.out.println("STEP: Confirm help topics are visible");
    }

    @When("user navigates to the settings page")
    public void user_navigates_to_the_settings_page() {
        System.out.println("STEP: Select settings from menu");
    }

    @Then("settings options should appear")
    public void settings_options_should_appear() {
        System.out.println("STEP: Verify settings options are shown");
    }
}
