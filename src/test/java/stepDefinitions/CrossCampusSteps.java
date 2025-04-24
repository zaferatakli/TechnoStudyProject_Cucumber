package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.HeaderMenu;
import utilities.GWD;

public class CrossCampusSteps {
    DialogContent dc = new DialogContent();
    HeaderMenu hm = new HeaderMenu();

    @When("The user clicks on the sign in button")
    public void theUserClicksOnTheSignInButton() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.getWebElement("signInButton")));
        Assert.assertTrue(hm.getWebElement("signInButton").isDisplayed(), "Sign In button is not displayed.");
        hm.action.moveToElement(hm.getWebElement("signInButton")).click().build().perform();
    }

    @Then("The user should be redirected to the sign in page of the Campus")
    public void theUserShouldBeRedirectedToTheSignInPageOfTheCampus() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.getWebElement("campusPageLogo")));
        Assert.assertTrue(hm.getWebElement("campusPageLogo").isDisplayed(), "Campus page logo is not displayed.");
    }
}
