import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

    public class excelreader {
        // to create file empty
        static FileInputStream fis = null;
        //to can read file and the path of file
        public FileInputStream getfile() throws FileNotFoundException {
            // String filepath = System.getProperty("user.dir") + "/src/test/resources/data.xlsx";
            String filepath = ".\\src\\test\\resources\\waqfydata.xlsx";

            File file = new File(filepath);
            fis = new FileInputStream(file);
            return fis;
        }

        public Object[][] getexceldata() throws IOException {
            fis = getfile();
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("Sheet1");
            int totalnumberofrows = sheet.getPhysicalNumberOfRows();
            int totalnumofcolumns = sheet.getRow(0).getLastCellNum();//4
            System.out.println("coll" + totalnumofcolumns);
            System.out.println("row" + totalnumberofrows);
            String[][] arrayexcel = new String[totalnumberofrows-1][totalnumofcolumns];
            for (int i = 1; i < totalnumberofrows; i++) {
                for (int j = 0; j < totalnumofcolumns; j++) {
                    XSSFRow row = sheet.getRow(i);
                    System.out.println("ddfdfdfd" + row);
                    arrayexcel[i-1][j] = row.getCell(j).toString().replaceAll("^\"|\"$", "");


                }
            }

            return arrayexcel;


        }

    }

