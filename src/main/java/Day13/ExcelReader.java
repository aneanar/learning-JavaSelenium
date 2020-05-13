package Day13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        //Open excel
        FileInputStream fis = new FileInputStream("C:\\Users\\aneesh.narayanan\\OneDrive - EY\\Documents\\Aneesh_backup\\OLD Desktop\\Learning\\Selenium_training_EY\\Search.xlsx");
        //connect to workbook and sheet
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheet("SearchResult");

        //get rowcount to iterate
        int rowcount = sheet1.getLastRowNum();
        System.out.println("Total rows number is: " + rowcount);

        // Core logic to read cell
        String cellValue = "";
        for (int i=1; i<=rowcount;i++){

            Cell cell  = sheet1.getRow(i).getCell(0);

            if(cell.getCellType()== CellType.STRING){
                cellValue = cell.getStringCellValue();
            }
            else if (cell.getCellType()== CellType.NUMERIC)
            {
                cellValue=String.valueOf(cell.getNumericCellValue());
            }
            else if (cell.getCellType()== CellType.BLANK)
            {
                cellValue="";
            }
            System.out.println(cellValue);
            // Core logic to write cell
            sheet1.getRow(i).getCell(1).setCellValue(i);

            //save and close
            FileOutputStream fos = new FileOutputStream("C:\\Users\\aneesh.narayanan\\OneDrive - EY\\Documents\\Aneesh_backup\\OLD Desktop\\Learning\\Selenium_training_EY\\Search.xlsx");
            wb.write(fos);
            fis.close();
            fos.close();
        }




    }

}
