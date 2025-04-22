package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.DialogContent;
import utilities.ConfigReader;
import utilities.GWD;

public class BookingSteps {

    DialogContent dc = new DialogContent();

    @Given("the user navigate the website")
    public void theUserIsOnTheHomepage() {
        GWD.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }

    @And("the user accepts cookies")
    public void theUserAcceptsCookies() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("acceptCookiesButton")));

        try {
            if (dc.getWebElement("acceptCookiesButton").isDisplayed()) {
                dc.myClick(dc.getWebElement("acceptCookiesButton"));
            }
        } catch (Exception e) {
            System.out.println("Accept Cookies button not displayed");
        }
    }

    @And("the Apply Now button is clearly visible")
    public void theButtonIsClearlyVisible() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("applyNowButton")));
        Assert.assertTrue(dc.getWebElement("applyNowButton").isDisplayed());
    }

    @When("the user clicks the Apply Now button")
    public void theUserClicksTheButton() {
        dc.myClick(dc.applyNowButton);
    }

    @Then("the application form page is displayed")
    public void theApplicationFormPageIsDisplayed() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.nameInput));
        Assert.assertTrue(dc.nameInput.isDisplayed());
    }

    @When("the user fills in the form with the following details:")
    public void theUserFillsInTheFormWithTheFollowingDetails() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.nameInput));
        dc.mySendKeys(dc.nameInput, (ConfigReader.getProperty("nameInput")));

        dc.wait.until(ExpectedConditions.visibilityOf(dc.emailInput));
        dc.mySendKeys(dc.emailInput, (ConfigReader.getProperty("emailInput")));

        dc.wait.until(ExpectedConditions.visibilityOf(dc.phoneInput));
        dc.mySendKeys(dc.phoneInput, (ConfigReader.getProperty("phoneInput")));

        Select selectCountry = new Select(dc.countrySelect);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.countrySelect));
        selectCountry.selectByVisibleText(ConfigReader.getProperty("country"));

        Select selectCourse = new Select(dc.courseSelect);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.courseSelect));
        selectCourse.selectByVisibleText(ConfigReader.getProperty("course"));

        Select selectHearAboutUsSelect = new Select(dc.hearAboutUsSelect);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.hearAboutUsSelect));
        selectHearAboutUsSelect.selectByVisibleText(ConfigReader.getProperty("hearAboutUs"));
    }

    @And("the user clicks the Book a Call button")
    public void theUserClicksTheBookACallButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.bookCallButton));
        dc.myClick(dc.bookCallButton);
    }

    @Then("a confirmation message is displayed")
    public void aConfirmationMessageIsDisplayed() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.thankYouMessage));
        Assert.assertTrue(dc.thankYouMessage.isDisplayed());
    }
}

