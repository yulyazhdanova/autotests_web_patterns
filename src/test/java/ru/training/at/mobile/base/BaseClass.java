package ru.training.at.mobile.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.training.at.mobile.pages.BasketPage;
import ru.training.at.mobile.pages.CatalogPage;
import ru.training.at.mobile.pages.ProductPage;
import ru.training.at.mobile.pages.TitlePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {

    protected AndroidDriver androidDriver;
    protected TitlePage titlePage;
    protected CatalogPage catalogPage;
    protected ProductPage productPage;
    protected BasketPage basketPage;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");
        options.setAppPackage("com.saucelabs.mydemoapp.android");
        options.setAppActivity("com.saucelabs.mydemoapp.android.view.activities.MainActivity");
        options.setAppWaitActivity("*");
        options.setNoReset(true);
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        titlePage = new TitlePage(androidDriver);
        catalogPage = new CatalogPage(androidDriver);
        productPage = new ProductPage(androidDriver);
        basketPage = new BasketPage(androidDriver);
    }
//    @AfterMethod
//    public void tearDown(){
//        if(androidDriver!=null){
//            androidDriver.quit();
//        }
//    }
}
