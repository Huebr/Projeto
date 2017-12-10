package br.com.projeto.dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.projeto.models.Livro;

public interface LivroDAO {
	
	List<Livro> getLivros();
	Livro getLivro();
	void adicionarLivro(Livro l);
	void updateLivro(Livro l);
	void removeLivro(Livro l);
}
