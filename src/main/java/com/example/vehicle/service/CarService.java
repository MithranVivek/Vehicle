package com.example.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.vehicle.entity.Car;
import com.example.vehicle.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepo;
	
	public String addCar(Car car) {
		carRepo.save(car);
		return "Successfully Saved";
	}

	public Car getCar(int id) {
		return carRepo.findById(id).get();
		
	}

	public String updateCar(Car id) {
		carRepo.save(id);
		return "Successfully Updated";
	}

	public String deleteCar(int id) {
		carRepo.deleteById(id);
		return "Successfully Deleted";
	}

	public String addCar(@RequestBody List<Car> cars) {
		carRepo.saveAll(cars);
		return "Successfully Saved";
	}

	public List<Car> getCar() {
		return carRepo.findAll();
	}
	
	

}
