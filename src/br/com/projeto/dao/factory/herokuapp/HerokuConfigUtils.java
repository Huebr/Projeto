
package br.com.projeto.dao.factory.herokuapp;

import java.net.URISyntaxException;
import java.sql.*;

public class HerokuConfigUtils {
	public static Connection getConnection() throws URISyntaxException, SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		String dbUrl = System.getenv("JDBC_DATABASE_URL");
		//String dbUrl = "jdbc:postgresql://ec2-174-129-195-73.compute-1.amazonaws.com:5432/d57p3hvc46b1rt?user=czllfgcbggyxep&password=1a9d41aced01a14d860d4a608130d472f6015cc521bc0393c7d8fe993bd2d366&sslmode=require";
	    return DriverManager.getConnection(dbUrl);
	}
	public static void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}
}

