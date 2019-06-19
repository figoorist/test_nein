package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Home page
 */
public class HomeBasePage extends BasePage {

    @FindBy(xpath = "//div[@id='search-button']")
    public WebElement btnSearch;

    @FindBy(xpath = "//input[@id='search-input-field']")
    public WebElement txtSearchInput;

    @FindBy(xpath = "//button[@id='submit-button']")
    public WebElement btnGo;

    /**
     * Constructor
     *
     * @param webDriver
     */
    public HomeBasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToHomePage() {
        driver.navigate().to("https://edition.cnn.com/");
        WaitForElementToAppear(btnSearch);
    }

    private WebElement getSearchFeatureButton() {
        return wait.until(ExpectedConditions.visibilityOf(btnSearch));
    }

    private WebElement getSearchInput() {
        return wait.until(ExpectedConditions.visibilityOf(txtSearchInput));
    }

    private WebElement getGoSearchButton() {
        return wait.until(ExpectedConditions.visibilityOf(btnGo));
    }

    public void GoToSearchFeature() {
        getSearchFeatureButton().click();
    }

    public void TypeSearchQuery(String query) {
        getSearchInput().sendKeys(query);
    }

    public ResultsBasePage PressGoButton() {
        getGoSearchButton().click();
        return new ResultsBasePage(driver);
    }

}
