package com.swm.cucumberselenium.app.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageContainer {

    @FindBy(how = How.CLASS_NAME, using = "vmiddle")
    public WebElement homePageUsername;

}
