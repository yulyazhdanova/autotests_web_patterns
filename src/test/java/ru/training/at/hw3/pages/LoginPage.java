package ru.training.at.hw3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends AbstractPage {
    @FindBy(css = ".nav > li > a")
    private List<WebElement> headerElements;

    @FindBy(css = "div.benefit-icon")
    private List<WebElement> iconList;

    @FindBy(id = "benefit-txt")
    private List <WebElement> textList;

    @FindBy(xpath = "//iframe[@id='frame']")
    private WebElement iframe;

    @FindBy(id = "frame-button")
    private WebElement iframeButton;

    @FindBy(css = "ul.sidebar-menu.left>li>a>span")
    private List <WebElement> leftItems;

    @FindBy(className = "dropdown-toggle")
    private WebElement serviceButton;

    @FindBy(css = "ul.dropdown-menu li:nth-child(8) a")
    private WebElement differentElementsPage;

    @FindBy(css = "label:nth-child(1) input[type=checkbox]")
    private WebElement water;

    @FindBy(css = "label:nth-child(3) input[type=checkbox]")
    private WebElement wind;

    @FindBy(xpath = "//label[@class = 'label-radio']/input[@wfd-id = 'id10']")
    private WebElement radio;

    @FindBy(xpath = "//select[@class = 'uui-form-element']/option[text() = 'Yellow']")
    private WebElement dropYellow;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public List<WebElement> getHeaderElements() {
        return headerElements;
    }

    public List<WebElement> getIconList() {
        return iconList;
    }

    public List<WebElement> getTextList() {
        return textList;
    }

    public WebElement getIframe() {
        return iframe;
    }

    public WebElement getIframeButton() {
        return iframeButton;
    }

    public List<WebElement> getLeftItems() {
        return leftItems;
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
}
