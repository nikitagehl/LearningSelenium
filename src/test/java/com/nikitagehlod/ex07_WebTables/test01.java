package com.nikitagehlod.ex07_WebTables;

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

        WebElement table= driver.findElement(By.id("customers"));

        String startpath= "//table[@id=\"customers\"]/tbody/tr[";
//             i=   "5"
                String endpath= "]/td[";
//                      j=   "2]";
        String last= "]";
       Integer rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println(rows);
        Integer col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        for (int i= 2; i<= rows; i++){
            for (int j= 1; j<=col ; j++){
//                System.out.println(startpath+i+endpath+j+"]");
                String tableData = driver.findElement(By.xpath(startpath+i+endpath+j+last)).getText();
                System.out.println(tableData);

                if(tableData.contains("Helen Bennett")){
                    System.out.println("yes");
                    String find_following_sibling = startpath+endpath+last+"/following-sibling::td";
                    System.out.println(driver.findElement(By.xpath(find_following_sibling)).getText());
                }
            }
        }
        driver.close();

    }
}
