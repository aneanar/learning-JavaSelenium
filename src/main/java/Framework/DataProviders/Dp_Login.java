package Framework.DataProviders;

import Day14.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;

public class Dp_Login {
    /**
     *      * Example of How to use an iterator object to dataprovider where date entered inline
     * @return
     */
    @DataProvider(name = "InvalidLoginData")
    public static Iterator<Object[]> dataProviderIterator_hardCoded() {
        ArrayList<Object[]> list = new ArrayList(
                Arrays.asList(
                        new Object[]{
                                new HashMap<Object, Object>() {
                                    {
                                        put("UserName", "Aneesh");
                                        put("Password", "Pwd1");
                                    }
                                }},
                        new Object[]{
                                new HashMap<Object, Object>() {
                                    {
                                        put("UserName", "Jim");
                                        put("Password", "Kolkata");
                                    }
                                }},
                        new Object[]{new HashMap<Object, Object>() {
                            {
                                put("UserName", "John");
                                put("Password", "Delhi");
                            }
                        }}


                )
        );


        return list.iterator();
    }

    /**
     * Example of How to use an iterator object to dataprovider where date read from excel sheet
     * @return
     * @throws IOException
     */
    @DataProvider(name = "dpIteratorExcel")
    public static Iterator<Object[]> dataProviderIterator_excel() throws IOException {
        List<Object[]> list = new ArrayList<>();
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir")+"\\src\\main\\resources\\TestData.xlsx");
        String sheetName = "TestData";
        int rowCount = excelRW.getRowCount(sheetName);
        int colCount = excelRW.getColCount(sheetName);


        for (int irow=1;irow<=rowCount;irow++)
        {
            Object[] objArray = new Object[1];
            Map<String, String> hmap = new HashMap<String,String>();

            for (int icol=0;icol<colCount;icol++)
            {
                String key= excelRW.excelRead(sheetName,0,icol);
                String value = excelRW.excelRead(sheetName,irow,icol);
                hmap.put(key,value);


            }
            objArray[0]=hmap;
            list.add(objArray);
        }
        return list.iterator();
    }


}
