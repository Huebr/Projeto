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
			 <% for (Livro book : (List<Livro>) request.getAttribute("books")) { %>
			
				<div class="col-md-3"></div>
				<div class="card col-md-6">
					<div class="card-body">
						<p class="card-title">
							<b><%=book.getAuthor()%></b>
						</p>
						<hr />
						<h3 class="card-subtitle mb-2 text-muted"><%=book.getTitle()%></h3>
						<a href="?command=Show&isbn=<%=book.getIsbn()%>">More...</a>
					</div>
				</div>
				<div class="col-md-3"></div>
				<br>
			<% } %>
	
			<%@ include file="partials/footer.jsp"%>
		</div>
	</main>
	</div> 
               
        <%@ include file="partials/scripts.jsp" %>
    </body>
</html>