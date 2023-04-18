import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControlAcceso {

	

		private static String driver = "com.mysql.cj.jdbs.Driver";
		private static String database = "sample";
		private static String hostname="localhost";
		private static String port = "3307";
		
		private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	    private static String username = "root";
	    private static String password = "root";
	    
	    
	    public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select titulo , precio from Libros where precio >2");
		}
		

}
