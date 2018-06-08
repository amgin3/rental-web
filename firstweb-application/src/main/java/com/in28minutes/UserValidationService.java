package com.in28minutes;

public class UserValidationService {
	public boolean isUserValid(String user, String password) {
		if (user.equals("Ame") && password.equals("dio")) {
			return true;
		}
		return false;
	}
}
