
package br.com.projeto.dao;

import java.net.URISyntaxException;
import java.sql.*;

public class ConfigUtils {
	public static Connection getConnection() throws URISyntaxException, SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		String dbUrl = System.getenv("JDBC_DATABASE_URL");
	    return DriverManager.getConnection(dbUrl);
	}
	public static void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}
}

