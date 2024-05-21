package com.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class YourCard extends BasePage {
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> products;
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    ArrayList<String> list = new ArrayList<>();

    public void verifyProducts(String expectedProduct) {
        for (WebElement product : products) {
            list.add(product.getText());
        }
        Assert.assertTrue(list.contains(expectedProduct));
    }
}
