package teoria;

import java.sql.SQLException;

public class Main3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		AccesoBdatos ac  = new AccesoBdatos( );
		ac.conectar();
		ac.columnasMetaData("empleados", "departamentos");
		ac.columnasMetaData("pedidos","detalles_pedido");
		ac.columnasMetaData("trabajadores","departamentos");
		ac.desconectar(); 
		
	}

}
