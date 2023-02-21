package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
		// 1. Test de la conexion
		try {
			Connection conn = getConnection();
			conn.close();
			System.out.println("Conexion y desconexions exitosa");
		} catch(Exception ex) {
			System.out.println("Error de desconexion a la base de datos");
			ex.printStackTrace();
		}
		
		// 2. Insertar pelicula
		//insertMovie();
		
		// 3. Listar e imprimir peliculas
		listAndPrintMovies3();
		
		Long time = System.currentTimeMillis();
		System.out.println(1970 + time / (1000 * 60 * 60 * 24 * 365));
	}
	
	public static void listAndPrintMovies3() {
		String nomFromUI = "Titanic";
		String sql = "SELECT * FROM peliculas WHERE nombre = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);) {
			
			ps.setString(1, nomFromUI);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				// Consultar los datos de la fila, armar un string e imprimirlo
				Long id = rs.getLong("id");
				String nombre = rs.getString("nombre");
				String descipcion = rs.getString("descripcion");
				
				System.out.println(id + " - " + nombre + " - " + descipcion);
			}
			System.out.println("Fin de la consulta de peliculas");
		} catch(Exception ex) {
			System.out.println("Error consultado peliculas");
			ex.printStackTrace();
		}
	}
	
	public static void listAndPrintMovies2() {
		String nomFromUI = "Triple";
		try(Connection conn = getConnection();
			Statement st = conn.createStatement();) {
			
			System.out.println("Iniciando la consulta de peliculas");
			String sql = "SELECT * FROM peliculas WHERE nombre like '" + nomFromUI + "%'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				// Consultar los datos de la fila, armar un string e imprimirlo
				Long id = rs.getLong("id");
				String nombre = rs.getString("nombre");
				String descipcion = rs.getString("descripcion");
				
				System.out.println(id + " - " + nombre + " - " + descipcion);
			}
			System.out.println("Fin de la consulta de peliculas");
		} catch(Exception ex) {
			System.out.println("Error consultado peliculas");
			ex.printStackTrace();
		}
	}
	
	
	public static void listAndPrintMovies() {
		Connection conn = null;
		Statement st = null;
		try {
			System.out.println("Iniciando la consulta de peliculas");
			conn = getConnection();
			st = conn.createStatement();
			String sql = "SELECT * FROM peliculas";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				// Consultar los datos de la fila, armar un string e imprimirlo
				Long id = rs.getLong("id");
				String nombre = rs.getString("nombre");
				String descipcion = rs.getString("descripcion");
				
				System.out.println(id + " - " + nombre + " - " + descipcion);
			}
			System.out.println("Fin de la consulta de peliculas");
		} catch(Exception ex) {
			System.out.println("Error consultado peliculas");
			ex.printStackTrace();
		} finally {
			try {
				if(st != null) st.close();
			} catch(Exception ex) {
				System.out.println("Error de desconexion de la sesion");
			}
			try {
				if(conn != null) conn.close();
			} catch(Exception ex) {
				System.out.println("Error de desconexion de la sesion");
			}
		}
	}
	
	
	public static void insertMovie() {
		try {
			Connection conn = getConnection();
			Statement st = conn.createStatement();
			String sql = "INSERT INTO peliculas(nombre, descripcion) "
					+ "VALUES('Predestination', 'Muy rara')";
			st.executeUpdate(sql);
			System.out.println("Pelicula guarda exitosamente");
		} catch(SQLException ex) {
			System.out.println("Error guardando pelicula");
			ex.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// Cargar el driver
			Class.forName("org.postgresql.Driver");
			// Obtener la conexion
			conn = DriverManager.getConnection("jdbc:postgresql://udemincreible.cnv9tbq6ab5q.us-east-1.rds.amazonaws.com/mynetflix",
				"increible", "losmejores");
		} catch(Exception ex) {
			System.out.println("Error de conexion a la base de datos");
			ex.printStackTrace();
		}
		return conn;
	}

}
