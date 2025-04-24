package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class DialogContent extends ParentPage {
    public Actions action;

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        this.action = new Actions(GWD.getDriver());
    }

    /// TC_501_Elements
    @FindBy(xpath = "//h1[text()='SOFTWARE DEVELOPMENT']")
    public WebElement softwareHomepage; //software ana sayfasındaki yazı

    @FindBy(xpath = "//h1[text()='Data Science Bootcamp']")
    public WebElement dataScienceHomepage; //dataScience ana sayfasındaki yazı

    @FindBy(xpath = "//h1[contains(text(),'Artificial Intelligence')]")
    public WebElement artificialHomepage; //artificialIntelligence ana sayfasındaki yazı

    @FindBy(xpath = "//div[@data-elem-type='text']//h1")
    public WebElement androidDevHomepage; //AndroidDeveloper ana sayfasındaki yazı

    @FindBy(xpath = "//h1[@class='tn-atom']/strong")
    public WebElement masterHomepage; //masterDegree ana sayfasındaki yazı

    /// TC_503_Elements
    @FindBy(xpath = "//div[@class='t972__actions']//button[@data-buttonfieldset='button']")
    public WebElement acceptCookiesButton;
    ///accept cookies button
    ///
    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement applyNowButton; // Apply Now butonu

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput; //Full name kısmı

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput; //Email kısmı

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneInput; //Phone kısmı

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countrySelect; //Country seçim kısmı

    @FindBy(xpath = "//select[@name='course']")
    public WebElement courseSelect; //Course seçim kısmı

    @FindBy(xpath = "//select[@name='survey']")
    public WebElement hearAboutUsSelect; //How did you hear about us kısmı

    @FindBy(xpath = "//div[@class='t-checkbox__indicator']")
    public WebElement checkBox; //CheckBox onaylama kısmı

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement bookCallButton; //Book a call butonu

    @FindBy(xpath = "(//span[text()='Thank you for your pre-application! '])[2]")
    public WebElement thankYouMessage; //Teşekkür mesajı

    /// TC_506_Elements⭐⭐⭐
    @FindBy(xpath = "//span[@class='t585__title t-name t-name_xl']//a")
    public WebElement codingBootcampLink; ///coding bootcamps worth it link ana menu

    ///  footer menu locators⭐⭐
    /// TC_505_Elements
    @FindBy(className = "t-sociallinks")
    public WebElement socialLinkField;
    ///sosyal medya bölümü

    @FindBy(xpath = "//div[@class='t-sociallinks']//li")
    public List<WebElement> socialLinks; /// sosyal medya linkleri

    /// TC_506_Elements⭐⭐⭐
    @FindBy(xpath = "//li//a[text()='Terms of Use']")
    public WebElement termsOfUseLink;
    ///footer menu terms of use

    @FindBy(xpath = "//li//a[text()='Privacy Policy']")
    public WebElement privacyPolicyLink;
    ///footer menu privacy policy

    @FindBy(xpath = "//li//a[text()='Cookies Policy']")
    public WebElement cookiesPolicyLink;
    ///footer menu cookies policy

    @FindBy(xpath = "//*[@class='t-feed__col-grid__post-wrapper']")
    public List<WebElement> blogsList;

    /// bloglarin listesi ->  blogs sayfasinda
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
