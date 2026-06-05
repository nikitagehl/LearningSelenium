package com.nikitagehlod.DataDrivenTesting;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class utilExcel {



    static Workbook book;
    static Sheet sheet;

   public static  String sheet_Path = System.getProperty("user.dir")+"src/test/java/Resources/Login.xlsx";

   public static Object[][] getDataFromExcel(String Sheetname) throws IOException {


       FileInputStream file = null;

       file = new FileInputStream(sheet_Path);
       try {
           book = WorkbookFactory.create(file);
       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (EncryptedDocumentException e) {
           throw new RuntimeException(e);
       }
            sheet = book.getSheet(Sheetname);
       Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

       for (int i = 0; i < sheet.getLastRowNum(); i++) {

           int j;
           for (j = 0; j < sheet.getRow(0).getLastCellNum(); j++) ;
           data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

       }

       return data;
   }

   public Object[][] getdata() throws IOException {
       return getDataFromExcel("Sheet1");
   }



//    src/test/java/Resources/Login.xlsx


}
