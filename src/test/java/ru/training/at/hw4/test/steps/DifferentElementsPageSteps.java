package ru.training.at.hw4.test.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.training.at.hw4.pages.DifferentElementsPage;
import ru.training.at.hw4.pages.LoginPage;

import java.util.List;


public class DifferentElementsPageSteps {

    @Step("Check Different Elements Page")
    public static void checkDifferentElementsPage(WebDriver webDriver, LoginPage loginPage, String expected) {
        loginPage.getServiceButton().click();
        loginPage.getDifferentElementsPage().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), expected);
    }

    @Step("Check Water")
    public static void checkWater(DifferentElementsPage differentElementsPage) {
        differentElementsPage.getWater().click();
        Assert.assertTrue(differentElementsPage.getWater().isSelected());
    }

    @Step("Check Wind")
    public static void checkWind(DifferentElementsPage differentElementsPage) {
        differentElementsPage.getWind().click();
        Assert.assertTrue(differentElementsPage.getWind().isSelected());
    }

    @Step("Check Radio")
    public static void checkRadio(DifferentElementsPage differentElementsPage) {
        differentElementsPage.getRadio().click();
        Assert.assertTrue(differentElementsPage.getRadio().isSelected());
    }

    @Step("Check Drop List")
    public static void checkDropList(DifferentElementsPage differentElementsPage, String expected) {
        differentElementsPage.getDropYellow().click();
        Assert.assertEquals(differentElementsPage.getDropYellow().getText(), expected);
    }
    @Step("Check Log Items Displayed")
    public static void checkLogItemsDisplayed(DifferentElementsPage differentElementsPage){
        for (int i = 0; i < differentElementsPage.getLogItems().size(); i++){
            Assert.assertTrue(differentElementsPage.getLogItems().get(i).isDisplayed());
        }
    }

    @Step("Check Log Items Text")
    public static void checkLogItems(DifferentElementsPage differentElementsPage, List<String> expected) {
        for (int i = 0; i < differentElementsPage.getLogItems().size(); i++) {
            Assert.assertEquals(differentElementsPage
                    .getLogItems()
                    .get(i)
                    .getText()
                    .substring(differentElementsPage.getLogItems().get(i).getText().lastIndexOf(':'))
                    .replaceAll("[^a-zA-Z ]", "").trim(), expected.get(i));
        }
    }

    @Step("Close Browser")
    public static void closeBrowser(WebDriver webDriver) {
        webDriver.close();
    }
}
