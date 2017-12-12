package br.com.projeto.front.controller.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import br.com.projeto.dao.UserDAO;
import br.com.projeto.models.User;
import br.com.projeto.models.UserImpl;

import java.io.IOException;
import java.util.Optional;

public class SignupCommand extends FrontCommand {
	@Override
	public void process() throws ServletException, IOException {
		if (request.getMethod().equals("POST")) {
			
			String user = request.getParameter("username");
			String senha = request.getParameter("senha");
			
			User newUser = new UserImpl();	
			
			newUser.setUsername(user);
			newUser.setPassword(senha);
			
			newUser.createUser();
			
			// SUPOSTA FUNÇÂO QUE DEVERIA REDIRECIONAR PARA O LOGIN
			request.setAttribute("redirect", request.getRequestURL().append("?").append("command=Login").toString());

		} else {
			String queryString = Optional.ofNullable(request.getQueryString()).orElse("command=Home");
			request.setAttribute("redirect", request.getRequestURL().append("?").append("command=Home").toString());
			forward("signup");
		}
	}
}
