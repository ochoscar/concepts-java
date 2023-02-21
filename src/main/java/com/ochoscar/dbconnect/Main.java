package com.ochoscar.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	// Metodo get conenction!!!!
	private static Connection dbConnection = null;
	private static final String connectionString = "jdbc:postgresql://rdsochoscar.cnv9tbq6ab5q.us-east-1.rds.amazonaws.com:5432/UDEM";
	private static final String user = "uudem";
	private static final String passwd = "javai2018*";

	public static void main(String[] args) throws SQLException {
		insert();
		list1();
		list2();
	}
	
	public static void list2( ) throws SQLException {
		Connection dbConnection = null;
		PreparedStatement statement = null;

		String selectTableSQL = "SELECT id, name, position from users where id = ?";
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.prepareStatement(selectTableSQL);
			statement.setLong(1, 2L);
			System.out.println(selectTableSQL);
			// execute select SQL stetement
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Long userid = rs.getLong("id");
				String name = rs.getString("name");
				String position = rs.getString("position");
				System.out.println("[" + userid + ", " + name + ", " + position + "]");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}
	
	public static void list1( ) throws SQLException {
		Connection dbConnection = null;
		Statement statement = null;

		String selectTableSQL = "SELECT id, name, position from users";
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(selectTableSQL);
			// execute select SQL stetement
			ResultSet rs = statement.executeQuery(selectTableSQL);
			while (rs.next()) {
				Long userid = rs.getLong("id");
				String name = rs.getString("name");
				String position = rs.getString("position");
				System.out.println("[" + userid + ", " + name + ", " + position + "]");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}
	
	public static void insert() throws SQLException {
		String insertTableSQL = "INSERT INTO users(name, position) values('oscar', 'docente')";
		Statement statement = null;
		//Connection dbConnection = null;
		
		try (Connection dbConnection = getDBConnection(); ){

			statement = dbConnection.createStatement();
			
			System.out.println(insertTableSQL);
			// execute insert SQL stetement
			statement.executeUpdate(insertTableSQL);
			System.out.println("Record is inserted into DBUSER table!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}
	
	private static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dbConnection = DriverManager.getConnection(connectionString, user, passwd);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}
	
	
}
