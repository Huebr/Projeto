<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <title>Home</title>

  <!-- Bootstrap core CSS -->
  <link href="./css/bootstrap.min.css" rel="stylesheet">


  <!-- Custom styles for this template -->
  <link href="./css/album.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
  <style>
    i {
      color: white;
    }
  </style>
</head>

<body>

  <header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
      <a class="navbar-brand" href="./?command=Home">Venda de Livros</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse"
        aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/?command=Home">Loja</a>
          </li>
          <li class="nav-item active">
            <form class=" ml-2 form-inline">
              <input class="form-control" type="procurar" placeholder="Procurar" aria-label="Procurar">
              <button class="btn btn-outline-success" type="submit">Procurar</button>
            </form>
          </li>
        </ul>
        <a class="nav-link mr-3 text-white" href="/?command=Login">Minha conta</a>
        <button class="btn btn-outline-success" type="button">
          <i class="fa fa-shopping-cart" aria-hidden="true"></i>
        </button>
      </div>
    </nav>
  </header>

  <br>
  <br>

  <main role="main">

    <div class="album text-muted">
      <div class="container">

        <div class="row">
          <div class="card">
            <a href="./item1.html">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 1</p>
          </div>
          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 2</p>
          </div>
          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 3</p>
          </div>

          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 4</p>
          </div>
          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 5</p>
          </div>
          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 6</p>
          </div>

          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 7</p>
          </div>
          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 8</p>
          </div>
          <div class="card">
            <a href="#">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image"
                width="350" height="280">
            </a>
            <br>
            <p class="card-text">Produto 9</p>
          </div>
        </div>

      </div>
    </div>

  </main>

  <!-- FOOTER -->
  <footer class="container">
    <p class="float-right">
      <a href="#">Back to top</a>
    </p>
    <p>&copy; 2017 Company, Inc. &middot;
      <a href="#">Privacy</a> &middot;
      <a href="#">Terms</a>
    </p>
  </footer>

  <!-- Bootstrap core JavaScript
    ================================================== -->
  <!-- Placed at the end of the document so the pages load faster -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
  <script src="./js/bootstrap.min.js"></script>

</body>

</html>