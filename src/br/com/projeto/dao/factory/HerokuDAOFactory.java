
package br.com.projeto.dao.factory;

import br.com.projeto.dao.LivroDAO;
import br.com.projeto.dao.UserDAO;
import br.com.projeto.dao.factory.herokuapp.HerokuLivroDAOImpl;
import br.com.projeto.dao.factory.herokuapp.HerokuUserDAOImpl;

public class HerokuDAOFactory implements DAOFactory {

	@Override
	public UserDAO getUserDAO() {
		// TODO Auto-generated method stub
		return  new HerokuUserDAOImpl();
	}

	@Override
	public LivroDAO getLivroDAO() {
		// TODO Auto-generated method stub
		return new HerokuLivroDAOImpl();
	}

}
