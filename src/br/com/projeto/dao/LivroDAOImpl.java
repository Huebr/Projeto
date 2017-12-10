package br.com.projeto.dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.models.Livro;
import br.com.projeto.models.LivroImpl;

public class LivroDAOImpl implements LivroDAO {
	public LivroDAOImpl() {
		String query ="CREATE TABLE IF NOT EXISTS livros( isbn varchar(14) PRIMARY KEY, title text NOT NULL,author varchar(50) NOT NULL, price numeric NOT NULL CHECK (price > 0) )";
		Connection conn;
		try {
			conn = ConfigUtils.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			ConfigUtils.closeConnection(conn);
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
			Connection conn = ConfigUtils.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM livros");
			while(rs.next()) {
				temp.add(new LivroImpl(rs.getString("isbn"),rs.getString("author"),rs.getString("title"),rs.getDouble("price")));
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
			Connection conn = ConfigUtils.getConnection();
			 String query = " insert into livros (isbn, title, author, price)"
				        + " values (?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = conn.prepareStatement(query);
				      preparedStmt.setString (1, l.getIsbn());
				      preparedStmt.setString (2, l.getTitle());
				      preparedStmt.setString   (3, l.getAuthor());
				      preparedStmt.setDouble(4, l.getPrice());
				      // execute the preparedstatement
				      preparedStmt.execute();
				      ConfigUtils.closeConnection(conn);
			
		} catch (URISyntaxException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLivro(Livro l) {
		// TODO Auto-generated method stub
		
	}

}
