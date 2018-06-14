package com.rentalcars.rentalcarssystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentalCarsSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalCarsSystemApplication.class, args);
		
		

//		String url = "jdbc:mysql://localhost:3306/rentalcars";
//		Properties props = new Properties();
//		props.setProperty("user", "myuser");
//		props.setProperty("password", "pian3zz4");
//
//		try {
//			Connection conn = DriverManager.getConnection(url, props);
//			 Statement stmt = conn.createStatement();
//		      conn.setAutoCommit(false);
//		      stmt.executeUpdate("INSERT INTO users(user_name, user_password) VALUES('Amedeo', 'baccala')");
//		      conn.commit();
//
//			System.out.println("Test di connessione avvenuto con successo");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
