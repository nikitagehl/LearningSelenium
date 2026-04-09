package com.nikitagehlod.ex06_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_31_Dec_Main extends Exception {

    @Test
    public void test_login() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(5000);

        WebElement input_email = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        input_email.sendKeys("augtest_040823@idrive.com");

        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("123456");

//        WebElement Check_box = driver.findElement(By.id("id-checkmark"));
//        Check_box.click();

        WebElement button = driver.findElement(By.id("frm-btn"));
        button.click();

        Thread.sleep(6000);

//        WebElement error_message_free_trial = driver.findElement(By.xpath("//h5[@class=\"id-card-title\"]"));
//        Assert.assertEquals(error_message_free_trial.getText(),"Your free trial has expired");
//        Thread.sleep(6000);
        driver.close();

    }

}
