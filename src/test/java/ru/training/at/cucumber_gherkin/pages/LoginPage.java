package ru.training.at.cucumber_gherkin.pages;

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

}
