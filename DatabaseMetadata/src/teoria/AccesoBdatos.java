package teoria;
//// https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/DatabaseMetaData.html

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

// Alberto Carrera Mart�n - Abril 2020


public class AccesoBdatos {

	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "empleados";
    private static String hostname = "localhost";
    private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";

    private Connection conecta;
    private DatabaseMetaData metadata;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
		metadata = conecta.getMetaData();
	}
	
	public void desconectar() throws SQLException, ClassNotFoundException {
		
		conecta = null; // = conecta.close();
	}
	
	public  void infoGeneralMetadata() throws SQLException {
		
		String mensaje= "Gestor de base de datos: " + metadata.getDatabaseProductName() + "\n" 
				+"Versi�n instalada: "+ metadata.getDatabaseProductVersion() + "\n" 
        		+ "Usuario conectado: " + metadata.getUserName() + "\n"
        		+ "Tipo de driver JDBC: " + metadata.getDriverName() + "\n"
        		+ "Versiones JDBC soportadas: " +metadata.getJDBCMinorVersion() +" a " + metadata.getJDBCMajorVersion() + "\n"
        		+ "Versi�n del Driver: " + metadata.getDriverVersion();

		JOptionPane.showMessageDialog(null,  mensaje, "Informaci�n del SGBD", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public  void tablasMetadata(String catalogo) throws SQLException {
		String mensaje = "";
		String tablaTipos[] = {"TABLE", "VIEW"};
		ResultSet rs = metadata.getTables(catalogo, null, null, tablaTipos);
		while (rs.next()) {
			mensaje = mensaje +  "Nombre: " +	rs.getString("TABLE_NAME") + " - "
							  + "Tipo : " + rs.getString("TABLE_TYPE") + "\n";
		}
		JOptionPane.showMessageDialog(null,  mensaje, "Tablas de la Bda " + catalogo, 
													JOptionPane.INFORMATION_MESSAGE);	
	}
	
	public  void tablasMetadataMejorado(String catalogo) throws SQLException {
		String mensaje = "";
		if (!existeCatalogo(catalogo)) {
			mensaje = " No existe el cat�logo: " + catalogo;
			JOptionPane.showMessageDialog(null,  mensaje, catalogo + " no encontrado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(-1);
		}
		String tablaTipos[] = {"TABLE", "VIEW"};
		ResultSet rs = metadata.getTables(catalogo, null, null, tablaTipos);
		while (rs.next()) {
			mensaje = mensaje +  "Nombre: " +	rs.getString("TABLE_NAME") + " - "
							  + "Tipo : " + rs.getString("TABLE_TYPE") + "\n";
		}
		JOptionPane.showMessageDialog(null,  mensaje, "Tablas de la Bda " + catalogo, JOptionPane.INFORMATION_MESSAGE);	
	}
	
	public boolean existeCatalogo (String catalogo) throws SQLException {
		boolean encontrado = false;
		ResultSet rs = metadata.getCatalogs();
		
		while (rs.next()) {
			if (rs.getString("TABLE_CAT").equalsIgnoreCase(catalogo)){
				encontrado =true;
				break;
			}
		}
		return encontrado;
	}
	
	public void columnasMetaData(String catalogo , String tabla ) throws SQLException {
		String mensaje = "";
		ResultSet rs = metadata.getColumns(catalogo, null, tabla, null);
		while (rs.next()) {
			mensaje = mensaje +"Nombre :"+(rs.getString("COLUMN_NAME")+" - "+"Tipo:"+rs.getString("TYPE_NAME")+" - "+"TAMAÑO: "+rs.getString("COLUMN_SIZE")+" - "
					+"¿Admite nulos ? ->"+ rs.getString("IS_NULLABLE"))+"\n" ;
		}
		if (mensaje.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe la bda "+catalogo+"o la tabla "+ tabla , "Columna de la tabla "+tabla + "de la Bda"+ catalogo , JOptionPane.INFORMATION_MESSAGE);
		}
		mensaje = mensaje +"------------------------------------------------------------------------------------------------------------------------------------";
		ResultSet rs2 = metadata.getPrimaryKeys(catalogo, null, tabla);
		
		String clavePrimaria = "";
		while(rs2.next()) {
			clavePrimaria = clavePrimaria + rs2.getString("COLUMN_NAME")+ "               ";
		}
		mensaje = mensaje + "Clave primaria "+clavePrimaria;
		JOptionPane.showMessageDialog(null, mensaje , "Columnas de la tabla "+tabla+"de la Bda"+catalogo,JOptionPane.INFORMATION_MESSAGE);
	}

	private ResultSet getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}