package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.HeaderMenu;
import utilities.GWD;

public class DropDownMenuSteps {
    HeaderMenu hm = new HeaderMenu();
    DialogContent dc = new DialogContent();

    @When("The user hovers over the Programs menu")
    public void theUserHoversOverTheProgramsMenu() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.programs));
        hm.action.moveToElement(hm.programs).build().perform();
    }

    @Then("The user should be see the all programs link and selects each page and navigated to the correct course page")
    public void theUserShouldBeNavigatedToTheCorrectCoursePage() {
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.sdetLink));
        hm.myClick(hm.sdetLink);
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.softwareHomepage));
        Assert.assertTrue(dc.softwareHomepage.isDisplayed(), "No text found");

        hm.action.moveToElement(hm.programs).build().perform();
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.dataScienceLink));
        hm.myClick(hm.dataScienceLink);
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.dataScienceHomepage));
        Assert.assertTrue(dc.dataScienceHomepage.isDisplayed(), "No text found");

        hm.action.moveToElement(hm.programs).build().perform();
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.artificialIntelligenceLink));
        hm.myClick(hm.artificialIntelligenceLink);
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.artificialHomepage));
        Assert.assertTrue(dc.artificialHomepage.isDisplayed(), "No text found");

        hm.action.moveToElement(hm.programs).build().perform();
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.androidDeveloperLink));
        hm.myClick(hm.androidDeveloperLink);
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.androidDevHomepage));
        Assert.assertTrue(dc.androidDevHomepage.isDisplayed(), "No text found");

        hm.action.moveToElement(hm.programs).build().perform();
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.mastersProgramLink));
        hm.myClick(hm.mastersProgramLink);
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.masterHomepage));
        Assert.assertTrue(dc.masterHomepage.isDisplayed(), "No text found");
    }
}