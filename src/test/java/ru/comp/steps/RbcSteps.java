package ru.comp.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ru.comp.pages.HomePage;
import ru.comp.pages.ResultsPage;

/**
 *
 */
public class RbcSteps {

    private HomePage homePage;
    private ResultsPage resultsPage;

    public RbcSteps(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        resultsPage = PageFactory.initElements(driver, ResultsPage.class);
    }

    public void CheckSearchQuery(String query, boolean isNoResults) {
        homePage.GoToSearchFeature();
        homePage.TypeSearchQuery(query);
        homePage.PressGoButton();

        if(isNoResults) {
            Assert.assertTrue(resultsPage.NoResultsBlockIsDisplayed() && resultsPage.getResultsCount() == 0);
        }
        else {
            Assert.assertTrue(resultsPage.getResultsCount() > 0);
        }

    }

}
