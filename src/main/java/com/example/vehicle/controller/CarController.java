package com.example.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.entity.Car;
import com.example.vehicle.service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	
	@Autowired
	CarService carSer;
	
	@PostMapping(value = "/add")
	public String addCar(@RequestBody Car car) {
		return carSer.addCar(car);
	}
	
	@GetMapping(value = "/get/{id}")
	public Car getCar(@PathVariable int id) {
		return carSer.getCar(id);
	}
	
	@PutMapping(value = "/update/{id}")
	public String updateCar(@RequestBody Car id) {
		return carSer.updateCar(id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteCar(@PathVariable int id) {
		return carSer.deleteCar(id);
	}
	
	@PostMapping(value = "/addAll")
	public String addCar(@RequestBody List<Car> cars) {
		return carSer.addCar(cars);
	}
	
	@GetMapping(value = "/getAll")
	public List<Car> getCar() {
		return carSer.getCar();
		System.out.println("vivek");
	}

}
