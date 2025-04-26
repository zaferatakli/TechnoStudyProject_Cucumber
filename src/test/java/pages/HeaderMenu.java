package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.GWD;

import static org.openqa.selenium.support.ui.ExpectedConditions.and;

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

    public void clickToLogoCheckHomePage() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(logo));
        and(ExpectedConditions.elementToBeClickable(logo));
        Assert.assertTrue(logo.isDisplayed());
        logo.click();
        GWD.getWait().until(ExpectedConditions.visibilityOf(logo));
        and(ExpectedConditions.elementToBeClickable(logo));
        Assert.assertTrue(logo.isDisplayed());
    }
    public void clickToBlogsLink() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(blogsLink));
        blogsLink.click();
    }
}
