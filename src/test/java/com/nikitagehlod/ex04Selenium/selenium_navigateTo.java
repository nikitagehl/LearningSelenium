package com.nikitagehlod.ex04Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium_navigateTo {

    @Test
    @Description("verify navigate to all the fuctions and uses ")
    public void test_NavigateTo(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.navigate().to("https://betspertsgolf.com/");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
