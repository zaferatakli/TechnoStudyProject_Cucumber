package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    /// TC_503_Elements
    @FindBy(xpath = "//div[@class='t972__actions']//button[@data-buttonfieldset='button']")
    public WebElement acceptCookiesButton; ///accept cookies button
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

    @FindBy(xpath = "//li//a[text()='Terms of Use']")
    public WebElement termsOfUseLink;
    ///footer menu terms of use

    @FindBy(xpath = "//li//a[text()='Privacy Policy']")
    public WebElement privacyPolicyLink;
    ///footer menu privacy policy

    @FindBy(xpath = "//li//a[text()='Cookies Policy']")
    public WebElement cookiesPolicyLink;
    ///footer menu cookies policy

    @FindBy(xpath = "//span[@class='js-feed-post-date t-feed__post-date t-uptitle t-uptitle_xs']")
    public List<WebElement> blogsList;

    /// bloglarin listesi ->  blogs sayfasinda


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "applyNowButton":
                return this.applyNowButton;
            case "nameInput":
                return this.nameInput;
            case "emailInput":
                return this.emailInput;
            case "phoneInput":
                return this.phoneInput;
            case "countrySelect":
                return this.countrySelect;
            case "courseSelect":
                return this.courseSelect;
            case "hearAboutUsSelect":
                return this.hearAboutUsSelect;
            case "checkBox":
                return this.checkBox;
            case "bookCallButton":
                return this.bookCallButton;
            case "thankYouMessage":
                return this.thankYouMessage;
            case "codingBootcampLink":
                return this.codingBootcampLink;
            case "termsOfUseLink":
                return this.termsOfUseLink;
            case "privacyPolicyLink":
                return this.privacyPolicyLink;
            case "cookiesPolicyLink":
                return this.cookiesPolicyLink;
            case "acceptCookiesButton":
                return this.acceptCookiesButton; ///accept cookies button
            case "blogsList":
                return (WebElement) this.blogsList;

        }
        return null;
    }
}
