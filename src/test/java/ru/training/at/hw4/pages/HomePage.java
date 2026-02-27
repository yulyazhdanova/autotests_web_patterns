package ru.training.at.hw4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.training.at.hw4.data.TestData;

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

    public HomePage openHomePage(){
        webDriver.get(TestData.URL);
        return this;
    }

    public LoginPage login(){
        this.userIcon.click();
        this.password.sendKeys(TestData.PASSWORD);
        this.userName.sendKeys(TestData.LOGIN);
        this.loginButton.click();
        return new LoginPage(webDriver);
    }

    public WebElement getUserNameLogin() {
        return userNameLogin;
    }

}
