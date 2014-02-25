package com.swm.cucumberselenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefs {

    Navigation navigation = new Navigation();

    @Given("^I navigate to the application$")
    public void I_navigate_to_the_application() throws Throwable {
        System.out.println("Entering: I navigate to the application");
        navigation.given_I_navigate_to_the_application();
    }

    @When("^I try to login with '<type>' credentials$")
    public void I_try_to_login_with_type_credentials() throws Throwable {
        System.out.println("Entering: I try to login with ");
    }

    @Then("^I should see that I logged in '<status>'$")
    public void I_should_see_that_I_logged_in_status_() throws Throwable {
        System.out.println("Entering: I should see that ");
    }

}
