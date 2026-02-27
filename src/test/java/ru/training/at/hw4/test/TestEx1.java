package ru.training.at.hw4.test;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw4.data.TestData;
import ru.training.at.hw4.test.steps.LoginPageSteps;

public class TestEx1 extends BaseClass {

    @Test(priority = 1)
    public void testEx1(){
        //5	Assert that there are 4 items on the header section are displayed, and they have proper texts
        assertHeaderElementsDisplayed();
        assertHeaderElementsSize();
        //6	Assert that there are 4 images on the Index Page, and they
        // are displayed 4 images
        assertIcons();
        //7	Assert that there are 4 texts on the Index Page under icons
        //,and they have proper text
        assertTextList();
        //8	Assert that there is the iframe with “Frame Button” exist
        assertFrame();
        //9	Switch to the iframe and check that there is “Frame Button” in the iframe
        // The “Frame Button” exists
        asserFrameButton();
        //10	Switch to original window back	 	Driver has focus on the original window
        assertOriginalWindow();
        //11	Assert that there are 5 items in the Left Section are displayed,
        // and they have proper text “Home”, “Contact form”, “Service”, “Metals & Colors”, “Elements packs”
        assertLeftItemsDisplayed();
        assertLeftItemGetText();
        //12	Close Browser
        close();
    }

    public void assertHeaderElementsDisplayed(){
        LoginPageSteps.checkHeaderElementsDisplayed(loginPage);
    }
    public void assertHeaderElementsSize(){
        LoginPageSteps.checkHeaderElementsSize(loginPage,TestData.HEADER_ELEMENTS.size());
    }

    public void assertIcons(){
        LoginPageSteps.checkIcons(loginPage);
    }

    public void assertTextList(){
        LoginPageSteps.checkTextList(loginPage,TestData.TEXT_ELEMENTS);
    }

    public void assertFrame(){
        LoginPageSteps.checkFrame(loginPage);
    }

    public void asserFrameButton(){
        LoginPageSteps.checkFrameButton(webDriver,loginPage);
    }

    public void assertOriginalWindow(){
        LoginPageSteps.checkOriginalWindow(webDriver,loginPage);
    }

    public void assertLeftItemsDisplayed(){
        LoginPageSteps.checkLeftItemsDisplayed(loginPage);
    }
    public void assertLeftItemGetText(){
        LoginPageSteps.checkLeftItemsGetText(loginPage,TestData.ITEMLEFTS);
    }

    public void close(){
        LoginPageSteps.closeBrowser(webDriver);
    }
}
