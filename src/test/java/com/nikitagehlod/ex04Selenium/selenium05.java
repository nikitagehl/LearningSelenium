package com.nikitagehlod.ex04Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium05 {

    @Test
    public void test_seleniumCommands(){
        WebDriver driver= new ChromeDriver();
         driver.get("https://devbeta.betspertsgolf.com/");
        Assert.assertEquals(driver.getTitle(),"Betsperts Golf - The Golf Betting Expert ");
    }
}
