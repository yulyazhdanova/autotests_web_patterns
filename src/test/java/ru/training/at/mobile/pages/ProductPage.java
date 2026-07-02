package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends AbstractPage {

    private final WebDriverWait wait;

    public ProductPage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));
    }

    private final By productTitle =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/productTV");

    private final By addToCartButton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartBt");

    public WebElement getProductTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
    }

    public void clickAddToCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }
}
