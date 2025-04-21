package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class HeaderMenu extends ParentPage{

    public HeaderMenu() {
        PageFactory.initElements(GWD.getDriver(), this);
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
    public WebElement aboutUsLink; ///ana menu about us

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Work With Us']")
    public WebElement workWithUsLink; ///ana menu work with us

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Blogs']")
    public WebElement blogsLink; ///ana menu blogs













    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "logo":
                return this.logo;
            case "programs":
                return this.programs;
            case "sdetLink":
                return this.sdetLink;
            case "dataScienceLink":
                return this.dataScienceLink;
            case "artificialIntelligenceLink":
                return this.artificialIntelligenceLink;
            case "androidDeveloperLink":
                return this.androidDeveloperLink;
            case "mastersProgramLink":
                return this.mastersProgramLink;
            case "aboutUsLink":
                return this.aboutUsLink;
            case "workWithUsLink":
                return this.workWithUsLink;
            case "blogsLink":
                return this.blogsLink;
        }
        return null;
    }
}
