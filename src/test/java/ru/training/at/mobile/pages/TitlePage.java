package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TitlePage extends AbstractPage {

    public TitlePage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(60));

    WebElement basketOfProducts = androidDriver.findElement(
            AppiumBy.id(
                    "com.saucelabs.mydemoapp.android:id/cartIV"
            )
    ) ;

    WebElement counterOfCarts = wait.until(d ->androidDriver.findElement(
            AppiumBy.androidUIAutomator(
                    "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/cartTV\")")));

    public WebElement getBasketOfProducts() {
        return basketOfProducts;
    }

    public WebElement getCounterOfCarts() {
        return counterOfCarts;
    }
}
