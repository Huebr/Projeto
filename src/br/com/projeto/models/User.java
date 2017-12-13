package br.com.projeto.models;

public interface User {
	String getUsername();
	void setUsername(String username);
	String getPassword();
	void setPassword(String password);
	int getId_user();
	void setId_user(int id);
	boolean authenticate(String username ,String pass);
	boolean createUser();
}