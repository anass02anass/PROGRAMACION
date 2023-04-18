package Session3;

import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {

		AccesoBdatos acc = new AccesoBdatos( );
		System.out.println(acc.busquedaPorCodigo(100));
	}

}
