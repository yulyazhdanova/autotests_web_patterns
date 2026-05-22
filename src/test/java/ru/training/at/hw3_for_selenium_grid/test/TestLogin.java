package ru.training.at.hw3_for_selenium_grid.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw3_for_selenium_grid.pages.HomePage;
import ru.training.at.hw3_for_selenium_grid.projectUtils.BeforeClass;
import ru.training.at.hw3_for_selenium_grid.projectUtils.DriverManager;

public class TestLogin {
    @Test
    public void loginSmokeTest() {
        DriverManager.setDriver(BeforeClass.createWebDriver());
        WebDriver driver = DriverManager.getDriver();

        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.login();

        Assert.assertTrue(homePage.getUserNameLogin().isDisplayed());

        DriverManager.quitDriver();
    }
}
