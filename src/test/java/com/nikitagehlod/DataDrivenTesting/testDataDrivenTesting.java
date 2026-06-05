package com.nikitagehlod.DataDrivenTesting;

import net.bytebuddy.asm.Advice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataDrivenTesting {

    @DataProvider(name = "LoginData")
    public Object[][] getData(){
       return new Object[][] {
            new Object[]{ "josh4", "Tester@123"},
                    new Object[]{ "hello" , "12345678"}
        };
    }


    @Test( dataProvider = "LoginData")
    public void login(String email, String pass){
        System.out.println( email + " and " + pass);

    }
}
