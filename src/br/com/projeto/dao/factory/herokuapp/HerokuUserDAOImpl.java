
package br.com.projeto.dao.factory.herokuapp;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.projeto.dao.UserDAO;
import br.com.projeto.models.User;
import br.com.projeto.models.UserImpl;

public class HerokuUserDAOImpl implements UserDAO {

	
	public HerokuUserDAOImpl() {
		String query ="CREATE TABLE IF NOT EXISTS users(id_user SERIAL PRIMARY KEY, username varchar(30) NOT NULL UNIQUE,password varchar(30) NOT NULL )";
		Connection conn;
		try {
			conn = HerokuConfigUtils.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			HerokuConfigUtils.closeConnection(conn);
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public User authenticate(String username, String password) {
		// TODO Auto-generated method stub
		 User us = new UserImpl();
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " SELECT * FROM users WHERE username=? AND password=?";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setString (1, username);
				      preparedStmt.setString (2, password);
				      // execute the preparedstatement
				      ResultSet rs= preparedStmt.executeQuery();
				      if(rs.next()) {
				    	  us.setId_user(rs.getInt("id_user"));
				    	  us.setUsername(rs.getString("username"));
				    	  us.setPassword(rs.getString("password"));
				      }
				      else us.setUsername("unknow");
				      HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	@Override
	public void createUser(User us) {
		// TODO Auto-generated method stub
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " insert into users (username,password)"
				        + " values (?, ?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setString (1, us.getUsername());
				      preparedStmt.setString (2, us.getPassword());
				      // execute the preparedstatement
				      preparedStmt.execute();
				      HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User us) {
		// TODO Auto-generated method stub
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " UPDATE users SET username=?, password=? WHERE id_user=?";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setString (1, us.getUsername());
				      preparedStmt.setString (2, us.getPassword());
				      preparedStmt.setInt (3, us.getId_user());
				      // execute the preparedstatement
				      preparedStmt.execute();
				      HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		 User us = new UserImpl();
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " SELECT * FROM users WHERE id_user=?";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setInt (1, id);
				      // execute the preparedstatement
				      ResultSet rs= preparedStmt.executeQuery();
				      if(rs.next()) {
				    	  us.setId_user(rs.getInt("id_user"));
				    	  us.setUsername(rs.getString("username"));
				    	  us.setPassword(rs.getString("password"));
				      }
				      else us.setUsername("unknow");
				      HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	@Override
	public void deleteUser(User us) {
		// TODO Auto-generated method stub
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " DELETE FROM users WHERE id_user=?";

			 // create the mysql insert preparedstatement
			 PreparedStatement preparedStmt = conn.prepareStatement(query);
			 preparedStmt.setInt (1, us.getId_user());
			 preparedStmt.execute();
			 HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}


