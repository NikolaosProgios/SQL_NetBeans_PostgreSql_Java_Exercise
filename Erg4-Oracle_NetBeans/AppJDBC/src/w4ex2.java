//dropTable
import java.sql.*;

public class w4ex2 {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";
    
    static Statement statment = null ; 
        
        
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        
        statment = dbConnection.createStatement();
        
        statment.executeUpdate("DROP TABLE Reserves"    );
        statment.executeUpdate("DROP TABLE Sailors");
        statment.executeUpdate("DROP TABLE boats"  );

                
        dbConnection.close();
    }
}