package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends AbstractPage {

    public BasketPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    WebElement productTitleInBasket = androidDriver.findElement(
            AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/titleTV\")")
    );

    public WebElement getProductTitleInBasket() {
        return productTitleInBasket;
    }
}
