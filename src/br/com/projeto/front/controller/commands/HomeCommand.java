package br.com.projeto.front.controller.commands;

import javax.servlet.ServletException;

import br.com.projeto.models.EstanteDeLivros;

import java.io.IOException;

public class HomeCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        super.process();
        EstanteDeLivros bookshelf = (EstanteDeLivros) request.getServletContext()
          .getAttribute("bookshelf");
        request.setAttribute("books", bookshelf);
        forward("home");
    }
}