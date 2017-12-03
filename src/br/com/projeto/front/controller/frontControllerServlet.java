package br.com.projeto.front.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.front.controller.commands.FrontCommand;
import br.com.projeto.front.controller.commands.UnknownCommand;
import br.com.projeto.models.EstanteDeLivros;
import br.com.projeto.models.EstanteDeLivrosImpl;

import java.io.IOException;

@WebServlet(name = "intercepting-filter", urlPatterns = "/")
public class frontControllerServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		EstanteDeLivros bookshelf = new EstanteDeLivrosImpl();
		bookshelf.init();
		getServletContext().setAttribute("bookshelf", bookshelf);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doCommand(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doCommand(request, response);
	}

	private void doCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrontCommand command = getCommand(request);
		command.init(request, response);
		command.process();
	}

	private FrontCommand getCommand(HttpServletRequest request) {
		try {
			Class type = Class.forName(String.format("br.com.projeto.front.controller.commands.%sCommand",
					request.getParameter("command")));
			return (FrontCommand) type.asSubclass(FrontCommand.class).newInstance();
		} catch (Exception e) {
			return new UnknownCommand();
		}
	}
}
