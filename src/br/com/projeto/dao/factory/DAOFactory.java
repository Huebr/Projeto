package br.com.projeto.dao.factory;

import br.com.projeto.dao.LivroDAO;
import br.com.projeto.dao.UserDAO;

public interface DAOFactory {
	UserDAO getUserDAO();
	LivroDAO getLivroDAO();
}
