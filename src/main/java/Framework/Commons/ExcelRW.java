package Framework.Commons;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelRW {
    FileInputStream fis;
    XSSFWorkbook wb;
    FileOutputStream fos;
    //init excel
    public ExcelRW(String xlPath) throws IOException {
        fis = new FileInputStream(xlPath);
        wb = new XSSFWorkbook(fis);
    }
    //Sheet object creation

    public XSSFSheet getSheet(String sheetName){
        XSSFSheet sheet = wb.getSheet(sheetName);
        return sheet;
    }

    public int getRowCount(String sheetName)
    {
        int rowCount = getSheet(sheetName).getLastRowNum();
        return rowCount;
    }

    public int getColCount (String sheetName){
        int colCount = getSheet(sheetName).getRow(0).getLastCellNum();
        return colCount;

    }
    //Excel Read values
    public String excelRead(String sheetName,int row, int column) {
        String cellValue = "";
        Cell cell = getSheet(sheetName).getRow(row).getCell(column);
        if (cell.getCellType() == CellType.STRING) {
            cellValue = cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            cellValue = String.valueOf(cell.getNumericCellValue());
        } else if (cell.getCellType() == CellType.BLANK) {
            cellValue = "";
        }
        return cellValue;
    }
    public void excelWrite(String sheetName, int row, int column,String value)
    {
        getSheet(sheetName).getRow(row).getCell(column).setCellValue(value);

    }
    //Save and Close function
    public void excelSaveAndClose(String xlPath) throws IOException {
        fos = new FileOutputStream(xlPath);
        wb.write(fos);
        fis.close();
        fos.close();

    }

}
