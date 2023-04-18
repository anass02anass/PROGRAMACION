import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main1 {


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
	System.out.println("introduce el número de pedido ");
	int numero = sc.nextInt();
	CallableStatement proc = conn.prepareCall("Select importePedido(?)");
	proc.setInt(1, numero);
	ResultSet rs = proc.executeQuery();
	double a = 0;
	if(rs.next()) {
		a = rs.getDouble(1);
		System.out.println("El total del pedido " + numero + " es " + a);
	}else {
		System.out.println("Existe algún error o el pedido "+numero+" no está");
		rs.close();
		proc.close();
		conn.close();
	}
	
	
	
	
}






}