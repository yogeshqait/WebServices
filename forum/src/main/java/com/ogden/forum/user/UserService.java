package com.ogden.forum.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {
	
	private Map<Integer, User> users = DatabaseClass.getUsers();
	public static String loggedIn = "False";
	
	User newUser = new User("Vidyut","vidyut@gmail.com","mypassword",1);
	public UserService() {
		users.put(newUser.getUserid(), newUser);
	}
	
	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}
  
	public User addUser(User user) {
		user.setUserid(users.size() + 1);
		users.put(user.getUserid(),user);
		return user;
	}
	
	public String login(String email, String password)
	{
		ArrayList<User> temp = new ArrayList<User>(users.values());
		for (User user : temp)
		{	
			if(user.getEmail().contentEquals(email)) {
				if(user.getPassword().contentEquals(password)) {
					loggedIn =user.getEmail();
					return loggedIn;
				}
			}
		}
		return null;
	}
	
	public String logout()
	{
		loggedIn = "False";
		return "Youare succesfully logged out";
	}
}
