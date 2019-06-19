package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsBasePage extends BasePage {

    @FindBy(xpath = "//div[@class='cnn-search__results-count']")
    public WebElement resultElement;

    @FindBy(xpath = "//div[@class='cnn-search cnn-search--no-results']//h3")
    public WebElement noResultElement;

    /**
     * Constructor
     *
     * @param webDriver
     */
    public ResultsBasePage(WebDriver webDriver) {

        super(webDriver);
    }

    public boolean foundSearchResults(String mySearchText) {
        WaitForElementToAppear(resultElement);
        return resultElement.isDisplayed()
                && resultElement.getText().startsWith("Displaying results")
                && resultElement.getText().endsWith(mySearchText);
    }

    public boolean noSearchResults(String mySearchText) {
        if (true) {
            WaitForElementToAppear(noResultElement);
            return noResultElement.isDisplayed()
                    && noResultElement.getText().equals("Your search for " + mySearchText + " did not match any documents.");
        } else {
            return false;
        }
    }
}
