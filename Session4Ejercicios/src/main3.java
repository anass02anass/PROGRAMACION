import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main3 {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "pedidos";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Scanner sc = new Scanner(System.in);
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("introduce número de categoría ");
		int numero = sc.nextInt();
		CallableStatement proc = conn.prepareCall("call incrementarPrecioCategoria(?,?,?)");
		
		System.out.println("introduce porcentage");
		int numero2 = sc.nextInt();
		proc.setInt(2, numero2);
		proc.registerOutParameter(3, java.sql.Types.INTEGER);
		
		ResultSet rs = proc.executeQuery();
		double a = 0;
		int resultado = proc.getInt(3);
		if (rs.next()) {
			a = rs.getDouble(1);
			System.out.println("se incremento el precio   " + numero2 + "% para  " +resultado +"productos de la categoria  ->"+numero);
		} else {
			System.out.println("No se actualizó ningún producto de la categoria ->" + numero );
			rs.close();
			proc.close();
			conn.close();
		}
	}

}
