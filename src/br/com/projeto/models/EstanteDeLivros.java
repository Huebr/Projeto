package br.com.projeto.models;

import java.util.List;

import br.com.projeto.dao.LivroDAO;
import br.com.projeto.dao.LivroDAOImpl;



public interface EstanteDeLivros {
    default void init() {
    	LivroDAO ldao= new LivroDAOImpl();
    	ldao.adicionarLivro(new LivroImpl("001", " bell hooks", "All about Love: New Visions", 12.14));
    	ldao.adicionarLivro(new LivroImpl("002", "Fowler, Martin", "Patterns of Enterprise Application Architecture", 27.88));
    	ldao.adicionarLivro(new LivroImpl("003", "Ian Sommerville", "Engenharia de Software", 42.90));
    	ldao.adicionarLivro(new LivroImpl("004", "Stephen Few", "Big Data, Big Dupe: A little book about a big bunch of nonsense", 35.65));

    	for(Livro l:ldao.getLivros()) {
        	 add(l);
         }
    }
    <E extends Livro> boolean add(E Livro);
    Livro get(String isbn);
    List<Livro> find(String q);
}
