//Create Table
import java.sql.*;
public class w4ex3 {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it175002";
    static String     passwd = "@Nick99P$";    
    static Statement statment = null ;  
    
    public static void main (String[] argv) throws Exception
    {
        Class.forName (driverClassName);
        dbConnection = DriverManager.getConnection (url, username, passwd);
        
        
        statment = dbConnection.createStatement();
        
        
        statment.executeUpdate("create table Sailors("
                                 + "sid integer not null,"
                                 + "sname varchar(15),"
                                 + "rating integer,"
                                 + "age real,"
                                 + "primary key(sid))"
                                );
        statment.executeUpdate("create table boats("
                                 +"bid integer not null,"
                                 +"bname varchar(20),"
                                 +"color varchar(20),"
                                 +"primary key(bid),"
                                 +"constraint b_color check (color in ( 'red', 'green', 'blue', 'yellow')))"
                                );
        statment.executeUpdate("create table Reserves("
                                 +"sid integer not null, "
                                 +"bid integer not null,"
                                 +"day1 date not null,"
                                 +"primary key (sid, bid, day1),"
                                 +"constraint r_sid foreign key(sid) references Sailors,"
                                 +"constraint r_bid foreign key(bid) references boats)"
                                );        
        dbConnection.close();
    }
}