package com.swm.cucumberselenium.app.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginContainer {

    @FindBy(how = How.ID, using = "LoginPage")
    public WebElement loginPageDiv;

    @FindBy(how = How.CSS, using = "#LoginPage input[name=username]")
    public WebElement usernameInput;

    @FindBy(how = How.CSS, using = "#LoginPage input[name=password]")
    public WebElement passwordInput;

    @FindBy(how = How.CSS, using = "#LoginPage span[role='button']")
    public WebElement submitButton;

}
