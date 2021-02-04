package com.example.hello_selenium_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class WandaVisionTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
   /* @Test
    public void iMBD() throws InterruptedException {
        driver.get("https://www.imdb.com/");
        driver.findElement(By.id("suggestion-search")).click();
        driver.findElement(By.id("suggestion-search")).sendKeys("wandavision");
        driver.findElement(By.id("suggestion-search")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.findElement(By.linkText("WandaVision")).click();
    }*/
}
