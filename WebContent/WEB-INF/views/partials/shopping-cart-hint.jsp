<%@ page import="br.com.projeto.models.Order" %>
<% if (session != null && session.getAttribute("order") != null) { %>
    <% Order order = ((Order) session.getAttribute("order")); %>
    <% if (order != null && order.getItems().size() > 0) { %>
        <hr/>
        <p>
            Seu carrinho de compras está guardando
            <% if (order.getItems().size() == 1) { %>
                1 item.
            <% } else { %>
                <%= (order.getItems().size()) %> items.
            <% } %>
            <a href="/?command=Checkout">Conferir</a>
        </p>
    <% } %>
<% } %>