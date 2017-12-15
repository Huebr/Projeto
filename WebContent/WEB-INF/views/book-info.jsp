<%@ page import="br.com.projeto.models.Livro" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Venda de livros</title>
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
		    
				<div class="jumbotron">
				    <% for (Livro book : (List<Livro>) request.getAttribute("books")) { %>
			    
						<h1 class="display-3"><%= book.getTitle() %></h1>
						<p>Autor: <%= book.getAuthor() %></p>
						<br>
						<form action="/?command=Order" method="POST">
							<p class="lead"> <img src="<%=book.getImgUrl() %>" class="img-responsive" alt="Imagem Livro"> </a></p>
							<p class="lead"><%=book.getResumo() %></p>
							<div class="row">
								<div class="col-md-2"> <label >Quantidade: </label> </div>
								<input class="col-md-1" type="text" id="quantity" name="quantity" value="1" required>
								<div class="col-md-2">
									<input type="hidden" name="isbn" value="<%= book.getIsbn() %>">
									<i class="fa fa-cart-plus"></i>
									<input type="submit" class="btn btn-success btn-sm " value="Preço: R$ <%= book.getPrice() %>">
								</div>
								<div class="col-md-1"> <a href="/?command=Home" class="btn btn-primary btn-sm">Voltar</a> </div>
							</div>
						</form>
					<% } %>
				</div>
        	<%@ include file="partials/visitor-counter.jsp"%>
		    <%@ include file="partials/footer.jsp"%>
	    </div>
	</main>
	
	<%@ include file="partials/scripts.jsp" %>
               
    </body>
</html>