import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main2 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "pedidos";
    private static String hostname = "localhost";
    private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Scanner sc = new Scanner (System.in );
		Connection conn = DriverManager.getConnection(url , username , password);
		System.out.println("introduce el número de categoria ");
		int numero = sc.nextInt();
		CallableStatement proc = conn.prepareCall("call productosCategoriaBajoMinimos(?)");
		proc.setInt(1, numero);
		System.out.println("Nombre Producto  - precio - existencias - Minimo ");
		System.out.println("--------------------------------------------------");
		ResultSet rs = proc.executeQuery();
		double a = 0;
		double c = 0; 
		double d = 0 ; 
		
		while(rs.next()) {
			String b = rs.getString(1);
			a = rs.getDouble(2);
			c = rs.getDouble(3);
			d = rs.getDouble(4);
			
			System.out.println(b+" | " + a + " | " + c+ " | "+ d);
		
			
		}
		rs.close();
		proc.close();
		conn.close();
		
	}

}
