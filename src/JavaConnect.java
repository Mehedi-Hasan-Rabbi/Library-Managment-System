import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mehedi Hasan\\Documents\\NetBeansProjects\\Library Managment System\\LibraryNew.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
