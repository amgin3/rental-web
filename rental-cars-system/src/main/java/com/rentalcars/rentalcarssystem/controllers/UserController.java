package com.rentalcars.rentalcarssystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rentalcars.rentalcarssystem.models.User;
import com.rentalcars.rentalcarssystem.repository.UserRepository;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

//	  @RequestMapping(value="/delete")
//	  @ResponseBody
//	  public String delete(long id) {
//	    try {
//	      User user = new User(id);
//	      _userDao.delete(user);
//	    }
//	    catch(Exception ex) {
//	      return ex.getMessage();
//	    }
//	    return "User succesfully deleted!";
//	  }
	  
	  @GetMapping(value="/add")
	  public @ResponseBody String addNewUser (@RequestParam String username, @RequestParam String password) {
			User n = new User();
			n.setUser_name(username);
			n.setPassword(password);
			userRepository.save(n);
			return "Saved";
	  }
	  
//	  @RequestMapping(value="/get-by-user_name")
//	  @ResponseBody
//	  public String getByUserName(String user_name) {
//	    String userId;
//	    try {
//	      User user = _userDao.getByUserName(user_name);
//	      userId = String.valueOf(user.getId());
//	    }
//	    catch(Exception ex) {
//	      return "User not found";
//	    }
//	    return "The user id is: " + userId;
//	  }

//	  @RequestMapping(value="/save")
//	  @ResponseBody
//	  public String create(String user_name, String password) {
//	    try {
//	      User user = new User(user_name, password);
//	      _userDao.save(user);
//	    }
//	    catch(Exception ex) {
//	      return ex.getMessage();
//	    }
//	    return "User succesfully saved!";
//	  }

	  // Private fields

//	  @Autowired
//	  private UserDao _userDao;
	  
}
