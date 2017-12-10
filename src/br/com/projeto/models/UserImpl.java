package br.com.projeto.models;

import br.com.projeto.dao.UserDAO;
import br.com.projeto.dao.UserDAOImpl;

public class UserImpl implements User {
	private String username;
	private int id_user;
	private String password;
	
	public boolean authenticate(String username ,String pass) {
		UserDAO udao= new UserDAOImpl();
		User us = udao.authenticate(username, pass);
		if(us.getUsername().equals("unknow")) {
			return false;
		}else {
			setUsername(us.getUsername());
			setPassword(us.getPassword());
			setId_user(us.getId_user());
			return true;
		}
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_user() {
		return id_user;
	}
	@Override
	public void setId_user(int id) {
		this.id_user=id;
	}
	
}
