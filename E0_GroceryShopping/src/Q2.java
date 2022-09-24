//questions
import java.sql.*;
public class Q2 {
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
        String selectstring ="SELECT  l.code , sum(s.quantity*p.price) as kati "
                    + "FROM A2Grocery  g inner join A2Shopping s "
                    + "on(g.code=s.Gcode)"
                    + "join A2Landlady  l on (l.code=s.Lcode) "
                    + "join  A2Product  p  on (p.code=s.Pcode) "
                    + "group by l.code " 
                ;
        rs = statment.executeQuery(selectstring);
        System.out.println("code \t kati");     
        
        while (rs.next()){
                String code = rs.getString("code");
                String kati = rs.getString("kati");
                System.out.println(code+"\t" + kati );                
        }
        
        statment.close();                
        dbConnection.close();
    }
}