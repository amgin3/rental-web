package com.rentalcars.rentalcarssystem.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rentalcars.rentalcarssystem.models.Car;
import com.rentalcars.rentalcarssystem.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	public CarRepository carService;

	@RequestMapping(value = "/newcar", method = RequestMethod.GET)
	public ModelAndView showCar(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("newcar");
		mav.addObject("car", new Car());
		return mav;
		
	}
	
	@RequestMapping(value = "/welcomeCar", method = RequestMethod.POST)
	public ModelAndView addNewCar(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("car") Car car) {
		car.setCar_brand(request.getParameter("brand"));
		carService.save(car);
		return new ModelAndView("welcomeCar", "brand", car.getCar_brand());
		
//		String name = request.getParameter("username")
//		user.setUser_name(name);
//		userService.save(user);
//		return new ModelAndView("welcome", "username", user.getUser_name());
	}
}