package com.rentalcars.rentalcarssystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.rentalcars.rentalcarssystem.models.Car;

public interface BookingRepository extends CrudRepository <Car, Long>{

}
