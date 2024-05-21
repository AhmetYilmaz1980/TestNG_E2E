package com.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut extends BasePage{
    @FindBy(id = "first-name")
    public WebElement firstname;
    @FindBy(id = "last-name")
    public WebElement lastname;
    @FindBy(id = "postal-code")
    public WebElement postalcode;
    @FindBy(id = "continue")
    public WebElement continueButton;

    public void fillTheForm(String firstName,String lastName,String postalCode){
        firstname.sendKeys(firstName);
        lastname.sendKeys(lastName);
        postalcode.sendKeys(postalCode);
    }
}
