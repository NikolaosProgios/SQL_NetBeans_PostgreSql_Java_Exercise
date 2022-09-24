import java.sql.*;

public class ex_5_1 {
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

	String selectString = "SELECT j.name, j.surname " 
                +"FROM athlete a, participates p, games g, trainer t, judge j " 
                +"WHERE a.code = p.athlete AND p.game = g.code AND t.code = a.trainer_code AND " 
                +"j.code = g.judge AND p.cancellation = 'D' "
                + "AND t.surname = 'Bartonietz'";

    try {
        rs = statement.executeQuery(selectString);
     	System.out.println("Judge name      Judge Surname" );
        while(rs.next()) {
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            System.out.println( name + "          " + surname );
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