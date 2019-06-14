package ru.comp.facades;

import org.openqa.selenium.By;

/**
 *
 */
public class ResultsPageFacade extends Facade {

    public By ResultSearchItem = By.xpath("//*[contains(@class, 'search-item js-search-item')]");

    public By NoResultsBlock = By.xpath("//*[contains(@class, 'g-nofound')]");

}
