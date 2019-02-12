package com.ogden.forum.user;

import static com.ogden.forum.user.UserService.loggedIn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MessageService {
	UserService userService = new UserService();

	private Map<Integer, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1, new Message(1, "Hello Vidyut Here", "vidyut@gmail.com"));
		messages.put(2, new Message(2, "This is a Web service","vidyut@gmail.com"));
	}
	
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(int id) {
		return messages.get(id);
	}
	
	public String addMessage(Message message) {
		if (loggedIn.contentEquals("False")) {
			return "Please Login to post a message";
		}
		else {
		message.setMessageid(messages.size() + 1);
		message.setAuthor(loggedIn);
		message.setCreated(new Date());
		messages.put(message.getMessageid(), message);
		return "Message posted succesfully";
		}
	}
	
}
