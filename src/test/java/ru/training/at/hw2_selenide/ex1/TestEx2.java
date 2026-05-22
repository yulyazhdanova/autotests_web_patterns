package ru.training.at.hw2_selenide.ex1;

import com.codeborne.selenide.Selenide;
import ru.training.at.hw2_selenide.BaseClass;
import ru.training.at.hw2_selenide.data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.selector.ByShadowCss.cssSelector;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.xpath;

public class TestEx2 extends BaseClass {

    @Test
    public void testEx2(){
        //5	Open through the header menu Service -> Different Elements Page
        $(className("dropdown-toggle")).click();
        //WebElement differentElementsPage = webDriver.findElement(By.xpath("//li/a[text() = 'Different elements']"));
        $(cssSelector("ul.dropdown-menu li:nth-child(8) a")).click();
        Assert.assertEquals(url(), TestData.DIFFURL);
        //6	Select checkboxes Water Wind
        $(cssSelector("label:nth-child(1) input[type=checkbox]")).click();
        $(cssSelector("label:nth-child(1) input[type=checkbox]")).isSelected();
        $(cssSelector("label:nth-child(3) input[type=checkbox]")).click();
        $(cssSelector("label:nth-child(3) input[type=checkbox]")).isSelected();
        //WebElement water = webDriver.findElement(By.xpath("//input[@wfd-id = 'id5'][contains(text(),'Wind')]"));
        //7	Select radio Selen
        $(cssSelector("div:nth-child(3) > label:nth-child(4) > input[type=radio]")).click();
        $(cssSelector("div:nth-child(3) > label:nth-child(4) > input[type=radio]")).isSelected();
        //8	Select in dropdown Yellow
        $(xpath("//select[@class = 'uui-form-element']/option[text() = 'Yellow']")).click();
        $(xpath("//select[@class = 'uui-form-element']/option[text() = 'Yellow']")).shouldHave(text("Yellow"));
        // 9.Assert that
        //•	for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //•	for radio button there is a log row and value is corresponded to the status of radio button
        //•	for dropdown there is a log row and value is corresponded to the selected value.
        $$(cssSelector("div.info-panel-body.info-panel-body-log > div > ul")).filter(visible);
        //10	Close Browser
        //webDriver.close();
    }
}
