//questions
import java.sql.*;
public class Q1 {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";    
    static Statement statment = null ;        
    
static ResultSet rs = null; 
    
    public static void main (String[] argv) throws Exception
    {
		/*Standard*/
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);       
        statment = dbConnection.createStatement();
		
		/*Select-from-Where ...*/
        String selectstring ="SELECT  g.name "
                    + "FROM A2Grocery g "
                    + "WHERE  EXISTS( "
                        + "SELECT l.code "
                        + "FROM A2Landlady l "
                        + "MINUS "
                        + "SELECT s.Pcode "
                        + "FROM A2Shopping s "
                        + "WHERE s.Gcode=g.code)" ;
        
        rs = statment.executeQuery(selectstring);
        System.out.println("name ");     
        
        while (rs.next()){
                String name = rs.getString("name");
                System.out.println(name );                
        }
        
        statment.close();                
        dbConnection.close();
    }
}