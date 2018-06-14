package com.rentalcars.rentalcarssystem.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	private UserValidationService service = new UserValidationService();
	//we are going to redirect to a JSP because in JSP it's easy to write the 
	//html content
	protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException{
		//the Prameter is what we pass between the browser and the application servlet
		
		//request.setAttribute("name", request.getParameter("name"));
		//request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException{
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			
			boolean isUserValid = service.isUserValid(name, password);
			if(isUserValid) {
				request.setAttribute("name", name);
				request.setAttribute("password", password);
				request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "InvalidCredential");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			}
			
		}

}
