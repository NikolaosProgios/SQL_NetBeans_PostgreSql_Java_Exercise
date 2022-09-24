import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Olympic_Games_Insert_Data_Oracle {
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
statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (1, 'Aziz', 'Zakari', 'Male', date'1976-2-9', 85, 175, 'Ghana', 'Ghana')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (2, 'Kim', 'Collins', 'Male', date'1976-4-5', 77, 180, 'SKN', 'SKN')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (3, 'Michael', 'Frater', 'Male', date'1982-10-6', 73, 175, 'Jamaica', 'Jamaica')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (4, 'Frank', 'Fredericks', 'Male', date'1967-10-2', 75, 180, 'Namibia', 'Namibia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (5, 'Joshua', 'Ross', 'Male', date'1981-2-9', 83, 185, 'Australia', 'Australia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (6, 'Alexander', 'Kosenkow', 'Male', date'1977-3-14', 70, 178, 'Rusia', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (7, 'Andrey', 'Epishin', 'Male', date'1981-6-10', 72, 177, 'Rusia', 'Rusia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (8, 'Jaysuma', 'Saidy Ndure', 'Male', date'1984-7-1', 72, 192, '', 'Gam')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (9, 'Shawn', 'Crawford', 'Male', date'1978-1-14', 81, 177, 'USA', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (10, 'Obadele', 'Thompson', 'Male', date'1976-3-30', 78, 176, 'Barbados', 'Barbados')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (11, 'Vicente', 'Lima', 'Male', date'1977-6-4', 65, 166, 'Brazil', 'Brazil')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (12, 'Matic', 'Osovnikar', 'Male', date'1980-1-19', 77, 179, 'Slovenia', 'Slovenia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (13, 'Deji', 'Aliu', 'Male', date'1975-11-22', 63, 175, 'Nigeria', 'Nigeria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (14, 'Nicolas', 'Macrozonaris', 'Male', date'1980-8-22', 73, 181, 'Canada', 'Canada')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (15, 'Gennadiy', 'Chernovol', 'Male', date'1976-6-6', 85, 187, 'Rusia', 'Kazakstan')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (16, 'Idrissa', 'Sanou', 'Male', date'1977-6-12', 88, 188, '', 'Bur')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (17, 'Justin', 'Gatlin', 'Male', date'1982-2-10', 83, 185, 'USA', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (18, 'Jason', 'Gardener', 'Male', date'1975-9-18', 75, 176, 'Great Britain', 'Great Britain')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (19, 'Uchenna', 'Emedolu', 'Male', date'1976-9-17', 68, 185, 'Nigeria', 'Nigeria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (20, 'Nobuharu', 'Asahara', 'Male', date'1972-6-21', 75, 179, 'Japan', 'Japan')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (21, 'Yeoryios', 'Theodoridis', 'Male', date'1972-12-12', 80, 181, 'Greece', 'Greece')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (22, 'Ronald', 'Nemeth', 'Male', date'1974-9-19', 80, 169, 'Hungary', 'Hungary')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (23, 'Nicconnor', 'Alexander', 'Male', date'1977-2-4', 70, 188, 'Trinidad', 'Trinidad')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (24, 'Eddy', 'De Lepine', 'Male', date'1984-3-30', 74, 175, 'France', 'France')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (25, 'Maurice', 'Greene', 'Male', date'1974-7-23', 81, 175, 'USA', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (26, 'Asafa', 'Powell', 'Male', date'1982-11-11', 88, 190, 'Jamaica', 'Jamaica')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (27, 'Leonard', 'Myles Mills', 'Male', date'1973-5-9', 70, 175, 'Ghana', 'Ghana')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (28, 'Lukasz', 'Chyla', 'Male', date'1981-3-31', 86, 188, 'Poland', 'Poland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (29, 'Kareem', 'Streete Thompson', 'Male', date'1973-3-30', 91, 183, 'USA', 'CAY')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (30, 'Simone', 'Collio', 'Male', date'1979-12-27', 74, 179, 'Italy', 'Italy')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (31, 'Jarbas', 'Mascarenhas', 'Male', date'1980-8-25', 78, 185, 'Brazil', 'Brazil')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, country_of_origin, country_of_participation) VALUES (32, 'Eric Pacome', 'N Dri', 'Male', date'1978-1-1', 'Ivory Coast', 'Ivory Coast')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (33, 'Andreas', 'Thorkildsen', 'Male', date'1982-4-1', 88, 188, 'Norway', 'Norway')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (34, 'Vadims', 'Vasilevskis', 'Male', date'1982-1-5', 89, 188, 'Latvia', 'Latvia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (1, 'Alexander', 'Makarov', 'Russia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (35, 'Sergey', 'Makarov', 'Male', date'1973-3-19', 102, 190, 'Russia', 'Russia', 1)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (2, 'John', 'Trower', 'Great Britain')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (36, 'Steve', 'Backley', 'Male', date'1969-2-12', 102, 195, 'Great Britain', 'Great Britain', 2)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (37, 'Alexander', 'Ivanov', 'Male', date'1982-5-25', 95, 189, 'Russia', 'Russia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (3, 'Heino', 'Puuste', 'Estonia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (38, 'Andrus', 'Varnic', 'Male', date'1977-9-27', 100, 182, 'Estonia', 'Estonia', 3)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (4, 'Maris', 'Griva', 'Latvia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (39, 'Eriks', 'Rags', 'Male', date'1975-6-1', 95, 183, 'Latvia', 'Latvia', 4)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (40, 'Tero', 'Pitkamaki', 'Male', date'1982-12-19', 90, 195, 'Finland', 'Finland')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (14, 'Jaroslav', 'Brabec', 'Czech')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (41, 'Jan', 'Zelezny', 'Male', date'1966-6-16', 86, 185, 'Czech', ' Czech', 14)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (42, 'Matti', 'Narhi', 'Male', date'1975-8-17', 100, 188, 'Finland', 'Finland')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (5, 'Jukka', 'Manninen', 'Finland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (43, 'Esko', 'Mikkola', 'Male', date'1975-2-14', 95, 185, 'Finland', 'Finland', 5)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (6, 'Don', 'Babbitt', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (44, 'Breaux', 'Greer', 'Male', date'1976-10-19', 92, 190, 'USA', 'USA', 6)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (7, 'Terseus', 'Liebenberg', 'South Africa')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (45, 'Gerhardus', 'Pienaar', 'Male', date'1981-8-10', 104, 194, 'South Africa', 'South Africa', 7)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (8, 'Christian', 'Nicolay', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (46, 'Christian', 'Nicolay', 'Male', date'1976-3-4', 106, 188, 'Germany', 'Germany', 8)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (9, 'Janis', 'Lusis', 'Latvia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (47, 'Voldemars', 'Lusis', 'Male', date'1974-12-7', 102, 187, 'Latvia', 'Latvia', 9)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (10, 'Rudolph', 'Sopko', 'Austria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (48, 'William', 'Hamlyn Harris', 'Male', date'1978-1-14', 96, 191, 'Austria', 'Austria', 10)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (49, 'Peter', 'Zupanc', 'Male', date'1982-1-8', 90, 184, 'Slovenia', 'Slovenia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (11, 'Jaroslev', 'Brabec', 'Czech')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (50, 'Miroslav', 'Guzdek', 'Male', date'1975-8-3', 93, 191, 'Czech', 'Czech', 11)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (51, 'Gergely', 'Horvath', 'Male', date'1975-6-5', 100, 186, 'Hungary', 'Hungary')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (52, 'Ronny', 'Nilsen', 'Male', date'1971-5-7', 90, 182, 'Norway', 'Norway')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (53, 'Manuel', 'Fuenmayor', 'Male', date'1980-12-3', 105, 190, 'Venezuela', 'Venezuela')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (54, 'David', 'Brisseault', 'Male', date'1969-3-7', 95, 185, 'France', 'France')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (55, 'Marian', 'Bokor', 'Male', date'1977-4-17', 98, 196, 'Czech', 'Czech')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (56, 'Isbel', 'Luaces', 'Male', date'1975-7-20', 99, 184, 'Cuba', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (57, 'Rongxlang', 'Li', 'Male', date'1972-1-18', 86, 180, 'China', 'China')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (58, 'Yukifumi', 'Murakami', 'Male', date'1979-12-23', 95, 184, 'Japan', 'Japan')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (12, 'Steve', 'Lemke', 'Austria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (59, 'Oliver', 'Dziubak', 'Male', date'1982-3-30', 101, 197, 'Germany', 'Austria', 12)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (13, 'Karin', 'Liebhardt', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (60, 'Peter', 'Esenwein', 'Male', date'1967-12-7', 102, 189, 'Germany', 'Germany', 13)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (61, 'Sergey', 'Voynov', 'Male', date'1977-2-26', 100, 188, 'Russia', 'Uzbekistan')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (62, 'Stuart', 'Farquhar', 'Male', date'1982-3-15', 105, 186, 'New Zealand', 'New Zealand')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (63, 'Nick', 'Nieland', 'Male', date'1972-1-31', 100, 190, 'Great Britain', 'Great Britain', 2)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (64, 'Jae Myong', 'Park', 'Male', date'1981-12-15', 92, 181, 'Korea', 'Korea')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (65, 'Edi', 'Ponos', 'Male', date'1976-4-10', 118, 196, 'Croatia', 'Croatia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (15, 'Klaus', 'Bartonietz', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (66, 'Boris', 'Henry', 'Male', date'1973-12-14', 110, 193, 'Germany', 'Germany', 15)");


statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (16, 'Dionisio', 'Quintana', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (67, 'Osleidys', 'Menendez', 'Female', date'1979-11-14', 80, 179, 'Cuba', 'Cuba', 16)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (17, 'Helge', 'Zoellkau', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (68, 'Steffi', 'Nerius', 'Female', date'1972-7-1', 72, 178, 'Germany', 'Germany', 17)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (18, 'Vassilis', 'Kokkolis', 'Greece')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (69, 'Mirela', 'Manjani', 'Female', date'1976-12-21', 64, 164, 'Greece', 'Greece', 18)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (70, 'Sonia', 'Bicet Poll', 'Female', date'1971-4-1', 83, 171, 'Cuba', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (71, 'Lavern', 'Eve', 'Female', date'1965-6-16', 81, 180, 'Bahamas', 'Bahamas')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (72, 'Noraida', 'Bicet', 'Female', date'1977-10-29', 87, 180, 'Cuba', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (73, 'Tetyana', 'Lyakhovych', 'Female', date'1979-5-20', 81, 178, 'Ukraine', 'Ukraine')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (19, 'Yannis', 'Peristeris', 'Greece')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (74, 'Savva', 'Lika', 'Female', date'1970-6-27', 70, 168, 'Greece', 'Greece', 19)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (20, 'Kari', 'Ihalainen', 'Finland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (75, 'Taina', 'Kolkkala', 'Female', date'1976-10-24', 73, 173, 'Finland', 'Finland', 20)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (76, 'Felicia', 'Tilea Moldovan', 'Female', date'1967-9-29', 74, 167, 'Romania', 'Romania')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (21, 'Henryk', 'Michalski', 'Poland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (77, 'Barbara', 'Madejczyk', 'Female', date'1976-9-30', 80, 180, 'Poland', 'Poland', 21)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (78, 'Francis', 'Obikwelu', 'Male', date'1978-11-22', 74, 191, 'Nigeria', 'Portugal')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Olympic Stadium', 72000, 'Athens')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Agios Kosmas Sailing Centre', 1600, 'Agios Kosmas')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Kaftanzoglio Stadium', 28200, 'Thessaloniki')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Pankritio Stadium', 26400, 'Heraklio')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Panthessaliko Stadium', 22700, 'Volos')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (1, 'Dimosthenis', 'Adamidis', 'Male', date'1958-8-27')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (2, 'Gail', 'Davison', 'Male', date'1956-2-19')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (3, 'Cezary', 'Jaszkowski', 'Male', date'1938-12-30')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (4, 'David', 'Sandoval', 'Male', date'1939-6-21')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (5, 'Sue', 'Neill', 'Male', date'1944-5-17')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (6, 'Gunter', 'Wagner', 'Male', date'1949-6-24')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (7, 'Maja', 'Walti', 'Male', date'1953-12-7')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (8, 'Galina', 'Galkina', 'Female', date'1951-2-3')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (9, 'Aikaterini', 'Manta', 'Female', date'1981-4-18')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (10, 'Li Jun', 'Ma', 'Male', date'1959-11-8')");

statement.executeUpdate("insert INTO SPORT (code, name, gender, record, record_date, recordman_surname, recordman_name ) VALUES (1, 'Javelin', 'Female', 71.54, date'2001-7-1', 'Hattestad', 'Trine')");

statement.executeUpdate("insert INTO SPORT (code, name, gender, record, record_date, recordman_surname, recordman_name ) VALUES (2, 'Javelin', 'Male', 90.17, date'2000-9-23', 'Zelezny', 'Jan')");

statement.executeUpdate("insert INTO SPORT (code, name, gender, record, record_date, recordman_surname, recordman_name ) VALUES (3, '100m', 'Male', 9.84, date'1996-7-27', 'Bailey', 'Donovan')");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (1, 'Final', TIMESTAMP '2004-8-27 20:55:00', 'Olympic Stadium', 1, 1)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (2, 'Round Group A', TIMESTAMP'2004-8-26 20:05:00', 'Olympic Stadium', 2, 2)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (3, 'Round Group B', TIMESTAMP'2004-8-26 21:50:00', 'Olympic Stadium', 2, 3)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (4, 'Final', TIMESTAMP'2004-8-28 20:40:00', 'Olympic Stadium', 2, 4)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (5, 'Round1', TIMESTAMP'2004-8-21 19:40:00', 'Olympic Stadium', 3, 5)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (6, 'Round1', TIMESTAMP'2004-8-21 19:47:00', 'Olympic Stadium', 3, 5)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (7, 'Round1', TIMESTAMP'2004-8-21 19:54:00', 'Olympic Stadium', 3, 6)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (8, 'Round1', TIMESTAMP'2004-8-21 20:01:00', 'Olympic Stadium', 3, 7)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (9, 'Round1', TIMESTAMP'2004-8-21 20:08:00', 'Olympic Stadium', 3, 7)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (10, 'Semifinal', TIMESTAMP'2004-8-22 20:55:00', 'Olympic Stadium', 3, 8)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (11, 'Semifinal', TIMESTAMP'2004-8-22 21:03:00', 'Olympic Stadium', 3, 8)");

statement.executeUpdate("insert INTO GAMES (code, glevel, gtimestamp, stadium, sport, judge) VALUES (12, 'Final', TIMESTAMP'2004-8-22 23:10:00', 'Olympic Stadium', 3, 9)");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 33, 86.50, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 34, 84.95, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 35, 84.84, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 36, 84.13, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 37, 83.31, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 38, 83.25, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 39, 83.14, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 40, 83.01, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 41, 80.59, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 42, 80.28, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 43, 79.43, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (4, 44, 74.36, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 34, 84.43, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 37, 82.18, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 40, 82.04, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 33, 81.74, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 41, 81.18, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 39, 80.84, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 56, 80.07, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 57, 79.94, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 58, 78.59, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 59, 78.53, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 60, 78.41, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 61, 74.68, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 62, 74.63, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 63, 72.79, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 64, 72.70, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (3, 65, 71.43, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, cancellation) VALUES (3, 66, 'D')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 44, 87.25, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 35, 86.08, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 43, 83.64, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 38, 83.25, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 42, 81.06, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 36, 80.68, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 45, 79.95, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 46, 79.77, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 47, 79.27, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 48, 77.43, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 49, 77.34, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 50, 76.45, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 51, 73.95, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 52, 73.46, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 53, 72.26, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 54, 71.86, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (2, 55, 71.74, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 67, 71.53, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 68, 65.82, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 69, 64.29, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 70, 63.54, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 71, 62.77, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 72, 62.51, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 73, 61.75, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 74, 60.91, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 75, 60.72, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 76, 59.72, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (1, 77, 58.22, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 9, 9.89, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 10, 10.12, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 11, 10.26, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 12, 10.26, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 13, 10.26, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 14, 10.28, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 15, 10.42, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (6, 16, 10.43, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 17, 9.96, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 18, 10.15, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 19, 10.15, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 20, 10.24, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 21, 10.36, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 22, 10.38, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (7, 23, 10.48, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, cancellation) VALUES (7, 24, 'D')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 1, 10.02, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 2, 10.05, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 3, 10.11, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 4, 10.17, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 5, 10.22, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 6, 10.24, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 7, 10.29, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (8, 8, 10.39, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 25, 9.93, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 26, 9.99, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 27, 10.18, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 28, 10.23, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 29, 10.24, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 30, 10.29, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 31, 10.30, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (9, 32, 10.32, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (10, 9, 10.07, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (10, 17, 10.09, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (10, 1, 10.11, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (10, 10, 10.22, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (10, 3, 10.29, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (10, 19, 10.35, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 17, 9.85, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 25, 9.87, 'Q')");

statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 9, 9.89, 'Q')");
statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 26, 9.94, 'Q')");
statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 2, 10.00, 'Q')");
statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 10, 10.10, 'Q')");
statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, cancellation) VALUES (12, 1, 'D')");
statement.executeUpdate("insert INTO PARTICIPATES (game, athlete, performance, cancellation) VALUES (12, 78, 9.86, 'Q')");

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