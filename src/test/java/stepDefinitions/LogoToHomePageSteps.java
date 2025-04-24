package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.HeaderMenu;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;

public class LogoToHomePageSteps {
    DialogContent dc = new DialogContent();
    HeaderMenu hm = new HeaderMenu();
    String expectedUrl = ConfigReader.getProperty("homePageUrl");

    @Given("The user navigates to the homepage")
    public void theUserNavigatesToTheHomepage() {
        GWD.getDriver().get(ConfigReader.getProperty("homePageUrl"));

        String actualUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL is not as expected");
    }

    @And("The user accepts cookies")
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

    @And("The logo should be visible and clickable")
    public void theLogoShouldBeVisibleAndClickable() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.getWebElement("logo")));
        Assert.assertTrue(hm.getWebElement("logo").isDisplayed(), "Logo is not displayed");
    }

    @When("The user clicks on the Logo")
    public void theUserClicksOnTheLogo() {
        hm.myClick(hm.getWebElement("logo"));
    }

    @Then("The user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
        GWD.getWait().until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), expectedUrl, "URL is not as expected after clicking the logo");
    }

    @Then("The user clicks on the Programs > SDET link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsSDETLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.getWebElement("programs")).build().perform();
        hm.clickMenuItemAndReturn(hm.getWebElement("sdetLink"), ConfigReader.getProperty("sdetUrl"));
    }

    @And("The user should return to the homepage by clicking the logo")
    public void theUserShouldReturnToTheHomepageByClickingTheLogo() {
        hm.action.moveToElement(hm.getWebElement("logo")).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("homePageUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("homePageUrl"), "URL is not as expected after clicking the logo again");
    }

    @Then("The user clicks on the Programs > Data Science link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsDataScienceLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.getWebElement("programs")).build().perform();
        hm.clickMenuItemAndReturn(hm.getWebElement("dataScienceLink"), ConfigReader.getProperty("dataScienceUrl"));
    }

    @Then("The user clicks on the Programs > AI link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsAILinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.getWebElement("programs")).build().perform();
        hm.clickMenuItemAndReturn(hm.getWebElement("artificialIntelligenceLink"), ConfigReader.getProperty("artificialIntelligenceUrl"));
    }

    @Then("The user clicks on the Programs > Android Developer link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsAndroidDeveloperLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.getWebElement("programs")).build().perform();
        hm.clickMenuItemAndReturn(hm.getWebElement("androidDeveloperLink"), ConfigReader.getProperty("androidDeveloperUrl"));
    }

    @Then("The user clicks on the Programs > Masters Program link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsMastersProgramLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.getWebElement("programs")).build().perform();
        hm.clickMenuItemAndReturn(hm.getWebElement("mastersProgramLink"), ConfigReader.getProperty("mastersProgramUrl"));
    }

    @Then("The user clicks on the About Us link and should be redirected to the correct page")
    public void theUserClicksOnTheAboutUsLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(hm.getWebElement("aboutUsLink"), ConfigReader.getProperty("aboutUsUrl"));
    }

    @Then("The user clicks on the Work With Us link and should be redirected to the correct page")
    public void theUserClicksOnTheWorkWithUsLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(hm.getWebElement("workWithUsLink"), ConfigReader.getProperty("workWithUsUrl"));
    }

    @Then("The user clicks on the Apply Now button and should be redirected to the correct page")
    public void theUserClicksOnTheApplyNowButtonAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(dc.getWebElement("applyNowButton"), ConfigReader.getProperty("applyNowUrl"));
    }

    @Then("The user clicks on the Coding Bootcamp link and should be redirected to the correct page")
    public void theUserClicksOnTheCodingBootcampLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(dc.getWebElement("codingBootcampLink"), ConfigReader.getProperty("codingBootcampUrl"));
    }

    @When("The user scrolls down the page")
    public void theUserScrollsDownThePage() {
        hm.scrollToElement(dc.getWebElement("termsOfUseLink"));
    }

    @Then("The user clicks on the Terms of Use link and should be redirected to the correct page")
    public void theUserClicksOnTheTermsOfUseLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(dc.getWebElement("termsOfUseLink"), ConfigReader.getProperty("termsOfUseUrl"));
    }

    @Then("The user clicks on the Privacy Policy link and should be redirected to the correct page")
    public void theUserClicksOnThePrivacyPolicyLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(dc.getWebElement("privacyPolicyLink"), ConfigReader.getProperty("privacyPolicyUrl"));
    }

    @Then("The user clicks on the Cookies Policy link and should be redirected to the correct page")
    public void theUserClicksOnTheCookiesPolicyLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.clickMenuItemAndReturn(dc.getWebElement("cookiesPolicyLink"), ConfigReader.getProperty("cookiesPolicyUrl"));
    }

    @When("The user clicks on the Blogs link")
    public void theUserClicksOnTheBlogsLink() {
        hm.clickMenuItemAndReturn(hm.getWebElement("blogsLink"), ConfigReader.getProperty("blogsUrl"));
    }

    @Then("The user clicks each of the all blog posts as {int} and verifies the page loads correctly")
    public void theUserClicksEachOfTheAllBlogPostsAsIndexAndVerifiesThePageLoadsCorrectly(int index) {
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("blogsUrl")));
        GWD.getWait().until(ExpectedConditions.visibilityOfAllElements(dc.getWebElementList("blogsList")));
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.getWebElement("logo")));

        List<WebElement> blogsPageList = dc.getWebElementList("blogsList");
        String mainWindow = GWD.getDriver().getWindowHandle();

        if (index <= 0 || index > blogsPageList.size()) {
            Assert.fail("Not in the given index blogs list: " + index);
        }

        WebElement currentBlog = blogsPageList.get(index - 1);

        if (index == 19 || index == 20 || index == 21) {
            dc.action.moveToElement(currentBlog).click().build().perform();

            for (String windowHandle : GWD.getDriver().getWindowHandles()) {
                if (!windowHandle.equals(mainWindow)) {
                    GWD.getDriver().switchTo().window(windowHandle);
                    break;
                }
            }
            GWD.getWait().until(ExpectedConditions.urlToBe(GWD.getDriver().getCurrentUrl()));
            GWD.getWait().until(ExpectedConditions.visibilityOf(hm.getWebElement("logo")));
            GWD.getDriver().close();
            GWD.getDriver().switchTo().window(mainWindow);
        } else {
            ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].removeAttribute('target')", currentBlog);
            dc.action.moveToElement(currentBlog).click().build().perform();
            GWD.getWait().until(ExpectedConditions.visibilityOf(hm.getWebElement("logo")));
        }

        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.getWebElement("logo")));
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.getWebElement("logo")));
        Assert.assertTrue(hm.getWebElement("logo").isDisplayed(), "Logo is not displayed");
        hm.myClick(hm.getWebElement("logo"));

        GWD.getWait().until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), expectedUrl, "URL is not as expected after clicking the logo again");
    }

    @And("The user should return to the homepage by clicking the logo after each blog check")
    public void theUserShouldReturnToTheHomepageByClickingTheLogoAfterEachBlogCheck() {
        hm.clickMenuItemAndReturn(hm.getWebElement("logo"), ConfigReader.getProperty("homePageUrl"));
    }
}