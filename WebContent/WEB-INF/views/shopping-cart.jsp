<%@ page import="br.com.projeto.models.Livro" %>
<%@ page import="br.com.projeto.models.Order" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bookshelf: Checkout</title>
    <%@ include file="partials/head.jsp" %>
</head>
<body>
    
	<header>
		<%@ include file="partials/navbar.jsp"%>
	</header>
	<br>
	<br>
	<br>
	<br>
    
	<main role="main">
		<div class="container">
		    <p class="text-center">Voce está comprando os seguintes livros:</p>

			<div class="card" >
				<div class="card-body">
					<h4 class="card-title">Carrinho</h4>
					<hr>
					<% Order order = (Order) session.getAttribute("order"); %>
					<% for (Map.Entry<Livro, Integer> entry : order.getItems().entrySet()) { %>
						<p class="card-text">
							<h3><%= entry.getKey().getTitle() %></h3>
							<i> by <%= entry.getKey().getAuthor()%></i>
							<br>
							<b><%= entry.getValue() %> x <%= entry.getKey().getPrice() %></b>
						</p>
						<br>
						<hr>
						<br>
					<% } %>
				</div>
				<div class="row">
					<div class="col-md-2">
						<b class="card-text">Total: <%= request.getAttribute("total") %></b>
					</div>
					<div class="col-md-1">
						<form action="/?command=Checkout" method="POST">
							<input type="submit" class="btn btn-success btn" value="Comprar">
						</form>
					</div>
					<div class="col-md-1">
						<form action="/?command=Home" method="POST">
							<input type="submit" class="btn btn-primary btn" value="Voltar">
						</form>
					</div>
				</div>
			</div>
			<%@ include file="partials/visitor-counter.jsp"%>
			<%@ include file="partials/footer.jsp"%>
		</div>
	    
	    
	    
	</main>
    
    <%@ include file="partials/scripts.jsp" %>
</body>
</html>