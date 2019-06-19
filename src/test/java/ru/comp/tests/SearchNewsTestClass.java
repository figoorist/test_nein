package ru.comp.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import ru.comp.pages.AutomationBaseClass;
import ru.comp.pages.HomeBasePage;
import ru.comp.pages.ResultsBasePage;

public class SearchNewsTestClass extends AutomationBaseClass {
    private static HomeBasePage homeBasePage;
    private static ResultsBasePage resultsBasePage;

    @BeforeClass
    public static void initPageObjects() {
        homeBasePage = new HomeBasePage(getDriver());
        homeBasePage.goToHomePage();
        resultsBasePage = new ResultsBasePage(getDriver());
    }

    @Test
    @Parameters({"correctQuery"})
    public void testSearchFeatureCorrectQuery(String correctQuery) {
        homeBasePage.GoToSearchFeature();
        homeBasePage.TypeSearchQuery(correctQuery);
        homeBasePage.PressGoButton();
        Assert.assertTrue(resultsBasePage.foundSearchResults(correctQuery));
    }

    @Test
    @Parameters({"incorrectQuery"})
    public void testSearchFeatureInvalidQuery(String incorrectQuery) {
        homeBasePage.GoToSearchFeature();
        homeBasePage.TypeSearchQuery(incorrectQuery);
        ResultsBasePage resPage = homeBasePage.PressGoButton();
        Assert.assertEquals(true, resPage.noSearchResults(incorrectQuery));
    }
}
