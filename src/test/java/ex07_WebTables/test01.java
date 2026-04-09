package ex07_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test01 extends Exception {

    @Test
    public void verify_table_static() throws Exception{
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");


        driver.close();

    }
}
