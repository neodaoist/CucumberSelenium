package com.swm.cucumberselenium.app.view;

import com.swm.cucumberselenium.app.containers.LoginPageContainer;
import com.swm.cucumberselenium.util.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginView {

    private static LoginPageContainer loginContainer = PageFactory.initElements(
            BrowserDriver.getCurrentDriver(), LoginPageContainer.class
    );

    /*public static void isDisplayedCheck() {
        System.out.println("Checking login page is displayed");
    }*/

    public static void login(String username, String password) {
        System.out.println("Logging in with username:" + username + " and password:" + password);
        loginContainer.usernameInput.sendKeys(username);
        loginContainer.passwordInput.sendKeys(password);
        loginContainer.submitButton.click();
        System.out.println("Login submitted");
    }

    public static void checkLoginSuccess() {
        HomeView.isDisplayedCheck();
    }

    public static void checkLoginErrors() {
        //
    }

}
