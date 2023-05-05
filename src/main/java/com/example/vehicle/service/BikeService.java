package com.example.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle.dao.BikeDao;
import com.example.vehicle.entity.Bike;

@Service
public class BikeService {
	
	@Autowired
	BikeDao bikeDao;

	public String addBike(Bike bike) {
		return bikeDao.addBike(bike);
	}

	public Bike getBike(int id) {
		return bikeDao.getBike(id);
	}

	public String updateBike(Bike id) {
		return bikeDao.updateBike(id);
	}

	public String deleteBike(int id) {
		return bikeDao.deleteBike(id);
	}

	public String addBike(List<Bike> bikes) {
		return bikeDao.addBike(bikes);
	}

	public List<Bike> getBike() {
		return bikeDao.getBike();
	}
	

}
