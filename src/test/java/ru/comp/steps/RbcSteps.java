package ru.comp.steps;

import org.testng.Assert;
import ru.comp.pages.HomePage;
import ru.comp.pages.ResultsPage;

public class RbcSteps {

    private HomePage homePage;
    private ResultsPage resultsPage;

    public RbcSteps(HomePage homePage, ResultsPage resultsPage) {
        this.homePage = homePage;
        this.resultsPage = resultsPage;
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
