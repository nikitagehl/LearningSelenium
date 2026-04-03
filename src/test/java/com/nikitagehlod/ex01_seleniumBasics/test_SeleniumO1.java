package com.nikitagehlod.ex01_seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_SeleniumO1 {



    @Test
    public void seleniumBasics(){
//        FirefoxDriver driver= new FirefoxDriver();
//        driver.get("https://devbeta.betspertsgolf.com/");
        EdgeDriver driver1= new EdgeDriver();
        driver1.get("https://devbeta.betspertsgolf.com/");
    }

}
