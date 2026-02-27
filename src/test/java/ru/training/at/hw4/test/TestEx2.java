package ru.training.at.hw4.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw4.data.TestData;
import ru.training.at.hw4.pages.DifferentElementsPage;
import ru.training.at.hw4.test.steps.DifferentElementsPageSteps;

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
        close();
    }

    public void assertDifferentElementsPage(){
        DifferentElementsPageSteps.checkDifferentElementsPage(webDriver,loginPage, TestData.DIFFURL);
    }

    public void assertWater(){
        DifferentElementsPageSteps.checkWater(differentElementsPage);
    }
    public void assertWind(){
        DifferentElementsPageSteps.checkWind(differentElementsPage);
    }

    public void asserRadio(){
        DifferentElementsPageSteps.checkRadio(differentElementsPage);
    }

    public void assertDropList(){
        DifferentElementsPageSteps.checkDropList(differentElementsPage, TestData.DROP);
    }

    public void assertLogIsDisplayed(){
        DifferentElementsPageSteps.checkLogItemsDisplayed(differentElementsPage);
    }

    public void assertLogList(){DifferentElementsPageSteps.checkLogItems(differentElementsPage,TestData.LOGITEMS);};

    public void close(){
        DifferentElementsPageSteps.closeBrowser(webDriver);
    }
}
