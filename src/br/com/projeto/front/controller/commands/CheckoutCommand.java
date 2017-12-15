package br.com.projeto.front.controller.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import br.com.projeto.models.Order;

public class CheckoutCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        super.process();
        HttpSession session = request.getSession(false);
        if (request.getMethod().equals("POST")) {
            session.removeAttribute("order");
            response.sendRedirect("/?command=Home&message=Muito obrigado pela compra!");
        } else {
            Order order = (Order) session.getAttribute("order");
            Double total = order.getItems().entrySet().stream()
              .map(entry -> entry.getKey().getPrice() * entry.getValue())
              .reduce((p1, p2) -> p1 + p2)
              .orElse(0.00);
            request.setAttribute("total", total);
            forward("shopping-cart");
        }
    }
}
