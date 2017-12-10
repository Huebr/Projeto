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
		    	<div class="col-md-2"></div>
		    	<div class="col-md-2">
					<h2 class="form-signin-heading">Entrar</h2>
		    	</div>
		    	<div class="col-md-3">
					<input type="text" name="username" placeholder="Nome">
					<input type="hidden" name="redirect" value="<%= (String) request.getAttribute("redirect") %>">
		    	</div>
		    	<div class="col-md-2">
					<input type="submit" value="Entrar" class="btn btn-secondary">
		    	</div>
				<div class="col-md-2"></div>    	
	    	</div>
		</form>		


    	<%@ include file="partials/footer.jsp" %>
    	
        <%@ include file="partials/visitor-counter.jsp" %>
        <%@ include file="partials/scripts.jsp" %>
    </div> <!-- /container -->
    	
    </body>
</html>