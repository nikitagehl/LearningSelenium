package com.nikitagehlod.DataDrivenTesting;

import org.testng.annotations.Test;

public class DataDrivenExcel {





  @Test (dataProvider = "getData", dataProviderClass = utilExcel.class)
       public void golf_Login(String username, String pass){

           System.out.println(username);
           System.out.println(pass);
       }
}
