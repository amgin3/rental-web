package com.rentalcars.rentalcarssystem.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rentalcars.rentalcarssystem.repository.UserRepository;

@Controller
public class LoginController extends HttpServlet{
	
	
	@GetMapping(value="/")
	public String goLogin() {
		return "login";
	}
	
//	@Autowired
//	UserRepository userService;

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//	}

//	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
//	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
//			@ModelAttribute("login") Login login) {
//		ModelAndView mav = null;
//		User user = userService.findAll();
//		if (null != user) {
//			mav = new ModelAndView("welcome");
//			mav.addObject("firstname", user.getUser_name());
//		} else {
//			mav = new ModelAndView("login");
//			mav.addObject("message", "Username or Password is wrong!!");
//		}
//		return mav;
//	}
}
