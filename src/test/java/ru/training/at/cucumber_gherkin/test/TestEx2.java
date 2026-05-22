package ru.training.at.cucumber_gherkin.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.cucumber_gherkin.BaseClass;
import ru.training.at.cucumber_gherkin.data.TestData;

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
        differentElementsPage.getServiceButton().click();
        differentElementsPage.getDifferentElementsPage().click();
        Assert.assertEquals(webDriver.getCurrentUrl(), TestData.DIFFURL);
    }

    public void assertWater(){
        differentElementsPage.getWater().click();
        Assert.assertTrue(differentElementsPage.getWater().isSelected());
    }
    public void assertWind(){
        differentElementsPage.getWind().click();
        Assert.assertTrue(differentElementsPage.getWind().isSelected());
    }

    public void asserRadio(){
        differentElementsPage.getRadio().click();
        Assert.assertTrue(differentElementsPage.getRadio().isSelected());
    }

    public void assertDropList(){
        differentElementsPage.getDropYellow().click();
        Assert.assertEquals(differentElementsPage.getDropYellow().getText(), TestData.DROP);
    }

    public void assertLogIsDisplayed(){
        differentElementsPage.getLogItems();
        for (int i = 0; i < differentElementsPage.getLogItems().size(); i++){
            Assert.assertTrue(differentElementsPage.getLogItems().get(i).isDisplayed());
        }
    }
    public void assertLogList(){
        for (int i = 0; i < differentElementsPage.getLogItems().size(); i++) {
            Assert.assertEquals(differentElementsPage
                    .getLogItems()
                    .get(i)
                    .getText()
                    .substring(differentElementsPage.getLogItems().get(i).getText().lastIndexOf(':'))
                    .replaceAll("[^a-zA-Z ]", "").trim(), TestData.LOGITEMS.get(i));
        }
    }

    public void close(){
        webDriver.close();
    }
}
