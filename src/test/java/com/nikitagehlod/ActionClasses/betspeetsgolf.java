package com.nikitagehlod.ActionClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class betspeetsgolf {

    @Test
    public void test_golf() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://devbeta.betspertsgolf.com/sign-in");

        WebElement takeIputData = driver.findElement(By.id("email"));
        takeIputData.sendKeys("nikitatester");

        WebElement takePassword = driver.findElement(By.id("password"));
        takePassword.sendKeys("Tester@123");

        WebElement button = driver.findElement(By.xpath("//button[@class=\"btn btn-success sign-in-page-form-button\"]"));

        button.click();

        Thread.sleep(3000);

        WebElement rabbitHole =
                driver.findElement(
                        By.xpath("//a[@href='/the-rabbit-hole']")
                );

        rabbitHole.click();
        Thread.sleep(3000);

        List<WebElement> list_of_plus = driver.findElements(By.xpath("//img[@data-tip=\"Add Column to your custom report\"]"));
        ;
        System.out.println(list_of_plus.size());
        for(int i = 0; i<= list_of_plus.size(); i++) {

//            i.click();
            WebElement button2 = driver.findElement(By.xpath("//div[@class='Add-column-discription']/form/textarea"));
            button2.sendKeys("hello");
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500);");

            WebElement save_button = driver.findElement(By.xpath("//div[@class='Add-column-discription']/form/div/button"));
//            save_button.click();
            System.out.println(save_button.getText());

        }
    }
}



