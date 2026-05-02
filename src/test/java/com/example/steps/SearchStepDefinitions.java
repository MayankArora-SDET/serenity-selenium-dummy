package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {

    @Given("user is on the search page")
    public void user_is_on_the_search_page() {
        System.out.println("STEP: Navigate to search page");
    }

    @When("user searches for a product")
    public void user_searches_for_a_product() {
        System.out.println("STEP: Enter search term and submit");
    }

    @Then("user should see search results")
    public void user_should_see_search_results() {
        System.out.println("STEP: Verify results are displayed");
    }

    @When("user searches with an empty query")
    public void user_searches_with_an_empty_query() {
        System.out.println("STEP: Submit an empty search");
    }

    @Then("user should see a validation warning")
    public void user_should_see_a_validation_warning() {
        System.out.println("STEP: Verify warning for empty search");
    }

    @When("user filters results by category")
    public void user_filters_results_by_category() {
        System.out.println("STEP: Apply category filter on results");
    }

    @Then("search results should match the filter")
    public void search_results_should_match_the_filter() {
        System.out.println("STEP: Verify results match category filter");
    }

    @When("user sorts results by price")
    public void user_sorts_results_by_price() {
        System.out.println("STEP: Sort results by price low to high");
    }

    @Then("search results should be sorted")
    public void search_results_should_be_sorted() {
        System.out.println("STEP: Verify results sorting order");
    }
}
