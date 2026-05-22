package ru.training.at.hw2_selenide.ex1;


import ru.training.at.hw2_selenide.BaseClass;
import ru.training.at.hw2_selenide.data.TestData;
import org.testng.annotations.Test;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.className;

public class TestEx1 extends BaseClass {

    @Test
    public void testEx1(){
        //5	Assert that there are 4 items on the header section are displayed,
        // and they have proper texts
        // "HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"
        $(xpath("//a[text()='Home']")).shouldHave(text(TestData.ITEM1));
        $(xpath("//a[text()='Contact form']")).shouldHave(text(TestData.ITEM2));
        $(className("dropdown-toggle")).shouldHave(text(TestData.ITEM3));
        $(xpath("//a[text()='Metals & Colors']")).shouldHave(text(TestData.ITEM4));
        //6	Assert that there are 4 images on the Index Page, and they
        // are displayed 4 images;
        $$(cssSelector("div.benefit-icon")).shouldHave(size(4));
        $$(cssSelector("div.benefit-icon")).filter(visible);
        //7	Assert that there are 4 texts on the Index Page under icons
        //,and they have proper text
        // 4 texts below of each image
        // Texts are displayed and equal to expected
        $$(className("benefit-txt")).get(0).shouldHave(text(TestData.TEXT1));
        $$(className("benefit-txt")).get(1).shouldHave(text(TestData.TEXT2));
        $$(className("benefit-txt")).get(2).shouldHave(text(TestData.TEXT3));
        $$(className("benefit-txt")).get(3).shouldHave(text(TestData.TEXT4));
        $$(className("benefit-txt")).filter(visible);
        //8	Assert that there is the iframe with “Frame Button” exist
        $(xpath("//iframe[@id='frame']")).isDisplayed();
        //9	Switch to the iframe and check that there is “Frame Button” in the iframe
        // The “Frame Button” exists
        switchTo().frame($(xpath("//iframe[@id='frame']")));
        $(id("frame-button")).isDisplayed();
        //10	Switch to original window back	 	Driver has focus on the original window
        switchTo().defaultContent();
        //11	Assert that there are 5 items in the Left Section are displayed,
        // and they have proper text “Home”, “Contact form”, “Service”, “Metals & Colors”, “Elements packs”
        // Left section menu items are displayed and have proper text
        $$(cssSelector("ul.sidebar-menu.left>li>a>span")).filter(visible);
        $$(cssSelector("ul.sidebar-menu.left>li>a>span")).get(0).shouldHave(text(TestData.ITEMLEFT1));
        $$(cssSelector("ul.sidebar-menu.left>li>a>span")).get(1).shouldHave(text(TestData.ITEMLEFT2));
        $$(cssSelector("ul.sidebar-menu.left>li>a>span")).get(2).shouldHave(text(TestData.ITEMLEFT3));
        $$(cssSelector("ul.sidebar-menu.left>li>a>span")).get(3).shouldHave(text(TestData.ITEMLEFT4));
        //12	Close Browser
        //webDriver.close();
    }
}
