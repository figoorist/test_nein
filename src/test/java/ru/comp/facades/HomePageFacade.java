package ru.comp.facades;

import org.openqa.selenium.By;

/**
 *
 */
public class HomePageFacade extends Facade {

    public By SearchButton = By.xpath("//*[@class = 'topline__search__menu js-search-open']");

    public By SearchInput = By.xpath("//input[@name = 'query']");

    public By GoButton = By.xpath("//input[@type = 'submit']");

}
