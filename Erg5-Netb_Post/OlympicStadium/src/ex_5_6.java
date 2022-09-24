import java.sql.*;
public class ex_5_6 
{    
    static String     OdriverClassName = "oracle.jdbc.OracleDriver" ;
    static String     Ourl = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection OdbConnection = null;
    static String     Ousername = "it175002";
    static String     Opasswd = "@Nick99P$";
    static Statement  Ostatement       = null;
    static ResultSet Ors		      = null;
        
    static String     PdriverClassName = "org.postgresql.Driver" ;
    static String     Purl             = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it175002" ;
    static String     Pusername = "it175002";
    static String     Ppasswd = "@Nick399P$";
    static Connection PdbConnection    = null;
    static Statement  Pstatement       = null;
    static ResultSet Prs		      = null;

    public static void main (String[] argv) throws Exception
    {
        //Oracle
        Class.forName (OdriverClassName);
        OdbConnection = DriverManager.getConnection (Ourl, Ousername, Opasswd);
        Ostatement    = OdbConnection.createStatement();
        //postgresql
        Class.forName (PdriverClassName);
        PdbConnection = DriverManager.getConnection (Purl, Pusername, Ppasswd);
        Pstatement    = PdbConnection.createStatement();

	String OselectString = "SELECT g.code " +
                "FROM sport s INNER JOIN games g ON s.code=g.sport " +
                "WHERE g.glevel= 'Final' AND s.gender = 'Male' AND s.name= '100m'";

        Ors = Ostatement.executeQuery(OselectString);

        while(Ors.next()) {
            int gamecode = Ors.getInt("code");
            String selectStringP = "SELECT v.name, v.surname " +
                "FROM volunteer v INNER JOIN helps h ON h.volunteer=v.at " +
                "WHERE h.game='"+gamecode+"'";
        
            Prs = Pstatement.executeQuery(selectStringP);

            while(Prs.next()){
                String vname = Prs.getString("name");
                String vsurname = Prs.getString("surname");
                System.out.println(vname + " " + vsurname);            
        }
       }      
        Ostatement.close();
        OdbConnection.close();
        Pstatement.close();
        PdbConnection.close();
    }
}