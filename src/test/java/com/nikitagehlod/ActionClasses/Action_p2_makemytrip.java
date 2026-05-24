package com.nikitagehlod.ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Action_p2_makemytrip {

    WebDriver driver;   // Class level

    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();   // Initialize once
        driver.manage().window().maximize();
    }

    @Test
    public void test_Action_classes() throws InterruptedException {

        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement closeBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[@data-cy='closeModal']")
                )
        );

        closeBtn.click();

        WebElement select_city= driver.findElement(By.id("fromCity"));

        Actions action = new Actions(driver);
        action.moveToElement(select_city).click().sendKeys("del").build().perform();

        Thread.sleep(3000);

        action.moveToElement(select_city).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
    }

    @AfterMethod
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}