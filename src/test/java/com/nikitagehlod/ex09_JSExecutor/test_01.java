package com.nikitagehlod.ex09_JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class test_01 {

    @Test
    public void JS_Excecutor() throws InterruptedException {
        EdgeOptions options= new EdgeOptions();

        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");

        Thread.sleep(3000);

        driver.close();
    }
}
