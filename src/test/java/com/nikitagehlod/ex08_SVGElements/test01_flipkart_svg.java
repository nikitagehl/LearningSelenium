package com.nikitagehlod.ex08_SVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class test01_flipkart_svg {

    @Test
    public void test_search_svg() throws InterruptedException {
       WebDriver driver = new EdgeDriver();
       driver.get("https://www.flipkart.com/");

       List< WebElement> input = driver.findElements(By.xpath("//input[@name=\"q\"]"));
        input.get(0).sendKeys("mobile");

        List<WebElement> svg= driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));
        svg.get(0).click();

        Thread.sleep(3000);
        driver.quit();

// sm_state sm_state_INMP
        ////*[name()="svg"]/*[name()='path']
   }
}
