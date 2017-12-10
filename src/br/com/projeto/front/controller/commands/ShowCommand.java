package br.com.projeto.front.controller.commands;

import javax.servlet.ServletException;

import br.com.projeto.models.EstanteDeLivros;
import br.com.projeto.models.Livro;

import java.io.IOException;
import java.util.Collections;

public class ShowCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        super.process();
        EstanteDeLivros bookshelf = (EstanteDeLivros) request.getServletContext()
          .getAttribute("bookshelf");
        String title = request.getParameter("isbn");
        Livro book = bookshelf.get(title);
        request.setAttribute("books", Collections.singletonList(book));
        forward("book-info");
    }
}