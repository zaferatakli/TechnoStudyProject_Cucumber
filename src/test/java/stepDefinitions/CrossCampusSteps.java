package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.HeaderMenu;
import utilities.GWD;

public class CrossCampusSteps {
    HeaderMenu hm = new HeaderMenu();

    @When("The user clicks on the sign in button")
    public void theUserClicksOnTheSignInButton() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.signInButton));
        Assert.assertTrue(hm.signInButton.isDisplayed(), "Sign In button is not displayed.");
        hm.action.moveToElement(hm.signInButton).click().build().perform();
    }

    @Then("The user should be redirected to the sign in page of the Campus")
    public void theUserShouldBeRedirectedToTheSignInPageOfTheCampus() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.campusPageLogo));
        Assert.assertTrue(hm.campusPageLogo.isDisplayed(), "Campus page logo is not displayed.");
    }
}