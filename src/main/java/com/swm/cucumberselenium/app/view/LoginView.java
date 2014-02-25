package com.swm.cucumberselenium.app.view;

import com.swm.cucumberselenium.BrowserDriver;
import com.swm.cucumberselenium.app.containers.LoginContainer;

public class LoginView {

    private static LoginContainer loginContainer = new LoginContainer();

    public static void isDisplayedCheck() {
        System.out.println("Checking login page is displayed");
        BrowserDriver.waitForElement(loginContainer.loginPageDiv);
    }

    public static void login(String username, String password) {
        System.out.println("Logging in with username:" + username + " and password:" + password);
        loginContainer.usernameInput.sendKeys(username);
        loginContainer.passwordInput.sendKeys(password);
        loginContainer.submitButton.clear();
        System.out.println("Login submitted");
    }

    public static void checkLoginSuccess() {

    }

    public static void checkLoginErrors() {

    }

}
