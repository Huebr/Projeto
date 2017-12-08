<!DOCTYPE html>
<html>
    <head>
        <title>Bookshelf: Title not found</title>
        <%@ include file="partials/head.jsp" %>
    </head>
    <body>
        <p>Our Bookshelf doesn't contains this title:</p>
        <h2><%= request.getParameter("q") %></h2>
        <%@ include file="partials/visitor-counter.jsp"%>
        <%@ include file="partials/scripts.jsp" %>
    </body>
</html>