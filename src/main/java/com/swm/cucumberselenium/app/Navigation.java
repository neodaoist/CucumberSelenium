package com.swm.cucumberselenium.app;

import com.swm.cucumberselenium.app.view.LoginView;
import com.swm.cucumberselenium.constants.CredentialsType;
import com.swm.cucumberselenium.constants.Outcome;
import com.swm.cucumberselenium.util.BrowserDriver;

public class Navigation {

    private User user;

    public void given_I_navigate_to_the_application() {
        BrowserDriver.loadPage(Application.APP_URL);
        //LoginView.isDisplayedCheck();
    }

    public void when_I_try_to_login(String credentialsType) {
        CredentialsType ct = CredentialsType.credentialsTypeForName(credentialsType);
        switch (ct) {
            case VALID:
                user = Users.createValidUser();
                break;
            case INVALID_USERNAME:
                user = Users.createInvalidUsernameUser();
                break;
            case INVALID_PASSWORD:
                user = Users.createInvalidPasswordUser();
                break;

            default:
                throw new IllegalArgumentException("unknown CredentialsType");
        }

        LoginView.login(user.getUsername(), user.getPassword());
    }

    public void then_I_login(String outcomeString) {
        Outcome outcome = Outcome.outcomeForName(outcomeString);
        switch(outcome){
            case SUCCESS:
                LoginView.checkLoginSuccess();
                break;
            case FAILURE:
                LoginView.checkLoginErrors();
                break;
        }
    }
}
