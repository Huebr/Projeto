package br.com.projeto.models;

import java.util.List;

import br.com.projeto.dao.LivroDAO;
import br.com.projeto.dao.factory.DAOFactory;
import br.com.projeto.dao.factory.HerokuDAOFactory;
import br.com.projeto.dao.factory.herokuapp.HerokuLivroDAOImpl;

//value list handler

public interface EstanteDeLivros {
    default void init() {
    	DAOFactory appDAOFactory= new HerokuDAOFactory();
    	LivroDAO ldao = appDAOFactory.getLivroDAO();
    	ldao.adicionarLivro(new LivroImpl("001", "Wilson, Robert Anton & Shea, Robert", "Illuminati", 9.99,"",""));
    	ldao.adicionarLivro(new LivroImpl("002", "Fowler, Martin", "Patterns of Enterprise Application Architecture", 27.88,"",""));
    	ldao.adicionarLivro(new LivroImpl("003", "Olaf Olafsson", "One Station Away: A Novel", 15.49,"",""));
    	ldao.adicionarLivro(new LivroImpl("004", "Maude Julien", "The Only Girl in the World: A Memoir", 17.70,"",""));
    	ldao.adicionarLivro(new LivroImpl("005", "Katherine Arden", "The Girl in the Tower: A Novel", 17.79,"",""));
    	ldao.adicionarLivro(new LivroImpl("006", "Ursula K. Le Guin", "No Time to Spare: Thinking About What Matters ", 14.95,"",""));
    	ldao.adicionarLivro(new LivroImpl("007", "Vanda Krefft", "The Man Who Made the Movies: The Meteoric Rise and Tragic Fall of William Fox", 25.47,"",""));
    	ldao.adicionarLivro(new LivroImpl("008", "Nora Roberts", "Nora Roberts: Biography", 13.99,"",""));
         for(Livro l:ldao.getLivros()) {
        	 add(l);
         }
    }
    <E extends Livro> boolean add(E Livro);
    Livro get(String isbn);
    List<Livro> find(String q);
}
