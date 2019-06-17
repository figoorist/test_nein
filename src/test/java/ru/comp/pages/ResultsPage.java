package ru.comp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(@class, 'search-item js-search-item')]")));
    }

    private WebElement getNoResultsBlock() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, 'g-nofound')]")));
    }

    public int getResultsCount() {
        int countOfResults = 0;
        try {
            countOfResults = getResultSearchItems().size();
        }
        catch (TimeoutException e){
        }

        return countOfResults;
    }

    public boolean NoResultsBlockIsDisplayed() {
        return getNoResultsBlock().isDisplayed();
    }
}
