import java.sql.*;
public class Olympic_Games_Create_Tables_Postgres {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url             = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it175002" ;
    static String     username = "it175002";
    static String     passwd = "@Nick399P$";
    static Connection dbConnection    = null;
    static Statement  statement       = null;

    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
         dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();

        try {
            statement.executeUpdate("drop TABLE HELPS");
            statement.executeUpdate("drop TABLE VOLUNTEER");
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
        statement.executeUpdate("CREATE TABLE VOLUNTEER (" +
				"at char(10) not null primary key," +
				"name char(20)," +
				"surname char(30)," +
                                "gender char(6),"+
				"age integer)");
        System.out.println("Table Volunteer created successfully");
         statement.executeUpdate("CREATE TABLE HELPS ("+
                                "game integer not null,"+
                                "volunteer char(10) not null references VOLUNTEER(at),"+
                                "primary key(game, volunteer))");
        System.out.println("Table Helps created successfully");
         statement.close();
        dbConnection.close();
    }
}