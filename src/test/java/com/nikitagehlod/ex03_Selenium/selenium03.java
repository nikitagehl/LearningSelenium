package com.nikitagehlod.ex03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium03 {

    @Test
    public void test_seleniumCommands(){
        WebDriver driver= new ChromeDriver();

        driver.get("https://devbeta.betspertsgolf.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
