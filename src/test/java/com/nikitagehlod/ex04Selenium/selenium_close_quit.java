package com.nikitagehlod.ex04Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium_close_quit {

    @Test
    @Description("verify navigate to all the fuctions and uses ")
    public void test_NavigateTo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
//         Thread.sleep(10000);
//
//         driver.close(); // This will close only current tab


        Thread.sleep(10000);

        driver.quit(); // close all the tabs of that browser

    }
}
