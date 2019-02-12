package com.ogden.forum.user;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/users")
public class UserResource {
	UserService userService = new UserService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> gettUsers() {	
		return userService.getAllUsers();
	}

	@POST
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User newUser (User user) {
		return userService.addUser(user);
	}
	
	
	  @POST	  
	  @Path("/login")	  
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	  @Produces(MediaType.APPLICATION_JSON) 
	  public String userLogin (@FormParam("useremail") String email, @FormParam("password") String password) { 
		  return userService.login(email, password); 
	  }
	  
	  @POST	  
	  @Path("/logout")	  
	  @Produces(MediaType.APPLICATION_JSON) 
	  public String userLogout () { 
		  return userService.logout(); 
	  }
	 
}
