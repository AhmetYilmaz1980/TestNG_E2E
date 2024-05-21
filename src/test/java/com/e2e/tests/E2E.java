package com.e2e.tests;

import com.e2e.pages.*;
import org.testng.annotations.Test;

public class E2E extends TestBase {
    LoginPage loginPage = new LoginPage();
    Products products = new Products();
    YourCard yourCard = new YourCard();
    CheckOut checkOut = new CheckOut();
    Overview overview = new Overview();
    Complete complete = new Complete();
    String title = "Swag Labs";
    String sortArt = "Price (high to low)";
    String product1 = "Sauce Labs Backpack";
    String product2 = "Sauce Labs Fleece Jacket";
    String expectedTitle = "Checkout: Overview";
    String expectedSuccessMessage = "Thank you for your order!";

    @Test
    public void e2ETest() {
        extentLogger = report.createTest("E2E Test");
        extentLogger.info("Login with valid credentials");
        loginPage.login();
        extentLogger.info("Verify success login with page title");
        loginPage.verifyPageWithTitle(title);
        extentLogger.info("Sort the products high to  low");
        products.selectSort(sortArt);
        extentLogger.info("Add to cart at least two item");
        products.selectAndAddWithProductName(product1);
        products.selectAndAddWithProductName(product2);
        extentLogger.info("Assert that the basket shows the true number of product");
        products.assertProductCount("2");
        extentLogger.info("Navigate to Your cart page");
        products.soppingCardContainer.click();
        extentLogger.info("Verify success Navigate to Your cart page with page title");
        loginPage.verifyPageWithTitle(title);
        extentLogger.info("Assert that the right items added to cart");
        yourCard.verifyProducts(product1);
        yourCard.verifyProducts(product2);
        extentLogger.info("Go to checkout page");
        yourCard.checkoutButton.click();
        extentLogger.info("Verify success navigate to checkout page with page title");
        loginPage.verifyPageWithTitle(title);
        extentLogger.info("Fill the form");
        checkOut.fillTheForm(faker.name().firstName(), faker.name().lastName(), faker.address().zipCode());
        extentLogger.info("click continue button and go to the checkout overview page");
        checkOut.continueButton.click();
        extentLogger.info("Verify success navigate checkout overview page with page title");
        overview.verifyPage(expectedTitle);
        extentLogger.info("Click finish button");
        overview.finishButton.click();
        extentLogger.info("assert the success shopping message");
        complete.verifySuccessMessage(expectedSuccessMessage);


    }
}
/**
 * 1-  Create a project from scratch. Design all packages, classes and ohter files...
 * 2- Navigate to https://www.saucedemo.com/
 * 3-Login with valid credentials (shown on the page)
 * 4-Sort the products high to  low
 * 5- Add to cart at least two item
 * 6- Assert that the basket shows the true number of product
 * 7-Navigate to Your cart page
 * 8-Assert that the right items added to cart
 * 9-go to checkout page and fill the form
 * 10-click continue button and go to the checkout overview page
 * 11-Click finish and assert the success shopping message
 * <p>
 * notes:     a. every new page should be asserted by page title
 * b.   use parameterized methods.
 * c. This is an e2e test so u can create one test method for this task called success shopping  test
 * good luck.
 */