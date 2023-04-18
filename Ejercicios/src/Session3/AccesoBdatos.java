package Session3;

/*
 * Revisado para versi�n 8.0.19 de MySQL 
 * Alberto Carrera Mart�n
 * y a�adido comentarios el 17 de marzo de 2020
 * 
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "demodb";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null; // = conecta.close();
	}

	public boolean insertar(Integer clave, String nombre, String localidad) {
		try {
			String sql = "insert into dept values (?,?,?)";
			PreparedStatement inserta = conecta.prepareStatement(sql);
			inserta.setInt(1, clave);
			inserta.setString(2, nombre);
			inserta.setString(3, localidad);
			inserta.executeUpdate();
			return true; // Todo ha ido bien
		} catch (SQLException e) {
			return false;// No ha ido bien la inserci�n
		}
	}

	public int insertarConBean(Depto registro) {
		try {
			String sql = "insert into dept values (?,?,?)";
			PreparedStatement inserta = conecta.prepareStatement(sql);
			inserta.setInt(1, registro.getDeptno());
			inserta.setString(2, registro.getDname());
			inserta.setString(3, registro.getLoc());
			inserta.executeUpdate();
			return 1;
		} catch (SQLException e) {
			return e.getErrorCode();
		}
	}

	public ArrayList<Depto> consultarTodos() {
		ArrayList<Depto> deptos = new ArrayList<Depto>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM dept");
			ResultSet reg = consulta.executeQuery();
			while (reg.next()) {
				Depto departamento = new Depto(reg.getInt(1), reg.getString(2), reg.getString(3));
				deptos.add(departamento);
			}
			consulta.close();
		} catch (SQLException e) {
			return null; // En caso de error devuelvo la lista null
		}
		return deptos; // Si todo va bien devuelvo la lista (�ArrayList no ResultSet!) de departamentos
	}

	public Depto consultarUno(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM dept WHERE deptno=?");
			consulta.setInt(1, numero);
			ResultSet reg = consulta.executeQuery();
			Depto departamento = new Depto();
			if (reg.next()) {
				departamento.setDeptno(reg.getInt(1));
				departamento.setDname(reg.getString(2));
				departamento.setLoc(reg.getString(3));
			} else
				departamento = null;
			consulta.close();
			return departamento;
		} catch (SQLException e) {
			// System.out.println("error en la consulta - "+e.getMessage());
			return null;
		}
	}

	public int actualizar(Depto registro) {
		try {
			String sql = "update dept set dname=?, loc=? where deptno=?";
			PreparedStatement actualiza = conecta.prepareStatement(sql);
			actualiza.setString(1, registro.getDname());
			actualiza.setString(2, registro.getLoc());
			actualiza.setInt(3, registro.getDeptno());
			return (actualiza.executeUpdate());
			// Nota la instrucci�n anterior equivale a:
			// int filas = actualiza.executeUpdate();
			// return filas
		} catch (SQLException e) {
			// System.out.println("error al actualizar en dept - "+e.getMessage());
			return 0;
		}
	}

	public int borrar(int numero) {
		int filas = 0; //
		try {
			PreparedStatement baja = conecta.prepareStatement("DELETE FROM dept WHERE deptno=?");
			baja.setInt(1, numero);
			filas = baja.executeUpdate();
			baja.close();
			return filas;
		} catch (SQLException e) {
			return e.getErrorCode(); // En caso de error en la consulta devuelve el c�digo de error MySQL
		}
	}

	// metodo para Busqueda Por Codigo.
	public Empleado busquedaPorCodigo(int numero) {
		PreparedStatement consulta;
		try {
			Empleado em = new Empleado();
			String cadenaSQL = "SELECT * FROM emp  where EMPNO=?";
			consulta =conecta.prepareStatement(cadenaSQL);
			consulta.setInt(1, numero);
			ResultSet reg = consulta.executeQuery();
			
			
			if (reg.next()) {
				em.setEmpNo(reg.getInt(1));
				em.setNombre(reg.getString(2));
				em.setTrabajo(reg.getString(3));
				em.setMgr(reg.getInt(4));
				em.setFechaAntiguedad(reg.getDate(5));
				em.setSalario(reg.getDouble(6));
				em.setComision(reg.getDouble(7));
				em.setDeptNo(reg.getInt(8));

			} else {
				em = null;
			}
			consulta.close();
			return em;
		} catch (SQLException ex) {
			return null;
		}
	}
}