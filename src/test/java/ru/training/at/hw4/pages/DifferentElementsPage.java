package ru.training.at.hw4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DifferentElementsPage extends AbstractPage {

    @FindBy(css = "label:nth-child(1) input[type=checkbox]")
    private WebElement water;

    @FindBy(css = "label:nth-child(3) input[type=checkbox]")
    private WebElement wind;

    @FindBy(css = "div:nth-child(3) > label:nth-child(4) > input[type=radio]")
    private WebElement radio;

    @FindBy(xpath = "//select[@class = 'uui-form-element']/option[text() = 'Yellow']")
    private WebElement dropYellow;

    @FindBy(css = ".logs > li")
    private List<WebElement> logItems;

    public DifferentElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getWater() {
        return water;
    }

    public WebElement getWind() {
        return wind;
    }

    public WebElement getRadio() {
        return radio;
    }

    public List<WebElement> getLogItems() {
        return logItems;
    }

    public WebElement getDropYellow() {
        return dropYellow;
    }

}
