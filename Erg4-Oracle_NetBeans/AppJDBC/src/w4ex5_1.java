//questions
import java.sql.*;
public class w4ex5_1 {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";    
    static Statement statment = null ;        
    static ResultSet rs = null; 
    
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
                
        statment = dbConnection.createStatement();

        String selectstring = "Select S.sname,S.age " 
                                +"from Sailors S ";
        
        rs = statment.executeQuery(selectstring);
        System.out.println("sname    age");     
        
        while (rs.next()){
                String name = rs.getString("sname");
                float vage = rs.getFloat("age");
                System.out.println(name+ "    "+ vage );                
        }
        
        statment.close();                
        dbConnection.close();
    }
}