package com.nikitagehlod.ex11_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class test_MostPolutedState {


    @Test
    public void test_cityPoluted(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.aqi.in/in/world-most-polluted-cities");

        List < WebElement> e= driver.findElements(By.cssSelector("div.location-name"));

        for(WebElement element : e){
//            System.out.println(element.getText());
            String leftOf= driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
            String rightOf= driver.findElement(with(By.tagName("div")).toRightOf(element)).getText();
//            System.out.println(rightOf);

            System.out.println( leftOf + "|" + element.getText() + "|" + rightOf);
        }
    }
}
