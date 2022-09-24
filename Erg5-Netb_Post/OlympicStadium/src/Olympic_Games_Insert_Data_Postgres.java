import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
/**
 *
 * @author Euclid
 */
public class Olympic_Games_Insert_Data_Postgres {
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

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('M100902', 'Miki', 'Katsarou', 'Female', 53)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('O212754', 'Orthodoxos', 'Papazoglou', 'Male', 73)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('K256984', 'Katerina', 'Athanasiadou', 'Female', 33)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('M986542', 'Marika', 'Glava', 'Female', 70)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('I523175', 'Irene', 'Anagnostou', 'Female', 42)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('A556325', 'Ali', 'Bas Hamdi', 'Male', 29)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('A996325', 'Andreas', 'Kazasoglou', 'Male', 88)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('D564789', 'Dimitris', 'Rambias', 'Male', 40)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('E556489', 'Effi', 'Kokkota', 'Female', 36)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('F789654', 'Fotis', 'Dinos', 'Male', 51)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('G456165', 'Giorgos', 'Yannikopoulos', 'Male', 54)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('L871672', 'Lambrini', 'Poppi', 'Female', 40)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('P556321', 'Panayiotis', 'Voudouris', 'Male', 30)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('M235461', 'Melita', 'Tsoutreli', 'Female', 65)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('C456525', 'Christina', 'Nannou Katsanou', 'Female', 67)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('D456654', 'Damianos Georgios', 'Vrahamis', 'Male', 68)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('Y555671', 'Yannis', 'Gelegenidis', 'Male', 42)");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (1, 'M100902')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (2, 'O212754')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (3, 'K256984')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (4, 'M986542')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (5, 'I523175')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (6, 'A556325')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (7, 'A996325')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (8, 'D564789')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (9, 'E556489')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (10, 'F789654')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (11, 'G456165')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (12, 'L871672')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (2, 'P556321')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (10, 'M235461')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (5, 'C456525')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (8, 'D456654')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (1, 'Y555671')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (5, 'L871672')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (11, 'P556321')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (7, 'M235461')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (4, 'C456525')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (2, 'D456654')");

statement.executeUpdate("insert INTO HELPS (game, volunteer) VALUES (9, 'Y555671')");

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