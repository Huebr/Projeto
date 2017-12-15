<!DOCTYPE html>
<html>
    <head>
        <title>Venda de livros: Título não encontrado</title>
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
	
	<main role="main">
		<div class="container">
			<%@ include file="partials/shopping-cart-hint.jsp"%>
			 <div class="col-md-3"></div>
				<div class="card col-md-6">
					<div class="card-body">
						<p class="card-title">
							<b>Nenhum livro encontrado</b>
						</p>
					</div>
				</div>
			<br>
	        <%@ include file="partials/visitor-counter.jsp"%>
		</div>
	</main>
		
	</div> 
               
	   <%@ include file="partials/scripts.jsp" %>
    </body>
    
    
    
        
        
    </body>
</html>