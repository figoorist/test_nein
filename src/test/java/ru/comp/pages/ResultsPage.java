package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import ru.comp.facades.ResultsPageFacade;

/**
 *
 */
public class ResultsPage extends Page<ResultsPageFacade> {

    /**
     * Constructor
     * @param webDriver
     */
    public ResultsPage(WebDriver webDriver) {

        super(webDriver);
        facade = new ResultsPageFacade();
    }

    public int getResultsCount() {
        return driver.findElements(facade.ResultSearchItem).size();
    }

    public boolean NoResultsBlockIsDisplayed() {
        return driver.findElement(facade.NoResultsBlock).isDisplayed();
    }
}
