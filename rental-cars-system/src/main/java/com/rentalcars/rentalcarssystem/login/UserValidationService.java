package com.rentalcars.rentalcarssystem.login;

public class UserValidationService {
	
	//let's create a method that allow to login only to those users
	//who insert the right user name and the right password
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("Pian3zz4")&&password.equals("toppe"))
			return true;
		return false;
	}

}
