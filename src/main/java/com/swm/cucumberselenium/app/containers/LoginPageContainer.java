package com.swm.cucumberselenium.app.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageContainer {

    @FindBy(how = How.NAME, using = "login[username]")
    public WebElement usernameInput;

    @FindBy(how = How.NAME, using = "login[password]")
    public WebElement passwordInput;

    @FindBy(how = How.ID, using = "login_btn")
    public WebElement submitButton;

}
