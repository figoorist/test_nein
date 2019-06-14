package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.comp.facades.HomePageFacade;

/**
 * Home page
 */
public class HomePage extends Page<HomePageFacade> {

    /**
     * Constructor
     * @param webDriver
     */
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        facade = new HomePageFacade();
    }

    public void GoToSearchFeature() {
        driver.findElement(facade.SearchButton).click();
    }

    public void TypeSearchQuery(String query) {
        driver.findElement(facade.SearchInput).sendKeys(query);
    }

    public void PressGoButton() {
        driver.findElement(facade.GoButton).click();
    }
}
