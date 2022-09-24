import java.sql.*;
public class w4ex5_6 {
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

        String selectstring ="SELECT AVG(S.rating) AS AVGrating "
                            + "FROM SAILORS S "
                            + "WHERE S.rating IS NOT NULL and s.age<45"
                            ;
        
        rs = statment.executeQuery(selectstring);             
        
        while (rs.next()){
                float avgrating= rs.getFloat("AVGrating");
                avgrating =  ( (float) ((int)(avgrating*100)) /100 );
                System.out.println("Average rating: "+avgrating); 
        }        
        statment.close();                
        dbConnection.close();
    }
}