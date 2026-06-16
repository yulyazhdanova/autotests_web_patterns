package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends AbstractPage {

    public CatalogPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    List<WebElement> products = androidDriver.findElements(
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/productTV")
    );

    public List<WebElement> getProducts() {
        return products;
    }
}
