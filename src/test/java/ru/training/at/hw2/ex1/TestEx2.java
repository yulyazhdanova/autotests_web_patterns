package ru.training.at.hw2.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw2.BaseClass;
import ru.training.at.hw2.data.TestData;

import java.util.List;

public class TestEx2 extends BaseClass {

    @Test
    public void testEx2(){
        //5	Open through the header menu Service -> Different Elements Page
        WebElement serviceButton = webDriver.findElement(By.className("dropdown-toggle"));
        serviceButton.click();
        //WebElement differentElementsPage = webDriver.findElement(By.xpath("//li/a[text() = 'Different elements']"));
        WebElement differentElementsPage = webDriver.findElement(By.cssSelector("ul.dropdown-menu li:nth-child(8) a"));
        differentElementsPage.click();
        Assert.assertEquals(webDriver.getCurrentUrl(), TestData.DIFFURL);
        //6	Select checkboxes Water Wind
        WebElement water = webDriver.findElement(By.cssSelector("label:nth-child(1) input[type=checkbox]"));
        //WebElement water = webDriver.findElement(By.xpath("//input[@wfd-id = 'id5'][contains(text(),'Wind')]"));
        WebElement wind = webDriver.findElement(By.cssSelector("label:nth-child(3) input[type=checkbox]"));
        water.click();
        Assert.assertTrue(water.isSelected());
        wind.click();
        Assert.assertTrue(wind.isSelected());
        //7	Select radio Selen
        WebElement radio = webDriver.findElement(By.cssSelector("div:nth-child(3) > label:nth-child(4) > input[type=radio]"));
        radio.click();
        Assert.assertTrue(radio.isSelected());
        //8	Select in dropdown Yellow
        WebElement dropYellow = webDriver.findElement(By.xpath("//select[@class = 'uui-form-element']/option[text() = 'Yellow']"));
        dropYellow.click();
        Assert.assertEquals(dropYellow.getText(),"Yellow");
        // 9.Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //•	for radio button there is a log row and value is corresponded to the status of radio button
        //•	for dropdown there is a log row and value is corresponded to the selected value.
        List<WebElement> logItems = webDriver.findElements(By.cssSelector("div.info-panel-body.info-panel-body-log > div > ul"));
        //10	Close Browser
        //webDriver.close();


    }

}
