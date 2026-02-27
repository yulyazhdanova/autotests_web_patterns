package ru.training.at.hw3.test;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw3.BaseClass;
import ru.training.at.hw3.data.TestData;

public class TestEx1 extends BaseClass {

    @Test(priority = 1)
    public void testEx1(){
        //5	Assert that there are 4 items on the header section are displayed, and they have proper texts
        assertHeaderElements();
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
        assertOriginalWidow();
        //11	Assert that there are 5 items in the Left Section are displayed,
        // and they have proper text “Home”, “Contact form”, “Service”, “Metals & Colors”, “Elements packs”
        assertLeftItems();
        //12	Close Browser
        close();
    }


    public void assertHeaderElements(){
        for (WebElement we: loginPage.getHeaderElements()) {
            Assert.assertTrue(we.isDisplayed());
        }
        for(int i = 0; i<TestData.HEADER_ELEMENTS.size();i++){
            Assert.assertEquals(loginPage.getHeaderElements().get(i).getText(),TestData.HEADER_ELEMENTS.get(i));
        }
    }

    public void assertIcons(){
        for (WebElement we: loginPage.getIconList()){
            we.isDisplayed();
        }
    }

    public void assertTextList(){
        for(int i = 0;i<loginPage.getTextList().size();i++){
            Assert.assertEquals(loginPage.getTextList().get(i).getText(),TestData.TEXT_ELEMENTS.get(i));
        }
    }

    public void assertFrame(){
        Assert.assertTrue(loginPage.getIframe().isDisplayed());
    }

    public void asserFrameButton(){
        webDriver.switchTo().frame(loginPage.getIframe());
        Assert.assertTrue(loginPage.getIframeButton().isDisplayed());
    }

    public void assertOriginalWidow(){
        webDriver.switchTo().defaultContent();
        assertHeaderElements();
    }

    public void assertLeftItems(){
        for(WebElement we:loginPage.getLeftItems()){
            we.isDisplayed();
        }
        for (int i=0;i<loginPage.getLeftItems().size();i++){
            Assert.assertEquals(loginPage.getLeftItems().get(i).getText(),TestData.ITEMLEFTS.get(i));
        }
    }

    public void close(){
        webDriver.close();
    }
}
