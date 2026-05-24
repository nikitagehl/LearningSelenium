package com.nikitagehlod.ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_p1 {

    @Test
    public void test_Action_classes() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

//[class="commonModal__close"]
        WebElement input= driver.findElement(By.xpath("//input[@name='firstname']"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.SHIFT).sendKeys(input,"nikita").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
