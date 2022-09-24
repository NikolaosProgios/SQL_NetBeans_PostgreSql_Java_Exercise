import java.sql.*;

public class ex_5_4 {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";
    static Statement  statement       = null;
    static ResultSet rs		      = null;

    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();

String selectString = "SELECT a.name , a.surname " +
               "FROM athlete a, participates p, games g, sport s " +
                "WHERE a.code = p.athlete AND p.game = g.code   AND g.sport=s.code AND " 
                //Andres               Telikos          100metron
                +"s.gender='Male' AND g.glevel='Final' AND s.name = '100m' AND " +
                "p.performance =(SELECT min(p2.performance) " +
                                    "FROM participates p2, games g2, sport s2 " +
                                    "WHERE  p2.game = g2.code  AND g2.sport=s2.code AND " + 
                                    "s2.gender='Male' AND g2.glevel='Final' AND name = '100m'  ) ";

    try {
        rs = statement.executeQuery(selectString);
     	System.out.println("Athlitis " );
        while(rs.next()) {
            String name = rs.getString("name");
            String surname = rs.getString("surname");

            System.out.println( name+" "+  surname );
        }
    
    
    
    } catch(SQLException ex) {
	System.out.println("\n -- SQL Exception --- \n");
	while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		System.out.println("SQLState: " + ex.getSQLState());
		System.out.println("ErrorCode: " + ex.getErrorCode());
		ex = ex.getNextException();
		System.out.println("");
	}
     }
        statement.close();
        dbConnection.close();
    }
}