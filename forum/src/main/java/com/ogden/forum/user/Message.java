package com.ogden.forum.user;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private int messageid;
    private String message;
    private Date created;
    private String author;
    
    public Message() {
    	
    }
    
    public Message(int messageid, String message, String author) {
    	this.messageid = messageid;
    	this.message = message;
    	this.author = author;
    	this.created = new Date();
    }
    
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

