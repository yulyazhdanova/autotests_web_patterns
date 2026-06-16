package ru.training.at.mobile.tests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.mobile.base.BaseClass;
import ru.training.at.mobile.base.TestData;

public class ProductTest extends BaseClass {

    @Test
    public void addFirstProductToBasketTest() {

        Assert.assertFalse(catalogPage.getProducts().isEmpty(), "Список товаров пустой");
        catalogPage.getProducts().get(0).click();
        Assert.assertTrue(productPage.getProductTitle().isDisplayed(), "Карточка товара не открылась");
//        Assert.assertTrue(productPage.getAddToCartBotton().isEnabled());
//        productPage.getAddToCartBotton().click();
        titlePage.getBasketOfProducts().click();
        Assert.assertEquals(basketPage.getProductTitleInBasket().getText(), TestData.PRODUCT);
        Assert.assertTrue(titlePage.getCounterOfCarts().isDisplayed(), "Корзина пустая");
    }
}
