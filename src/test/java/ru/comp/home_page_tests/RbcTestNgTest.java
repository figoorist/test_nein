package ru.comp.home_page_tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.comp.TestNgTestBase;
import ru.comp.steps.RbcSteps;

public class RbcTestNgTest extends TestNgTestBase {

    private RbcSteps rbcSteps;

    @BeforeClass
    public void initPageObjects() {

        rbcSteps = new RbcSteps(driver);
    }

    @BeforeMethod
    @Parameters({"siteUrl"})
    public void goToHomePage(String siteUrl) {
        driver.get(siteUrl);
    }

    @Test
    @Parameters({"correctQuery"})
    public void testSearchFeatureCorrectQuery(String correctQuery) {
        rbcSteps.CheckSearchQuery(correctQuery, false);
    }

    @Test
    @Parameters({"incorrectQuery"})
    public void testSearchFeatureFoolishQuery(String incorrectQuery) {
        rbcSteps.CheckSearchQuery(incorrectQuery, true);
    }
}
