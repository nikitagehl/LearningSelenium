package com.nikitagehlod.ex04Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium_optionClasses {


    @Test
    public void test_optionClass() throws InterruptedException {

        // option class for window size
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--window-size=1080,720");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.google.com/");
        Thread.sleep(15000);
        driver.close();
    }
}
