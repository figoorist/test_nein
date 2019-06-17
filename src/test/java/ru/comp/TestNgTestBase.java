package ru.comp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected WebDriver driver;

  @BeforeClass
  public void initTestSuite() {
      driver = new ChromeDriver();
      //maximize screen
      driver.manage().window().maximize();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }
}
