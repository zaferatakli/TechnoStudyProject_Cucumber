package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import utilities.GWD;

import java.util.List;

public class SubmenuSocialMediaSteps {
    DialogContent dc = new DialogContent();

    @When("Scroll to the dropdown menu social area")
    public void scrollToTheDropdownMenuSocialArea() {
        dc.scrollToElement(dc.socialLinkField);
    }

    @Then("Click on all social media menu links.")
    public void clickOnAllSocialMediaMenuLinks() {
        String technoStudyWindowID = GWD.getDriver().getWindowHandle();
        String[] socialList = {"facebook", "instagram", "youtube", "linkedin"};
        List<WebElement> socialLinkList = dc.getWebElementList("socialLinks");

        int i = 0;
        for (WebElement social : socialLinkList) {
            Assert.assertTrue(social.isDisplayed(), "Logo is not displayed");
            social.click();
            for (String windowHandle : GWD.getDriver().getWindowHandles()) {
                if (!windowHandle.equals(technoStudyWindowID)) {
                    GWD.getDriver().switchTo().window(windowHandle);
                    break;
                }
            }
            GWD.getWait().until(ExpectedConditions.urlToBe(GWD.getDriver().getCurrentUrl()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains(socialList[i]), socialList[i] + " page not displayed!");
            i++;
            GWD.getDriver().close();
            GWD.getDriver().switchTo().window(technoStudyWindowID);
        }
    }
}