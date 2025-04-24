package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    
    List<Vehiculo> findByPersonaRut(String rut);

    /*ES LO QUE SE ENTIENDE POR FINDBY 
    SELECT * FROM VEHICULO 
     WHERE rut =
    */
}
