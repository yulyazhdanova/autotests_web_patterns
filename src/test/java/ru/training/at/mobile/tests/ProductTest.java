package ru.training.at.mobile.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.mobile.base.BaseClass;
import ru.training.at.mobile.base.TestData;

public class ProductTest extends BaseClass {

    @Test(priority = 2)
    public void addFirstProductToBasketTest() throws InterruptedException {
        reopenApp();
        checkOfList();
        openCartOfFirstProduct();
        checkOfAddBotton();
        Thread.sleep(5000);
        checkOfBasketNotEmptyOne();
    }

    @Test(priority = 1)
    public void sortingOfCatalogTest() throws InterruptedException {
        reopenApp();
        Thread.sleep(5000);
        checkOfList();
        Thread.sleep(5000);
        sortingOfCatalog();
        Thread.sleep(5000);
        checkOfPrices();
    }

    @Test(priority = 3)
    public void addTwoProductsToBasketTest() throws InterruptedException {
        reopenApp();
        Thread.sleep(5000);
        checkOfList();
        openCartOfFirstProduct();
        checkOfAddBotton();
        Thread.sleep(5000);
        checkOfBasketNotEmptyOne();
        openCatalog();
        Thread.sleep(5000);
        openCartOfSecondProduct();
        Thread.sleep(5000);
        checkOfAddBotton();
        checkOfBasketNotEmptyTwo();
    }

    public void checkOfList() {
        Assert.assertFalse(catalogPage.getListOfProducts().isEmpty(), "Список товаров пустой");
    }

    public void openCartOfFirstProduct() {
        catalogPage.getFirstProduct();
        Assert.assertTrue(productPage.getProductTitle().isDisplayed(), "Карточка товара не открылась");
        Assert.assertEquals(productPage.getProductTitle().getText(), TestData.FIRST_PRODUCT_IN_BASKET);
    }
    public void openCartOfSecondProduct() {
        catalogPage.getSecondProduct();
        Assert.assertTrue(productPage.getProductTitle().isDisplayed(), "Карточка товара не открылась");
        Assert.assertEquals(productPage.getProductTitle().getText(), TestData.SECOND_PRODUCT_IN_BASKET);
    }

    public void checkOfAddBotton() {
        productPage.clickAddToCartButton();
    }

    public void checkOfBasketNotEmptyOne() {
        titlePage.getBasketOfProducts();
        Assert.assertEquals(basketPage.getProductTitleInBasketOne().getText(), TestData.FIRST_PRODUCT_IN_BASKET);
        //Assert.assertTrue(titlePage.getCounterOfCarts().isDisplayed(), "Корзина пустая");
    }
    public void checkOfBasketNotEmptyTwo() {
        titlePage.getBasketOfProducts();
        Assert.assertEquals(basketPage.getProductTitleInBasketTwo().getText(), TestData.SECOND_PRODUCT_IN_BASKET);
        //Assert.assertTrue(titlePage.getCounterOfCarts().isDisplayed(), "Корзина пустая");
    }

    public void openCatalog() {
        titlePage.getMenuBotton();
        titlePage.getCatalogBotton();
    }
    public void reopenApp() {
        String appPackage = "com.saucelabs.mydemoapp.android";
        androidDriver.terminateApp(appPackage);
        androidDriver.activateApp(appPackage);
    }

    public void sortingOfCatalog() {
        titlePage.getSortingBotton();
        titlePage.getPriceSorting();
    }

    public void checkOfPrices() {
        double price1 = Double.parseDouble(catalogPage.getPriceOne().getText().replaceAll("[^0-9.]", ""));
        double price2 = Double.parseDouble(catalogPage.getPriceTwo(). getText().replaceAll("[^0-9.]", ""));
        double different = price2 - price1;
        Assert.assertTrue(different > 0);
    }
}
