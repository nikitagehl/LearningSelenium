package com.nikitagehlod.ex10_Action_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_Scrolling {

    @Test
    public void test_Action_classes() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");



        Actions action = new Actions(driver);

        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
