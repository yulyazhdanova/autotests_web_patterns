package ru.training.at.hw4.test.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.training.at.hw4.pages.HomePage;
import ru.training.at.hw4.pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class LoginPageSteps {

    @Step("Check Username")
    public static void checkUserName(HomePage homePage, String expected){
        Assert.assertEquals(homePage.getUserNameLogin().getText(), expected);
    }
    @Step("Check Header Elements Displayed")
    public static void checkHeaderElementsDisplayed(LoginPage loginPage){
        for (WebElement we: loginPage.getHeaderElements()) {
            Assert.assertTrue(we.isDisplayed());
        }
    }
    @Step("Check Header Elements Size")
    public static void checkHeaderElementsSize(LoginPage loginPage,int size){
        for(int i = 0; i<size; i++){
            Assert.assertEquals(loginPage.getHeaderElements().size(), size);
        }
    }
    @Step("Check Icons")
    public static void checkIcons(LoginPage loginPage){
        for (WebElement we: loginPage.getIconList()){
            we.isDisplayed();
        }
    }
    @Step("Check Text List")
    public static void checkTextList(LoginPage loginPage, List<String> expected){
        for(int i = 0;i<loginPage.getTextList().size();i++){
            Assert.assertEquals(loginPage.getTextList().get(i).getText(), expected.get(i));
        }
    }
    @Step("Check Frame")
    public static void checkFrame(LoginPage loginPage){
        Assert.assertTrue(loginPage.getIframe().isDisplayed());
    }
    @Step("Check Frame Button")
    public static void checkFrameButton(WebDriver webDriver,LoginPage loginPage){
        webDriver.switchTo().frame(loginPage.getIframe());
        Assert.assertTrue(loginPage.getIframeButton().isDisplayed());
    }
    @Step("Check Original Window")
    public static void checkOriginalWindow(WebDriver webDriver,LoginPage loginPage){
        webDriver.switchTo().defaultContent();
        checkHeaderElementsSize(loginPage, new ArrayList<String>().size());
    }
    @Step("Check Left Items Displayed")
    public static void checkLeftItemsDisplayed(LoginPage loginPage){
        for(WebElement we:loginPage.getLeftItems()){
            we.isDisplayed();
        }
    }
    @Step("Check Left Items Get Text")
    public static void checkLeftItemsGetText(LoginPage loginPage, List<String> expected){
        for (int i=0;i<loginPage.getLeftItems().size();i++){
            Assert.assertEquals(loginPage.getLeftItems().get(i).getText(), expected.get(i));
        }
    }

    @Step("Close Browser")
    public static void closeBrowser(WebDriver webDriver){
        webDriver.close();
    }
}
