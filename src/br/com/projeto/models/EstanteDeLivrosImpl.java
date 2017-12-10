package br.com.projeto.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstanteDeLivrosImpl extends ArrayList<Livro> implements EstanteDeLivros {
	

    @Override
    public Livro get(String isbn) {
        return this.stream()
          .filter(book -> book.getIsbn().equals(isbn))
          .findFirst()
          .orElse(null);
    }

    @Override
    public List<Livro> find(String q) {
        return this.stream()
          .filter(book -> book.getTitle().toLowerCase().contains(q.toLowerCase())
            || book.getAuthor().toLowerCase().contains(q.toLowerCase()))
          .collect(Collectors.toList());
    }
}