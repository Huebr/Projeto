package br.com.projeto.dao.factory.herokuapp;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.dao.LivroDAO;
import br.com.projeto.models.Livro;
import br.com.projeto.models.LivroImpl;

public class HerokuLivroDAOImpl implements LivroDAO {
	public HerokuLivroDAOImpl() {
		String query ="CREATE TABLE IF NOT EXISTS livros( isbn varchar(14) PRIMARY KEY, title text NOT NULL,author varchar(50) NOT NULL, price numeric NOT NULL CHECK (price > 0),resumo text NOT NULL, imgUrl varchar(256) NOT NULL )";
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
	public List<Livro> getLivros() {
		// TODO Auto-generated method stub
		List<Livro> temp = new ArrayList();
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM livros");
			while(rs.next()) {
				temp.add(new LivroImpl(rs.getString("isbn"),rs.getString("author"),rs.getString("title"),rs.getDouble("price"),rs.getString("resumo"),rs.getString("imgUrl")));
			}
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public Livro getLivro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarLivro(Livro l) {
		// TODO Auto-generated method stub
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " insert into livros (isbn, title, author, price,resumo,imgUrl)"
				        + " values (?, ?, ?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setString (1, l.getIsbn());
				      preparedStmt.setString (2, l.getTitle());
				      preparedStmt.setString (3, l.getAuthor());
				      preparedStmt.setDouble(4, l.getPrice());
				      preparedStmt.setString (5, l.getResumo());
				      preparedStmt.setString (6, l.getImgUrl());
				      // execute the preparedstatement
				      preparedStmt.execute();
				      HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLivro(Livro l) {
		// TODO Auto-generated method stub
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " UPDATE livros SET title=?, author=?, price=?, resumo=?, imgUrl=? WHERE isbn=?";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setString (1, l.getTitle());
				      preparedStmt.setString (2, l.getAuthor());
				      preparedStmt.setDouble (3, l.getPrice());
				      preparedStmt.setString (4, l.getResumo());
				      preparedStmt.setString (5, l.getImgUrl());
				      preparedStmt.setString(6, l.getIsbn());
				      // execute the preparedstatement
				      preparedStmt.execute();
				      HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeLivro(Livro l) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			Connection conn = HerokuConfigUtils.getConnection();
			 String query = " DELETE FROM livros WHERE isbn=?";

			 // create the mysql insert preparedstatement
			 PreparedStatement preparedStmt = conn.prepareStatement(query);
			 preparedStmt.setString (1, l.getIsbn());
			 preparedStmt.execute();
			 HerokuConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
