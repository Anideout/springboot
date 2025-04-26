package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    
    List<Vehiculo> findByPersonaRut(String rut);

    Vehiculo findByPatente(String patente);
      
    
}
