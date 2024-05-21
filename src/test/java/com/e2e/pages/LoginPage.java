package com.e2e.pages;

import com.e2e.utilities.BrowserUtils;
import com.e2e.utilities.ConfigurationReader;
import com.e2e.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "user-name")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void login(){
        Driver.get().get(ConfigurationReader.get("url"));
        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }




}
