package ru.comp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 *
 */
public class ResultsPage extends Page {

    /**
     * Constructor
     * @param webDriver
     */
    public ResultsPage(WebDriver webDriver) {

        super(webDriver);
    }

    private List<WebElement> getResultSearchItems() {
        return driver.findElements(By.xpath("//*[contains(@class, 'search-item js-search-item')]"));
    }

    private WebElement getNoResultsBlock() {
        return driver.findElement(By.xpath("//*[contains(@class, 'g-nofound')]"));
    }

    public int getResultsCount() {
        return getResultSearchItems().size();
    }

    public boolean NoResultsBlockIsDisplayed() {
        return getNoResultsBlock().isDisplayed();
    }
}
