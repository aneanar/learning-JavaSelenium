package Day16;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Utilities.PropertiesFile;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DBHandling {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;
        Object[] result= null;
        List resultList = new ArrayList();
        try
        {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
            String connectionUrl = PropertiesFile.readConfigValue("sqlConnectionString");
             con = DriverManager.getConnection(connectionUrl);

            if (con != null) {
                System.out.println("Connection is established");
            }
            else {
                System.out.println("Connection is not established");
            }
            Statement stmt = con.createStatement();
//Update statement execution which would return number of rows got updated
           // stmt.executeUpdate("<update statement>");

            //select statement and return it into a result set

            ResultSet resultSet = stmt.executeQuery("select  * from cases where gencaseid = 'ETP-002467'");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                for (int iCol = 1; iCol <= columnCount; iCol++) {
                    String columnName = metaData.getColumnLabel(iCol);
                    String rowValue = resultSet.getString(iCol);
                    resultList.add(rowValue);
                    //  System.out.println(columnName + "<<<<>>>>" + rowValue);
                }
//                String [] temp = new String[resultList.size()];
                //adding to a string using toArray methode to convert a list to object array
               // System.out.println(result.getClass());
                result =  resultList.toArray();

                for (Object item: result)
                {

                    System.out.println(item);

                }



            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }


        finally {

            if (con!=null&&!con.isClosed())
            {con.close();
                System.out.println("DB connection is closed");}
        }

    }
}