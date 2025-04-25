package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.DialogContent;
import utilities.ConfigReader;
import utilities.GWD;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BookingSteps {
    DialogContent dc = new DialogContent();
    Random random = new Random();

    @Given("the user navigate the website")
    public void theUserIsOnTheHomepage() {
        GWD.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }

    @And("the user accepts cookies")
    public void theUserAcceptsCookies() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.acceptCookiesButton));

        try {
            if (dc.acceptCookiesButton.isDisplayed()) {
                dc.myClick(dc.acceptCookiesButton);
            }
        } catch (Exception e) {
            System.out.println("Accept Cookies button not displayed");
        }
    }

    @And("the Apply Now button is clearly visible")
    public void theButtonIsClearlyVisible() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.applyNowButton));
        Assert.assertTrue(dc.applyNowButton.isDisplayed());
    }

    @When("the user clicks the Apply Now button")
    public void theUserClicksTheButton() {
        dc.action.moveToElement(dc.applyNowButton).click().build().perform();
    }

    @Then("the application form page is displayed")
    public void theApplicationFormPageIsDisplayed() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.nameInput));
        Assert.assertTrue(dc.nameInput.isDisplayed());
    }

    @When("the user fills in the form with the following details:")
    public void theUserFillsInTheFormWithTheFollowingDetails() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.nameInput));
        dc.mySendKeys(dc.nameInput, (ConfigReader.getProperty("name")));

        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.emailInput));
        dc.mySendKeys(dc.emailInput, (ConfigReader.getProperty("email")));

        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.phoneInput));
        dc.mySendKeys(dc.phoneInput, (ConfigReader.getProperty("phoneNumber")));

        Select selectCountry = new Select(dc.countrySelect);
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.countrySelect));
        selectCountry.selectByVisibleText(ConfigReader.getProperty("country"));

        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.courseSelect));
        Select selectCourse = new Select(dc.courseSelect);
        List<WebElement> courseOptions = selectCourse.getOptions();
        int randomCourse = random.nextInt(courseOptions.size() - 1) + 1;
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.courseSelect));
        selectCourse.selectByIndex(randomCourse);

        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.hearAboutUsSelect));
        Select selectHearAboutUsSelect = new Select(dc.hearAboutUsSelect);
        List<WebElement> hearAboutUsOptions = selectHearAboutUsSelect.getOptions();
        int randomHearAboutUs = random.nextInt(hearAboutUsOptions.size() - 1) + 1;
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.hearAboutUsSelect));
        selectHearAboutUsSelect.selectByIndex(randomHearAboutUs);
    }

    @And("the user click the terms of use checkbox")
    public void theUserClickTheTermsOfUseCheckbox() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(dc.checkBox));
        dc.myClick(dc.checkBox);
    }

    @And("the user clicks the Book a Call button")
    public void theUserClicksTheBookACallButton() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(dc.bookCallButton));
        dc.myClick(dc.bookCallButton);
    }

    @Then("a confirmation message is displayed")
    public void aConfirmationMessageIsDisplayed() {
        dc.action.pause(Duration.ofSeconds(30)).build().perform();
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.thankYouMessage));
        Assert.assertTrue(dc.thankYouMessage.isDisplayed());
    }
}

