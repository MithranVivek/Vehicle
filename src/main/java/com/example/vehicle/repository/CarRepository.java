package com.example.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
