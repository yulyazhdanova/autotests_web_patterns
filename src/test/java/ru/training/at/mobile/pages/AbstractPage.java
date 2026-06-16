package ru.training.at.mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    protected AndroidDriver androidDriver;

    public AbstractPage(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;

    }
}
