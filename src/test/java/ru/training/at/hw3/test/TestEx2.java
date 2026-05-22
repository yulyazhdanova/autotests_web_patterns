package ru.training.at.hw3.test;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw3.BaseClass;
import ru.training.at.hw3.data.TestData;
import ru.training.at.hw3.pages.LoginPage;
import ru.training.at.hw4.pages.DifferentElementsPage;
import ru.training.at.hw4.test.steps.DifferentElementsPageSteps;

import java.util.List;

public class TestEx2 extends BaseClass {

    @Test(priority = 2)
    public void testEx2(){
        //5	Open through the header menu Service -> Different Elements Page
        assertDifferentElementsPage();
        //6	Select checkboxes Water Wind
        assertWater();
        assertWind();
        //7	Select radio Selen
        asserRadio();
        //8	Select in dropdown Yellow
        assertDropList();
        //9 Assert log row
        assertLogIsDisplayed();
        assertLogList();
        //10	Close Browser
        //close();
    }

    public void assertDifferentElementsPage(){
        loginPage.getServiceButton().click();
        loginPage.getDifferentElementsPage().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),TestData.DIFFURL);
    }

    public void assertWater(){
        loginPage.getWater().click();
        Assert.assertTrue(loginPage.getWater().isSelected());
    }
    public void assertWind(){
        loginPage.getWind().click();
        Assert.assertTrue(loginPage.getWind().isSelected());
    }

    public void asserRadio(){
        loginPage.getRadio().click();
        Assert.assertTrue(loginPage.getRadio().isSelected());
    }

    public void assertDropList(){
        loginPage.getDropYellow().click();
        Assert.assertEquals(loginPage.getDropYellow().getText(),TestData.DROP);
    }
    public void assertLogIsDisplayed(){
        loginPage.getLogItems();
        for (int i = 0; i < loginPage.getLogItems().size(); i++){
            Assert.assertTrue(loginPage.getLogItems().get(i).isDisplayed());
        }
    }
    public void assertLogList(){
        for (int i = 0; i < loginPage.getLogItems().size(); i++) {
            Assert.assertEquals(loginPage
                    .getLogItems()
                    .get(i)
                    .getText()
                    .substring(loginPage.getLogItems().get(i).getText().lastIndexOf(':'))
                    .replaceAll("[^a-zA-Z ]", "").trim(), TestData.LOGITEMS.get(i));
        }
    }

    public void close(){
        webDriver.close();
    }
}
