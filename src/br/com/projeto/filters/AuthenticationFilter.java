package br.com.projeto.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projeto.front.controller.commands.FrontCommand;
import br.com.projeto.front.controller.commands.HomeCommand;

import java.io.IOException;

public class AuthenticationFilter implements Filter {
	private OnIntercept callback;

	public AuthenticationFilter(OnIntercept callback) {
		this.callback = callback;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		HttpSession session = httpServletRequest.getSession(false);
		if (session == null || session.getAttribute("user") == null) {
			callback.intercept();
			FrontCommand command = new HomeCommand();
			command.init(httpServletRequest, httpServletResponse);
			command.process();
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
	}
}