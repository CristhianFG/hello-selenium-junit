package com.example.hello_selenium_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class SearchTest {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        @BeforeEach
        public void setUp() {
            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(true);
            driver = new FirefoxDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @AfterEach
        public void tearDown() {
            driver.quit();
        }
        @Test
        public void searchdevopsprivacity() {
            driver.get("https://www.google.es/");
            driver.manage().window().setSize(new Dimension(731, 768));
            driver.switchTo().frame(0);
            driver.findElement(By.cssSelector("#introAgreeButton .RveJvd")).click();
            driver.switchTo().defaultContent();
            driver.findElement(By.name("q")).sendKeys("devops");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        }

}
