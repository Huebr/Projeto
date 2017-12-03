package br.com.projeto.models;

import java.util.Map;

public interface Order {
    String getUsername();
    Map<Livro, Integer> getItems();
    void add(Livro item, Integer quantity);
}