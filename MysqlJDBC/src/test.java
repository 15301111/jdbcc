import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class test {
	public static Connection getConnection() throws SQLException {
        Connection conn = null;
 
       
            // assign db parameters
            String url       = "jdbc:mysql://localhost:3306/mysqljdbc";
            String user      = "root";
            String password  = "root";
            
            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
       
        return conn;
    }
	
	public static void main(String[] args) {
        // create a new connection from MySQLJDBCUtil
        try (Connection conn = getConnection()) {
            
            // print out a message
            System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
