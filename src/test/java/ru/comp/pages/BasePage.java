package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage extends AutomationBaseClass {
    /*
     * Constructor injecting the WebDriver interface
     * @param webDriver
     */
    public BasePage(WebDriver finalDriver) {
        this.driver = getDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(finalDriver, OPTIMIZED_TIMEOUT), this);
        wait = new WebDriverWait(driver, OPTIMIZED_TIMEOUT);
    }
}
