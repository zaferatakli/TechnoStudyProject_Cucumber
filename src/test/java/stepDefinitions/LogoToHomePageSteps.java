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

import java.time.Duration;
import java.util.List;
import java.util.Set;

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
        GWD.getWait().until(ExpectedConditions.visibilityOf(dc.acceptCookiesButton));

        try {
            if (dc.acceptCookiesButton.isDisplayed()) {
                dc.myClick(dc.acceptCookiesButton);
            }
        } catch (Exception e) {
            System.out.println("Accept Cookies button not displayed");
        }
    }

    @And("The logo should be visible and clickable")
    public void theLogoShouldBeVisibleAndClickable() {
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(hm.logo));
        Assert.assertTrue(hm.logo.isDisplayed(), "Logo is not displayed");
    }

    @When("The user clicks on the Logo")
    public void theUserClicksOnTheLogo() {
        hm.myClick(hm.logo);
    }

    @Then("The user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
        GWD.getWait().until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), expectedUrl, "URL is not as expected after clicking the logo");
    }

    @Then("The user clicks on the Programs > SDET link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsSDETLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.programs).build().perform();
        hm.action.moveToElement(hm.sdetLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("sdetUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("sdetUrl"), "URL is not as expected after clicking the SDET link");
    }

    @And("The user should return to the homepage by clicking the logo")
    public void theUserShouldReturnToTheHomepageByClickingTheLogo() {
        hm.clickToLogoCheckHomePage();
    }

    @Then("The user clicks on the Programs > Data Science link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsDataScienceLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.programs).build().perform();
        hm.action.moveToElement(hm.dataScienceLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("dataScienceUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("dataScienceUrl"), "URL is not as expected after clicking the Data Science link");
    }

    @Then("The user clicks on the Programs > AI link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsAILinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.programs).build().perform();
        hm.action.moveToElement(hm.artificialIntelligenceLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("artificialIntelligenceUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("artificialIntelligenceUrl"), "URL is not as expected after clicking the AI link");
    }

    @Then("The user clicks on the Programs > Android Developer link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsAndroidDeveloperLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.programs).build().perform();
        hm.action.moveToElement(hm.androidDeveloperLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("androidDeveloperUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("androidDeveloperUrl"), "URL is not as expected after clicking the Android Developer link");
    }

    @Then("The user clicks on the Programs > Masters Program link and should be redirected to the correct page")
    public void theUserClicksOnTheProgramsMastersProgramLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.programs).build().perform();
        hm.action.moveToElement(hm.mastersProgramLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("mastersProgramUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("mastersProgramUrl"), "URL is not as expected after clicking the Masters Program link");
    }

    @Then("The user clicks on the About Us link and should be redirected to the correct page")
    public void theUserClicksOnTheAboutUsLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.aboutUsLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("aboutUsUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("aboutUsUrl"), "URL is not as expected after clicking the About Us link");
    }

    @Then("The user clicks on the Work With Us link and should be redirected to the correct page")
    public void theUserClicksOnTheWorkWithUsLinkAndShouldBeRedirectedToTheCorrectPage() {
        hm.action.moveToElement(hm.workWithUsLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("workWithUsUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("workWithUsUrl"), "URL is not as expected after clicking the Work With Us link");
    }

    @Then("The user clicks on the Apply Now button and should be redirected to the correct page")
    public void theUserClicksOnTheApplyNowButtonAndShouldBeRedirectedToTheCorrectPage() {
        dc.action.moveToElement(dc.applyNowButton).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("applyNowUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("applyNowUrl"), "URL is not as expected after clicking the Apply Now button");
    }

    @Then("The user clicks on the Coding Bootcamp link and should be redirected to the correct page")
    public void theUserClicksOnTheCodingBootcampLinkAndShouldBeRedirectedToTheCorrectPage() {
        dc.action.scrollToElement(dc.codingBootcampLink).build().perform();
        dc.action.moveToElement(dc.codingBootcampLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("codingBootcampUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("codingBootcampUrl"), "URL is not as expected after clicking the Coding Bootcamp link");
    }

    @When("The user scrolls down the page")
    public void theUserScrollsDownThePage() {
        hm.scrollToElement(dc.termsOfUseLink);
    }

    @Then("The user clicks on the Terms of Use link and should be redirected to the correct page")
    public void theUserClicksOnTheTermsOfUseLinkAndShouldBeRedirectedToTheCorrectPage() {
        dc.action.pause(Duration.ofSeconds(1)).build().perform();
        dc.action.moveToElement(dc.termsOfUseLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("termsOfUseUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("termsOfUseUrl"), "URL is not as expected after clicking the Terms of Use link");
    }

    @Then("The user clicks on the Privacy Policy link and should be redirected to the correct page")
    public void theUserClicksOnThePrivacyPolicyLinkAndShouldBeRedirectedToTheCorrectPage() {
        dc.action.pause(Duration.ofSeconds(1)).build().perform();
        dc.action.moveToElement(dc.privacyPolicyLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("privacyPolicyUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("privacyPolicyUrl"), "URL is not as expected after clicking the Privacy Policy link");
    }

    @Then("The user clicks on the Cookies Policy link and should be redirected to the correct page")
    public void theUserClicksOnTheCookiesPolicyLinkAndShouldBeRedirectedToTheCorrectPage() {
        dc.action.pause(Duration.ofSeconds(1)).build().perform();
        dc.action.moveToElement(dc.cookiesPolicyLink).click().build().perform();
        GWD.getWait().until(ExpectedConditions.urlToBe(ConfigReader.getProperty("cookiesPolicyUrl")));
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), ConfigReader.getProperty("cookiesPolicyUrl"), "URL is not as expected after clicking the Cookies Policy link");
    }

    @When("The user clicks on the Blogs link")
    public void theUserClicksOnTheBlogsLink() {
        hm.action.moveToElement(hm.blogsLink).click().build().perform();
    }

    @Then("The user clicks each of the all blog posts and verifies the page loads correctly")
    public void theUserClicksEachOfTheAllBlogPostsAsIndexAndVerifiesThePageLoadsCorrectly() {
        String homePageUrl = ConfigReader.getProperty("homePageUrl");

        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.logo));

        String mainWindow = GWD.getDriver().getWindowHandle();
        GWD.getWait().until(ExpectedConditions.visibilityOfAllElements(dc.getWebElementList("blogsList")));

        int totalBlogs = dc.getWebElementList("blogsList").size();

        for (int i = 0; i < totalBlogs; i++) {
            List<WebElement> blogs = dc.getWebElementList("blogsList");
            WebElement blogToClick = blogs.get(i);

            int windowCountBeforeClick = GWD.getDriver().getWindowHandles().size();
            ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", blogToClick);
            hm.action.moveToElement(blogToClick).click().perform();

            GWD.getWait().until(driver -> GWD.getDriver().getWindowHandles().size() >= windowCountBeforeClick);

            Set<String> windowsAfterClick = GWD.getDriver().getWindowHandles();
            boolean newWindowOpened = windowsAfterClick.size() > windowCountBeforeClick;

            if (newWindowOpened) {
                for (String window : windowsAfterClick) {
                    if (!window.equals(mainWindow)) {
                        GWD.getDriver().switchTo().window(window);
                        break;
                    }
                }
            }

            hm.clickToLogoCheckHomePage();

            GWD.getWait().until(ExpectedConditions.urlToBe(homePageUrl));

            if (newWindowOpened) {
                GWD.getDriver().close();
                GWD.getDriver().switchTo().window(mainWindow);
                GWD.getDriver().navigate().refresh();
                GWD.getWait().until(ExpectedConditions.visibilityOf(hm.logo));
            }
            Assert.assertTrue(hm.logo.isDisplayed(), "Logo is not displayed after clicking the blog post");
            hm.clickToBlogsLink();

            GWD.getWait().until(ExpectedConditions.visibilityOfAllElements(dc.getWebElementList("blogsList")));

            //System.out.println("Clicked blog post: " + (i)); // can be activated to see how many blog pages have been checked
        }
        GWD.getWait().until(ExpectedConditions.visibilityOf(hm.logo));
        Assert.assertTrue(hm.logo.isDisplayed(), "Logo is not displayed after clicking the blog post");
        hm.myClick(hm.logo);
    }
}