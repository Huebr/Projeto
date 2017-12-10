package br.com.projeto.front.controller.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import br.com.projeto.models.User;
import br.com.projeto.models.UserImpl;

import java.io.IOException;
import java.util.Optional;

public class LoginCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        if (request.getMethod().equals("POST")) {
        	String user = request.getParameter("username");
        	String senha = request.getParameter("senha");
        	User us = new UserImpl();
        	if(us.authenticate(user, senha)) {
        		HttpSession session = request.getSession(true);
                session.setAttribute("user", us);
                response.sendRedirect(request.getParameter("redirect"));
        	}else {
        		request.setAttribute("redirect", request.getRequestURL().append("?").append("command=Home").toString());
        		forward("login");
        	}
        } else {
            String queryString = Optional.ofNullable(request.getQueryString())
              .orElse("command=Home");
//            request.setAttribute("redirect", request.getRequestURL().append("?").append(queryString).toString());
            request.setAttribute("redirect", request.getRequestURL().append("?").append("command=Home").toString());
            forward("login");
        }
    }
}
