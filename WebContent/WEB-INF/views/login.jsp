<!DOCTYPE html>
<html>
    <head>
        <title>Bookshelf: Login</title>
        <%@ include file="partials/head.jsp" %>
    </head>
    <body>
    <br><br><br><br><br>
		<form class="form-signin" action="/?command=Login" method="POST">
	    <div class="container">
	    	<div class="row">
		    	<div class="col-md-4"></div>
		    	<div class="col-md-4">
					<h2 class="form-signin-heading">Login: </h2>
					<input type="text" name="username" placeholder="Nome">
					<br>
					<input type="password" name="" placeholder="Senha">
					<br>
					<input type="hidden" name="redirect" value="<%= (String) request.getAttribute("redirect") %>">
					<br>
					<input type="submit" value="Entrar" class="btn btn-secondary"> ou
					<a href="#" value="" class="btn btn-secondary">Cadastre-se</a>
		    	</div>
				<div class="col-md-4"></div>    	
	    	</div>
		</form>		


    	<%@ include file="partials/footer.jsp" %>
    	
        <%@ include file="partials/visitor-counter.jsp" %>
        <%@ include file="partials/scripts.jsp" %>
    </div> <!-- /container -->
    	
    </body>
</html>