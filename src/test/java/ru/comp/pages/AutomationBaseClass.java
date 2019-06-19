package ru.comp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Base automation class for TestNG-based test classes
 */
public class AutomationBaseClass {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static final int OPTIMIZED_TIMEOUT = 5;

    @BeforeClass
    public void initTestSuite() {
        final ChromeOptions chromeOptions = new ChromeOptions();
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("pageLoadStrategy", "none");
        chromeOptions.merge(dc);
        final ChromeDriverService service = new ChromeDriverService.Builder().usingAnyFreePort().build();
        driver = new ChromeDriver(service, chromeOptions);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    protected final static WebDriver getDriver() {
        final WebDriver finalDriver = driver;
        return finalDriver;
    }

    protected void WaitForElementToAppear(WebElement element) {
        wait = new WebDriverWait(driver, OPTIMIZED_TIMEOUT);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            System.out.println("TimeoutException, increase timeout!!!");
        }
    }
}
