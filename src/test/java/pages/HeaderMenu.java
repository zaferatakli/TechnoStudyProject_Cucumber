package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.GWD;

import static org.openqa.selenium.support.ui.ExpectedConditions.and;

public class HeaderMenu extends ReusableMethods {
    public Actions action;

    public HeaderMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
        this.action = new Actions(GWD.getDriver());
    }

    @FindBy(xpath = "//*[@class='t228__imglogo ']")
    public WebElement logo;

    @FindBy(xpath = "//li//a[@class='t-menu__link-item t966__tm-link']")
    public WebElement programs;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Software Development Engineer in Test']")
    public WebElement sdetLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Data Science Bootcamp']")
    public WebElement dataScienceLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Artificial Intelligence']")
    public WebElement artificialIntelligenceLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Android Developer Bootcamp']")
    public WebElement androidDeveloperLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[contains(text(), 'Master')]")
    public WebElement mastersProgramLink;

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='About Us']")
    public WebElement aboutUsLink;

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Work With Us']")
    public WebElement workWithUsLink;

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Blogs']")
    public WebElement blogsLink;

    @FindBy(xpath = "//a[text()='SIGN IN']")
    public WebElement signInButton;

    @FindBy(xpath = "//img")
    public WebElement campusPageLogo;

    public void clickToLogoCheckHomePage() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(logo));
        and(ExpectedConditions.elementToBeClickable(logo));
        Assert.assertTrue(logo.isDisplayed());
        myClick(logo);
        GWD.getWait().until(ExpectedConditions.visibilityOf(logo));
        and(ExpectedConditions.elementToBeClickable(logo));
        Assert.assertTrue(logo.isDisplayed());
    }

    public void clickToBlogsLink() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(blogsLink));
        myClick(blogsLink);
    }
}
