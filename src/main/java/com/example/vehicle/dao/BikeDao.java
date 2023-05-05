package com.example.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vehicle.entity.Bike;
import com.example.vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	
	@Autowired
	BikeRepository bikeRepo;

	public String addBike(Bike bike) {
		bikeRepo.save(bike);
		return "successfully Added";
	}

	public Bike getBike(int id) {
		return bikeRepo.findById(id).get();	
	}

	public String updateBike(Bike id) {
		bikeRepo.save(id);
		return "Successfully Updated";
	}

	public String deleteBike(int id) {
		bikeRepo.deleteById(id);
		return "Successfully Deleted";
	}

	public String addBike(List<Bike> bikes) {
		bikeRepo.saveAll(bikes);
		return "Successfully list Added";
	}

	public List<Bike> getBike() {
		return bikeRepo.findAll();
	}

}
