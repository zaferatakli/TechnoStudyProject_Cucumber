package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.GWD;

public class HeaderMenu extends ParentPage {
    public Actions action;

    public HeaderMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
        this.action = new Actions(GWD.getDriver());
    }

    /// TC_506_Elements⭐⭐⭐
    /// logo to home page locators⭐⭐
    @FindBy(xpath = "//*[@class='t228__imglogo ']")
    public WebElement logo; ///logo

    /// header menu locators⭐⭐
    @FindBy(xpath = "//li//a[@class='t-menu__link-item t966__tm-link']")
    public WebElement programs;
    ///ana menu programs

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Software Development Engineer in Test']")
    public WebElement sdetLink;
    ///sdet link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Data Science Bootcamp']")
    public WebElement dataScienceLink;
    ///data science link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Artificial Intelligence']")
    public WebElement artificialIntelligenceLink;
    ///artificial intelligence link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Android Developer Bootcamp']")
    public WebElement androidDeveloperLink;
    ///android developer link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[contains(text(), 'Master')]")
    public WebElement mastersProgramLink;
    ///master's Program link programs alt menu

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='About Us']")
    public WebElement aboutUsLink;
    ///ana menu about us

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Work With Us']")
    public WebElement workWithUsLink;
    ///ana menu work with us

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Blogs']")
    public WebElement blogsLink;

    /// TC_502_Elements
    @FindBy(xpath = "//a[text()='SIGN IN']")
    public WebElement signInButton;

    @FindBy(xpath = "//img")
    public WebElement campusPageLogo;

    public void clickMenuItemAndReturn(WebElement menuItem, String getExpectedUrl) {
        GWD.getWait().until(ExpectedConditions.visibilityOf(menuItem));
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(menuItem));

        String currentUrl = GWD.getDriver().getCurrentUrl();

        if (!currentUrl.equals(getExpectedUrl)) {
            ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", menuItem);
            ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].removeAttribute('target')", menuItem);
            ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", menuItem);

            GWD.getWait().until(ExpectedConditions.urlToBe(getExpectedUrl));
            Assert.assertEquals(GWD.getDriver().getCurrentUrl(), getExpectedUrl, "URL is not as expected after clicking the menu item");
        }

        GWD.getWait().until(ExpectedConditions.visibilityOf(logo));
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(logo));

//        GWD.getWait().until(ExpectedConditions.visibilityOf(menuItem));
//        GWD.getWait().until(ExpectedConditions.elementToBeClickable(menuItem));
//        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", menuItem);
//        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].removeAttribute('target')", menuItem);
//        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", menuItem);
//
//        GWD.getWait().until(ExpectedConditions.urlToBe(GWD.getDriver().getCurrentUrl()));
//
//        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), getExpectedUrl, "URL is not as expected after clicking the menu item");
//
//        GWD.getWait().until(ExpectedConditions.visibilityOf(logo));
//        GWD.getWait().until(ExpectedConditions.elementToBeClickable(logo));
    }
}
