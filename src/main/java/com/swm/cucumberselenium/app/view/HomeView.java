package com.swm.cucumberselenium.app.view;

import com.swm.cucumberselenium.app.containers.HomePageContainer;
import com.swm.cucumberselenium.util.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import static org.fest.assertions.api.Assertions.assertThat;

public class HomeView {

    private static final HomePageContainer homePageContainer = PageFactory.initElements(
            BrowserDriver.getCurrentDriver(), HomePageContainer.class
    );

    public static void isDisplayedCheck(){
        BrowserDriver.waitForElement(homePageContainer.homePageUsername);
        String pageSrc = BrowserDriver.getCurrentDriver().getPageSource();
        assertThat(pageSrc).contains(Application.VERIFY_HOMEPAGE_STRING);
        //homePageContainer.homePageUsername.isDisplayed();
    }

}
