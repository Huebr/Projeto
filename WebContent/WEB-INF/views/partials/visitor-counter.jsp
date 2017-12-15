<% Integer counter = (Integer) request.getAttribute("counter"); %>
<% if (counter != null && counter > 0) { %>
    <hr/>
    <p>Você é o visitante número #<%= counter %>. <a href="/?command=Logout">Logout</a></p>
<% } %>