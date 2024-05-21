package com.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Complete extends BasePage{
    @FindBy(xpath = "//h2")
    public WebElement success;

    public void verifySuccessMessage(String expectedMessage){
        String actualMessage = success.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
