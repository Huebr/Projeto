
package br.com.projeto.dao;

import br.com.projeto.models.User;

public interface UserDAO {
	User authenticate(String username,String password);
	boolean createUser(User us);
	void updateUser(User us);
	User getUser(int id);
	void deleteUser(User us);
}
