package com.rentalcars.rentalcarssystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.rentalcars.rentalcarssystem.models.User;

public interface UserRepository extends CrudRepository <User, Long>{

}
