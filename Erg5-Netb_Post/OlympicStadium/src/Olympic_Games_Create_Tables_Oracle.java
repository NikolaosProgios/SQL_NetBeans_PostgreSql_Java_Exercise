import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Olympic_Games_Create_Tables_Oracle {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";
    static Statement  statement       = null;

    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
  /*      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your username: ");
	String username = keyboard.readLine();
	System.out.print("Enter your password: ");
	String passwd = keyboard.readLine();
	System.out.print("Enter the database name: ");
	String dbname = keyboard.readLine();
	url = url + dbname;
        System.out.println(username + " "+ passwd+" "+ url);*/
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();

        try {
            statement.executeUpdate("drop TABLE PARTICIPATES");
            statement.executeUpdate("drop TABLE GAMES");
            statement.executeUpdate("drop TABLE ATHLETE");
            statement.executeUpdate("drop TABLE SPORT");
            statement.executeUpdate("drop TABLE TRAINER");
            statement.executeUpdate("drop TABLE JUDGE");
            statement.executeUpdate("drop TABLE STADIUM");
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
        
        statement.executeUpdate("CREATE TABLE STADIUM (" +
                                "name varchar(30) not null primary key," +
                                "capacity integer," +
                                "city varchar(20))");
        System.out.println("Table Stadium created successfully");
        
        statement.executeUpdate("CREATE TABLE JUDGE ("+
                                "code integer not null primary key,"+
                                "name varchar(20),"+
                                "surname varchar(30),"+
                                "gender varchar(6),"+
                                "date_of_birth date)");
        System.out.println("Table Judge created successfully");
        
        statement.executeUpdate("CREATE TABLE TRAINER (" +
                                "code integer not null primary key," +
                                "name varchar(20),"+
                                "surname varchar(30),"+
                                "country_of_origin varchar(20))");
        System.out.println("Table Trainer created successfully");
        
        statement.executeUpdate("CREATE TABLE SPORT (" +
                                "code integer not null primary key," +
                                "name varchar(50)," +
                                "gender varchar(6),"+
                                "record float,"+
                                "record_date date,"+
                                "recordman_surname varchar(30),"+
                                "recordman_name varchar(20))");
        System.out.println("Table Sport created successfully");
        
        statement.executeUpdate("CREATE TABLE ATHLETE (" +
                                "code integer not null primary key,"+
                                "name varchar(50),"+
                                "surname varchar(30),"+
                                "gender varchar(6),"+
                                "date_of_birth date,"+
                                "weight float,"+
                                "height integer,"+
                                "country_of_origin varchar(20),"+
                                "country_of_participation varchar(20),"+
                                "trainer_code integer,"+
                                "foreign key(trainer_code) references TRAINER(code))");
        System.out.println("Table Athlete created successfully");
        
        statement.executeUpdate("CREATE TABLE GAMES ("+
                                "code integer not null primary key,"+
                                "glevel varchar(20),"+
                                "gtimestamp timestamp,"+
                                "stadium varchar(30) not null," + 
                                "sport integer not null,"+
                                "judge integer not null," +
                                "foreign key(stadium) references STADIUM(name)," +
                                "foreign key(sport) references SPORT(code)," +
                                "foreign key(judge) references JUDGE(code))");
        System.out.println("Table Games created successfully");
        
        statement.executeUpdate("CREATE TABLE PARTICIPATES ("+
                                "game integer not null references GAMES(code),"+
                                "athlete integer not null references ATHLETE(code),"+
                                "primary key(game, athlete),"+
                                "performance float,"+
                                "cancellation varchar(1))");
        System.out.println("Table Participates created successfully");
        
        statement.close();
        dbConnection.close();
    }
}