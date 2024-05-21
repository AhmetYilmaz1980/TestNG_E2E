package com.e2e.pages;

import com.e2e.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {

    public BasePage(){PageFactory.initElements(Driver.get(),this);}

    public void verifyPageWithTitle(String expectedtitle){
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle,expectedtitle);
    }

}
