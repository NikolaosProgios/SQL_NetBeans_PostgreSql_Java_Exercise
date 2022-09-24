//Create Table_rows
import java.sql.*;
public class ologin {
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
        statement = dbConnection.createStatement();

	//CreateTable
	statement.executeUpdate("create table A2Landlady"
                        + "(code varchar(5) not null primary key,"
                        + "name varchar(10),"
                        + "surname varchar(20),"
                        + "origin varchar(20))"                                 
                            );
		
	statement.executeUpdate("create table A2Grocery "
                + "(code varchar(5) not null primary key,"
                + "name varchar(30),"
                + "address varchar(30))"                                 
                    );
		
       statement.executeUpdate("create table A2Product "
               + "(code varchar(5) not null primary key,"
               + "name varchar(20),"
               + "price integer)"                                
                    );
      statement.executeUpdate("create table A2Shopping "
              + "(Lcode varchar(5) not null references A2Landlady(code),"
              + "Gcode varchar(5) not null references A2Grocery(code),"
              + "Sday varchar(10),"
              + "Pcode varchar(5) not null references A2Product(code),"
              + "quantity integer,"
              + "primary key(Lcode, Gcode, Pcode) )"                                
              );
 
        dbConnection.close();
    }
}