package Day14;

import java.io.IOException;

public class UseExcelRW {
public static String xlPath ="C:\\Users\\aneesh.narayanan\\OneDrive - EY\\Documents\\Aneesh_backup\\OLD Desktop\\Learning\\Selenium_training_EY\\Search.xlsx";
    public static void main(String[] args) throws IOException {
        ExcelRW xlObj = new ExcelRW(xlPath);
        int rowCount = xlObj.getRowCount("SearchResult");
        for (int i=1;i<=rowCount;i++)
        {
            String cellValue = xlObj.excelRead("SearchResult", i, 0);
            System.out.println(cellValue);

        }
        xlObj.excelSaveAndClose(xlPath);

    }
}
