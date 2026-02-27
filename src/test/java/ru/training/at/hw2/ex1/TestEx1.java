package ru.training.at.hw2.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.at.hw2.BaseClass;
import ru.training.at.hw2.data.TestData;

import java.util.List;

public class TestEx1 extends BaseClass {

    @Test
    public void testEx1(){
        //5	Assert that there are 4 items on the header section are displayed,
        // and they have proper texts
        // "HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"
        WebElement icon1 = webDriver.findElement(By.xpath("//a[text()='Home']"));
        WebElement icon2 = webDriver.findElement(By.xpath("//a[text()='Contact form']"));
        WebElement icon3 = webDriver.findElement(By.className("dropdown-toggle"));
        WebElement icon4 = webDriver.findElement(By.xpath("//a[text()='Metals & Colors']"));
        Assert.assertEquals(icon1.getText(),TestData.ITEM1);
        Assert.assertEquals(icon2.getText(),TestData.ITEM2);
        Assert.assertEquals(icon3.getText(),TestData.ITEM3);
        Assert.assertEquals(icon4.getText(),TestData.ITEM4);
        //6	Assert that there are 4 images on the Index Page, and they
        // are displayed 4 images
        List<WebElement> iconList = webDriver.findElements(By.cssSelector("div.benefit-icon"));
        Assert.assertEquals(iconList.size(),4);
        for(WebElement we:iconList){
            we.isDisplayed();
        }
        //7	Assert that there are 4 texts on the Index Page under icons
        //,and they have proper text
        // 4 texts below of each image
        // Texts are displayed and equal to expected
        List <WebElement> textList = webDriver.findElements(By.className("benefit-txt"));
        for(WebElement tl:textList){
            tl.isDisplayed();
        }
        Assert.assertEquals(textList.get(0).getText(),TestData.TEXT1);
        Assert.assertEquals(textList.get(1).getText(),TestData.TEXT2);
        Assert.assertEquals(textList.get(2).getText(),TestData.TEXT3);
        Assert.assertEquals(textList.get(3).getText(),TestData.TEXT4);
        //8	Assert that there is the iframe with “Frame Button” exist
        WebElement iframe = webDriver.findElement(By.xpath("//iframe[@id='frame']"));
        Assert.assertTrue(iframe.isDisplayed());
        //9	Switch to the iframe and check that there is “Frame Button” in the iframe
        // The “Frame Button” exists
        webDriver.switchTo().frame("frame");
        WebElement iframeButton = webDriver.findElement(By.id("frame-button"));
        Assert.assertTrue(iframeButton.isDisplayed());
        //10	Switch to original window back	 	Driver has focus on the original window
        webDriver.switchTo().defaultContent();
        //11	Assert that there are 5 items in the Left Section are displayed,
        // and they have proper text “Home”, “Contact form”, “Service”, “Metals & Colors”, “Elements packs”
        // Left section menu items are displayed and have proper text
        List <WebElement> leftItems = webDriver.findElements(By.cssSelector("ul.sidebar-menu.left>li>a>span"));
        for(WebElement we:leftItems){
            Assert.assertTrue(we.isDisplayed());
        }
        Assert.assertEquals(leftItems.get(0).getText(),TestData.ITEMLEFT1);
        Assert.assertEquals(leftItems.get(1).getText(),TestData.ITEMLEFT2);
        Assert.assertEquals(leftItems.get(2).getText(),TestData.ITEMLEFT3);
        Assert.assertEquals(leftItems.get(3).getText(),TestData.ITEMLEFT4);
        Assert.assertEquals(leftItems.get(4).getText(),TestData.ITEMLEFT5);
        //12	Close Browser
        //webDriver.close();
    }
}
