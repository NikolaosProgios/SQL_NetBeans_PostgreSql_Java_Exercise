import java.sql.*;

public class ex_5_3 {
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

	String selectString = "SELECT count(DISTINCT p.athlete) as kati " +
               "FROM athlete a, participates p, games g, stadium s " +
                "WHERE a.code = p.athlete AND p.game = g.code   AND g.stadium=s.name AND " +
                //"GROUP BY s.name " +
                //"HAVING s.name ='Olympic Stadium' " ;
                "s.name='Olympic Stadium' ";
    try {
        rs = statement.executeQuery(selectString);
     	System.out.println("count athlites: " );
        while(rs.next()) {
            int oh = rs.getInt("kati");//count(DISTINCT p.athlete)

            System.out.println( oh  );
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