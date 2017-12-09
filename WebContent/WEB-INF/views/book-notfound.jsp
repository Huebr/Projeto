<!DOCTYPE html>
<html>
    <head>
        <title>Bookshelf: Title not found</title>
        <%@ include file="partials/head.jsp" %>
    </head>
    <body>
    
    
    <body>
    
	<header>
		<%@ include file="partials/navbar.jsp"%>
	</header>
	<br>
	<br>
	<br>
	<br>
	
	<div class="container">
	    <main role="main">
		    <div class="row">
				<div class="jumbotron">
					<h1 class="display-3"><p>Our Bookshelf doesn't contains this title:</p></h1>
					<h2><%= request.getParameter("q") %></h2>
					<br>
				</div>
		    </div>
		</main>
		
        <%@ include file="partials/shopping-cart-hint.jsp"%>
        <%@ include file="partials/visitor-counter.jsp"%>
	</div> 
               
        <%@ include file="partials/scripts.jsp" %>
    </body>
    
    
    
        
        
    </body>
</html>