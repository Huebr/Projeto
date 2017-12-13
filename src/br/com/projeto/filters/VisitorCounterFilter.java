package br.com.projeto.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.projeto.models.User;

import java.io.IOException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class VisitorCounterFilter implements Filter {
    private static Set<String> users = new HashSet<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(
      ServletRequest request,
      ServletResponse response,
      FilterChain chain
    ) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession(false);
        Optional.ofNullable(((User)session.getAttribute("user")).getUsername())
          .map(Object::toString)
          .ifPresent(users::add);
        request.setAttribute("counter", users.size());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}