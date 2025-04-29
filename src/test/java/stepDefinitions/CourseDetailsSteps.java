package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.HeaderMenu;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;

public class CourseDetailsSteps {
    HeaderMenu hm = new HeaderMenu();
    DialogContent dc = new DialogContent();

    @When("The user scrolls down the page one the courses section")
    public void theUserScrollsDownThePageOneTheCoursesSection() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.chooseProgramTitle));
        dc.scrollToElement(dc.chooseProgramTitle);
        Assert.assertTrue(dc.chooseProgramTitle.isDisplayed(), "Choose a Program section is not displayed");
    }

    @And("The user clicks on the {string} button each course and should be redirected to the course details page")
    public void theUserClicksOnTheButtonEachCourseAndShouldBeRedirectedToTheCourseDetailsPage(String arg0) {
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.chooseProgramTitle));
        List<WebElement> learnMoreButtonsList = dc.learnMoreButtons;

        for (int i = 0; i < learnMoreButtonsList.size(); i++) {
            Assert.assertTrue(dc.learnMoreButtons.get(i).isDisplayed(), "Learn More button is not displayed");
            dc.action.moveToElement(dc.learnMoreButtons.get(i)).click().build().perform();

            GWD.getWait().until(ExpectedConditions.visibilityOf(hm.logo));
            Assert.assertTrue(hm.logo.isDisplayed(), "Techno Study logo is not displayed on the course page");
            hm.myClick(hm.logo);

            GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("homePageUrl")));
            Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("homePageUrl"), "URL does not match the expected home page URL");
            dc.scrollToElement(dc.chooseProgramTitle);
        }
    }
}