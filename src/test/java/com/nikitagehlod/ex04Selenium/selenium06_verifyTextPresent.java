package com.nikitagehlod.ex04Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium06_verifyTextPresent {

    @Test
    public void test_seleniumCommands(){
        WebDriver driver= new ChromeDriver();
         driver.get("https://devbeta.betspertsgolf.com/");
         driver.manage().window().maximize();
         if(driver.getPageSource().contains(".homepage-rh-bg")){
             System.out.println("it is visible");
             Assert.assertTrue(true);
         }
         else {
             System.out.println("not visible");
//             throw new exception("not visible");
         }

    }
}
