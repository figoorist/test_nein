package ru.comp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        return driver.findElement(By.xpath("//*[@class = 'topline__search__menu js-search-open']"));
    }

    private WebElement getSearchInput() {
        return driver.findElement(By.xpath("//input[@name = 'query']"));
    }

    private WebElement getGoSearchButton() {
        return driver.findElement(By.xpath("//input[@type = 'submit']"));
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
