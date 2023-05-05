package com.example.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
