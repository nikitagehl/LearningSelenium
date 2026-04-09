package com.nikitagehlod.ex06_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class xpath01 extends Exception{

    @Test
    public void test_xpath_katalone() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximise");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement click_button= driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        click_button.click();

        Thread.sleep(3000);

        WebElement input_username= driver.findElement(By.xpath("//input[@name=\"username\"]"));
        input_username.sendKeys("John Doe");

        WebElement input_pass= driver.findElement(By.xpath("//input[@name=\"password\"]"));
        input_pass.sendKeys("ThisIsNotAPassword");

        WebElement button= driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        button.click();

        Thread.sleep(3000);
        driver.close();
    }
}
