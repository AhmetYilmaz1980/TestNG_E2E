package com.e2e.pages;

import com.e2e.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Products extends BasePage{
    @FindBy(css = "[data-test='product-sort-container']")
    public WebElement sortButton;


    @FindBy(id = "shopping_cart_container")
    public WebElement soppingCardContainer;

    public void selectSort(String sortArt){
        Select select = new Select(sortButton);
        select.selectByVisibleText(sortArt);
    }

    public void selectAndAddWithProductName(String productName){
        WebElement addCard = Driver.get().findElement(By.xpath("//div[text()='" + productName + "']//..//..//following-sibling::div//button"));
        addCard.click();
    }

    public void assertProductCount(String count){
        Assert.assertEquals(soppingCardContainer.getText(), count);
    }
}
