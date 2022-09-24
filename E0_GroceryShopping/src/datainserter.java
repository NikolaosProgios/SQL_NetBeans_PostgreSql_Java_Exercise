//Create Table_rows
import java.sql.*;
public class datainserter {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url             = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it175002" ;
    static String     username = "it175002";
    static String     passwd = "@Nick399P$";
    static Connection dbConnection    = null;
    static Statement  statement       = null;

    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
         dbConnection = DriverManager.getConnection (url, username, passwd);

        statement    = dbConnection.createStatement();
	statement.executeUpdate(

                 "insert into A2Landlady values ('L01', 'Maria', 'Antouaneta', 'Pontos');"
                + "insert into A2Landlady values ('L02', 'Stella', 'Mpentakou', 'Athina');"
                + "insert into A2Landlady values ('L03', 'Ioanna', 'Pappa', 'Ios');"

                + "insert into A2Grocery values ('G01', 'Makis', 'Tsimiski 30');"
                + "insert into A2Grocery values ('G02', 'Kostas', 'L. Nikis 51');"
                + "insert into A2Grocery values ('G03', 'Nikos', 'Venizelou 102');"

                + "insert into A2Product values ('P001', 'Lemonia', 1.20);"
                + "insert into A2Product values ('P002', 'Mila', 2.30);"
                + "insert into A2Product values ('P003', 'Aggouria', 3);"
                + "insert into A2Product values ('P004', 'Patates', 4);"

                + "insert into A2Shopping values('L01', 'G01', 'Deutera', 'P001', 10);"
                + "insert into A2Shopping values('L01', 'G02', 'Triti', 'P002', 3);"
                + "insert into A2Shopping values('L01', 'G03', 'Tetarti', 'P002', 2);"
                + "insert into A2Shopping values('L01', 'G01', 'Paraskeui', 'P003', 5);"
                + "insert into A2Shopping values('L01', 'G03', 'Deutera', 'P004', 8);"
                + "insert into A2Shopping values('L02', 'G01', 'Pempti', 'P001', 3);"
                + "insert into A2Shopping values('L02', 'G01', 'Pempti', 'P002', 4);"
                + "insert into A2Shopping values('L02', 'G03', 'Pempti', 'P003', 8);"
                + "insert into A2Shopping values('L02', 'G02', 'Pempti', 'P001', 7);"
                + "insert into A2Shopping values('L03', 'G01', 'Deutera', 'P004', 9);"
                ); 
		
               
        dbConnection.close();
    }
}