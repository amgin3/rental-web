package com.rentalcars.rentalcarssystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "car")
	public class Car {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

//		@NotNull
		// @Size(min = 3, max = 80)
		private String brand;

//		@NotNull
		// @Size(min = 2, max = 80)
		private String model;

		public Car() {
		}

		public Car(long id) {
			this.id = id;
		}

		public Car(String brand, String model) {
			this.brand = brand;
			this.model = model;
		}

		public long getId() {
			return id;
		}

		public String getCar_brand() {
			return brand;
		}

		public void setCar_brand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}
	}
