package ru.training.at.mobile.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TitlePage extends AbstractPage {

    private final WebDriverWait wait;

    public TitlePage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.wait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
    }

    private final By basketOfProducts =
            AppiumBy.id(
                    "com.saucelabs.mydemoapp.android:id/cartIV"
            );

    public void getBasketOfProducts() {
        wait.until(ExpectedConditions.elementToBeClickable(basketOfProducts)).click();
    }

    private final By sortingBotton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/sortIV"
            );

    public void getSortingBotton() {
        wait.until(ExpectedConditions.elementToBeClickable(sortingBotton)).click();
    }

    private final By priceSorting =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/priceAscCL\")"
            );

    public void getPriceSorting() {
        wait.until(ExpectedConditions.elementToBeClickable(priceSorting)).click();
    }
    private final By menuBotton =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/menuIV\")"
            );
    public void getMenuBotton() {
        wait.until(ExpectedConditions.elementToBeClickable(menuBotton)).click();
    }
    private final By catalogBotton =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Catalog\"]"
            );
    public void getCatalogBotton() {
        wait.until(ExpectedConditions.elementToBeClickable(catalogBotton)).click();
    }

//    private final By counterOfCarts =
//            AppiumBy.id(
//                    "om.saucelabs.mydemoapp.android:id/cartTV"
//            );

//    public WebElement getCounterOfCarts(){
//        return wait.until(ExpectedConditions.presenceOfElementLocated(counterOfCarts));
//    }
}
