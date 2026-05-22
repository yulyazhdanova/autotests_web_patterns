package ru.training.at.hw3_for_selenium_grid.pages;

import org.openqa.selenium.JavascriptExecutor;
import ru.training.at.hw3_for_selenium_grid.data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends AbstractPage {

    @FindBy(id = "user-icon")
    private WebElement userIcon;

    @FindBy(id = "name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "user-name")
    private WebElement userNameLogin;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage openHomePage() {
        webDriver.get(TestData.URL);
        return this;
    }

    public LoginPage login() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(userIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(TestData.LOGIN);
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(TestData.PASSWORD);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        return new LoginPage(webDriver);
    }

    public WebElement getUserNameLogin() {
        return userNameLogin;
    }
}