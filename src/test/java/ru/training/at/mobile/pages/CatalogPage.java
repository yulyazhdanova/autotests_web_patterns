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

public class CatalogPage extends AbstractPage {

    private WebDriverWait wait;

    public CatalogPage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));
    }

    private final By products =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/productIV");

    private List<WebElement> listOfProducts = androidDriver.findElements(
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/productTV")
    );

    public void getFirstProduct() {
        List<WebElement> productsList = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(products)
        );
        WebElement firstProduct = productsList.get(0);
        wait.until(
                ExpectedConditions.elementToBeClickable(firstProduct)
        ).click();
    }

    public void getSecondProduct() {
        List<WebElement> productsList = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(products)
        );
        WebElement secondProduct = productsList.get(2);
        wait.until(
                ExpectedConditions.elementToBeClickable(secondProduct)
        ).click();
    }

    public List<WebElement> getListOfProducts() {
        return listOfProducts;
    }

    private final List <WebElement> listOfPrices1 = androidDriver.findElements(
            AppiumBy.androidUIAutomator(
            "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/priceTV\")"
            ));

    public WebElement getPriceOne() {
        Collections.singletonList(wait.until(ExpectedConditions.visibilityOfAllElements(listOfPrices1)));
        WebElement firstPrice = listOfPrices1.get(1);
        return firstPrice;
    }
    public WebElement getPriceTwo() {
        Collections.singletonList(wait.until(ExpectedConditions.visibilityOfAllElements(listOfPrices1)));
        WebElement secondPrice = listOfPrices1.get(2);
        return secondPrice;
    }

}
