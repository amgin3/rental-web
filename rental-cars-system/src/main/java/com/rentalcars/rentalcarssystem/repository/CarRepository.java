package com.rentalcars.rentalcarssystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.rentalcars.rentalcarssystem.models.Car;

public interface CarRepository extends CrudRepository <Car, Long>{

}
