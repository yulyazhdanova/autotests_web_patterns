package ru.training.at.hw4.test.steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import ru.training.at.hw4.pages.HomePage;
import ru.training.at.hw4.pages.LoginPage;

public class HomePageSteps {

    @Step("Check Homepage Title")
    public static void checkHomePageWithCorrectTitle(HomePage homePage, String expected){
        Assert.assertEquals(homePage.getTitle(),expected);
    }
    @Step("Login User")
    public static LoginPage loginUser(HomePage homePage){
        return homePage.login();
    }
}
