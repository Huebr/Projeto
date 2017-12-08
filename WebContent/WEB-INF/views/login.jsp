<!DOCTYPE html>
<html>
    <head>
        <title>Bookshelf: Login</title>
        <%@ include file="partials/head.jsp" %>
    </head>
    <body>
        <p>Please input a username:</p>
        <h2>Login</h2>
        <form action="/?command=Login" method="POST">
            <input type="text" name="username" placeholder="Username">
            <input type="hidden" name="redirect" value="<%= (String) request.getAttribute("redirect") %>">
            <input type="submit" value="Proceed">
        </form>
        <%@ include file="partials/visitor-counter.jsp" %>
        <%@ include file="partials/scripts.jsp" %>
    </body>
</html>