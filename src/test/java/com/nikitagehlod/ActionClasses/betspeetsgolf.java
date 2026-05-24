package com.nikitagehlod.ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class betspeetsgolf {

@Test
    public void test_golf() throws InterruptedException {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver= new EdgeDriver(edgeOptions);

        driver.get("https://devbeta.betspertsgolf.com/sign-in");

        WebElement takeIputData= driver.findElement(By.id("email"));
        takeIputData.sendKeys("nikitatester");

        WebElement takePassword= driver.findElement(By.id("password"));
        takePassword.sendKeys("Tester@123");

        WebElement button = driver. findElement(By.xpath("//button[@class=\"btn btn-success sign-in-page-form-button\"]"));

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
      for(WebElement e: list_of_plus){
          System.out.println(e.getText());
          e.click();
          WebElement button2 = driver. findElement(By.xpath( "//div[@class='Add-column-discription']/form/textarea"));
          //div[@class="Add-column-discription"]/form/textarea
          button2.click();
      }
//      list_of_plus.get(1).click();
//        Thread.sleep(3000);
    }
//    https://devbeta.betspertsgolf.com/the-rabbit-hole

}
