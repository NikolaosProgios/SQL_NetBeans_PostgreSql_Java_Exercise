import java.sql.*;
public class w4ex5_4 {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";    
    static Statement statment = null ;        
    static ResultSet rs = null; 
    
    public static void main (String[] argv) throws Exception    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
                
        statment = dbConnection.createStatement();

        String selectstring ="SELECT s.sname "
                    + "FROM Sailors s "
                    + "WHERE NOT EXISTS("
                        + "SELECT b.bid "
                        + "FROM Boats b "
                        + "MINUS "//oracle to minus einai to except tis postgress
                        + "SELECT r.bid "
                        + "FROM Reserves r "
                        + "WHERE r.sid=s.sid)" ;
        
        rs = statment.executeQuery(selectstring);
        System.out.println("sname:");     
        
        while (rs.next()){
                String name = rs.getString("sname");
                System.out.println(name);                
        }        
        statment.close();                
        dbConnection.close();
    }
}