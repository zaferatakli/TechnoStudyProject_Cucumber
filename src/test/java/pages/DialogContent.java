package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class DialogContent extends ReusableMethods {
    public Actions action;

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        this.action = new Actions(GWD.getDriver());
    }

    @FindBy(xpath = "//h1[text()='SOFTWARE DEVELOPMENT']")
    public WebElement softwareHomepage;

    @FindBy(xpath = "//h1[text()='Data Science Bootcamp']")
    public WebElement dataScienceHomepage;

    @FindBy(xpath = "//h1[contains(text(),'Artificial Intelligence')]")
    public WebElement artificialHomepage;

    @FindBy(xpath = "//div[@data-elem-type='text']//h1")
    public WebElement androidDevHomepage;

    @FindBy(xpath = "//h1[@class='tn-atom']/strong")
    public WebElement masterHomepage;

    @FindBy(xpath = "//div[@class='t972__actions']//button[@data-buttonfieldset='button']")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneInput;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countrySelect;

    @FindBy(xpath = "//select[@name='course']")
    public WebElement courseSelect;

    @FindBy(xpath = "//select[@name='survey']")
    public WebElement hearAboutUsSelect;

    @FindBy(xpath = "//div[@class='t-checkbox__indicator']")
    public WebElement checkBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement bookCallButton;

    @FindBy(xpath = "(//span[text()='Thank you for your pre-application! '])[2]")
    public WebElement thankYouMessage;

    @FindBy(xpath = "//span[@class='t585__title t-name t-name_xl']//a")
    public WebElement codingBootcampLink;

    @FindBy(className = "t-sociallinks")
    public WebElement socialLinkField;

    @FindBy(xpath = "//div[@class='t-sociallinks']//li")
    public List<WebElement> socialLinks;

    @FindBy(xpath = "//li//a[text()='Terms of Use']")
    public WebElement termsOfUseLink;

    @FindBy(xpath = "//li//a[text()='Privacy Policy']")
    public WebElement privacyPolicyLink;

    @FindBy(xpath = "//li//a[text()='Cookies Policy']")
    public WebElement cookiesPolicyLink;

    @FindBy(xpath = "//*[@class='t-feed__col-grid__post-wrapper']")
    public List<WebElement> blogsList;

    @FindBy(xpath = "//strong[text()='Terms of Use']")
    public WebElement termsOfUsePageTitle;

    @FindBy(xpath = "(//a[text()='Terms of Use'])[1]")
    public WebElement termsOfUseForm;

    public List<WebElement> getWebElementList(String strElement) {
        switch (strElement) {
            case "blogsList":
                return this.blogsList;
            case "socialLinks":
                return this.socialLinks;
        }
        return null;
    }
}