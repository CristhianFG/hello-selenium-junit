package com.example.hello_selenium_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PrecioTest {

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
    /*@Test
    public void test() {
        driver.get("http://localhost:3006/");
        TimeUnit.SECONDS.sleep(3);
        driver.manage().window().setSize(new Dimension(1533, 873));
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        vars.put("p1", driver.findElement(By.cssSelector("tr:nth-child(1) > .ng-binding:nth-child(2)")).getText());
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        vars.put("p2", driver.findElement(By.cssSelector("tr:nth-child(2) > .ng-binding:nth-child(2)")).getText());
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
        vars.put("p3", driver.findElement(By.cssSelector("tr:nth-child(3) > .ng-binding:nth-child(2)")).getText());
        vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
        System.out.println("Cola=vars.get('p1').toString()");
        System.out.println("Beer=vars.get('p2').toString()");
        System.out.println("Wine=vars.get('p3').toString()");
        System.out.println("Total=vars.get('total').toString()");
        assertEquals(vars.get("total").toString(), "€6.25");
    }*/
}

