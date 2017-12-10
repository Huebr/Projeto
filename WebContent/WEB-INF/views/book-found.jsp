<%@ page import="br.com.projeto.models.Livro" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Bookshelf: Titulo encontrado</title>
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
	    <%@ include file="partials/shopping-cart-hint.jsp"%>
		    <div class="row">
		    
			    <% for (Livro book : (List<Livro>) request.getAttribute("books")) { %>
			    
					<div class="jumbotron">
						<h1 class="display-3"><%= book.getTitle() %></h1>
						<p>Autor: <%= book.getAuthor() %></p>
						<br>
						<form action="/?command=Order" method="POST">
							<p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris
							condimentum nibh, ut fermentum massa justo sit amet risus.</p>
							<p class="lead">Foto do livro</p>
							<div class="row">
								<div class="col-md-2">
									<label >Quantidade: </label>
								</div>
								<div class="col-md-2">
									<input type="text" id="quantity" name="quantity" value="1" required>
								</div>
								<div class="col-md-3">
									<input type="hidden" name="isbn" value="<%= book.getIsbn() %>">
									<input type="submit" class="btn btn-success btn-sm" value="Adicionar no carrinho:<%= book.getPrice() %>$">
								</div>
								<div class="col-md-2">
									<a href="/?command=Home" class="btn btn-primary btn-sm">Voltar</a>
								</div>
							</div>
						</form>
					</div>
				<% } %>
		    </div>
        	<%@ include file="partials/visitor-counter.jsp"%>
	    </div>
	</main>
		
	</div> 
               
        <%@ include file="partials/scripts.jsp" %>
    </body>
</html>