package br.com.projeto.models;


public interface Livro {
    String getIsbn();

    void setIsbn(String isbn);

    String getAuthor();

    void setAuthor(String author);

    String getTitle();

    void setTitle(String title);

    Double getPrice();
    String getResumo();
    void setResumo(String resumo);
    void setImgUrl(String url);
    String getImgUrl();
    
    void setPrice(Double price);
}
