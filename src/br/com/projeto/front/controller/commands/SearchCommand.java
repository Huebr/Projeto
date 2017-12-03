package br.com.projeto.front.controller.commands;



import javax.servlet.ServletException;

import br.com.projeto.models.EstanteDeLivros;
import br.com.projeto.models.Livro;

import java.io.IOException;
import java.util.List;

public class SearchCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        super.process();
        EstanteDeLivros bookshelf = (EstanteDeLivros) request.getServletContext()
          .getAttribute("bookshelf");
        String q = request.getParameter("q");
        List<Livro> books = bookshelf.find(q);
        if (books.size() > 0) {
            request.setAttribute("books", books);
            forward("book-found");
        } else {
            forward("book-notfound");
        }
    }
}