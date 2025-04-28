package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import utilities.GWD;
import java.util.Set;

public class TermsOfUseSteps {
    DialogContent dc = new DialogContent();

    @When("The user clicks the Apply Now button")
    public void theUserClicksTheApplyNowButton() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.applyNowButton));
        Assert.assertTrue(dc.applyNowButton.isDisplayed(),"Apply Now button is not displayed");
        dc.action.moveToElement(dc.applyNowButton).click().build().perform();
    }

    @And("The user sees the form")
    public void theUserSeesTheForm() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.bookCallButton));
        Assert.assertTrue(dc.bookCallButton.isDisplayed(),"Book a Call Button is not displayed");
    }

    @And("The user clicks the Terms of Use link")
    public void theUserClicksTheTermsOfUseLink() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.termsOfUseForm));
        Assert.assertTrue(dc.termsOfUseForm.isDisplayed(),"Term Of Use button is not displayed");
        dc.action.moveToElement(dc.termsOfUseForm).click().build().perform();
    }

    @Then("The user should be redirected to the Terms of Use page")
    public void theUserShouldBeRedirectedToTheTermsOfUsePage() {
        String mainWindowHandle = GWD.getDriver().getWindowHandle();
        Set<String> windowHandles = GWD.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                GWD.getDriver().switchTo().window(handle);
            }
        }
    }

    @And("The page title should be Terms of Use")
    public void thePageTitleShouldBeTermsOfUse() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.termsOfUsePageTitle));
        Assert.assertTrue(dc.termsOfUsePageTitle.isDisplayed(),"Term Of Use page title is not displayed");
    }
}
