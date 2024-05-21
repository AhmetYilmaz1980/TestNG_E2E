package com.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Overview extends BasePage{
    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    public WebElement checkoutOverviev;
    @FindBy(id = "finish")
    public WebElement finishButton;

    public void verifyPage(String expectedTitle){
        String actualTittle = checkoutOverviev.getText();
        Assert.assertEquals(actualTittle,expectedTitle);
    }
}
