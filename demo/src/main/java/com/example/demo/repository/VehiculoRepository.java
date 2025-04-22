package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vehiculo;

public interface VehiculoRepository 
extends JpaRepository<Vehiculo, Long>
{

}
