import java.sql.*;

public class ex_5_5 {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url             = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it175002" ;
    static String     username = "it175002";
    static String     passwd = "@Nick399P$";
    static Connection dbConnection    = null;
    static Statement  statement       = null;
    static ResultSet rs		      = null;

    public static void main (String[] argv) throws Exception
    {
        
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();

	String 
        selectString = "SELECT v.at , v.surname , count(*) as fores "+
                       "FROM helps h inner join volunteer v  on (h.volunteer=v.at) "+
                       "GROUP BY  v.at" ;

    try {
        rs = statement.executeQuery(selectString);
     	System.out.println("Athlitis " );
        while(rs.next()) {
            String name = rs.getString("at");
            String surname = rs.getString("surname");
            String fores = rs.getString("fores");
            System.out.println( name + "    " + surname + "     " + fores );
        } 
    /**/
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
    /**/
        statement.close();
        dbConnection.close();
    }
}