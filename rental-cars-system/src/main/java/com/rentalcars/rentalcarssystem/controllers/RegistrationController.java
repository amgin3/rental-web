package com.rentalcars.rentalcarssystem.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rentalcars.rentalcarssystem.models.User;
import com.rentalcars.rentalcarssystem.repository.UserRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	public UserRepository userService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		return mav;
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("user") User user) {
		user.setUser_name(request.getParameter("username"));
		userService.save(user);
		return new ModelAndView("welcome", "username", user.getUser_name());
	}
}