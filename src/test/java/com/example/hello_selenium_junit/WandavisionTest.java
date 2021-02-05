package com.example.hello_selenium_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WandavisionTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeEach
  public void setUp() {
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void test() throws MalformedURLException {
    //Seleccion de navegador
    //ChromeOptions chromeOptions = new ChromeOptions();
    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444")/*, chromeOptions*/);

    //Prueba de iMDB
    driver.get("https://www.imdb.com/");
    driver.manage().window().setSize(new Dimension(729, 698));
    driver.findElement(By.id("suggestion-search")).click();
    driver.findElement(By.id("suggestion-search")).sendKeys("wandavision");
    driver.findElement(By.id("suggestion-search")).sendKeys(Keys.ENTER);
    //driver.findElement(By.linkText("WandaVision")).click();
   // driver.findElement(By.cssSelector("#tr4371535 > .sodatext")).click();
  }
}
