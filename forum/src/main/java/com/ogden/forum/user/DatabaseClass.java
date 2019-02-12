package com.ogden.forum.user;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
	
	private static Map<Integer, User> users = new HashMap<>();
	private static Map<Integer, Message> messages = new HashMap<>();

	public static Map<Integer, User> getUsers() {
		return users;
	}
	
	public static Map<Integer, Message> getMessages() {
		return messages;
	}

}
