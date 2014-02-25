package com.swm.cucumberselenium;

import com.swm.cucumberselenium.app.NavigatorFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {

    @Given("^I navigate to the application$")
    public void I_navigate_to_the_application() throws Throwable {
        System.out.println("Entering: I navigate to the application");
        NavigatorFactory.getNavigator().given_I_navigate_to_the_application();
    }

    @When("^I try to login with '([^\']+)' credentials$")
    public void I_try_to_login_with_type_credentials(String credentialsType) throws Throwable {
        System.out.println("Entering: I try to login with ");
        NavigatorFactory.getNavigator().when_I_try_to_login(credentialsType);
    }

    @Then("^I should see that I logged in '([^\']+)'$")
    public void I_should_see_that_I_logged_in_status_(String outcome) throws Throwable {
        System.out.println("Entering: I should see that ");
        NavigatorFactory.getNavigator().then_I_login(outcome);
    }

}
