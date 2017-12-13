package br.com.projeto.models;

import java.util.List;

import br.com.projeto.dao.LivroDAO;
import br.com.projeto.dao.factory.DAOFactory;
import br.com.projeto.dao.factory.HerokuDAOFactory;
import br.com.projeto.dao.factory.herokuapp.HerokuLivroDAOImpl;



public interface EstanteDeLivros {
    default void init() {
    	DAOFactory appDAOFactory= new HerokuDAOFactory();
    	LivroDAO ldao = appDAOFactory.getLivroDAO();
    	ldao.adicionarLivro(new LivroImpl("001", "Wilson, Robert Anton & Shea, Robert", "Illuminati", 9.99,"",""));
    	ldao.adicionarLivro(new LivroImpl("002", "Fowler, Martin", "Patterns of Enterprise Application Architecture", 27.88,"",""));
    	ldao.adicionarLivro(new LivroImpl("003", "Unknown", "Something about German Umlauts (äüö) and ß", 5.49,"",""));
         for(Livro l:ldao.getLivros()) {
        	 add(l);
         }
    }
    <E extends Livro> boolean add(E Livro);
    Livro get(String isbn);
    List<Livro> find(String q);
}
