package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
     private VehiculoController repository;
    
    @GetMapping
    public List<Vehiculo> obtenerVehiculos(){
        return reposit
    }
    
    
}
