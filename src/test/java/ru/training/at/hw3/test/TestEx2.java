package ru.training.at.hw3.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw3.BaseClass;
import ru.training.at.hw3.data.TestData;

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

    public void close(){
        webDriver.close();
    }
}
