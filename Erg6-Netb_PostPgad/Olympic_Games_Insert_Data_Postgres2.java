import java.sql.*;
/**
 *
 * @author Euclid
 */
public class Olympic_Games_Insert_Data_Postgres2 {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url             = "jdbc:postgresql://dblabs.it.teithe.gr:5432/euclid" ;
    static String     username = "username";
    static String     passwd = "passwd";
    static Connection dbConnection    = null;
    static Statement  statement       = null;
    
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();
        try {
statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (1, 'Aziz', 'Zakari', 'Male', '2/9/1976', 85, 175, 'Ghana', 'Ghana')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (2, 'Kim', 'Collins', 'Male', '4/5/1976', 77, 180, 'SKN', 'SKN')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (3, 'Michael', 'Frater', 'Male', '10/6/1982', 73, 175, 'Jamaica', 'Jamaica')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (4, 'Frank', 'Fredericks', 'Male', '10/2/1967', 75, 180, 'Namibia', 'Namibia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (5, 'Joshua', 'Ross', 'Male', '2/9/1981', 83, 185, 'Australia', 'Australia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (6, 'Alexander', 'Kosenkow', 'Male', '3/14/1977', 70, 178, 'Rusia', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (7, 'Andrey', 'Epishin', 'Male', '6/10/1981', 72, 177, 'Rusia', 'Rusia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (8, 'Jaysuma', 'Saidy Ndure', 'Male', '7/1/1984', 72, 192, '', 'Gam')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (9, 'Shawn', 'Crawford', 'Male', '1/14/1978', 81, 177, 'USA', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (10, 'Obadele', 'Thompson', 'Male', '3/30/1976', 78, 176, 'Barbados', 'Barbados')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (11, 'Vicente', 'Lima', 'Male', '6/4/1977', 65, 166, 'Brazil', 'Brazil')");
 
statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (12, 'Matic', 'Osovnikar', 'Male', '1/19/1980', 77, 179, 'Slovenia', 'Slovenia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (13, 'Deji', 'Aliu', 'Male', '11/22/1975', 63, 175, 'Nigeria', 'Nigeria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (14, 'Nicolas', 'Macrozonaris', 'Male', '8/22/1980', 73, 181, 'Canada', 'Canada')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (15, 'Gennadiy', 'Chernovol', 'Male', '6/6/1976', 85, 187, 'Rusia', 'Kazakstan')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (16, 'Idrissa', 'Sanou', 'Male', '6/12/1977', 88, 188, '', 'Bur')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (17, 'Justin', 'Gatlin', 'Male', '2/10/1982', 83, 185, 'USA', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (18, 'Jason', 'Gardener', 'Male', '9/18/1975', 75, 176, 'Great Britain', 'Great Britain')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (19, 'Uchenna', 'Emedolu', 'Male', '9/17/1976', 68, 185, 'Nigeria', 'Nigeria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (20, 'Nobuharu', 'Asahara', 'Male', '6/21/1972', 75, 179, 'Japan', 'Japan')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (21, 'Yeoryios', 'Theodoridis', 'Male', '12/12/1972', 80, 181, 'Greece', 'Greece')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (22, 'Ronald', 'Nemeth', 'Male', '9/19/1974', 80, 169, 'Hungary', 'Hungary')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (23, 'Nicconnor', 'Alexander', 'Male', '2/4/1977', 70, 188, 'Trinidad', 'Trinidad')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (24, 'Eddy', 'De Lepine', 'Male', '3/30/1984', 74, 175, 'France', 'France')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (25, 'Maurice', 'Greene', 'Male', '7/23/1974', 81, 175, 'USA', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (26, 'Asafa', 'Powell', 'Male', '11/11/1982', 88, 190, 'Jamaica', 'Jamaica')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (27, 'Leonard', 'Myles Mills', 'Male', '5/9/1973', 70, 175, 'Ghana', 'Ghana')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (28, 'Lukasz', 'Chyla', 'Male', '3/31/1981', 86, 188, 'Poland', 'Poland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (29, 'Kareem', 'Streete Thompson', 'Male', '3/30/1973', 91, 183, 'USA', 'CAY')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (30, 'Simone', 'Collio', 'Male', '12/27/1979', 74, 179, 'Italy', 'Italy')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (31, 'Jarbas', 'Mascarenhas', 'Male', '8/25/1980', 78, 185, 'Brazil', 'Brazil')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, country_of_origin, country_of_participation) VALUES (32, 'Eric Pacome', 'N Dri', 'Male', '1/1/1978', 'Ivory Coast', 'Ivory Coast')");

 

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (33, 'Andreas', 'Thorkildsen', 'Male', '4/1/1982', 88, 188, 'Norway', 'Norway')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (34, 'Vadims', 'Vasilevskis', 'Male', '1/5/1982', 89, 188, 'Latvia', 'Latvia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (1, 'Alexander', 'Makarov', 'Russia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (35, 'Sergey', 'Makarov', 'Male', '3/19/1973', 102, 190, 'Russia', 'Russia', 1)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (2, 'John', 'Trower', 'Great Britain')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (36, 'Steve', 'Backley', 'Male', '2/12/1969', 102, 195, 'Great Britain', 'Great Britain', 2)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (37, 'Alexander', 'Ivanov', 'Male', '5/25/1982', 95, 189, 'Russia', 'Russia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (3, 'Heino', 'Puuste', 'Estonia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (38, 'Andrus', 'Varnic', 'Male', '9/27/1977', 100, 182, 'Estonia', 'Estonia', 3)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (4, 'Maris', 'Griva', 'Latvia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (39, 'Eriks', 'Rags', 'Male', '6/1/1975', 95, 183, 'Latvia', 'Latvia', 4)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (40, 'Tero', 'Pitkamaki', 'Male', '12/19/1982', 90, 195, 'Finland', 'Finland')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (14, 'Jaroslav', 'Brabec', 'Czech')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (41, 'Jan', 'Zelezny', 'Male', '6/16/1966', 86, 185, 'Czech', ' Czech', 14)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (42, 'Matti', 'Narhi', 'Male', '8/17/1975', 100, 188, 'Finland', 'Finland')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (5, 'Jukka', 'Manninen', 'Finland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (43, 'Esko', 'Mikkola', 'Male', '2/14/1975', 95, 185, 'Finland', 'Finland', 5)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (6, 'Don', 'Babbitt', 'USA')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (44, 'Breaux', 'Greer', 'Male', '10/19/1976', 92, 190, 'USA', 'USA', 6)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (7, 'Terseus', 'Liebenberg', 'South Africa')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (45, 'Gerhardus', 'Pienaar', 'Male', '8/10/1981', 104, 194, 'South Africa', 'South Africa', 7)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (8, 'Christian', 'Nicolay', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (46, 'Christian', 'Nicolay', 'Male', '3/4/1976', 106, 188, 'Germany', 'Germany', 8)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (9, 'Janis', 'Lusis', 'Latvia')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (47, 'Voldemars', 'Lusis', 'Male', '12/7/1974', 102, 187, 'Latvia', 'Latvia', 9)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (10, 'Rudolph', 'Sopko', 'Austria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (48, 'William', 'Hamlyn Harris', 'Male', '1/14/1978', 96, 191, 'Austria', 'Austria', 10)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (49, 'Peter', 'Zupanc', 'Male', '1/8/1982', 90, 184, 'Slovenia', 'Slovenia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (11, 'Jaroslev', 'Brabec', 'Czech')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (50, 'Miroslav', 'Guzdek', 'Male', '8/3/1975', 93, 191, 'Czech', 'Czech', 11)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (51, 'Gergely', 'Horvath', 'Male', '6/5/1975', 100, 186, 'Hungary', 'Hungary')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (52, 'Ronny', 'Nilsen', 'Male', '5/7/1971', 90, 182, 'Norway', 'Norway')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (53, 'Manuel', 'Fuenmayor', 'Male', '12/3/1980', 105, 190, 'Venezuela', 'Venezuela')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (54, 'David', 'Brisseault', 'Male', '3/7/1969', 95, 185, 'France', 'France')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (55, 'Marian', 'Bokor', 'Male', '4/17/1977', 98, 196, 'Czech', 'Czech')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (56, 'Isbel', 'Luaces', 'Male', '7/20/1975', 99, 184, 'Cuba', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (57, 'Rongxlang', 'Li', 'Male', '1/18/1972', 86, 180, 'China', 'China')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (58, 'Yukifumi', 'Murakami', 'Male', '12/23/1979', 95, 184, 'Japan', 'Japan')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (12, 'Steve', 'Lemke', 'Austria')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (59, 'Oliver', 'Dziubak', 'Male', '3/30/1982', 101, 197, 'Germany', 'Austria', 12)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (13, 'Karin', 'Liebhardt', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (60, 'Peter', 'Esenwein', 'Male', '12/7/1967', 102, 189, 'Germany', 'Germany', 13)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (61, 'Sergey', 'Voynov', 'Male', '2/26/1977', 100, 188, 'Russia', 'Uzbekistan')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (62, 'Stuart', 'Farquhar', 'Male', '3/15/1982', 105, 186, 'New Zealand', 'New Zealand')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (63, 'Nick', 'Nieland', 'Male', '1/31/1972', 100, 190, 'Great Britain', 'Great Britain', 2)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (64, 'Jae Myong', 'Park', 'Male', '12/15/1981', 92, 181, 'Korea', 'Korea')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (65, 'Edi', 'Ponos', 'Male', '4/10/1976', 118, 196, 'Croatia', 'Croatia')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (15, 'Klaus', 'Bartonietz', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (66, 'Boris', 'Henry', 'Male', '12/14/1973', 110, 193, 'Germany', 'Germany', 15)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (16, 'Dionisio', 'Quintana', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (67, 'Osleidys', 'Menendez', 'Female', '11/14/1979', 80, 179, 'Cuba', 'Cuba', 16)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (17, 'Helge', 'Zoellkau', 'Germany')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (68, 'Steffi', 'Nerius', 'Female', '7/1/1972', 72, 178, 'Germany', 'Germany', 17)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (18, 'Vassilis', 'Kokkolis', 'Greece')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (69, 'Mirela', 'Manjani', 'Female', '12/21/1976', 64, 164, 'Greece', 'Greece', 18)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (70, 'Sonia', 'Bicet Poll', 'Female', '4/1/1971', 83, 171, 'Cuba', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (71, 'Lavern', 'Eve', 'Female', '6/16/1965', 81, 180, 'Bahamas', 'Bahamas')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (72, 'Noraida', 'Bicet', 'Female', '10/29/1977', 87, 180, 'Cuba', 'Cuba')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (73, 'Tetyana', 'Lyakhovych', 'Female', '5/20/1979', 81, 178, 'Ukraine', 'Ukraine')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (19, 'Yannis', 'Peristeris', 'Greece')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (74, 'Savva', 'Lika', 'Female', '6/27/1970', 70, 168, 'Greece', 'Greece', 19)");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (20, 'Kari', 'Ihalainen', 'Finland')");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (75, 'Taina', 'Kolkkala', 'Female', '10/24/1976', 73, 173, 'Finland', 'Finland', 20)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (76, 'Felicia', 'Tilea Moldovan', 'Female', '9/29/1967', 74, 167, 'Romania', 'Romania')");

statement.executeUpdate("insert INTO TRAINER (code, name, surname, country_of_origin) VALUES (21, 'Henryk', 'Michalski', 'Poland')");

System.out.println("Data inserted into Trainer table");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation, trainer_code) VALUES (77, 'Barbara', 'Madejczyk', 'Female', '9/30/1976', 80, 180, 'Poland', 'Poland', 21)");

statement.executeUpdate("insert INTO ATHLETE (code, name, surname, gender, date_of_birth, weight, height, country_of_origin, country_of_participation) VALUES (78, 'Francis', 'Obikwelu', 'Male', '11/22/1978', 74, 191, 'Nigeria', 'Portugal')");

System.out.println("Data inserted into Athlete table");

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

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('L871672', 'Lambrinos', 'Bourlesas', 'Male', 40)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('P556321', 'Panayiotis', 'Voudouris', 'Male', 30)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('M235461', 'Melita', 'Tsoutreli', 'Female', 65)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('C456525', 'Christina', 'Nannou Katsanou', 'Female', 67)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('D456654', 'Damianos Georgios', 'Vrahamis', 'Male', 68)");

statement.executeUpdate("insert INTO VOLUNTEER (at, name, surname, gender, age) VALUES ('Y555671', 'Yannis', 'Gelegenidis', 'Male', 42)");

System.out.println("Data inserted into Volunteer table");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Olympic Stadium', 72000, 'Athens')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Agios Kosmas Sailing Centre', 1600, 'Agios Kosmas')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Kaftanzoglio Stadium', 28200, 'Thessaloniki')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Pankritio Stadium', 26400, 'Heraklio')");

statement.executeUpdate("insert INTO STADIUM (name, capacity, city) VALUES ('Panthessaliko Stadium', 22700, 'Volos')");

System.out.println("Data inserted into Stadium table");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (1, 'Dimosthenis', 'Adamidis', 'Male', '8/27/1958')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (2, 'Gail', 'Davison', 'Male', '2/19/1956')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (3, 'Cezary', 'Jaszkowski', 'Male', '12/30/1938')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (4, 'David', 'Sandoval', 'Male', '6/21/1939')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (5, 'Sue', 'Neill', 'Male', '5/17/1944')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (6, 'Gunter', 'Wagner', 'Male', '6/24/1949')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (7, 'Maja', 'Walti', 'Male', '12/7/1953')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (8, 'Galina', 'Galkina', 'Female', '2/3/1951')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (9, 'Aikaterini', 'Manta', 'Female', '4/18/1981')");

statement.executeUpdate("insert INTO JUDGE (code, name, surname, gender, date_of_birth) VALUES (10, 'Li Jun', 'Ma', 'Male', '11/8/1959')");

System.out.println("Data inserted into Judge table");

statement.executeUpdate("insert INTO SPORT (code, name, gender, record, record_date, recordman_surname, recordman_name ) VALUES (1, 'Javelin', 'Female', 71.54, '7/1/2001', 'Hattestad', 'Trine')");

statement.executeUpdate("insert INTO SPORT (code, name, gender, record, record_date, recordman_surname, recordman_name ) VALUES (2, 'Javelin', 'Male', 90.17, '9/23/2000', 'Zelezny', 'Jan')");

statement.executeUpdate("insert INTO SPORT (code, name, gender, record, record_date, recordman_surname, recordman_name ) VALUES (3, '100m', 'Male', 9.84, '7/27/1996', 'Bailey', 'Donovan')");

System.out.println("Data inserted into Sport table");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (1, 'Final', '8/27/2004', '20:55', 'Olympic Stadium', 1, 1)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (2, 'Round Group A', '8/26/2004', '20:05', 'Olympic Stadium', 2, 2)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (3, 'Round Group B', '8/26/2004', '21:50', 'Olympic Stadium', 2, 3)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (4, 'Final', '8/28/2004', '20:40', 'Olympic Stadium', 2, 4)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (5, 'Round1', '8/21/2004', '19:40', 'Olympic Stadium', 3, 5)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (6, 'Round1', '8/21/2004', '19:47', 'Olympic Stadium', 3, 5)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (7, 'Round1', '8/21/2004', '19:54', 'Olympic Stadium', 3, 6)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (8, 'Round1', '8/21/2004', '20:01', 'Olympic Stadium', 3, 7)");
statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (9, 'Round1', '8/21/2004', '20:08', 'Olympic Stadium', 3, 7)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (10, 'Semifinal', '8/22/2004', '20:55', 'Olympic Stadium', 3, 8)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (11, 'Semifinal', '8/22/2004', '21:03', 'Olympic Stadium', 3, 8)");

statement.executeUpdate("insert INTO GAMES (code, level, gdate, gtime, stadium, sport, judge) VALUES (12, 'Final', '8/22/2004', '23:10', 'Olympic Stadium', 3, 9)");

System.out.println("Data inserted into Games table");

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

System.out.println("Data inserted into Helps table");


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
System.out.println("Data inserted into Participates table");

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
