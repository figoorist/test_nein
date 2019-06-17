package ru.comp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Home page
 */
public class HomePage extends Page {

    /**
     * Constructor
     * @param webDriver
     */
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private WebElement getSearchFeatureButton(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class = 'topline__search__menu js-search-open']")));
    }

    private WebElement getSearchInput() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name = 'query']")));
    }

    private WebElement getGoSearchButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type = 'submit']")));
    }

    public void GoToSearchFeature() {
        getSearchFeatureButton().click();
    }

    public void TypeSearchQuery(String query) {
        getSearchInput().sendKeys(query);
    }

    public void PressGoButton() {
        getGoSearchButton().click();
    }
}
