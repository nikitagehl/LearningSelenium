package com.nikitagehlod.ex06_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class xpath_golf_login extends Exception{

    @Test
    public void test_xpath_katalone() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximise");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://devbeta.betspertsgolf.com/sign-in");

//        WebElement click_button= driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
//        click_button.click();
//
//        Thread.sleep(3000);

        WebElement input_username= driver.findElement(By.xpath("//input[@id=\"email\"]"));
        input_username.sendKeys("testweekweb");

        WebElement input_pass= driver.findElement(By.xpath("//input[@id=\"password\"]"));
        input_pass.sendKeys("Tester@123");

        WebElement button= driver.findElement(By.xpath("//button[@class=\"btn btn-success sign-in-page-form-button\"] "));
        button.click();

        Thread.sleep(3000);
        driver.close();
    }
}
