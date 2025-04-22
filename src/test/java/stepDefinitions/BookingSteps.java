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

import java.time.Duration;

public class BookingSteps {
    DialogContent dc = new DialogContent();

    @Given("the user navigate the website")
    public void theUserIsOnTheHomepage() {
        GWD.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }

    @And("the user accepts cookies")
    public void theUserAcceptsCookies() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("acceptCookiesButton")));

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
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("applyNowButton")));
        Assert.assertTrue(dc.getWebElement("applyNowButton").isDisplayed());
    }

    @When("the user clicks the Apply Now button")
    public void theUserClicksTheButton() {
        dc.action.moveToElement(dc.getWebElement("applyNowButton")).click().build().perform();
        //dc.myClick(dc.getWebElement("applyNowButton"));
    }

    @Then("the application form page is displayed")
    public void theApplicationFormPageIsDisplayed() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.nameInput));
        Assert.assertTrue(dc.nameInput.isDisplayed());
    }

    @When("the user fills in the form with the following details:")
    public void theUserFillsInTheFormWithTheFollowingDetails() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("nameInput")));
        dc.mySendKeys(dc.getWebElement("nameInput"), (ConfigReader.getProperty("name")));

        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("emailInput")));
        dc.mySendKeys(dc.getWebElement("emailInput"), (ConfigReader.getProperty("email")));

        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("phoneInput")));
        dc.mySendKeys(dc.getWebElement("phoneInput"), (ConfigReader.getProperty("phoneNumber")));

        Select selectCountry = new Select(dc.getWebElement("countrySelect"));
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("countrySelect")));
        selectCountry.selectByVisibleText(ConfigReader.getProperty("country"));

        Select selectCourse = new Select(dc.getWebElement("courseSelect"));
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("courseSelect")));
        selectCourse.selectByVisibleText(ConfigReader.getProperty("course"));

        Select selectHearAboutUsSelect = new Select(dc.getWebElement("hearAboutUsSelect"));
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("hearAboutUsSelect")));
        selectHearAboutUsSelect.selectByVisibleText(ConfigReader.getProperty("hearAboutUs"));
    }

    @And("the user click the terms of use checkbox")
    public void theUserClickTheTermsOfUseCheckbox() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(dc.getWebElement("checkBox")));
        dc.myClick(dc.getWebElement("checkBox"));
    }

    @And("the user clicks the Book a Call button")
    public void theUserClicksTheBookACallButton() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(dc.getWebElement("bookCallButton")));
        dc.myClick(dc.getWebElement("bookCallButton"));
    }

    @Then("a confirmation message is displayed")
    public void aConfirmationMessageIsDisplayed() {
        dc.action.pause(Duration.ofSeconds(30)).build().perform();
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.getWebElement("thankYouMessage")));
        Assert.assertTrue(dc.getWebElement("thankYouMessage").isDisplayed());
    }
}

