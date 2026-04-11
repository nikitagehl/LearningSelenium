package ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Verify_signup_now_login extends Exception{

    @Description("verify negative test case for login")
    @Test
    public void test_negative_login(){

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver= new EdgeDriver(edgeOptions);

        driver.get("https://devbeta.betspertsgolf.com/sign-in");

//        <input type="text" autocomplete="off"
//        class="form-control sign-in-page-card-form-input"
//    id="email" name="email"
//    placeholder="Username/Email" value="betspertstester@gmail.com">

//        WebElement takeIputData= driver.findElement(By.id("email"));
//        takeIputData.sendKeys("nikbarfa07");
//
//        WebElement takePassword= driver.findElement(By.id("password"));
//        takePassword.sendKeys("Tester@123");


//        <button type="button"
//        class="btn btn-success sign-in-page-form-button">
//        Sign IN</button>


//        WebElement clickButtton= driver.findElement(By.className("sign-in-page-form-button"));
//
//        clickButtton.click();


        WebElement sign_up_now= driver.findElement(By.partialLinkText("Sign Up Today!"));
        sign_up_now.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();

    }
}
