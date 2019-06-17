package ru.comp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

    protected WebDriver driver;

    // Create WebDriver wait
    protected WebDriverWait wait;

    /*
     * Constructor injecting the WebDriver interface
     * @param webDriver
     */
    public Page(WebDriver driver) {
      this.driver = driver;
      wait = new WebDriverWait(driver, 10);
    }
}
