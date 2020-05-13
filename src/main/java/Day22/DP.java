package Day22;

import Day14.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;

public class DP {

    @DataProvider(name = "dpObjectArray")
    public static Object[][] dataProviderObjectArray() {

//Object[][] obj = new Object[2][2];
//obj[0][0]="Name" ;
//obj[0][1]="Aneesh" ;
//obj[1][0]="Name" ;
//obj[1][1]="Jim" ;

        Object[][] obj = new Object[][]
                {
                        {"Name", "Aneesh"},
                        {"Name", "Jim"},
                        {"Name", "John"},
                        {"Name", "Joseph"}

                };

        return obj;

    }


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


    @DataProvider(name = "dpIteratorHardcoded")
    public static Iterator<Object[]> dataProviderIterator_hardCoded() {
        ArrayList<Object[]> list = new ArrayList(
                Arrays.asList(
                        new Object[]{
                                new HashMap<Object, Object>() {
                                    {
                                        put("Name", "Aneesh");
                                        put("City", "Kochi");
                                    }
                                }},
                        new Object[]{
                                new HashMap<Object, Object>() {
                                    {
                                        put("Name", "Jim");
                                        put("City", "Kolkata");
                                    }
                                }},
                        new Object[]{new HashMap<Object, Object>() {
                            {
                                put("Name", "John");
                                put("City", "Delhi");
                            }
                        }}


                )
        );


        return list.iterator();
    }

    @DataProvider(name = "dpIteratorObjectArrayofClass")
    public static Iterator<Object[]> dataProviderIterator_ObjectArrayofClass() {
        ArrayList<Object[]> list = new ArrayList(
                Arrays.asList(
                        new Object[]{

                                new HashMap<String, Student>() {
                                    {
                                        put("Aneesh", new Student("Aneesh Narayanan", "Kochi"));
                                        put("Jim", new Student("Jim Micheal", "Kolkata"));


                                    }
                                }
                        },
                        new Object[]{
                                new HashMap<String, Student>() {
                                    {
                                        put("Jim", new Student("Jim Micheal", "Kolkata"));
                                        put("Aneesh", new Student("Aneesh Narayanan", "Kochi"));


                                    }
                                }
                        })
        );


        return list.iterator();
    }

    @DataProvider(name = "dpIteratorClassObject")
    public static Iterator<Object[]> dataProviderIterator_ClassObject() {
        ArrayList<Object[]> list = new ArrayList<Object[]>();

        Object[] objects = new Object[1];
        objects[0]=new Student("Aneesh", "Kochi");
        Object[] objects1 = new Object[1];
        objects1[0]=new Student("Jim", "Kolkata");

        list.add(objects);
        list.add(objects1);
        return list.iterator();

    }

    @DataProvider(name = "dpIteratormap")
    public static Iterator<Map> dataProviderIteratormap() {
        ArrayList<Map> list = new ArrayList(
                Arrays.asList(

                        new HashMap<Object, Object>() {
                            {
                                put("Name", "Aneesh");
                                put("City", "Kochi");
                            }
                        },
                        new HashMap<Object, Object>() {
                            {
                                put("Name", "Jim");
                                put("City", "Kolkata");
                            }
                        },
                        new HashMap<Object, Object>() {
                            {
                                put("Name", "John");
                                put("City", "Delhi");
                            }
                        }


                )
        );


        return list.iterator();
    }

}
