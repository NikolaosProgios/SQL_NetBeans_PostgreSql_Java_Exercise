import java.sql.*;

public class Olympic_Games_Create_Tables_Postgres2 {
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
            statement.executeUpdate("drop TABLE PARTICIPATES");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE HELPS"); 
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE GAMES");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE ATHLETE");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE SPORT");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE TRAINER");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE JUDGE");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE STADIUM");
        } catch(SQLException ex) {}
        try {
            statement.executeUpdate("drop TABLE VOLUNTEER");
        } catch(SQLException ex) {}
        
        statement.executeUpdate("CREATE TABLE VOLUNTEER (" +
				"at char(10) not null primary key," +
				"name char(20)," +
				"surname char(30)," +
                                "gender char(6),"+
				"age integer)");
        System.out.println("Table Volunteer created successfully");
        statement.executeUpdate("CREATE TABLE STADIUM (" +
                                "name char(30) not null primary key," +
                                "capacity integer," +
                                "city char(20))");
        System.out.println("Table Stadium created successfully");
        statement.executeUpdate("CREATE TABLE JUDGE ("+
                                "code integer not null primary key,"+
                                "name char(20),"+
                                "surname char(30),"+
                                "gender char(6),"+
                                "date_of_birth date)");
        System.out.println("Table Judge created successfully");
        statement.executeUpdate("CREATE TABLE TRAINER (" +
                                "code integer not null primary key," +
                                "name char(20),"+
                                "surname char(30),"+
                                "country_of_origin char(20))");
        System.out.println("Table Trainer created successfully");
        statement.executeUpdate("CREATE TABLE SPORT (" +
                                "code integer not null primary key," +
                                "name char(50)," +
                                "gender char(6),"+
                                "record float,"+
                                "record_date date,"+
                                "recordman_surname char(30),"+
                                "recordman_name char(20))");
        System.out.println("Table Sport created successfully");
        statement.executeUpdate("CREATE TABLE ATHLETE (" +
                                "code integer not null primary key,"+
                                "name char(50),"+
                                "surname char(30),"+
                                "gender char(6),"+
                                "date_of_birth date,"+
                                "weight float,"+
                                "height integer,"+
                                "country_of_origin char(20),"+
                                "country_of_participation char(20),"+
                                "trainer_code integer,"+
                                "foreign key(trainer_code) references TRAINER(code))");
        System.out.println("Table Athlete created successfully");
        statement.executeUpdate("CREATE TABLE GAMES ("+
                                "code integer not null primary key,"+
                                "level char(20),"+
                                "gdate date,"+
                                "gtime time,"+
                                "stadium char(30) not null references STADIUM(name),"+
                                "sport integer not null references SPORT(code),"+
                                "judge integer not null references JUDGE(code))");
        System.out.println("Table Games created successfully");
        statement.executeUpdate("CREATE TABLE HELPS ("+
                                "game integer not null references GAMES(code),"+
                                "volunteer char(10) not null references VOLUNTEER(at),"+
                                "primary key(game, volunteer))");
        System.out.println("Table Helps created successfully");
        statement.executeUpdate("CREATE TABLE PARTICIPATES ("+
                                "game integer not null references GAMES(code),"+
                                "athlete integer not null references ATHLETE(code),"+
                                "primary key(game, athlete),"+
                                "performance float,"+
                                "cancellation char)");
        System.out.println("Table Participates created successfully");
        
        statement.close(); 
        dbConnection.close();
    }
}
