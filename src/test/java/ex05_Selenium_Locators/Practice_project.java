package ex05_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_project extends Exception{


    @Test
    public void test_ketlone(){
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximise");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_button = driver.findElement(By.id("btn-make-appointment"));
        make_appointment_button.click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement enter_email= driver.findElement(By.id("txt-username"));
        enter_email.sendKeys("John Doe");

        WebElement enter_pass= driver.findElement(By.id("txt-password"));
        enter_pass.sendKeys("ThisIsNotAPassword");

        WebElement button= driver.findElement(By.id("btn-login"));
        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
         driver.close();

    }
}
