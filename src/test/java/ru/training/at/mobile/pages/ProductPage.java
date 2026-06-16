package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends AbstractPage {

    public ProductPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    WebElement productTitle = androidDriver.findElement(
            AppiumBy.id(
                    "com.saucelabs.mydemoapp.android:id/productTV")
    );
//    WebElement addToCartBotton = androidDriver.findElement(
//            AppiumBy.androidUIAutomator(
//                    "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/cartBt\")")
//    );

    public WebElement getProductTitle() {
        return productTitle;
    }

//    public WebElement getAddToCartBotton() {
//        return addToCartBotton;
//    }
}
