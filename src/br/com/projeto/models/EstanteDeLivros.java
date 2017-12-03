package br.com.projeto.models;

import java.util.List;

public interface EstanteDeLivros {
    default void init() {
        add(new LivroImpl("001", "Wilson, Robert Anton & Shea, Robert", "Illuminati", 9.99));
        add(new LivroImpl("002", "Fowler, Martin", "Patterns of Enterprise Application Architecture", 27.88));
        add(new LivroImpl("003", "Unknown", "Something about German Umlauts (äüö) and ß", 5.49));
    }
    <E extends Livro> boolean add(E Livro);
    Livro get(String isbn);
    List<Livro> find(String q);
}
