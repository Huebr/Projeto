package br.com.projeto.front.controller.commands;


import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import br.com.projeto.models.EstanteDeLivros;
import br.com.projeto.models.Livro;
import br.com.projeto.models.Order;
import br.com.projeto.models.OrderImpl;

import java.io.IOException;
import java.util.Optional;

public class OrderCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        super.process();
        if (request.getMethod().equals("POST")) {
            HttpSession session = request.getSession(false);
            Order order = Optional
              .ofNullable(session.getAttribute("order"))
              .map(Order.class::cast)
              .orElseGet(() -> new OrderImpl((String) session.getAttribute("username")));
            EstanteDeLivros bookshelf = (EstanteDeLivros) request.getServletContext()
              .getAttribute("bookshelf");
            String isbn = request.getParameter("isbn");
            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
            Livro book = bookshelf.get(isbn);
            order.add(book, quantity);
            session.setAttribute("order", order);
            response.sendRedirect(String.format("/?command=Show&isbn=%s", isbn));
        }
    }
}