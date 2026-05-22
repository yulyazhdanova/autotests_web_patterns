package ru.training.at.cucumber_gherkin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DifferentElementsPage extends AbstractPage {


    @FindBy(className = "dropdown-toggle")
    private WebElement serviceButton;

    @FindBy(css = "ul.dropdown-menu li:nth-child(8) a")
    private WebElement differentElementsPage;

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

    public WebElement getServiceButton() {
        return serviceButton;
    }

    public WebElement getDifferentElementsPage() {
        return differentElementsPage;
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

    public WebElement getDropYellow() {
        return dropYellow;
    }

    public List<WebElement> getLogItems() {
        return logItems;
    }

}
