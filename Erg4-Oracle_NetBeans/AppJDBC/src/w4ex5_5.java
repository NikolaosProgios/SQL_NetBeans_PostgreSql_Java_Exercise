import java.sql.*;
public class w4ex5_5 {
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

        String selectstring ="SELECT S.rating, AVG(S.age) AS AVGAGE "
                            + "FROM SAILORS S "
                            + "WHERE S.rating IS NOT NULL "
                            + "GROUP BY S.rating" ;
        
        rs = statment.executeQuery(selectstring);
             
        
        while (rs.next()){
                float rating = rs.getFloat("rating");
                float avga= rs.getFloat("AVGAGE");
                System.out.println("Rating: "+rating+"-->Average age: "+avga);               
        }        
        statment.close();                
        dbConnection.close();
    }
}