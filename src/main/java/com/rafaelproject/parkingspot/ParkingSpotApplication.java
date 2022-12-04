package com.rafaelproject.parkingspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rafaelproject.parkingspot")
public class ParkingSpotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingSpotApplication.class, args);
	}
}
