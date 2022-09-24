import java.sql.*;
public class w4ex5_8 {
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

        String selectstring ="SELECT R.DAY1, COUNT(*) AS COUNTER "
                            + "FROM RESERVES R "
                            + "GROUP BY R.DAY1 "
                            + "HAVING COUNT(*)>1" ;
        
        rs = statment.executeQuery(selectstring);
        System.out.println("sname:");     
        
        while (rs.next()){
            String date= rs.getString("DAY1");
            String counter= rs.getString("COUNTER");
            System.out.println("Date: "+date+"-->Count: "+counter);               
        }        
        statment.close();                
        dbConnection.close();
    }
}