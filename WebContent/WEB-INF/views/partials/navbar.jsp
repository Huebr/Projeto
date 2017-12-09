<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
	<a class="navbar-brand" href="/?command=Home">Venda de Livros</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarCollapse" aria-controls="navbarCollapse"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarCollapse">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active">
				<form class="ml-2 form-inline" action="/?command=Search" method="POST">
					<input class="form-control" type="text" id="search"
						placeholder="Procurar" aria-label="Procurar" name="q">
					<button class="btn btn-outline-success" type="submit">Procurar</button>
				</form>
			</li>
		</ul>
		<a class="nav-link mr-3 text-white" href="/?command=Login">Minha
			conta</a>
	</div>
</nav>