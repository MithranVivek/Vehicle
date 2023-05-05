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

import com.example.vehicle.entity.Bike;
import com.example.vehicle.service.BikeService;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {
	
	@Autowired
	BikeService bikeSer;
	
	@PostMapping(value = "/add")
	public String addBike(@RequestBody Bike bike) {
		return bikeSer.addBike(bike);
	}
	
	@GetMapping(value = "/get/{id}")
	public Bike getBike(@PathVariable int id) {
		return bikeSer.getBike(id);
	}
	
	@PutMapping(value = "/update/{id}")
	public String updateBike(@RequestBody Bike id) {
		return bikeSer.updateBike(id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteBike(@PathVariable int id) {
		return bikeSer.deleteBike(id);
	}
	
	@PostMapping(value = "/addAll")
	public String addBike(@RequestBody List<Bike> bikes) {
		return bikeSer.addBike(bikes);
	}
	
	@GetMapping(value = "/getAll")
	public List<Bike> getBike(){
		return bikeSer.getBike();
	}

}
