package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class BasketPage extends AbstractPage {

    private WebDriverWait wait;

    public BasketPage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));
    }
    private final By productTitleInBasketOne =
            AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/titleTV\")");

    public WebElement getProductTitleInBasketOne(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitleInBasketOne));
    }
    private final List<WebElement> productTitleInBasketTwo = androidDriver.findElements(
            AppiumBy.androidUIAutomator(
                    "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/titleTV\")"));


    public WebElement getProductTitleInBasketTwo() {
        Collections.singletonList(wait.until(ExpectedConditions.visibilityOfAllElements(productTitleInBasketTwo)));
        WebElement titleInBasketTwo = productTitleInBasketTwo.get(1);
        return titleInBasketTwo;
    }

//    private WebElement productTitleInBasket = androidDriver.findElement(
//            AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/titleTV\")")
//    );

//    public WebElement getProductTitleInBasketOne() {
//        return productTitleInBasket;
//    }

}
